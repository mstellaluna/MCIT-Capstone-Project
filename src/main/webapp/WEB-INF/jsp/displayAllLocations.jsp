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



    <div class="container mainForm">
        <h1>All Locations</h1>
        <c:if test="${empty locationList}">
       		<p>${emptyLocationList}</p>
 		</c:if>
         <c:if test="${!empty locationList}">
        <table class="table table-bordered table-responsive-md table-striped text-center">
            <tr>
              <th class="text-center">Location ID</th>
              <th class="text-center">Location Name</th>
              <th class="text-center">Actions</th>
            </tr>
            <c:forEach items="${locationList}" var="location">
            <tr>
              <td class="pt-3-half">${location.id}</td>
              <td class="pt-3-half">${location.locationName}</td>
              <td>
              	<span class="table-details"><a type="button" class="btn btn-info btn-rounded btn-sm my-0"  href="<c:url value='/locations/location_details/${location.id}'/> ">Details</a></span>
                <span class="table-edit"><a type="button" class="btn btn-primary btn-rounded btn-sm my-0"  href="<c:url value='/locations/edit_location/${location.id}'/> ">Edit</a></span>
                <span class="table-remove"><a type="button" class="btn btn-danger btn-rounded btn-sm my-0" href="<c:url value='/locations/delete_location?id=${location.id}'/> ">Delete</a></span>
              </td>
            </tr> 
            </c:forEach>  
          </table>
          </c:if>
        </div>
 

</body>

</html>
