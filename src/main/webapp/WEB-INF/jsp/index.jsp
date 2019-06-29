<<<<<<< HEAD
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
=======
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
>>>>>>> e5bc1ff3ca3ce40fe811c83fcad6ddaa77e9244c

<!DOCTYPE html>
<html lang="en">

<head>
<<<<<<< HEAD
<title>College Grading System</title>
<%@include file="/WEB-INF/templates/header.jsp"%>
=======

>>>>>>> e5bc1ff3ca3ce40fe811c83fcad6ddaa77e9244c
</head>

<body>

<<<<<<< HEAD
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
		</ul>
	</nav>

=======
        <nav class="menu" tabindex="0">
                <div class="smartphone-menu-trigger"></div>
                <header class="logo">
                    <img src="/resources/theme/images/logo.jpg" />
                    <sec:authentication property="name"/>
                </header>
                <ul>
                    <li tabindex="0"><i class="fas fa-home"></i><span><a href="#">Home</a></span></li>
                    <li tabindex="0"><i class="fas fa-sign-in-alt"></i><span><a href="login_form.html"> Login</a></span></li>
                    <li tabindex="0"><i class="fas fa-user-plus"></i><span><a href="register_form.html">Register</a></span></li>
                </ul>
            </nav>
>>>>>>> e5bc1ff3ca3ce40fe811c83fcad6ddaa77e9244c


	<div class="container mainForm">
		<h1>Montreal College of Information Technology</h1>
		<p id="mainPara">
			Welcome to the MCIT Student Management System<span>
			<sec:authentication property="name" /></span>
		</p>

<<<<<<< HEAD
=======
    <div class="container mainForm">
            <h1>Montreal College of Information Technology</h1>
            
            <p id="mainPara"> Welcome to the MCIT Student Management System <sec:authentication property="name"/></p>
>>>>>>> e5bc1ff3ca3ce40fe811c83fcad6ddaa77e9244c


	</div>

</body>

</html>