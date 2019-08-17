<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>

<head>
<title>College Grading System</title>
<%@include file="/WEB-INF/templates/header.jsp"%>
</head>

<body>
	<%@include file="/WEB-INF/templates/nav.jsp"%>


    <div class="container courseForm">
            <h1>Add Location</h1>
            <c:url var="addAction" value="addLocations" />
            
            <form:form action="${addAction}" modelAttribute="locations" method="POST">  
              <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />  
              <table>
              	<tr> 
              		<td>
              			<form:label path="locationName" cssClass="col-xs-3 col-form-label mr-2" >
							<spring:message text="Location Name:"/>
						</form:label>
              		</td>
              		<td>
              			<form:input type="text" cssClass="form-control" path="locationName" />
              			<form:errors path="locationName" cssClass="errorMessage" />
              		</td>
                </tr>
              </table>
              
                   
               
                <div class="form-group row">
                <div class="offset-xs-3 col-xs-9">
                        <button class="btn btn-primary" type="submit" name="addLocation" id="submit">Add Location</button>
                </div>
                </div>
                </form:form>
    </div>
</body>

</html>


