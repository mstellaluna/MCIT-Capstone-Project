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
    <h1>Teacher Details</h1>
      <p>${emptyTeacherList}</p>
     <c:if test="${!empty teacher}">
     <div class="container bootstrap snippet mainForm">
     <h3>Teacher Information</h3>
       <table class=" courseViewStudent table table-bordered table-responsive-md table-striped text-center">
                <tr>
                  <th class="text-center">Teacher ID</th>
                  <th class="text-center">First Name</th>
                  <th class="text-center">Last Name</th>
                  <th class="text-center">Address</th>
                  <th class="text-center">Country</th>
                  <th class="text-center">Phone Number</th>
                  <th class="text-center">Salary</th>
                  <th class="text-center">Actions</th>
                </tr>
                <tr>
                  <td class="pt-3-half">${teacher.id}</td>
                  <td class="pt-3-half">${teacher.firstName}</td>
                  <td class="pt-3-half">${teacher.lastName}</td>
                  <td class="pt-3-half">${teacher.address}</td>
                  <td class="pt-3-half">${teacher.country}</td>
                  <td class="pt-3-half">${teacher.phoneNumber}</td>
                  <td class="pt-3-half">${teacher.salary}</td>
                  <td>
                   <span class="text-center editLocation"><a type="button" class="btn btn-primary btn-rounded btn-sm my-0"  href="<c:url value='/teacher/edit_teacher/${teacher.id}'/> ">Edit</a></span>
                  </td>
                </tr> 
              </table> 
        </div>   
      </c:if>     

       <div class="container bootstrap snippet mainForm">
            <h3 class="studentDetailsHeaders"> All Assigned Courses</h3>
      
            <p>${emptyCourseList}</p>
            <table class=" courseViewStudent table table-bordered table-responsive-md table-striped text-center">
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
                	 <span class="table-remove"><a type="button" class="btn btn-danger btn-rounded btn-sm my-0" href="<c:url value='/course/course_remove_teacher/${course.id}/${teacher.id}'/> ">Delete</a></span>
                  </td>
                </tr> 
                </c:forEach>  
              </table>
            </div>
         </div>
     

  </body>  
  </html>
                                                      