<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
 --%>
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
		<form action="student" method="post">
			<table>
				<tr>
					<td><label for="firstName"
						class="col-xs-3 col-form-label mr-2">First Name:</label></td>
					<td><input type="text" class="form-control" id="firstName"
						name="firstName"></td>
				</tr>
				<tr>
					<td><label for="lastName" class="col-xs-3 col-form-label mr-2">Last
							Name:</label></td>
					<td><input type="text" class="form-control" id="lastName"
						name="lastName"></td>
				</tr>
				<tr>
					<td><label for="university"
						class="col-xs-3 col-form-label mr-2">Organization:</label></td>
					<td><input type="text" class="form-control" id="university"
						name="university"></td>
				</tr>
				<tr>
					<td><label for="address" class="col-xs-3 col-form-label mr-2">Address:</label>
					</td>
					<td><input type="text" class="form-control" id="address"
						name="address"></td>
				</tr>
				<tr>
					<td><label for="city" class="col-xs-3 col-form-label mr-2">City:</label>
					</td>
					<td><input type="text" class="form-control" id="city"
						name="city"></td>
				</tr>
				<tr>
					<td><label for="state-province"
						class="col-xs-3 col-form-label mr-2">State/Province:</label></td>
					<td><input type="text" class="form-control"
						id="state-province" name="state-province"></td>
				</tr>
				<tr>
					<td><label for="postalCode"
						class="col-xs-3 col-form-label mr-2">Postal Code:</label></td>
					<td><input type="text" class="form-control" id="postalCode"
						name="postalCode"></td>
				</tr>
				<tr>
					<td><label for="telephone"
						class="col-xs-3 col-form-label mr-2">Telephone:</label></td>
					<td><input type="tel" class="form-control" id="telephone"
						name="telephone"></td>
				</tr>

				<tr>
					<td><label for="fax" class="col-xs-3 col-form-label mr-2">Fax:</label>
					</td>
					<td><input type="tel" class="form-control" id="fax" name="fax">
					</td>
				</tr>
				<tr>
					<td>
						<label for="email" class="col-xs-3 col-form-label mr-2">Email:</label>
					</td>
					<td>
						<input type="email" class="form-control" id="email" name="email">
					</td>
				</tr>
				<tr>
					<td>
						<label for="gender" class="col-xs-3 col-form-label mr-2">Gender:</label>
					</td>
					<td style="text-align: left;" colspan="2">
						<input type="checkbox" name="male" id="male"> Male 
						<input type="checkbox" name="female" id="female"> Female
					</td>
				</tr>
				<tr>
					<td>
						<label for="birthday" class="col-xs-3 col-form-label mr-2">Date of Birth: </label>
					</td>
					<td style="text-align: left;">
						<input type="date" name="birthday" id="birthday">
					</td>
				</tr>
				<tr>
					<td style="text-align: center;" colspan="2">
						<button type="submit" name="addStudent" id="submit">Add Student</button>
						<button type="submit" name="viewAllStudents" id="submit">View All Students</button>
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>

</html>