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
    <h1>Course Details</h1>
      
    <div class="container bootstrap snippet mainForm">
     <h3>Course Details Summary</h3>
     <p>${emptyCourseList}</p>
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
              
    <div class="container bootstrap snippet mainForm">
       <h3>Assigned Teacher(s)</h3>
        <p>${emptyTeacherList}</p>
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
         <div class="container bootstrap snippet mainForm">
       <h3>Enrolled Students</h3>
        <p>${emptyStudentList}</p>
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
       
        <div class="container bootstrap snippet mainForm">
       <h3>Results for Enrolled Students </h3>
        <p>${emptyResultsList}</p>
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
        <div class="container bootstrap snippet mainForm">
       <h3>Schedule Information </h3>
        <p>${emptyCourseSchedule}</p>
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
        <c:forEach items="${courseSchedule}" var="schedule">
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
                                                      