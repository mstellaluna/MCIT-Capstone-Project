<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <meta author="Mary Mule">
    <title>Edit Course</title>

    <!--SITE FAVICON-->
    <link rel="shortcut icon" href="./img/favicon.jpg" type="image/x-icon">

    <!-- BOOTSTRAP 4 AND CUSTOM CSS FILE IMPORT-->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
        integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="stylesheet" href="./css/styles.css">

    <!-- FontAwesome CDN-->
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.1/css/all.css"
        integrity="sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr" crossorigin="anonymous">

    <!-- Google Font Import-->
    <link href="https://fonts.googleapis.com/css?family=Poppins|Lato" rel="stylesheet">

</head>

<body>


    <nav class="menu" tabindex="0">
        <div class="smartphone-menu-trigger"></div>
        <header class="logo">
            <img src="./img/logo.jpg" />
        </header>
        <ul>
                        <li tabindex="0" class="icon-home"><i class="fas fa-home"></i><span><a href="index.html"> Home</a></span></li>
            <li tabindex="0" class="icon-student"><i class="fas fa-user"></i><span><a href="addStudent.html"> Student</a></span></li>
            <li tabindex="0" class="icon-course"><i class="fas fa-book"></i><span><a href="addCourse.html"> Course</a></span></li>
            <li tabindex="0" class="icon-results"><i class="fas fa-clipboard"></i><span><a href="addResults.html"> Results</a></span></li>
        </ul>
    </nav>

    <nav class="menu" tabindex="0">
        <div class="smartphone-menu-trigger"></div>
        <header class="logo">
            <img src="logo.jpg" />
        </header>
        <ul>
            <li tabindex="0" class="icon-home"><i class="fas fa-home"></i><span><a href="index.html"> Home</a></span>
            </li>
            <li tabindex="0" class="icon-student"><i class="fas fa-user"></i><span><a href="addStudent.html">
                        Student</a></span></li>
            <li tabindex="0" class="icon-course"><i class="fas fa-book"></i><span> Course</span></li>
            <li tabindex="0" class="icon-results"><i class="fas fa-clipboard"></i><span> Results</span></li>
        </ul>
    </nav>



    <div class="container courseForm">
        <h1>Edit Course</h1>
        <form action="course" method="post">
            <div class="form-group row">
                <label for="id" class="col-xs-3 col-form-label mr-2">Course ID:</label>
                <div class="col-xs-9">
                    <input type="text" class="form-control" value="${course.id}" name="id" disabled>
                </div>
            </div>
            <div class="form-group row">
                <label for="courseName" class="col-xs-3 col-form-label mr-2">Course Name:</label>
                <div class="col-xs-9">
                    <input type="text" class="form-control" value="${course.courseName}" name="courseName">
                </div>
            </div>
             <div class="form-group row">
                <div class="offset-xs-3 col-xs-9">
                    <button type="submit" name="updateCourse" id="submit">Update</button>
                </div>
                </div>
        </form>
    </div>
</body>

</html>

