<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>

<head>
<title>College Grading System</title>
<%@include file="/WEB-INF/templates/header.jsp"%>
</head>

<body>
	<%@include file="/WEB-INF/templates/nav.jsp"%>


    <div class="container courseForm">
            <h1>Add Course</h1>
            <c:url var="addAction" value="addCourse" />
            
            <form:form action="${addAction}" commandName="course" method="POST">  
              <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />  
              <table>
              	<tr> 
              		<td>
              			<form:label path="courseName" cssClass="col-xs-3 col-form-label mr-2" >
							<spring:message text="Course Name:"/>
						</form:label>
              		</td>
              		<td>
              			<form:input type="text" cssClass="form-control" path="courseName" />
              			<form:errors path="courseName" cssClass="errorMessage" />
              		</td>
                </tr>
                <tr> 
              		<td>
              			<form:label path="creditNumber" cssClass="col-xs-3 col-form-label mr-2" >
							<spring:message text="Course Credit:"/>
						</form:label>
              		</td>
              		<td>
         			
              			<form:input type="text" cssClass="form-control" path="creditNumber" />
              			<form:errors path="creditNumber" cssClass="errorMessage" />
              			
              		</td>
                </tr>
              </table>
              
                   
               
                <div class="form-group row">
                <div class="offset-xs-3 col-xs-9">
                        <button class="btn btn-primary" type="submit" name="addCourse" id="submit">Add Course</button>
                </div>
                </div>
                </form:form>
    </div>
</body>

</html>


