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
     <c:if test="${!empty studentList}">
    <div class="col-sm-9 panel panel-default panel-horizontal studentInfoPanel">
    		<span class="editStudent"><a type="button" class="btn btn-primary btn-rounded btn-sm my-0"  href="<c:url value='/student/student_details/edit_student/${student.id}'/> ">Edit</a></span>
            <div class="panel-body studentFullName"><p>${student.firstname} ${student.lastName }</p></div>
            <div class="panel-body studentStreetAddress"><p>${student.address}</p></div>
            <div class="panel-body studentCityCountry"><p>${student.city}, ${student.country}</p></div>
            <div class="panel-body studentMajor"><p>${student.major}</p></div>

          </div>
      </c:if>     
    <div class="row">
  		<div class="col-sm-3"><!--left col-->
              

      <div class="text-center">
        <img src="http://ssl.gstatic.com/accounts/ui/avatar_2x.png" class="avatar img-circle img-thumbnail" alt="avatar">
        <br>
        <p class="studentID">Student ID: ${student.id}</p>
      </div><br>

               
          <div class="panel panel-default contactPanel">
            <div class="panel-heading">Contact</div>
            <div class="panel-body">${student.phoneNumber}</div>
            <div class="panel-body"><a href="mailto:${student.emailAddress}">Send Email</a></div>
          </div>
          
          
          <div class="panel panel-default paymentPanel">
                <div class="panel-heading">Payment Due</div>
                <div class="panel-body"><p class="paymentAmount">${payment.paymentDue}</p></div>
                <button type="submit" class="btn btn-info makePayment"  id="submit">Make a payment</button>
        </div>
        </div>
       </div><!--/col-3-->
       <div class="row">
            <div class="col-sm-6"><!--left col-->
       <div class="allCourseViewStudentDetails">
            <h3 class="studentDetailsHeaders"> All Courses</h3>
            <table class=" courseViewStudent table table-bordered table-responsive-md table-striped text-center">
                <tr>
                  <th class="text-center">Course ID</th>
                  <th class="text-center">Course Name</th>
                  <th class="text-center">Actions</th>
                </tr>
                <c:forEach items="${enrolledList}" var="enrolled">
                <tr>
                  <td class="pt-3-half">${course.id}</td>
                  <td class="pt-3-half">${course.courseName}</td>
                  <td class="pt-3-half">${course.creditNumber}</td>
                  <td>
                    <span class="table-edit"><a type="button" class="btn btn-primary btn-rounded btn-sm my-0"  href="<c:url value='/course?id=${course.id}&action=edit'/> ">Edit</a></span>
                    <span class="table-remove"><a type="button" class="btn btn-danger btn-rounded btn-sm my-0" href="<c:url value='/course?id=${course.id}&action=delete'/> ">Delete</a></span>
                  </td>
                </tr> 
                </c:forEach>  
              </table>
            </div> 
            <div class="allPaymentViewStudentDetails">
                    <h3>All Payments</h3>
                    <table class=" paymentViewStudent table table-bordered table-responsive-md table-striped text-center">
                        <tr>
                          <th class="text-center">Course ID</th>
                          <th class="text-center">Course Name</th>
                           <th class="text-center">Course Credits</th>
                          <th class="text-center">Actions</th>
                        </tr>
                        <c:forEach items="${paymentList}" var="payment">
                        <tr>
                          <td class="pt-3-half">${payment.id}</td>
                          <td class="pt-3-half">${course.courseName}</td>
                           <td class="pt-3-half">${course.creditNumber}</td>
                          <td>
                            <span class="table-edit"><a type="button" class="btn btn-primary btn-rounded btn-sm my-0"  href="<c:url value='/course?id=${course.id}&action=edit'/> ">Edit</a></span>
                            <span class="table-remove"><a type="button" class="btn btn-danger btn-rounded btn-sm my-0" href="<c:url value='/course?id=${course.id}&action=delete'/> ">Delete</a></span>
                          </td>
                        </tr> 
                        </c:forEach>  
                      </table>
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
             </div>
             </div>       
    </div><!--/row-->
   
    </div>
  </body>  
  </html>
                                                      