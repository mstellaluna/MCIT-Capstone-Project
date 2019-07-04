<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>

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
			<li tabindex="0" class="icon-student"><span><a
					href="<c:url value="/logout" />"> Home</a></span></li>
		</ul>
	</nav>



	<div class="container mainForm">
		<!-- <h1>Montreal College of Information Technology</h1>-->

	<form name='f' action="logout" method='POST'>
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
				<p id="logoutPara"> You have been successfully logged out.</p>
    </form>
</div>
</body>