<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<!-- Favicon -->
<link rel="shortcut icon" href="favicon.ico">

<!-- CSS Global Compulsory -->
<link rel="stylesheet" href="./resources/assets/css/bootstrap.min.css">


</head>

<body>
	<div class="container" style="margin-top:20px;">
		<div class="row">
			<div
				class="col-md-4 col-md-offset-4 col-sm-6 col-sm-offset-3 breadcrumb">
				<form:form class="form-horizontal" modelAttribute="user">
					<div class="row" style="text-align: center;">
						<h2>Login to your account.</h2>
					</div>
					<label>ID</label>
					<form:input cssClass="form-control" path="id"
						style="margin-bottom:20px;" />
					<label>PW</label>
					<form:password cssClass="form-control" path="pw"
						style="margin-bottom:20px;" />
					<div class="row">
						<div style="text-align: center;">
							<button class="btn btn-primary" type="submit">로그인</button>
						</div>
					</div>
					<hr>
					<h4>가입하기</h4>
					<p>
						<a class="color-green" href="register">click here</a> to sign up.
					</p>
				</form:form>
			</div>
		</div>
		<!--/row-->
	</div>


	<!-- JS Global Compulsory -->
	<script type="text/javascript"
		src="http://code.jquery.com/jquery-1.10.2.min.js"></script>
	<script type="text/javascript"
		src="http://code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
	<script type="text/javascript"
		src="./resources/assets/js/bootstrap.min.js"></script>

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
