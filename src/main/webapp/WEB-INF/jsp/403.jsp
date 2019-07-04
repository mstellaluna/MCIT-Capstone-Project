<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html lang="en">

<head>
<title>College Grading System</title>
<%@include file="/WEB-INF/templates/header.jsp"%>
</head>

<body>

    <nav class="menu" tabindex="0">
        <div class="smartphone-menu-trigger"></div>
        <header class="logo">
            <img src="${pageContext.request.contextPath}/resources/theme/images/logo.jpg">
        </header>
        <ul>
            <li tabindex="0"><span><a href="<c:url value="/login" />">Home</a></span></li>
        </ul>

        <div class="switch switch-blue">
            <input type="radio" class="switch-input" name="english-french" value="en" id="en" checked>
            <label for="en" class="switch-label switch-label-off">EN</label>
            <input type="radio" class="switch-input" name="english-french" value="fr" id="fr">
            <label for="fr" class="switch-label switch-label-on">FR</label>
            <span class="switch-selection"></span>
          </div>
    </nav>

<div class="container mainForm">

            <h1>403 - Forbidden</h1>
            <p>You don't have permission to access this page.<br>
            Please return to the main page.</p>
    
            <a class="btn btn-info" href="#" role="button">Main Page</a>

        </div>   


</body>
</html>