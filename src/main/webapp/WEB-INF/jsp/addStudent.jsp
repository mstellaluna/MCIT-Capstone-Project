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


	<nav class="menu" tabindex="0">
		<div class="smartphone-menu-trigger"></div>
		<header class="logo">
			 <img src="${pageContext.request.contextPath}/resources/theme/images/logo.jpg">
		</header>
		<ul>
			<li tabindex="0" class="icon-student"><span><a href="index.html"> Home</a></span></li>
			<li tabindex="0" class="icon-student"><span><a href="addStudent.html">Student</a></span></li>
			<li tabindex="0" class="icon-course"><span><a href="addCourse.html">Course</a></span></li>
			<li tabindex="0" class="icon-results"><span><a href="addResults.html">Results</a></span></li>
		</ul>
	</nav>



	<div class="container studentForm">
		<h1>Add Student</h1>
		<form:form action="student" method="post">
			<table>
				<tr>
					<td><label for="firstName"
						class="col-xs-3 col-form-label mr-2">First Name:</label></td>
					<td><form:input type="text" class="form-control" path="firstName"
						name="firstName" required/></td>
				</tr>  
				<tr>
					<td><label for="lastName" class="col-xs-3 col-form-label mr-2">Last
							Name:</label></td>
					<td><form:input type="text" class="form-control" path="lastName"
						name="lastName" required/></td>
				</tr>
				<tr>
					<td><label for="university"
						class="col-xs-3 col-form-label mr-2">Organization:</label></td>
					<td><form:input type="text" class="form-control" path='' id="university"
						name="university" required/></td>
				</tr>
				<tr>
					<td><label for="address" class="col-xs-3 col-form-label mr-2">Address:</label>
					</td>
					<td><form:input type="text" class="form-control" 
						name="address" path="address" required/></td>
				</tr>
				<tr>
					<td><label for="city" class="col-xs-3 col-form-label mr-2">City:</label>
					</td>
					<td><form:input type="text" class="form-control" path="city"
						name="city" required/></td>
				</tr>
				<tr>
					<td><label for="state-province"
						class="col-xs-3 col-form-label mr-2">State/Province:</label></td>
					<td><form:input type="text" class="form-control" path=""
						id="state-province" name="state-province" required/></td>
				</tr>
				<tr>
					<td><label for="postalCode"
						class="col-xs-3 col-form-label mr-2">Postal Code:</label></td>
					<td><form:input type="text" class="form-control" id="postalCode"
						name="postalCode" path="" required/></td>
				</tr>
				<tr>
					<td><label for="telephone"
						class="col-xs-3 col-form-label mr-2">Telephone:</label></td>
					<td><form:input type="tel" class="form-control" id="telephone"
						name="telephone" path="" required/></td>
				</tr>

				<tr>
					<td><label for="fax" class="col-xs-3 col-form-label mr-2">Fax:</label>
					</td>
					<td><form:input type="tel" class="form-control" id="fax" name="fax" path="" required/>
					</td>
				</tr>
				<tr>
					<td>
						<label for="email" class="col-xs-3 col-form-label mr-2">Email:</label>
					</td>
					<td>
						<form:input type="email" class="form-control" id="email" name="email" path="" required/>
					</td>
				</tr>
				<tr>
					<td>
						<label for="gender" class="col-xs-3 col-form-label mr-2">Gender:</label>
					</td>
					<td style="text-align: left;" colspan="2">
						<form:input type="checkbox" name="male" id="male" path=""/> Male 
						<form:input type="checkbox" name="female" id="female" path=""/> Female
					</td>
				</tr>
				<tr>
					<td>
						<label for="birthday" class="col-xs-3 col-form-label mr-2">Date of Birth: </label>
					</td>
					<td style="text-align: left;">
						<form:input type="date" name="birthday" id="birthday" path="" required/>
					</td>
				</tr>
				<tr>
					<td style="text-align: center;" colspan="2">
						<button type="submit" name="addStudent" id="submit">Add Student</button>
						<button type="submit" name="viewAllStudents" id="submit">View All Students</button>
					</td>
				</tr>
			</table>
		</form:form>
	</div>
</body>

</html>