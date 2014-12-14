<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Arm - List</title>
    <link rel="stylesheet" href="css/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="css/custom.css">
    <script type="text/javascript">
        function add() {
            document.forms[0].action = "armAdd";
            document.forms[0].submit();
        }

        function update() {
            document.forms[0].action = "armUpdate";
            document.forms[0].submit();
        }

        function clear() {
            document.forms[0].action = "armInitAdd";
            document.forms[0].submit();
        }
    </script>
</head>
<body>
<div class="navbar navbar-fixed-top">
    <div class="navbar-inner">
        <div class="container">
            <s:if test="hasActionErrors()">
                <div class="alert alert-danger">
                    <s:actionerror/>
                </div>
            </s:if>
            <form class="form-signin" action="armAdd.action" method="post">
                <s:hidden name="model.id" id="id"/>
                <s:textfield cssClass="form-control" placeholder="Full Name" name="model.name" id="name"/>
                <s:textfield cssClass="form-control" placeholder="Email" name="model.email" id="email"/>
                <s:textfield cssClass="form-control" placeholder="Age" name="model.age" id="age"/>
                <s:textfield cssClass="form-control" placeholder="Owner" name="model.arm" id="owner"/>
                <s:if test="%{id == null}">
                    <button class="btn btn-md btn-primary" onclick="add()">Add</button>
                </s:if>
                <s:if test="%{id != null}">
                    <button class="btn btn-md btn-primary" onclick="update()">Update</button>
                </s:if>
                <button class="btn btn-md btn-primary" onclick="clear()">Clear</button>
            </form>
        </div>
    </div>
</div>
<script src="js/jquery-1.11.1.min.js"></script>
<script src="css/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>