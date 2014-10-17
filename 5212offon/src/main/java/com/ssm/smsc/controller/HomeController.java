package com.ssm.smsc.controller;

import java.util.List;
import java.util.Locale;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ssm.smsc.domain.Product;
import com.ssm.smsc.domain.User;
import com.ssm.smsc.service.SmscService;
import com.ssm.smsc.util.ConnectTestDB;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	
	@Resource(name="smscService")
	private SmscService	smscService;

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(User user, Model model) {
		
		ConnectTestDB ctd = new ConnectTestDB();
		ctd.connectTest();
		
		
		return "login";
	}
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String home_post(@ModelAttribute User user, Model model, HttpSession session) {
		
		session.setAttribute("userInfo", user);
		boolean check = smscService.checkUserData(user);
		if(check==true){
			
			return "redirect:productlist";
		}else{
			return "/login_error";
		}
	}
	
	@RequestMapping(value = "/productlist", method = RequestMethod.GET)
	public String productlist(User user, Model model, HttpSession session) {
		
		User userInfo = (User) session.getAttribute("userInfo");
		model.addAttribute("userid",userInfo.getId());
		List<Product> productList = smscService.getAllProductData();
		
		System.out.println("productList:"+productList.toString());
		
		model.addAttribute("productList",productList);
		return "productlist";
	}
	
	
	@RequestMapping(value = "productlist/{product_no}", method = RequestMethod.GET)
	public String product_modify(@PathVariable("product_no") Integer product_no, Model model, HttpSession session) {
		logger.info("product_no:"+product_no);
		User userInfo = (User)session.getAttribute("userInfo");
		
		Product product = new Product();
		product = smscService.getProductData(product_no);
		
		model.addAttribute("userid", userInfo.getId());
		model.addAttribute("product", product);
		
		return "product_m";
	}
	

	@RequestMapping(value = "productlist/{product_no}", method = RequestMethod.POST)
	public String product_m_complete(@ModelAttribute("product") Product product, Model model, HttpSession session) {
		
		System.out.println("product::::"+product.toString());
		session.getAttribute("userInfo");
		smscService.updateProductData(product);
				
		return "redirect:../productlist";
	}
	

	@RequestMapping(value = "new_product", method = RequestMethod.GET)
	public String new_product(@ModelAttribute("product") Product product, Model model, HttpSession session) {
		
		System.out.println("in new_product");
//		int totalNum = smscService.getTotalProductNum();
//		product.setProduct_no(totalNum+1);
//		smscService.insertProductData(product);
				
		return "new_product";
	}
	
	@RequestMapping(value = "new_product", method = RequestMethod.POST)
	public String new_product_com(@ModelAttribute("product") Product product, Model model, HttpSession session) {
		
		int totalNum = smscService.getTotalProductNum();
		product.setProduct_no(totalNum+1);
		smscService.insertProductData(product);
				
		return "redirect:productlist";
	}
	
	@RequestMapping(value = "delete/{product_no}", method = RequestMethod.GET)
	public String delete(@PathVariable("product_no") Integer product_no, Model model, HttpSession session) {
				
		smscService.deleteProductData(product_no);
				
		return "redirect:../productlist";
	}
	
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(User user, Model model, HttpSession session) {
		
		session.setAttribute("userInfo", null);
		return "redirect:/";
	}
	
	
	
	@RequestMapping(value = "/login_error", method = RequestMethod.GET)
	public String login_error(User user, Model model) {
		
		
		return "login_error";
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		User user = new User();
		
		model.addAttribute("user",user);
		
		return "register";
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register_complete(@ModelAttribute("user") User user, Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		smscService.insertUserData(user);
		
		return "register_complete";
	}
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	
}
