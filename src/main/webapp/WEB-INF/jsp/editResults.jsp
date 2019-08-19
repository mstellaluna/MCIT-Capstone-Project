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
            <h1>Edit Results</h1>
             <c:url var="addAction" value="/results/updateResults?id=${id}" />
            <form:form action="${addAction}" modelAttribute="results" method="post">
             <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
                   <table>
                    <tr>   
                  <td>
                            <label for="id" class="col-xs-3 col-form-label mb-3">Result ID:</label>
                        </td>
                        <td>
                            <input type='number' class="form-control" name='id' value="${id}" disabled>
                        </td> 
                    </tr>
                    </table>
             
             <div class="form-group row"> 
      		<p>${emptyStudentList}</p>
          	<select id="studentId" name="studentId" class=" student_names_dropdown custom-select custom-select-lg mb-3">
            	<option value="">Select Student</option>
					<c:forEach items="${studentList}" var="student">
						<option value="${student.id}">${student.firstName} ${student.lastName}</option>
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
                            <label for="session" class="col-xs-3 col-form-label mb-3">Session:</label>
                        </td>
                        <td>
                            <input type='number' class="form-control" name='session' required>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <label for="mark" class="col-xs-3 col-form-label mb-3">Mark:</label>
                        </td>
                        <td>
                            <input type='number' class="form-control" name='mark' required>
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
