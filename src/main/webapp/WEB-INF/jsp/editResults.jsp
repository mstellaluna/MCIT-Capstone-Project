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
<body>
<%@include file="/WEB-INF/templates/nav.jsp"%>




   <div class="container resultsForm">
   <h1>Edit Results</h1>
     <c:url var="editAction" value="/results/edit_results" />
            <h1>Edit Results</h1>
            <form:form action="${editAction }" modelAttribute="results" method="post">
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
           <table>
        		<tr>
					<td>
						<form:label path="session" cssClass="col-xs-3 col-form-label mr-2" >
							<spring:message text="Session:"/>
						</form:label>
					</td>
					<td>
						<form:input type="number" cssClass="form-control" path="session" value="${results.session }" />
					</td>
				</tr>
				<tr>
					<td>
						<form:label path="mark" cssClass="col-xs-3 col-form-label mr-2" >
							<spring:message text="Mark:"/>
						</form:label>
					</td>
					<td>
						<form:input type="text" cssClass="form-control" path="results.mark" value="${results.mark}" required="required"/>
					</td>
				</tr>      	
               </table>
               <div class="form-group row">
                <div class="offset-xs-3 col-xs-9">
                        <button class="btn btn-info" type="submit" name="editResults" id="submit">Update Results</button>
                </div>
                </div>        
                </form:form>
    </div>
  
</body>

</html>
