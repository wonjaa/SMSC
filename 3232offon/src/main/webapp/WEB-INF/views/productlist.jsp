<!DOCTYPE html SYSTEM "http://www.thymeleaf.org/dtd/xhtml1-strict-thymeleaf-spring3-3.dtd">
<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en">
<!--<![endif]-->
<head>
<title>SMSC | Spring MVC Source Customizing</title>

<!-- Meta -->
<meta charset="utf-8" />
<META HTTP-EQUIV="contentType" CONTENT="text/html;charset=UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta name="description" content="" />
<meta name="author" content="" />

<!-- Favicon -->
<link rel="shortcut icon" href="favicon.ico" />

<!-- CSS Global Compulsory -->
<link rel="stylesheet" href="resources/assets/css/bootstrap.min.css" />


</head>

<body class="container">


	<div class="row">


		<div class="container">
			<div class="row">

				<div class="col-md-offset-1 col-md-10 col-md-offset-1">
					<div style="float: right; padding: 20px 10px 20px 0;">
						로그인 성공! <b>[<span th:text="${userid}"></span> 님]
						</b> 환영합니다.<br />
						<div style="float: right;">
							<a href="logout">로그아웃</a>
						</div>
					</div>
					<table class="table table-hover">
						<thead>
							<tr>
								<th>상품번호</th>
								<th>상품명</th>
								<th style="width: 300px;">설명</th>
								<th>재고</th>
								<th>수정/삭제 </th>
							</tr>
						</thead>
						<tbody>
							<tr th:each="productList : ${productList}">
								<td th:text="${productList.product_no}">#</td>
								<td th:text="${productList.name}">상품명</td>
								<td th:text="${productList.desc}">설명</td>
								<td th:text="${productList.number}">재고</td>
								<td><a
									th:href="@{'productlist/'+${productList.product_no}}">수정</a>
									<a th:href="@{'delete/'+${productList.product_no}}">삭제</a></td>

							</tr>
						</tbody>
					</table>
					<div class="row" style="float: right;">
						<button class="button"
							onclick="javascript:location.href='new_product';">상품등록</button>
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
