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
   

    <div class="container studentForm">
        <h1>Edit Student</h1>
          <c:url var="editAction" value="/student/updateStudent?id=${student.id}" />

        <form:form action="${editAction}" commandName="student" method="POST">
          <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
               <table>
        		<tr>
					<td>
						<form:label path="id" cssClass="col-xs-3 col-form-label mr-2" >
							<spring:message text="Student ID:"/>
						</form:label>
					</td>
					<td>
						<form:input type="number" cssClass="form-control" path="id" value="${student.id}" disabled="true"/>
					</td>
				</tr>
				<tr>
					<td>
						<form:label path="firstName" cssClass="col-xs-3 col-form-label mr-2" >
							<spring:message text="First Name:"/>
						</form:label>
					</td>
					<td>
						<form:input type="text" cssClass="form-control" path="firstName" value="${student.firstName}" required="required"/>
					</td>
				</tr>
				<tr>
					<td>
						<form:label path="lastName" cssClass="col-xs-3 col-form-label mr-2">
							<spring:message text="Last Name:"/>
						</form:label>	
					</td>
					<td>
						<form:input type="text" cssClass="form-control" path="lastName" value="${student.lastName}"  required="required"/>
					</td>
				</tr>
				<tr>
					<td>
						<form:label path="address" cssClass="col-xs-3 col-form-label mr-2">
							<spring:message text="Address:"/>
						</form:label>
					</td>
					<td>
						<form:input type="text" cssClass="form-control" path="address" value="${student.address}" required="required"/>					
					</td>
				</tr>
				<tr>
					<td>
						<form:label path="city" cssClass="col-xs-3 col-form-label mr-2">
							<spring:message text="City:"/>
						</form:label>	
					</td>
					<td>
						<form:input type="text" cssClass="form-control" path="city" value="${student.city}" required="required"/>					
					</td>
				</tr>
				<tr>
					<td>
						<form:label path="country" cssClass="col-xs-3 col-form-label mr-2">
							<spring:message text="Country:"/>
						</form:label>	
					</td>
					<td>
						<form:input type="text" cssClass="form-control" path="country" value="${student.country}" required="required"/>						
					</td>
				</tr>
				<tr>
					<td>
						<form:label path="phoneNumber" cssClass="col-xs-3 col-form-label mr-2">
							<spring:message text="Phone Number: "/>
						</form:label>	
					</td>
					<td>
						<form:input type="tel" cssClass="form-control" path="phoneNumber" value="${student.phoneNumber}" required="required"/>
					</td>
				</tr>
				<tr>
					<td>
						<form:label path="major" cssClass="col-xs-3 col-form-label mr-2">
							<spring:message text="Major:"/>
						</form:label>	
					</td>
					<td>
						<form:input type="text" cssClass="form-control" path="major" value="${student.major}" required="required"/>						
					</td>
				</tr>
				<tr>
					<td>
						<form:label path="emailAddress" cssClass="col-xs-3 col-form-label mr-2">
							<spring:message text="Email"/>
						</form:label>	
					</td>
					<td>
						<form:input type="emailAddress" cssClass="form-control" path="emailAddress" value="${student.emailAddress}" required="required"/>
					</td>
				</tr>   
   				<tr>
					<td style="text-align: center;" colspan="2">
						<button class="btn btn-primary" type="submit" name="updateStudent" id="submit">Update Student</button>						
					</td>
				</tr>
            </table>
        </form:form>
      </div>  			
</body>

</html>


