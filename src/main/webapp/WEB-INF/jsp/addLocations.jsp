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


    <div class="container mainForm">
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
                 <tr>
                        <td colspan="2">
                      		 <button class="btn btn-info" type="submit" name="submit" value="submit">Submit</button>
                        	 <button class="btn btn-secondary" type="reset" name="reset" value="reset">Cancel</button>                            
                        </td>
                    </tr>
              </table>
                </form:form>
    </div>
</body>

</html>


