<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>

<!DOCTYPE html>
<html lang="en">

<head>
<title>College Grading System</title>
<%@include file="/WEB-INF/templates/header.jsp"%>
</head>

<body>
	<%@include file="/WEB-INF/templates/nav.jsp"%>




	<div class="container mainForm">
		<h1>Montreal College of Information Technology</h1>
		<p class="mainPara">
			Welcome to the MCIT Student Management System<span>
			<security:authentication property="name" /></span>
		</p>



	</div>
<%@include file="/WEB-INF/templates/footer.jsp"%>
</body>

</html>