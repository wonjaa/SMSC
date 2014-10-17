<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en">
<!--<![endif]-->
<head>
<title>SMSC | Spring MVC Source Customizing</title>

<!-- Meta -->
<meta charset="utf-8"></meta>
<META HTTP-EQUIV="contentType" CONTENT="text/html;charset=UTF-8"></META>
<meta name="viewport" content="width=device-width, initial-scale=1.0"></meta>
<meta name="description" content=""></meta>
<meta name="author" content=""></meta>

<!-- Favicon -->
<link rel="shortcut icon" href="favicon.ico"></link>

<!-- CSS Global Compulsory -->
<link rel="stylesheet" href="./resources/assets/css/style.css"></link>


</head>

<body>


	<div class="container small">



		<div>
			<div>
				<div>
					<div style="text-align: center;">
								<h4>
									<b>가입하기</b>
								</h4>
							</div>

					<form id="user" action="./register" method="post">
						<div class="form-group">
							<label for="id">ID</label>
							<div>
								<input id="id" name="id" class="form-control" type="text" value=""/>
							</div>
						</div>
						<div class="form-group">
							<label for="name">name</label>
							<div>
								<input id="name" name="name" class="form-control" type="text" value=""/>
							</div>
						</div>
						<div class="form-group">
							<label for="pw">Password</label>
							<div>
								<input id="pw" name="pw" class="form-control" type="password" value=""/>
							</div>
						</div>

						<div class="form-group">
							<label>Confirm</label>
							<div>
								<input type="password" class="form-control" id="pw2"/>
							</div>
						</div>

						<div>
							<label for="age">Age</label>
							<div>
								<input id="age" name="age" class="form-control" type="text" value="0"/>
							</div>
						</div>

						<div class="form-group" style="padding-top:20px;text-align:center;">
							<div>
								<input type="submit" value="가입하기"/>
							</div>
						</div>
					</form>
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
