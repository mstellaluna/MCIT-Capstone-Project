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
<div class="container bootstrap snippet studentForm">
    <h1>Course Details</h1>
      
    <div class="allCourseViewStudentDetails">
     <h3>Course Details Summary</h3>
       <table class=" courseViewStudent table table-bordered table-responsive-md table-striped text-center">
                <tr>
                  <th class="text-center">ID</th>
                  <th class="text-center">Name</th>
                  <th class="text-center">Credits</th>
                  <th class="text-center">Action</th>
                </tr>
                <tr>
                  <td class="pt-3-half">${course.id}</td>
                  <td class="pt-3-half">${course.courseName}</td>
                  <td class="pt-3-half">${course.creditNumber}</td>
                  <td>
                   <span class="text-center editCourse"><a type="button" class="btn btn-primary btn-rounded btn-sm my-0"  href="<c:url value='/course/edit_course/${course.id}'/> ">Edit</a></span>
                  </td>
                </tr> 
              </table> 
        </div>   
              
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
                    <span class="text-center editCourse"><a type="button" class="btn btn-danger btn-rounded btn-sm my-0"  href="<c:url value='/teacher/delete_teacher/${teacher.id}'/> ">Delete</a></span>
                  </td>
                </tr> 
                </c:forEach>
              </table> 
        </div>  
        <div class="row">
            <div class="col-sm-6"><!--left col-->
     <%--   <div class="allCourseViewStudentDetails">
       
            <h3 class="studentDetailsHeaders"> All Courses</h3> 
      
            <p>${emptyTeacherList}</p>
            <table class=" courseViewStudent table table-bordered table-responsive-md table-striped text-center">
                <tr>
                  <th class="text-center">Teacher ID</th>
                  <th class="text-center">Teacher First Name</th>
                  <th class="text-center">Teacher Last Name</th>
                  <th class="text-center">Actions</th>
                </tr>
                <c:forEach items="${teacherList}" var="teacher">
                <tr>
                  <td class="pt-3-half">${teacher.id}</td>
                  <td class="pt-3-half">${teacher.firstName}</td>
                  <td class="pt-3-half">${teacher.lastName}</td>
                  <td>
                     <span class="table-details"><a type="button" class="btn btn-info btn-rounded btn-sm my-0"  href="<c:url value='/teacher/teacher_details/${teacher.id}'/> ">Details</a></span>
                	 <span class="table-edit"><a type="button" class="btn btn-primary btn-rounded btn-sm my-0"  href="<c:url value='/teacher/edit_teacher/${teacher.id}'/> ">Edit</a></span>
                	 <span class="table-remove"><a type="button" class="btn btn-danger btn-rounded btn-sm my-0" href="<c:url value='/teacher/delete_teacher/${teacher.id}'/> ">Delete</a></span>
                  </td>
                </tr> 
                </c:forEach>   --%>
              </table>
            </div>     
<%--   		<div class="col-sm-3"><!--left col-->
              

      <div class="text-center">
     
        <p class="studentID">Course ID: ${course.id}</p>
      </div> --%>
       </div><!--/col-3-->
       <div class="row">
            <div class="col-sm-6"><!--left col-->
       <div class="allCourseViewStudentDetails">
            <h3 class="studentDetailsHeaders"> All Courses</h3>
      
            <p>${emptyTeacherList}</p>
            <table class=" courseViewStudent table table-bordered table-responsive-md table-striped text-center">
                <tr>
                  <th class="text-center">Teacher ID</th>
                  <th class="text-center">Teacher First Name</th>
                  <th class="text-center">Teacher Last Name</th>
                  <th class="text-center">Actions</th>
                </tr>
                <c:forEach items="${teacherList}" var="teacher">
                <tr>
                  <td class="pt-3-half">${teacher.id}</td>
                  <td class="pt-3-half">${teacher.firstName}</td>
                  <td class="pt-3-half">${teacher.lastName}</td>
                  <td>
                     <span class="table-details"><a type="button" class="btn btn-info btn-rounded btn-sm my-0"  href="<c:url value='/teacher/teacher_details/${teacher.id}'/> ">Details</a></span>
                	 <span class="table-edit"><a type="button" class="btn btn-primary btn-rounded btn-sm my-0"  href="<c:url value='/teacher/edit_teacher/${teacher.id}'/> ">Edit</a></span>
                	 <span class="table-remove"><a type="button" class="btn btn-danger btn-rounded btn-sm my-0" href="<c:url value='/teacher/delete_teacher/${teacher.id}'/> ">Delete</a></span>
                  </td>
                </tr> 
                </c:forEach>  
              </table>
            </div> 
            </div>
                    </div>
                    <div class="row">
                      <div class="col-sm-6"><!--left col-->
                 <div class="allResultsViewStudentDetails">
                      <h3 class="studentDetailsHeaders"> All Results</h3>
                      <table class=" resultsViewStudent table table-bordered table-responsive-md table-striped text-center">
                          <tr>
                            <th class="text-center">Course ID</th>
                            <th class="text-center">Course Name</th>
                            <th class="text-center">Grade</th>
                            <th class="text-center">Actions</th>
                          </tr>
                          <c:forEach items="${completeList}" var="course">
                          <tr>
                            <td class="pt-3-half">${course.id}</td>
                            <td class="pt-3-half">${course.courseName}</td>
                            <td class="pt-3-half">${course.grade}</td>
                            <td>
                              <span class="table-edit"><a type="button" class="btn btn-primary btn-rounded btn-sm my-0"  href="<c:url value='/course?id=${course.id}&action=edit'/> ">Edit</a></span>
                              <span class="table-remove"><a type="button" class="btn btn-danger btn-rounded btn-sm my-0" href="<c:url value='/course?id=${course.id}&action=delete'/> ">Delete</a></span>
                            </td>
                          </tr> 
                          </c:forEach>  
                        </table>
                      </div>
                     <div class="allResultsViewStudentDetails">
                      <h3 class="studentDetailsHeaders"> All Results</h3>
                      <table class=" resultsViewStudent table table-bordered table-responsive-md table-striped text-center">
                          <tr>
                            <th class="text-center">Course ID</th>
                            <th class="text-center">Course Name</th>
                            <th class="text-center">Grade</th>
                            <th class="text-center">Actions</th>
                          </tr>
                          <c:forEach items="${completeList}" var="course">
                          <tr>
                            <td class="pt-3-half">${course.id}</td>
                            <td class="pt-3-half">${course.courseName}</td>
                            <td class="pt-3-half">${course.grade}</td>
                            <td>
                              <span class="table-edit"><a type="button" class="btn btn-primary btn-rounded btn-sm my-0"  href="<c:url value='/course?id=${course.id}&action=edit'/> ">Edit</a></span>
                              <span class="table-remove"><a type="button" class="btn btn-danger btn-rounded btn-sm my-0" href="<c:url value='/course?id=${course.id}&action=delete'/> ">Delete</a></span>
                            </td>
                          </tr> 
                          </c:forEach>  
                        </table>
                      </div>         
             </div>
             </div>       
    </div><!--/row-->
   
    </div>
  </body>  
  </html>
                                                      