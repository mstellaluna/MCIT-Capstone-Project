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
</head>

<body>

<%@include file="/WEB-INF/templates/nav.jsp"%>

<div class="container mainForm">
    <h1>All Results</h1>
     <c:if test="${empty resultsList}">
       		<p>${emptyResultsList}</p>
 		</c:if>
 	<c:if test="${!empty resultsList}">	
    <table class="table table-bordered table-responsive-md table-striped text-center">
        <tr>
        	<th class="text-center">Results ID</th>
            <th class="text-center">Student ID</th>
            <th class="text-center">First Name</th>
            <th class="text-center">Last Name</th>
            <th class="text-center">Course ID</th>
            <th class="text-center">Course Name</th>
            <th class="text-center">Session</th>
            <th class="text-center">Mark</th>
            <th class="text-center">Actions</th>
        </tr>
        <c:forEach items="${resultsList}" var="results">
            <tr>
           		<td class="pt-3-half">${results.id}</td>
                <td class="pt-3-half">${results.studentResult.id}</td>
                <td class="pt-3-half">${results.studentResult.firstName}</td>
                <td class="pt-3-half">${results.studentResult.lastName}</td>
                <td class="pt-3-half">${results.courseResult.id}</td>
                <td class="pt-3-half">${results.courseResult.courseName}</td>
                <td class="pt-3-half">${results.session}</td>
                <td class="pt-3-half">${results.mark}</td>
                <td>
                    <span class="table-edit"><a type="button" class="btn btn-primary btn-rounded btn-sm my-0"  href="<c:url value='/results/edit_results/${results.id}'/> ">Edit</a></span>
                    <span class="table-remove"><a type="button" class="btn btn-danger btn-rounded btn-sm my-0" href="<c:url value='/results/delete_results/${results.id}'/> ">Delete</a></span>
                </td> 
            </tr>
        </c:forEach>
    </table>
    </c:if>
</div>


</body>

</html>
