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

<div class="container studentForm">

 <h1>Teacher Assignment</h1>
          <c:url var="addAction" value="assignTeachertoCourse" />
            
            <form:form action="${addAction}" modelAttribute="AssignTeacherToCourse" method="POST">  
          <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" /> 
          
      		<div class="form-group row"> 
          	<select id="teacherId" name="teacherId" class=" student_names_dropdown custom-select custom-select-lg mb-3">
            	<option value="">Select Teacher</option>
					<c:forEach items="${teacherList}" var="teacher">
						<option value="${teacher.id}">${teacher.firstName} ${teacher.lastName}</option>
					</c:forEach>
			</select>
           </div>
           
             <div class="form-group row"> 
          	<select id="courseId" name="courseId" class=" student_names_dropdown custom-select custom-select-lg mb-3">
            	<option value="">Select Course</option>
					<c:forEach items="${courseList}" var="course">
						<option value="${course.id}">${course.courseName} </option>
					</c:forEach>
			</select>
           </div>     
           <div class="form-group row">
                <div class="offset-xs-3 col-xs-9">
                    <button type="submit" name="addTeacher" id="submit">Assign Teacher</button>
                </div>
            </div>
            </form:form>

</div>
</body>
</html>	