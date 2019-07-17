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



    <div class="container allCourseView">
        <h1>All Courses</h1>
         <c:if test="${!empty courseList}">
        <table class="table table-bordered table-responsive-md table-striped text-center">
            <tr>
              <th class="text-center">Course ID</th>
              <th class="text-center">Course Name</th>
              <th class="text-center">Course Credits</th>
              <th class="text-center">Actions</th>
            </tr>
            <c:forEach items="${courseList}" var="course">
            <tr>
              <td class="pt-3-half">${course.id}</td>
              <td class="pt-3-half">${course.courseName}</td>
              <td class="pt-3-half">${course.creditNumber}</td>
              <td>
              	<span class="table-details"><a type="button" class="btn btn-info btn-rounded btn-sm my-0"  href="<c:url value='/course/course_details/${course.id}'/> ">Details</a></span>
                <span class="table-edit"><a type="button" class="btn btn-primary btn-rounded btn-sm my-0"  href="<c:url value='/course/edit_course/${course.id}'/> ">Edit</a></span>
                <span class="table-remove"><a type="button" class="btn btn-danger btn-rounded btn-sm my-0" href="<c:url value='/course/delete_course?id=${course.id}'/> ">Delete</a></span>
              </td>
            </tr> 
            </c:forEach>  
          </table>
          </c:if>
        </div>
 

</body>

</html>
