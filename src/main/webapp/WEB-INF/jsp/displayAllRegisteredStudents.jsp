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


    <div class="container allStudentView">
        <h1>All Students</h1>
         <c:if test="${!empty studentList}">
        <table class="table table-bordered table-responsive-md table-striped text-center">
        <tr>
        	<th class="text-left">${course.name}</th>
       </tr> 	
            <tr>
              <th class="text-center">Student ID</th>
              <th class="text-center">First Name</th>
              <th class="text-center">Last Name</th>
              <th class="text-center">Actions</th>
            </tr>
            <c:forEach items="${course.getStudentsRegistered()}" var="student">
            <tr>
              <td class="pt-3-half">${student.id}</td>
              <td class="pt-3-half">${student.firstName}</td>
              <td class="pt-3-half">${student.lastName}</td>
              <td>
            	<span class="table-details"><a type="button" class="btn btn-info btn-rounded btn-sm my-0"  href="<c:url value='/student/student_details/${student.id}'/> ">Details</a></span>
                <span class="table-edit"><a type="button" class="btn btn-primary btn-rounded btn-sm my-0"  href="<c:url value='/student/edit_student/${student.id}'/> ">Edit</a></span>
                <span class="table-remove"><a type="button" class="btn btn-danger btn-rounded btn-sm my-0" href="<c:url value='/student/delete_student?id=${student.id}'/> ">Delete</a></span>
              </td>
            </tr> 
            </c:forEach>  
          </table>
          </c:if>
        </div>
 

</body>

</html>
