<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="true"%>
<%
	request.setCharacterEncoding("UTF-8");
%>
<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en">
<!--<![endif]-->
<head>
<title>SMSC | Spring MVC Source Customizing</title>

<!-- Meta -->
<meta charset="utf-8">
<META HTTP-EQUIV="contentType" CONTENT="text/html;charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<!-- Favicon -->
<link rel="shortcut icon" href="favicon.ico">

<!-- CSS Global Compulsory -->
<link rel="stylesheet" href="resources/assets/css/bootstrap.min.css">


</head>

<body class="container">


	<div class="row">


		<div class="container" style="padding-top:70px;">
			<div class="row">

				<div class="col-md-offset-1 col-md-10 col-md-offset-1">
					<div class="pull-right" style="padding: 20px 10px 20px 0;">
						로그인 성공! <b>[${sessionScope.userInfo.id}님]</b> 환영합니다.<br />
						<div style="float: right;">
							<a href="logout">로그아웃</a>
						</div>
					</div>
					<table class="table table-hover">
						<thead>
							<tr>
								<th class="col-md-1">상품번호</th>
								<th class="col-md-3">상품명</th>
								<th class="col-md-4">설명</th>
								<th class="col-md-1">재고</th>
								<th class="col-md-3">수정/삭제</th> 
							</tr>
						</thead>
						<tbody>
							<c:forEach var="productlist" begin="0" items="${productList}"
								varStatus="status">

								<tr>
									<td>${productlist.product_no}</td>
									<td>${productlist.name}</td>
									<td>${productlist.desc}</td>
									<td>${productlist.number}</td>
									<td><button class="btn btn-primary"
											onclick="javascript:location.href='productlist/${productlist.product_no}';">수정</button>
										<button class="btn btn-warning"
											onclick="javascript:location.href='delete/${productlist.product_no}'">삭제</button></td>

								</tr>
							</c:forEach>
						</tbody>
					</table>
					<div class="row" style="float: right;">
						<button class="btn btn-warning"
							onclick="javascript:location.href='new_product';">상품등록</button>
					</div>
				</div>

			</div>
			<!--/row-->
		</div>
	</div>


	<!-- JS Global Compulsory -->
	<script type="text/javascript"
		src="http://code.jquery.com/jquery-1.10.2.min.js"></script>
	<script type="text/javascript"
		src="http://code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
	<script type="text/javascript"
		src="resources/assets/js/bootstrap.min.js"></script>

	<script type="text/javascript">
		jQuery(document).ready(function() {
			App.init();
			ContactPage.initMap();
			CirclesMaster.initCirclesMaster1();
		});
	</script>
	<!--[if lt IE 9]>
    <script src="./resources/assets/plugins/respond.js"></script>
    <script src="./resources/assets/plugins/html5shiv.js"></script>
<![endif]-->

</body>
</html>
