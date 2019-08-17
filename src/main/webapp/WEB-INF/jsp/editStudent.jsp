<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>

<head>
<title>College Grading System</title>
<%@include file="/WEB-INF/templates/header.jsp"%>
</head>
<%@include file="/WEB-INF/templates/nav.jsp"%>
<body>

          
 <div class="container bootstrap snippet studentForm">
        <h1>Edit Student</h1>
          <c:url var="editAction" value="/student/updateStudent?id=${student.id}" />
        <form:form action="${editAction}" commandName="student" method="POST">
          <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
               <table>
        		<tr>
					<td>
						<form:label path="id" cssClass="col-xs-3 col-form-label mr-2" >
							<spring:message text="Student ID:"/>
						</form:label>
					</td>
					<td>
						<form:input type="number" cssClass="form-control" path="id" value="${student.id}" disabled="true"/>
					</td>
				</tr>
				<tr>
					<td>
						<form:label path="firstName" cssClass="col-xs-3 col-form-label mr-2" >
							<spring:message text="First Name:"/>
						</form:label>
					</td>
					<td>
						<form:input type="text" cssClass="form-control" path="firstName" value="${student.firstName}" required="required"/>
					</td>
				</tr>
				<tr>
					<td>
						<form:label path="lastName" cssClass="col-xs-3 col-form-label mr-2">
							<spring:message text="Last Name:"/>
						</form:label>	
					</td>
					<td>
						<form:input type="text" cssClass="form-control" path="lastName" value="${student.lastName}"  required="required"/>
					</td>
				</tr>
				<tr>
					<td>
						<form:label path="address" cssClass="col-xs-3 col-form-label mr-2">
							<spring:message text="Address:"/>
						</form:label>
					</td>
					<td>
						<form:input type="text" cssClass="form-control" path="address" value="${student.address}" required="required"/>					
					</td>
				</tr>
				<tr>
					<td>
						<form:label path="city" cssClass="col-xs-3 col-form-label mr-2">
							<spring:message text="City:"/>
						</form:label>	
					</td>
					<td>
						<form:input type="text" cssClass="form-control" path="city" value="${student.city}" required="required"/>					
					</td>
				</tr>
				<tr>
					<td>
						<form:label path="country" cssClass="col-xs-3 col-form-label mr-2">
							<spring:message text="Country:"/>
						</form:label>	
					</td>
					<td>
						<form:input type="text" cssClass="form-control" path="country" value="${student.country}" required="required"/>						
					</td>
				</tr>
				<tr>
					<td>
						<form:label path="phoneNumber" cssClass="col-xs-3 col-form-label mr-2">
							<spring:message text="Phone Number: "/>
						</form:label>	
					</td>
					<td>
						<form:input type="tel" cssClass="form-control" path="phoneNumber" value="${student.phoneNumber}" required="required"/>
					</td>
				</tr>
				<tr>
					<td>
						<form:label path="major" cssClass="col-xs-3 col-form-label mr-2">
							<spring:message text="Major:"/>
						</form:label>	
					</td>
					<td>
						<form:input type="text" cssClass="form-control" path="major" value="${student.major}" required="required"/>						
					</td>
				</tr>
				<tr>
					<td>
						<form:label path="emailAddress" cssClass="col-xs-3 col-form-label mr-2">
							<spring:message text="Email"/>
						</form:label>	
					</td>
					<td>
						<form:input type="emailAddress" cssClass="form-control" path="emailAddress" value="${student.emailAddress}" required="required"/>
					</td>
				</tr>   		
            </table>
             <div class="form-group row">
                <div class="offset-xs-3 col-xs-9">
                    <button class="btn btn-primary" type="submit" name="updateStudent" id="submit">Update Student</button>
                </div>
                </div>
          </form:form>    
      
       <div class="allCourseViewStudentDetails">
            <h3>Registered Courses</h3>
      
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
     
     	 
       
        <div class="container studentForm">
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
                              <span class="table-remove"><a type="button" class="btn btn-danger btn-rounded btn-sm my-0" href="<c:url value='/course?id=${course.id}&action=delete'/> ">Delete</a></span>
                            </td>
                          </tr> 
                          </c:forEach>  
                        </table>
                      </div>        

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
       
 	   </div>  	 
</body>

</html>


