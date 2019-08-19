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
		  <h1>Edit Schedule</h1>
          <c:url var="addAction" value="/schedule/updateSchedule?id=${id}" />         
            <form:form action="${addAction}" modelAttribute="classSchedule" method="POST">  
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
                    </table>	
                     <div class="form-group row"> 
      		<p>${emptyCourseList}</p>
          	<select id="courseID" name="courseID" class=" course_names_dropdown custom-select custom-select-lg mb-3">
            	<option value="">Select Course</option>
					<c:forEach items="${courseList}" var="course">
						<option value="${course.id}">${course.courseName}</option>
					</c:forEach>
			</select>
           </div>
           	
             <div class="form-group row"> 
             <p>${emptyLocationList}</p>
          	<select id="locationID" name="locationID" class=" location_names_dropdown custom-select custom-select-lg mb-3">
            	<option value="">Select Location</option>
					<c:forEach items="${locationList}" var="location">
						<option value="${location.id}">${location.locationName} </option>
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
                     <tr>
                        <td colspan="2">
                      		 <button class="btn btn-info" type="submit" name="submit" value="submit">Submit</button>
                        	 <button class="btn btn-secondary" type="reset" name="reset" value="reset">Cancel</button>                            
                        </td>
                    </tr>
                    </table>
          </form:form>            


</div>
</body>
</html>	