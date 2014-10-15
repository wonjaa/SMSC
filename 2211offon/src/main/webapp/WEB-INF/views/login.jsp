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
<link rel="stylesheet" href="./resources/assets/css/style.css">


</head>

<body>
	<div class="container" style="margin-top: 20px;">
		<div class="container small">
			<div>
				<form:form class="form-horizontal" modelAttribute="user">
					<div style="text-align: center;">
						<span style="font-size: 50px;">Login to your account.</span>
					</div>
					<label>ID</label>
					<form:input cssClass="form-control" path="id"
						style="margin-bottom:20px;" />
					<label>PW</label>
					<form:password cssClass="form-control" path="pw"
						style="margin-bottom:20px;" />

					<div style="text-align: center;">
						<button class="button" type="submit">로그인</button>
					</div>

					<hr>
					<div>
						<h5>가입하기</h5>
					</div>
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
	<script type="text/javascript" src="./resources/assets/js/skel.min.js"></script>
	<script type="text/javascript"
		src="./resources/assets/js/skel-layers.min.js"></script>
	<script type="text/javascript" src="./resources/assets/js/init.js"></script>

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
