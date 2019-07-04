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
			<img
				src="${pageContext.request.contextPath}/resources/theme/images/logo.jpg">
		</header>
		<ul>
			<li tabindex="0" class="icon-student"><span><a
					href="index.html"> Home</a></span></li>
			<li tabindex="0" class="icon-student"><span><a
					href="addStudent.html">Student</a></span></li>
			<li tabindex="0" class="icon-course"><span><a
					href="addCourse.html">Course</a></span></li>
			<li tabindex="0" class="icon-results"><span><a
					href="addResults.html">Results</a></span></li>
			<li tabindex="0" class="icon-results"><span><a
					href="<c:url value="/logout" />">Logout</a></span></li>
		</ul>
	</nav>



	<div class="container mainForm">
		<h1>Montreal College of Information Technology</h1>
		<p id="mainPara">
			Welcome to the MCIT Student Management System<span>
			<sec:authentication property="name" /></span>
		</p>



	</div>

</body>

</html>