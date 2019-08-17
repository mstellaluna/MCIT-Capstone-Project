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

<div class="container allResultsView">
    <h1>All Scheduled Classes</h1>
    <table class="table table-bordered table-responsive-md table-striped text-center">
        <tr>
        	<th class="text-center">Schedule ID</th>
            <th class="text-center">Location ID</th>
            <th class="text-center">Course ID</th>
            <th class="text-center">Start Time</th>
            <th class="text-center">End Time</th>
            <th class="text-center">Date</th>
            <th class="text-center">Actions</th>
        </tr>
        <c:forEach items="${scheduleList}" var="schedule">
            <tr>
           		<td class="pt-3-half">${schedule.id}</td>
                <td class="pt-3-half">${schedule.locationID}</td>
                <td class="pt-3-half">${schedule.courseID}</td>
<%--                 <td class="pt-3-half">${schedule.course.id}</td>
                <td class="pt-3-half">${schedule.course.courseName}</td> --%>
                <td class="pt-3-half">${schedule.startTime}</td>
                <td class="pt-3-half">${schedule.endTime}</td>
                <td class="pt-3-half">${schedule.classDate}</td>                
                <td>
                    <span class="table-edit"><a type="button" class="btn btn-primary btn-rounded btn-sm my-0"  href="<c:url value='/results/edit_results/${results.id}'/> ">Edit</a></span>
                    <span class="table-remove"><a type="button" class="btn btn-danger btn-rounded btn-sm my-0" href="<c:url value='/results/delete_results/${results.id}'/> ">Delete</a></span>
                </td> 
            </tr>
        </c:forEach>
    </table>
</div>


</body>

</html>
