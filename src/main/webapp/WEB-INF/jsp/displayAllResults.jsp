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



<div class="container allResultsView">
    <h1>All Results</h1>
    <table class="table table-bordered table-responsive-md table-striped text-center">
        <tr>
            <th class="text-center">Student ID</th>
            <th class="text-center">First Name</th>
            <th class="text-center">Last Name</th>
            <th class="text-center">Course ID</th>
            <th class="text-center">Course Name</th>
            <th class="text-center">Marks 1</th>
            <th class="text-center">Marks 2</th>
            <th class="text-center">Grade</th>
            <th class="text-center">Actions</th>
        </tr>
        <c:forEach items="${completeList}" var="results">
            <tr>
                <td class="pt-3-half">${results.student.id}</td>
                <td class="pt-3-half">${results.student.firstName}</td>
                <td class="pt-3-half">${results.student.lastName}</td>
                <td class="pt-3-half">${results.course.id}</td>
                <td class="pt-3-half">${results.course.courseName}</td>
                <td class="pt-3-half">${results.mark1}</td>
                <td class="pt-3-half">${results.mark2}</td>
                <td class="pt-3-half">${results.grade}</td>
                <td>
                    <span class="table-edit"><a type="button" class="btn btn-primary btn-rounded btn-sm my-0"  href="<c:url value='/results?studentId=${results.student.id}&courseId=${results.course.id}&action=edit'/> ">Edit</a></span>
                    <span class="table-remove"><a type="button" class="btn btn-danger btn-rounded btn-sm my-0" href="<c:url value='/results?studentId=${results.student.id}&courseId=${results.course.id}&action=delete'/> ">Delete</a></span>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>


</body>

</html>
