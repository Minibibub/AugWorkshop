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
</head>
<body>
<div class="navbar navbar-fixed-top">
    <div class="navbar-inner">
        <div class="container">
            <div class="row">
                <div class="col-xs-3"><a href="armInitAdd.action">Add New</a></div>
            </div>
            <s:if test="%{arms.size() <= 0}">
                Data Not Found
            </s:if>
            <s:else>
                <div class="row">
                    <div class="col-xs-2">No</div>
                    <div class="col-xs-2">Name</div>
                    <div class="col-xs-3">Email</div>
                    <div class="col-xs-2">Age</div>
                    <div class="col-xs-3">Actions</div>
                </div>
                <s:iterator value="arms" status="armStatus">
                    <div class="row">
                        <div class="col-xs-2"><s:property value="%{#armStatus.index + 1}"/></div>
                        <div class="col-xs-2"><s:property value="name"/></div>
                        <div class="col-xs-3"><s:property value="email"/></div>
                        <div class="col-xs-2"><s:property value="age"/></div>
                        <div class="col-xs-3"><a href="armInitUpdate?id=<s:property value="id" />">Edit</a> | <a
                                href="armDelete?id=<s:property value="id" />">Delete</a></div>
                    </div>
                </s:iterator>
            </s:else>
        </div>
    </div>
</div>
<script src="js/jquery-1.11.1.min.js"></script>
<script src="css/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>