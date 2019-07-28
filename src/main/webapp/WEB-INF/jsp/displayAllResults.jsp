<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
<title>College Grading System</title>
<%@include file="/WEB-INF/templates/header.jsp"%>
</head>

<body>

<%@include file="/WEB-INF/templates/nav.jsp"%>

<div class="container allResultsView">
    <h1>All Results</h1>
    <table class="table table-bordered table-responsive-md table-striped text-center">
        <tr>
        	<th class="text-center">Results ID</th>
            <th class="text-center">Student ID</th>
            <th class="text-center">First Name</th>
            <th class="text-center">Last Name</th>
            <th class="text-center">Course ID</th>
            <th class="text-center">Course Name</th>
            <th class="text-center">Marks 1</th>
            <th class="text-center">Marks 2</th>
            <th class="text-center">Grade</th>
            <th class="text-center">Actions</th>
        </tr>
        <c:forEach items="${completeList}" var="results">
            <tr>
           		<td class="pt-3-half">${results.id}</td>
                <td class="pt-3-half">${results.student.id}</td>
                <td class="pt-3-half">${results.student.firstName}</td>
                <td class="pt-3-half">${results.student.lastName}</td>
                <td class="pt-3-half">${results.course.id}</td>
                <td class="pt-3-half">${results.course.courseName}</td>
                <td class="pt-3-half">${results.mark1}</td>
                <td class="pt-3-half">${results.mark2}</td>
                <td class="pt-3-half">${results.grade}</td>
                <td>
                    <span class="table-edit"><a type="button" class="btn btn-primary btn-rounded btn-sm my-0"  href="<c:url value='/results?studentId=${results.student.id}&courseId=${results.course.id}&action=edit'/> ">Edit</a></span>
                    <span class="table-remove"><a type="button" class="btn btn-danger btn-rounded btn-sm my-0" href="<c:url value='/results?studentId=${results.student.id}&courseId=${results.course.id}&action=delete'/> ">Delete</a></span>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>


</body>

</html>
