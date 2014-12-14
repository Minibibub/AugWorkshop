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
<title>UpdateMay</title>
<link rel="stylesheet" href="css/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="css/custom.css">
<script type="text/javascript">
	function update() {
		var name = document.getElementById("name");
		var email = document.getElementById("email");
		var age = document.getElementById("age");
		
		if(name.value === ""){
			alert("Plese fill-in name ");
			name.focus();
			return  false;
		}else if(email.value === ""){
			alert("Plese fill-in email ");
			email.focus();
			return  false;
		}else if(age.value < 18){
			alert("Plese fill-in age is over");
			age.focus();
			return  false;
		}else{
			document.forms[0].submit();
		}

	}
</script>
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
				<form class="form-signin" action="updatemay" method="post">
					<s:hidden name="may.id" id="id" />
					<s:textfield cssClass="form-control" autofocus="" require=""
						placeholder="Name" name="may.name" id="name" />
					<s:textfield cssClass="form-control" autofocus="" require=""
						placeholder="Email" name="may.email" id="email" />
					<s:textfield cssClass="form-control" autofocus="" require=""
						placeholder="Age" name="may.age" id="age" />
					<s:textfield cssClass="form-control" autofocus="" require=""
						placeholder="Owner" name="may.may" id="namemay" />
					<center>
						<div class="row">
							<div class="col-xs-6">
								<button class="btn btn-md btn-primary btn-block"
									onclick="return update()">Update</button>
							</div>
							<div class="col-xs-6">
								<button class="btn btn-md btn-primary btn-block" type="reset">Cancel</button>
							</div>
						</div>
					</center>
				</form>
			</div>
		</div>
	</div>
	<script src="css/js/bootstrap.min.js"></script>
</body>
</html>