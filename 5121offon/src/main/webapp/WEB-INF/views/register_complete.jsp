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
	<div class="container" style="margin-top:20px;">
		<div class="row">
			<div
				class="col-md-offset-2 col-md-8 col-md-offset-2 breadcrumb">
					<div class="row" style="text-align: center;">
						<p><b>회원가입이 완료되었습니다. 로그인 해 주세요.</b></p>
						<div>
							<button class="btn btn-primary" onclick="javascript:location.href='./';">로그인하기</button>
						</div>
						
					</div>
					
					
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
	<script type="text/javascript" src="./resources/assets/js/skel-layers.min.js"></script>
	<script type="text/javascript"
		src="./resources/assets/js/init.js"></script>

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
