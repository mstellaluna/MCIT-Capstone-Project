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

    

    <div class="container courseForm">
        <h1>Edit Course</h1>
          <c:url var="editAction" value="/course/updateCourse?id=${course.id}" />
         
         <form:form action="${editAction}" commandName="course" method="POST">
        	  <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
             <table>
        		<tr>
					<td>
						<form:label path="id" cssClass="col-xs-3 col-form-label mr-2" >
							<spring:message text="Course ID:"/>
						</form:label>
					</td>
					<td>
						<form:input type="number" cssClass="form-control" path="id" value="${course.id}" disabled="true"/>
					</td>
				</tr>
				<tr>
					<td>
						<form:label path="courseName" cssClass="col-xs-3 col-form-label mr-2" >
							<spring:message text="Course Name:"/>
						</form:label>
					</td>
					<td>
						<form:input type="text" cssClass="form-control" path="courseName" value="${course.courseName}" required="required"/>
					</td>
				</tr>
				<tr>
					<td>
						<form:label path="creditNumber" cssClass="col-xs-3 col-form-label mr-2">
							<spring:message text="Credit Number:"/>
						</form:label>	
					</td>
					<td>
						<form:input type="text" cssClass="form-control" path="creditNumber" value="${course.creditNumber}"  required="required"/>
					</td>
				</tr>
				</table>
				
             <div class="form-group row">
                <div class="offset-xs-3 col-xs-9">
                    <button class="btn btn-primary" type="submit" name="updateCourse" id="submit">Update Course</button>
                </div>
                </div>
        </form:form>
        
        <div class="allCourseViewStudentDetails">
       <h3>Assigned Teacher(s)</h3>
       <table class=" courseViewStudent table table-bordered table-responsive-md table-striped text-center">
                <tr>
                  <th class="text-center">ID</th>
                  <th class="text-center">First Name</th>
                  <th class="text-center">Last Name</th>
                  <th class="text-center">Action</th>
                </tr>
                 <c:forEach items="${teacherList}" var="teacher">
                <tr>
                  <td class="pt-3-half">${teacher.id}</td>
                 <td class="pt-3-half">${teacher.firstName}</td>
                  <td class="pt-3-half">${teacher.lastName}</td> 
                  <td>
                  <span class="table-details"><a type="button" class="btn btn-info btn-rounded btn-sm my-0"  href="<c:url value='/teacher/teacher_details/${teacher.id}'/> ">Details</a></span>
                   <span class="text-center editCourse"><a type="button" class="btn btn-primary btn-rounded btn-sm my-0"  href="<c:url value='/teacher/edit_teacher/${teacher.id}'/> ">Edit</a></span>
                    <span class="text-center editCourse"><a type="button" class="btn btn-danger btn-rounded btn-sm my-0"  href="<c:url value='/course/course_remove_teacher/${course.id}/${teacher.id}'/> ">Delete</a></span>
                  </td>
                </tr> 
                </c:forEach>
              </table> 
        </div> 
         <div class="allCourseViewStudentDetails">
       <h3>Enrolled Students</h3>
       <table class=" courseViewStudent table table-bordered table-responsive-md table-striped text-center">
                <tr>
                   <th class="text-center">Student ID</th>
              	<th class="text-center">First Name</th>
              <th class="text-center">Last Name</th>
              <th class="text-center">Actions</th>
                </tr>
                 <c:forEach items="${studentList}" var="student">
                <tr>
                   <td class="pt-3-half">${student.id}</td>
              <td class="pt-3-half">${student.firstName}</td>
              <td class="pt-3-half">${student.lastName}</td>

                  <td>
                <span class="table-details"><a type="button" class="btn btn-info btn-rounded btn-sm my-0"  href="<c:url value='/student/student_details/${student.id}'/> ">Details</a></span>
                <span class="table-edit"><a type="button" class="btn btn-primary btn-rounded btn-sm my-0"  href="<c:url value='/student/edit_student/${student.id}'/> ">Edit</a></span>
                <span class="table-remove"><a type="button" class="btn btn-danger btn-rounded btn-sm my-0" href="<c:url value='/course/course_remove_student/${course.id}/${student.id}'/> ">Delete</a></span>
                  </td>
                </tr> 
                </c:forEach>
              </table> 
        </div> 
         <div class="allCourseViewStudentDetails">
       <h3>Results for Enrolled Students </h3>
       <table class=" courseViewStudent table table-bordered table-responsive-md table-striped text-center">
                <tr>
                  <th class="text-center">Student ID</th>
                  <th class="text-center">First Name</th>
                  <th class="text-center">Last Name</th>
                  <th class="text-center">Session</th>
                  <th class="text-center">Mark</th>
                  <th class="text-center">Action</th>
                </tr>
                 <c:forEach items="${resultsList}" var="results">
                <tr>
                  <td class="pt-3-half">${results.studentResult.id}</td>
                  <td class="pt-3-half">${results.studentResult.firstName}</td>
                  <td class="pt-3-half">${results.studentResult.lastName}</td>
                  <td class="pt-3-half">${results.session}</td>
                  <td class="pt-3-half">${results.mark}</td>
                  <td>
                   <span class="text-center editCourse"><a type="button" class="btn btn-primary btn-rounded btn-sm my-0"  href="<c:url value='/results/edit_results/${results.id}'/> ">Edit</a></span>
                    <span class="text-center editCourse"><a type="button" class="btn btn-danger btn-rounded btn-sm my-0"  href="<c:url value='/course/course_remove_teacher/${course.id}/${teacher.id}'/> ">Delete</a></span>
                  </td>
                </tr> 
                </c:forEach>
              </table> 
        </div>    
    </div>
</body>

</html>

