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
</head>

<body>

<%@include file="/WEB-INF/templates/nav.jsp"%>

<div class="container studentForm">
		  <h1>Student Enrollment</h1>
          <c:url var="addAction" value="addPayment" />
            
            <form:form action="${addAction}" modelAttribute="payment" method="POST">  
          <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" /> 
     
      		<div class="form-group row"> 
      		<p>${emptyStudentList}</p>
          	<select id="studentId" name="studentId" class=" student_names_dropdown custom-select custom-select-lg mb-3">
            	<option value="">Select Student</option>
					<c:forEach items="${studentList}" var="student">
						<option value="${student.id}">${student.firstName} ${student.lastName}</option>
					</c:forEach>
			</select>
           </div>

                 <table>
                    <tr>
                        <td>
                            <label for="amount" class="col-xs-3 col-form-label mr-2">Amount:</label>
                        </td>
                        <td>
                            <input type='number' class="form-control" name='amount' required>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <label for="paymentDate" class="col-xs-3 col-form-label mr-2">Payment Date:</label>
                        </td>
                        <td>
                            <input type='date' class="form-control" name='paymentDate' required 
                            pattern="(?:19|20)[0-9]{2}-(?:(?:0[1-9]|1[0-2])/(?:0[1-9]|1[0-9]|2[0-9])|(?:(?!02)(?:0[1-9]|1[0-2])/(?:30))|(?:(?:0[13578]|1[02])-31))">
                        </td>
                    </tr>
               <!--      <tr>
                        <td>
                      		 <button class="btn btn-info" type="submit" name="submit" value="submit">Submit</button>                  
                        </td>
                    </tr> -->
        </form:form>
               	                 	
            <div class="form-group row">
                <div class="offset-xs-3 col-xs-9">
                    <button type="submit" name="addPayment" id="submit">Add Payment</button>
                </div>
                </div>
                


</div>
</body>
</html>	