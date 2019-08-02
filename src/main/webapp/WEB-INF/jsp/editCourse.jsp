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

    

    <div class="container courseForm">
        <h1>Edit Course</h1>
          <c:url var="editAction" value="/course/updateCourse?id=${course.id}" />
         
         <form:form action="${editAction}" commandName="course" method="POST">
        	  <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
             <table>
        		<tr>
					<td>
						<form:label path="id" cssClass="col-xs-3 col-form-label mr-2" >
							<spring:message text="Course ID:"/>
						</form:label>
					</td>
					<td>
						<form:input type="number" cssClass="form-control" path="id" value="${course.id}" disabled="true"/>
					</td>
				</tr>
				<tr>
					<td>
						<form:label path="courseName" cssClass="col-xs-3 col-form-label mr-2" >
							<spring:message text="Course Name:"/>
						</form:label>
					</td>
					<td>
						<form:input type="text" cssClass="form-control" path="courseName" value="${course.courseName}" required="required"/>
					</td>
				</tr>
				<tr>
					<td>
						<form:label path="creditNumber" cssClass="col-xs-3 col-form-label mr-2">
							<spring:message text="Credit Number:"/>
						</form:label>	
					</td>
					<td>
						<form:input type="text" cssClass="form-control" path="creditNumber" value="${course.creditNumber}"  required="required"/>
					</td>
				</tr>
				</table>
             <div class="form-group row">
                <div class="offset-xs-3 col-xs-9">
                    <button class="btn btn-primary" type="submit" name="updateCourse" id="submit">Update Course</button>
                </div>
                </div>
        </form:form>
    </div>
</body>

</html>

