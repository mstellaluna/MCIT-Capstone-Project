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

	<div class="container teacherForm">
		<h1>Add Teacher</h1>
		     <c:url var="addAction" value="addTeacher" />

        <form:form action="${addAction}" commandName="teacher" method="POST">
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
			<table>
				<tr>
					<td>
						<form:label path="firstName" cssClass="col-xs-3 col-form-label mr-2" >
							<spring:message text="First Name:"/>
						</form:label>
					</td>
					<td>
						<form:input type="text" cssClass="form-control" path="firstName" />
						<form:errors path="firstName" cssClass="errorMessage" />
					</td>
				</tr>  
				<tr>
					<td>
						<form:label path="lastName" cssClass="col-xs-3 col-form-label mr-2">
							<spring:message text="Last Name:"/>
						</form:label>	
					</td>
					<td>
						<form:input type="text" cssClass="form-control" path="lastName" />
						<form:errors path="lastName" cssClass="errorMessage" />
					</td>
				</tr>
				<tr>
					<td>
						<form:label path="address" cssClass="col-xs-3 col-form-label mr-2">
							<spring:message text="Address:"/>
						</form:label>
					</td>
					<td>
						<form:input type="text" cssClass="form-control" path="address" />
						<form:errors path="address" cssClass="errorMessage" />					
					</td>
				</tr>
				<tr>
					<td>
						<form:label path="city" cssClass="col-xs-3 col-form-label mr-2">
							<spring:message text="City:"/>
						</form:label>	
					</td>
					<td>
						<form:input type="text" cssClass="form-control" path="city" />
						<form:errors path="city" cssClass="errorMessage" />
					</td>
				</tr>
				<tr>
					<td>
						<form:label path="country" cssClass="col-xs-3 col-form-label mr-2">
							<spring:message text="Country:"/>
						</form:label>	
					</td>
					<td>
						<form:input type="text" cssClass="form-control" path="country" />
						<form:errors path="country" cssClass="errorMessage" />
					</td>
				</tr>
				<tr>
					<td>
						<form:label path="phoneNumber" cssClass="col-xs-3 col-form-label mr-2">
							<spring:message text="Phone Number: "/>
						</form:label>	
					</td>
					<td>
						<form:input type="tel" cssClass="form-control" path="phoneNumber" />
						<form:errors path="phoneNumber" cssClass="errorMessage" />
					</td>
				</tr>
				<tr>
					<td>
						<form:label path="salary" cssClass="col-xs-3 col-form-label mr-2" >
							<spring:message text="Salary:"/>
						</form:label>
					</td>
					<td>
						<form:input type="number" cssClass="form-control" path="salary" />
						<form:errors path="salary" cssClass="errorMessage" />
					</td>
				</tr>  
				
				<tr>
					<td style="text-align: center;" colspan="2">
						<button class="btn btn-primary" type="submit" name="submitStudentForm" id="submit">Add Teacher</button>						
						<button class="btn btn-info" type="submit" name="viewAllStudents" id="submit">View All Teachers</button>		
					</td>
				</tr>
			</table>
		</form:form>
	</div>
</body>

</html>