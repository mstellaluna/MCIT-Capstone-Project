<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<head>
<title>College Grading System</title>
<%@include file="/WEB-INF/templates/header.jsp"%>
</head>

<body>
	<%@include file="/WEB-INF/templates/nav.jsp"%>






    <div class="container courseForm">
            <h1>Add Course</h1>
            <form action="course" method="post">           
                <div class="form-group row">
                <label for="courseName" class="col-xs-3 col-form-label mr-2">Course Name:</label>
                <div class="col-xs-9">
                <input type="text" class="form-control" id="courseName" name="courseName">
                </div>
                </div>
                <div class="form-group row">
                <div class="offset-xs-3 col-xs-9">
                        <button type="submit" name="addCourse" id="submit">Add Course</button>
                        <button type="submit" name="viewAllCourses" id="submit">View All Courses</button>
                </div>
                </div>
                </form>
    </div>
</body>

</html>


