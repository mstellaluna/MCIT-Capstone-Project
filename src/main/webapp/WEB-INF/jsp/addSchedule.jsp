<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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

<div class="container studentForm">
		  <h1>Add Schedule</h1>
          <c:url var="addAction" value="addSchedule" />         
            <form:form action="${addAction}" modelAttribute="addScheduleForm" method="POST">  
          <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" /> 
  		
  			<div class="form-group row"> 
      		<p>${emptyLocationList}</p>  	
          	<select id="locationId" name="locationId" class=" student_names_dropdown custom-select custom-select-lg mb-3">
            	<option value="">Select Location</option>
					<c:forEach items="${locationList}" var="location">
						<option value="${location.id}">${location.locationName}</option>
					</c:forEach>
			</select>
           </div>		   
     
             <div class="form-group row"> 
             <p>${emptyCourseList}</p>
          	<select id="courseId" name="courseId" class=" student_names_dropdown custom-select custom-select-lg mb-3">
            	<option value="">Select Course</option>
					<c:forEach items="${courseList}" var="course">
						<option value="${course.id}">${course.courseName} </option>
					</c:forEach>
			</select>
           </div>  

                          <table>
                                     <tr>
                        <td>
                            <label for="classDate" class="col-xs-3 col-form-label mr-2">Class Date:</label>
                        </td>
                        <td>
                         
                           <input type="date" class="form-control" name="classDate"  required/>
                       
                            
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <label for="startTime" class="col-xs-3 col-form-label mr-2">Start:</label>
                        </td>
                        <td>
                            <input type="time" class="form-control" name="startTime" required />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <label for="endTime" class="col-xs-3 col-form-label mr-2">End:</label>
                        </td>
                        <td>
                         
                           <input type="time" class="form-control" name="endTime"  required/>
                       
                            
                        </td>
                    </tr>
                    </table>
  
              	                 	
            <div class="form-group row">
                <div class="offset-xs-3 col-xs-9">
                    <button class="btn btn-primary" type="submit" name="addSchedule" id="submit">Schedule</button>
                </div>
                </div>
          </form:form>            


</div>
</body>
</html>	