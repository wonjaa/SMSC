<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
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
<meta charset="utf-8">
<META HTTP-EQUIV="contentType" CONTENT="text/html;charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<!-- Favicon -->
<link rel="shortcut icon" href="favicon.ico">

<!-- CSS Global Compulsory -->
<link rel="stylesheet" href="./resources/assets/css/bootstrap.min.css">


</head>

<body class="container">


	<div class="row">



		<div class="container">
			<div class="row">
				<div class="col-md-4 col-md-offset-4 col-sm-6 col-sm-offset-3">
					<div class="reg-header">
						<h2>SIGN UP</h2>
					</div>

					<form:form class="form-horizontal" modelAttribute="user">
						<div class="form-group">
							<label for="id" class="col-sm-2 control-label">ID</label>
							<div class="col-sm-10">
								<form:input cssClass="form-control" path="id"
									style="max-width:300px;" />
							</div>
						</div>
						<div class="form-group">
							<label for="pw" class="col-sm-2 control-label">Password</label>
							<div class="col-sm-10">
								<form:password cssClass="form-control" path="pw"
									style="max-width:300px;" />
							</div>
						</div>

						<div class="form-group">
							<label for="pw" class="col-sm-2 control-label">Confirm</label>
							<div class="col-sm-10">
								<input type="password" class="form-control" id="pw2"
									style="max-width: 300px;" />
							</div>
						</div>

						<div class="form-group">
							<label for="age" class="col-sm-2 control-label">Age</label>
							<div class="col-sm-10">
								<form:input cssClass="form-control" path="age"
									style="max-width:300px;" />
							</div>
						</div>

						<div class="form-group">
							<div class="col-sm-offset-2 col-sm-10">
								<button type="submit" class="btn btn-default">Sign up</button>
							</div>
						</div>
					</form:form>
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
