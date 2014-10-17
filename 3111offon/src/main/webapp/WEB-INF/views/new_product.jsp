<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en">
<!--<![endif]-->
<head>
<title>SMSC | Spring MVC Source Customizing</title>

<!-- Meta -->
<meta HTTP-EQUIV="contentType" CONTENT="text/html;charset=UTF-8"></meta>
<meta charset="utf-8"></meta>
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
			<div style="float: right; padding: 20px 10px 20px 0;">
				로그인 성공! <b>[<span th:text="${userid}"></span> 님]</b> 환영합니다.<br />
				<div style="float: right;">
					<a href="logout">로그아웃</a>
				</div>
			</div>
		</div>
		<div>
			<div>
				<form id="product" name="product" accept-charset="UTF-8" action="./new_product" method="post">
					<div style="font-size:24px;text-align: center;">
						상품생성
					</div>
					<div>
						<div style="padding-bottom: 10px;">상품명</div>
						<div>
							<input id="name" name="name" class="form-control" type="text" value=""/>
						</div>
					</div>
					<div>
						<div style="padding: 20px 0 10px 0;">재고</div>
						<div>
							<input id="number" name="number" class="form-control" type="number" value="0"/>
						</div>
					</div>
					<div>
						<div style="padding: 20px 0 10px 0;">설명</div>
						<div>
							<input id="desc" name="desc" class="form-control" type="text" value=""/>
						</div>
					</div>
					<div style="padding: 20px; text-align: center;">
						<input type="submit" class="button" value="생성하기"/>

					</div>
				</form>
				<div style="float:right;">
					<button class="button alt"
						onclick="javascript:location.href='productlist';">취소</button>
				</div>
			</div>
		</div>
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
