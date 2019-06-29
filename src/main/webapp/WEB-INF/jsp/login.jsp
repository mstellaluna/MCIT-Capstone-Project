<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>
<<<<<<< HEAD
<title>College Grading System</title>
<%@include file="/WEB-INF/templates/header.jsp"%>
=======
	<title>College Grading System</title>
	<%@include file="/WEB-INF/templates/header.jsp" %>
>>>>>>> e5bc1ff3ca3ce40fe811c83fcad6ddaa77e9244c
</head>

<body>

    <nav class="menu" tabindex="0">
        <div class="smartphone-menu-trigger"></div>
        <header class="logo">
            <img src="${pageContext.request.contextPath}/resources/theme/images/logo.jpg">
        </header>
        <ul>
<<<<<<< HEAD
            <li tabindex="0"><span><a href="index.html">Home</a></span></li>
            <li tabindex="0"><span><a href="#"> Login</a></span></li>
            <li tabindex="0"><span><a href="register_form.html">Register</a></span></li>
=======
            <li tabindex="0"><i class="fas fa-home"></i><span><a href="index.html">Home</a></span></li>
            <li tabindex="0"><i class="fas fa-sign-in-alt"></i><span><a href="#"> Login</a></span></li>
            <li tabindex="0"><i class="fas fa-user-plus"></i><span><a href="register_form.html">Register</a></span></li>
>>>>>>> e5bc1ff3ca3ce40fe811c83fcad6ddaa77e9244c
        </ul>

        <div class="switch switch-blue">
            <input type="radio" class="switch-input" name="english-french" value="en" id="en" checked>
            <label for="en" class="switch-label switch-label-off">EN</label>
            <input type="radio" class="switch-input" name="english-french" value="fr" id="fr">
            <label for="fr" class="switch-label switch-label-on">FR</label>
            <span class="switch-selection"></span>
          </div>
    </nav>


    <div class="container forms">

        <form class="text-center p-5">

            <h1>Login</h1>


            <div class="form-row form-container">
                <input type="email" id="email" class="form-control mb-4" placeholder="E-mail Address">
                <input type="password" id="password" class="form-control mb-4" placeholder="Password">
                <button class="btn btn-block" type="submit">Login</button>
                <span>New here? Register<a href="login_form.html"> here.</a></span>
            </div>    

        </form>
    </div>
</body>

</html>