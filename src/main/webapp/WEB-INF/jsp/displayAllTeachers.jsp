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



    <div class="container allTeacherView">
        <h1>All Teachers</h1>
         <c:if test="${!empty teacherList}">
        <table class="table table-bordered table-responsive-md table-striped text-center">
            <tr>
              <th class="text-center">Teacher ID</th>
              <th class="text-center">First Name</th>
              <th class="text-center">Last Name</th>
              <th class="text-center">Address</th>
              <th class="text-center">City</th>
              <th class="text-center">Country</th>
              <th class="text-center">Phone Number</th>
              <th class="text-center">Salary</th>
              <th class="text-center">Actions</th>
            </tr>
            <c:forEach items="${teacherList}" var="teacher">
            <tr>
              <td class="pt-3-half">${teacher.id}</td>
              <td class="pt-3-half">${teacher.firstName}</td>
              <td class="pt-3-half">${teacher.lastName}</td>
              <td class="pt-3-half">${teacher.address}</td>
              <td class="pt-3-half">${teacher.city}</td>
              <td class="pt-3-half">${teacher.country}</td>
              <td class="pt-3-half">${teacher.phoneNumber}</td>
              <td class="pt-3-half">${teacher.salary}</td>
              <td>
              	<span class="table-details"><a type="button" class="btn btn-info btn-rounded btn-sm my-0"  href="<c:url value='/teacher/teacher_details/${teacher.id}'/> ">Details</a></span>
                <span class="table-edit"><a type="button" class="btn btn-primary btn-rounded btn-sm my-0"  href="<c:url value='/teacher/edit_teacher/${teacher.id}'/> ">Edit</a></span>
                <span class="table-remove"><a type="button" class="btn btn-danger btn-rounded btn-sm my-0" href="<c:url value='/teacher/delete_teacher/${teacher.id}'/> ">Delete</a></span>
              </td>
            </tr> 
            </c:forEach>  
          </table>
          </c:if>
        </div>
 

</body>

</html>
