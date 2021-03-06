<!DOCTYPE html SYSTEM "http://www.thymeleaf.org/dtd/xhtml1-strict-thymeleaf-spring3-3.dtd">
<html lang="en">
<head>
<title>SMSC | Spring MVC Source Customizing</title>

<!-- Meta -->
<meta charset="utf-8"></meta>
<meta name="viewport" content="width=device-width, initial-scale=1.0"></meta>
<meta name="description" content=""></meta>
<meta name="author" content=""></meta>

<link rel="shortcut icon" href="favicon.ico"></link>

<link rel="stylesheet" href="./resources/assets/css/style.css"></link>


</head>

<body>
	<div class="container" style="margin-top: 20px;">
		<div class="container small">
			<div>
				<form id="user" class="form-horizontal" action="./" method="post">
					<div style="text-align: center;">
						<span style="font-size: 50px;">Login to your account.</span>
					</div>
					<label>ID</label>
					<input id="id" name="id" class="form-control" style="margin-bottom:20px;" type="text" value=""/>
					<label>PW</label>
					<input id="pw" name="pw" class="form-control" style="margin-bottom:20px;" type="password" value=""/>

					<div style="text-align: center;">
						<button class="button" type="submit">로그인</button>
					</div>

					<div>
						<h5>가입하기</h5>
					</div>
					<p>
						<a class="color-green" href="register">click here</a> to sign up.
					</p>
				</form>
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
