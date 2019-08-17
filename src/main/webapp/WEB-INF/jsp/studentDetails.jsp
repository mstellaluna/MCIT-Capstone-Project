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
    <h1>Student Details</h1>
     <c:if test="${!empty student}">
     <div class="allCourseViewStudentDetails">
     <h3>Student Information</h3>
       <table class=" courseViewStudent table table-bordered table-responsive-md table-striped text-center">
                <tr>
                  <th class="text-center">Student ID</th>
                  <th class="text-center">First Name</th>
                  <th class="text-center">Last Name</th>
                  <th class="text-center">Address</th>
                  <th class="text-center">Country</th>
                  <th class="text-center">Phone Number</th>
                  <th class="text-center">Email</th>
                  <th class="text-center">Major</th>
                  <th class="text-center">Actions</th>
                </tr>
                <tr>
                  <td class="pt-3-half">${student.id}</td>
                  <td class="pt-3-half">${student.firstName}</td>
                  <td class="pt-3-half">${student.lastName}</td>
                  <td class="pt-3-half">${student.address}</td>
                  <td class="pt-3-half">${student.country}</td>
                  <td class="pt-3-half">${student.phoneNumber}</td>
                  <td class="pt-3-half">${student.emailAddress}</td>
                  <td class="pt-3-half">${student.major}</td>
                  <td>
                   <span class="text-center editLocation"><a type="button" class="btn btn-primary btn-rounded btn-sm my-0"  href="<c:url value='/student/edit_student/${student.id}'/> ">Edit</a></span>
                  </td>
                </tr> 
              </table> 
        </div>   
      </c:if>     

       <div class="allCourseViewStudentDetails">
            <h3 class="studentDetailsHeaders"> Registered Courses</h3>
      
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
                	 <span class="table-remove"><a type="button" class="btn btn-danger btn-rounded btn-sm my-0" href="<c:url value='/course/course_remove_student/${course.id}/${student.id}'/> ">Delete</a></span>
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
                             <th class="text-center">Session</th>
                            <th class="text-center">Mark</th>
                            <th class="text-center">Actions</th>
                          </tr>
                          <c:forEach items="${resultsList}" var="results">
                          <tr>
                          <td class="pt-3-half">${results.courseResult.id}</td>
                            <td class="pt-3-half">${results.courseResult.courseName}</td>
                            <td class="pt-3-half">${results.session}</td>
                            <td class="pt-3-half">${results.mark}</td>
                            <td>
                              <span class="table-edit"><a type="button" class="btn btn-primary btn-rounded btn-sm my-0"  href="<c:url value='/results/edit_results/${results.id}'/> ">Edit</a></span>
                              <span class="table-remove"><a type="button" class="btn btn-danger btn-rounded btn-sm my-0" href="<c:url value='/results/delete_results?id=${results.courseResult.id}'/> ">Delete</a></span>
                            </td>
                          </tr> 
                          </c:forEach>  
                        </table>
                      </div>        
            <div class="allPaymentViewStudentDetails">
                    <h3>All Payments</h3>
                    <table class=" paymentViewStudent table table-bordered table-responsive-md table-striped text-center">
                        <tr>
                          <th class="text-center">Payment ID</th>
                          <th class="text-center">Amount</th>
                           <th class="text-center">Date</th>
                          <th class="text-center">Actions</th>
                        </tr>
                        <c:forEach items="${paymentList}" var="payment">
                        <tr>
                          <td class="pt-3-half">${payment.id}</td>
                          <td class="pt-3-half">${payment.amount}</td>
                           <td class="pt-3-half">${payment.paymentDate}</td>
                          <td>
                            <span class="table-edit"><a type="button" class="btn btn-primary btn-rounded btn-sm my-0"  href="<c:url value='/payment/edit_payment/${payment.id}'/> ">Edit</a></span>
                            <span class="table-remove"><a type="button" class="btn btn-danger btn-rounded btn-sm my-0" href="<c:url value='/payment/delete_payment?id=${payment.id}'/> ">Delete</a></span>
                          </td>
                        </tr> 
                        </c:forEach>  
                      </table>
                    </div> 
                    </div>
     
  </body>  
  </html>
                                                      