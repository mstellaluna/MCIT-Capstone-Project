<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html lang="en">

<head>
<title>College Grading System</title>
<%@include file="/WEB-INF/templates/header.jsp"%>
</head>

<body>

<%@include file="/WEB-INF/templates/nav.jsp"%>

<div class="container mainForm">
		  <h1>Student Enrollment</h1>
          <c:url var="addAction" value="registerStudentToCourse" />
            
            <form:form action="${addAction}" modelAttribute="RegisterStudentToCourseForm" method="POST">  
          <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" /> 
     
      		<div class="form-group row"> 
      		<p>${emptyStudentList}</p>
          	<select id="studentId" name="studentId" class=" student_names_dropdown custom-select custom-select-lg mb-3">
            	<option value="">Select Student</option>
					<c:forEach items="${studentList}" var="student">
						<option value="${student.id}">${student.firstName} ${student.lastName}</option>
					</c:forEach>
			</select>
           </div>
           	
             <div class="form-group row"> 
             <p>${emptyCourseList}</p>
          	<select id="courseId" name="courseId" class=" student_names_dropdown custom-select custom-select-lg mb-3">
            	<option value="">Select Course</option>
					<c:forEach items="${courseList}" var="course">
						<option value="${course.id}">${course.courseName} </option>
					</c:forEach>
			</select>
           </div>      
                 	
            <div class="form-group row">
                <div class="offset-xs-3 col-xs-9">
                    <button class="btn btn-info" type="submit" name="assignStudentToCourse" id="submit">Assign Student</button>
                </div>
                </div>
        </form:form>


</div>
</body>
</html>	