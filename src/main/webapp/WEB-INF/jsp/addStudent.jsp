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
	<%@include file="/WEB-INF/templates/nav.jsp"%>


	 <div class="container studentForm">
        <h1>Add Student</h1>
        <form action="student" method="post">

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