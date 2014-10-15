<!DOCTYPE html>
<html lang="en">
<head>
<title>SMSC | Spring MVC Source Customizing</title>

<meta charset="utf-8">
<META HTTP-EQUIV="contentType" CONTENT="text/html;charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<link rel="shortcut icon" href="favicon.ico">

<link rel="stylesheet" href="./resources/assets/css/style.css">


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
								<input type="submit" value="가입하기">
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>


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

</body>
</html>
