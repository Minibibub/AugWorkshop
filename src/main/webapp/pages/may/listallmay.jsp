<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title>ListAllMay</title>
<link rel="stylesheet" href="css/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="css/custom.css">
</head>
<body>
	<div class="navbar navbar-fixed-top">
		<div class="navbar-inner">
			<div class="container">
				<s:if test="hasActionErrors()">
					<div class="alert alert-danger">
						<s:actionerror />
					</div>
				</s:if>
				<form class="form-signin" action="findmay" method="get">
					<s:textfield cssClass="form-control" autofocus="" require=""
						placeholder="Name" name="name" id="name" />
					<div class="row">
						<div class="col-xs-4">
							<button class="btn btn-md btn-primary btn-block"
								onclick="excute(document.getElementById('name').value)">Ok</button>
						</div>
					</div>
					<br>
					
				</form>
				
				<form class="form-signin" action="listallmay" method="post">
					<s:iterator value="mays">
						<s:property value="name" />
						<s:property value="email" />
						<s:property value="age" />
						<s:property value="may" />
						<a href="initUpdateMay?id=<s:property value="id" />">Edit |</a>
						<a href="deleteMay?id=<s:property value="id" />">Delete</a>
						<br>
					</s:iterator>
				</form>
			</div>
		</div>
	</div>
	<script src="css/js/bootstrap.min.js"></script>
</body>
</html>