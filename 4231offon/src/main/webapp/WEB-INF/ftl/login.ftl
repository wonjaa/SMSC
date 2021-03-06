<#ftl encoding="utf-8"/>
<!DOCTYPE html>
<html lang="en">
<head>
<title>SMSC | Spring MVC Source Customizing</title>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<link rel="shortcut icon" href="favicon.ico">

<link rel="stylesheet" href="./resources/assets/css/style.css">


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

					<hr>
					<div>
						<h5>가입하기</h5>
					</div>
					<p>
						<a class="color-green" href="register">click here</a> to sign up.
					</p>
				</form>
			</div>
		</div>
	</div>


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

</body>
</html>
