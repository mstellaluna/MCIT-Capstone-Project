<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
<title>College Grading System</title>
<%@include file="/WEB-INF/templates/header.jsp"%>
</head>

<body>

<%@include file="/WEB-INF/templates/nav.jsp"%>

<div class="container studentForm">
         <form action="student" method="post">
            <div class="form-group row">
                <select id="student_names" class=" student_names_dropdown custom-select custom-select-lg mb-3">
                    <option selected>Select Student</option>
                    <c:forEach items="studentList" var="student">
                    <option value="">${student.id} ${student.firstName} ${student.lastName}</option>
                </c:forEach>    
                  </select>
            </div>
            <div class="form-group row">
                <select id="course_names" class=" course_names_dropdown custom-select custom-select-lg mb-3">
                    <option selected>Select Course</option>
                    <c:forEach items="courseList" var="student">
                    <option value="">${course.id} ${course.courseName}</option>
                </c:forEach>    
                  </select>
            </div>
            <div class="form-group row">
                <div class="offset-xs-3 col-xs-9">
                    <button type="submit" name="updateStudent" id="submit">Assign Student</button>
                </div>
            </div>
        </form>


</div>
</body>
</html>	