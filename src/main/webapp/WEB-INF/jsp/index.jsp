<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<!DOCTYPE html>
<html lang="en">

<head>

</head>

<body>

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



    <div class="container mainForm">
            <h1>Montreal College of Information Technology</h1>
            
            <p id="mainPara"> Welcome to the MCIT Student Management System <sec:authentication property="name"/></p>


   
    </div>

</body>

</html>