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
<body>
<%@include file="/WEB-INF/templates/nav.jsp"%>

    

    <div class="container mainForm">
        <h1>Edit Location</h1>
          <c:url var="editAction" value="/locations/updateLocations?id=${locations.id}" />
         
         <form:form action="${editAction}" ModelAttribute="locations" method="POST">
        	  <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
             <table>
        		<tr>
				 	<td>
                            <label for="id" class="col-xs-3 col-form-label mb-3">Location ID:</label>
                        </td>
                        <td>
                            <input type='number' class="form-control" name='id' value="${id}" disabled>
                        </td> 
                   
				</tr>
				<tr>
					<td>
                            <label for="locationName" class="col-xs-3 col-form-label mb-3">Location Name:</label>
                        </td>
                        <td>
                            <input type='text' class="form-control" name='locationName' value="${locationName}">
                        </td> 
				</tr>
				 <tr>
                        <td colspan="2">
                      		 <button class="btn btn-info" type="submit" name="submit" value="submit">Submit</button>
                        	 <button class="btn btn-secondary" type="reset" name="reset" value="reset">Cancel</button>                            
                        </td>
                    </tr>
				</table>
        </form:form>
        	 <div class="container mainForm">
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

