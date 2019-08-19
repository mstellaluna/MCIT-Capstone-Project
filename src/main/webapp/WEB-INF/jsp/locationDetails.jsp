<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
<title>College Grading System</title>
<%@include file="/WEB-INF/templates/header.jsp"%>
</head>
<%@include file="/WEB-INF/templates/nav.jsp"%>

<body>
<div class="container bootstrap snippet mainForm">
    <h1>Location Details</h1>
      
    <div class="container bootstrap snippet mainForm">
     <h3>Room Details</h3>
       <table class=" courseViewStudent table table-bordered table-responsive-md table-striped text-center">
                <tr>
                  <th class="text-center">ID</th>
                  <th class="text-center">Name</th>
                  <th class="text-center">Actions</th>
                </tr>
                <tr>
                  <td class="pt-3-half">${locations.id}</td>
                  <td class="pt-3-half">${locations.locationName}</td>
                  <td>
                   <span class="text-center editLocation"><a type="button" class="btn btn-primary btn-rounded btn-sm my-0"  href="<c:url value='/locations/edit_location/${locations.id}'/> ">Edit</a></span>
                  </td>
                </tr> 
              </table> 
        </div>   
      <div class="container bootstrap snippet mainForm">
       <h3>Schedule Information </h3>
       <p>${emptyLocationSchedule}</p>
   <table class="table table-bordered table-responsive-md table-striped text-center">
        <tr>
        	<th class="text-center">Schedule ID</th>
            <th class="text-center">Location ID</th>
            <th class="text-center">Location Name</th>
            <th class="text-center">Course ID</th>
            <th class="text-center">Course Name</th>
            <th class="text-center">Start Time</th>
            <th class="text-center">End Time</th>
            <th class="text-center">Date</th>
            <th class="text-center">Actions</th>
        </tr>
        <c:forEach items="${locationSchedule}" var="schedule">
            <tr>
           		<td class="pt-3-half">${schedule.id}</td>
                <td class="pt-3-half">${schedule.scheduledLocations.id}</td>
                <td class="pt-3-half">${schedule.scheduledLocations.locationName}</td>
                <td class="pt-3-half">${schedule.scheduledCourses.id}</td>
                <td class="pt-3-half">${schedule.scheduledCourses.courseName}</td> 
                <td class="pt-3-half">${schedule.startTime}</td>
                <td class="pt-3-half">${schedule.endTime}</td>
                <td class="pt-3-half">${schedule.classDate}</td>                
                <td>
                   <span class="text-center editCourse"><a type="button" class="btn btn-primary btn-rounded btn-sm my-0"  href="<c:url value='/schedule/edit_schedule/${schedule.id}'/> ">Edit</a></span>
                    <span class="text-center editCourse"><a type="button" class="btn btn-danger btn-rounded btn-sm my-0"  href="<c:url value='/schedule/delete_schedule?id=${schedule.id}'/> ">Delete</a></span>
                  </td>
                </tr> 
                </c:forEach>
              </table> 
        </div>    
       </div>           
  </body>  
  </html>
                                                      