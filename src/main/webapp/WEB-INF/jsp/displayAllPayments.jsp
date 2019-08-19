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

<div class="container mainForm">
    <h1>All Payments</h1>
    <c:if test="${empty paymentList}">
       		<p>${emptyPaymentList}</p>
 		</c:if>
 	<c:if test="${!empty paymentList}">	
    <table class="table table-bordered table-responsive-md table-striped text-center">
        <tr>
        	<th class="text-center">Payment ID</th>
            <th class="text-center">Student ID</th>
            <th class="text-center">First Name</th>
            <th class="text-center">Last Name</th>
            <th class="text-center">Amount</th>
            <th class="text-center">Date</th>
            <th class="text-center">Actions</th>
        </tr>
        <c:forEach items="${paymentList}" var="payment">
            <tr>
           		<td class="pt-3-half">${payment.id}</td>
                <td class="pt-3-half">${payment.studentPayments.id}</td>
                <td class="pt-3-half">${payment.studentPayments.firstName}</td>
                <td class="pt-3-half">${payment.studentPayments.lastName}</td>
                <td class="pt-3-half">${payment.amount}</td>
                <td class="pt-3-half">${payment.paymentDate}</td>
                <td>
                    <span class="table-edit"><a type="button" class="btn btn-primary btn-rounded btn-sm my-0"  href="<c:url value='/payment/edit_payment/${payment.id}'/> ">Edit</a></span>
                    <span class="table-remove"><a type="button" class="btn btn-danger btn-rounded btn-sm my-0" href="<c:url value='/payment/delete_payment?id=${payment.id}'/> ">Delete</a></span>
                </td> 
            </tr>
        </c:forEach>
    </table>
    </c:if>
</div>


</body>

</html>
