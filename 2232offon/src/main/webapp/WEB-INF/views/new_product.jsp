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
<META HTTP-EQUIV="contentType" CONTENT="text/html;charset=UTF-8">
<meta charset="utf-8">
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


		<div class="container">
			<div class="row">
				<div class="row">
					<div class="pull-right" style="padding: 20px 10px 20px 0;">
						로그인 성공! <b>[${sessionScope.userInfo.id}님]</b> 환영합니다.<br />
						<div style="float: right;">
							<a href="logout">로그아웃</a>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-md-offset-4 col-md-4 col-md-offset-4">
						<form:form commandName="product" name="product"
							accept-charset="UTF-8">
							<div style="text-align: center;">
								<h4>
									<b>상품등록</b>
								</h4>
							</div>
							<div>
								<div style="padding-bottom:10px;">이름</div> <div> <form:input
										cssClass="form-control" path="name" />
								</div>
							</div>
							<div>
								<div style="padding:20px 0 10px 0;">재고</div><div><form:input type="number" cssClass="form-control"
										path="number" /></div>
							</div>
							<div>
								<div style="padding:20px 0 10px 0;">설명</div><div><form:input cssClass="form-control"
										path="desc" /></div>
							</div>
							<div style="padding:20px;text-align:center;">
								<input type="submit" class="btn btn-warning" value="만들기">
								
							</div>
						</form:form>
						<div class="pull-right">
						<button class="btn btn-default" onclick="javascript:location.href='productlist';">취소</button>
						</div>
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
