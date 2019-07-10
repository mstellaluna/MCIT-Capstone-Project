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


<<<<<<< HEAD
	<div class="container studentForm">
		<h1>Add Student</h1>
		     <c:url var="addAction" value="submitStudentForm" ></c:url>

        <form:form action="${addAction}" commandName="student" method="POST">
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
			<table>
				<tr>
					<td>
						<form:label path="firstName" cssClass="col-xs-3 col-form-label mr-2" >
							<spring:message text="First Name:"/>
						</form:label>
					</td>
					<td>
						<form:input type="text" cssClass="form-control" path="firstName" required="required"/>
					</td>
				</tr>  
				<tr>
					<td>
						<form:label path="lastName" cssClass="col-xs-3 col-form-label mr-2">
							<spring:message text="Last Name:"/>
						</form:label>	
					</td>
					<td>
						<form:input type="text" cssClass="form-control" path="lastName" required="required"/>
					</td>
				</tr>
				<tr>
					<td>
						<form:label path="address" cssClass="col-xs-3 col-form-label mr-2">
							<spring:message text="Address:"/>
						</form:label>
					</td>
					<td>
						<form:input type="text" cssClass="form-control" path="address" required="required"/>					
					</td>
				</tr>
				<tr>
					<td>
						<form:label path="city" cssClass="col-xs-3 col-form-label mr-2">
							<spring:message text="City:"/>
						</form:label>	
					</td>
					<td>
						<form:input type="text" cssClass="form-control" path="city" required="required"/>
					</td>
				</tr>
				<tr>
					<td>
						<form:label path="country" cssClass="col-xs-3 col-form-label mr-2">
							<spring:message text="Country:"/>
						</form:label>	
					</td>
					<td>
						<form:input type="text" cssClass="form-control" path="country" required="required"/>
					</td>
				</tr>
				<tr>
					<td>
						<form:label path="phoneNumber" cssClass="col-xs-3 col-form-label mr-2">
							<spring:message text="Phone Number: "/>
						</form:label>	
					</td>
					<td>
						<form:input type="tel" cssClass="form-control" path="phoneNumber" required="required"/>
					</td>
				</tr>

				<tr>
					<td>
						<form:label path="major" cssClass="col-xs-3 col-form-label mr-2">
							<spring:message text="Major:"/>
						</form:label>	
					</td>
					<td>
						<form:input type="text" cssClass="form-control" path="major" required="required"/>
					</td>
				</tr>
				<tr>
					<td>
						<form:label path="emailAddress" cssClass="col-xs-3 col-form-label mr-2">
							<spring:message text="Email"/>
						</form:label>	
					</td>
					<td>
						<form:input type="emailAddress" cssClass="form-control" path="emailAddress" required="required"/>
					</td>
				</tr>
				<tr>
					<td style="text-align: center;" colspan="2">
						<button class="btn btn-primary" type="submit" name="submitStudentForm" id="submit">Add Student</button>						
						<button class="btn btn-info" type="submit" name="viewAllStudents" id="submit">View All Students</button>
					</td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
=======
	 <div class="container studentForm">
        <h1>Add Student</h1>
        <form action="student" method="post">
>>>>>>> fa1894509430e9c438929e3f6e586d4eaf02c32b

            <table>
                <tr>
                    <td>
                        <label for="firstName" class="col-xs-3 col-form-label mr-2">First Name:</label>
                    </td>
                    <td>
                        <input type="text" class="form-control" id="firstName" name="firstName"  required>
                    </td>
                </tr>
                <tr>
                    <td>
                        <label for="lastName" class="col-xs-3 col-form-label mr-2">Last Name:</label>
                    </td>
                    <td>
                        <input type="text" class="form-control" id="lastName" name="lastName" required>
                    </td>
                </tr>
                <tr>
                    <td>
                        <label for="major" class="col-xs-3 col-form-label mr-2">Major:</label>
                    </td>
                    <td>
                        <input type="text" class="form-control" id="major" name="major" required>
                    </td>
                </tr>
                <tr>
                    <td>
                        <label for="address" class="col-xs-3 col-form-label mr-2">Address:</label>
                    </td>
                    <td>
                        <input type="text" class="form-control" id="address" name="address" required>
                    </td>
                </tr>
                <tr>
                    <td>
                            <label for="city" class="col-xs-3 col-form-label mr-2">City:</label>
                    </td>
                    <td>
                            <input type="text" class="form-control" id="city" name="city" required>
                    </td>
                </tr>
                <tr>
                    <td>
                            <label for="country" class="col-xs-3 col-form-label mr-2">Country:</label>
                    </td>
                    <td>
                            <input type="text" class="form-control" id="country" name="country" required>
                    </td>
                </tr>
                <tr>
                    <td>
                            <label for="telephone" class="col-xs-3 col-form-label mr-2">Telephone:</label>
                    </td>
                    <td>
                            <input type="tel" class="form-control" id="telephone" name="telephone" required>
                    </td>
                </tr>
                <tr>
                    <td>
                            <label for="email" class="col-xs-3 col-form-label mr-2">Email:</label>
                    </td>
                    <td>
                            <input type="email" class="form-control" id="email" name="email" required>
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                            <button class="btn btn-info" type="submit" name="addStudent" id="submit">Add Student</button>
                        <button class="btn btn-secondary" type="submit" name="viewAllStudents" id="submit">View All Students</button>
                    </td>
                </tr>
            </table>
            </form>
            </div>
	</body>
</html>