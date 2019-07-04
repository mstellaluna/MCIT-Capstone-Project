<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html lang="en">

<head>
<title>College Grading System</title>
<%@include file="/WEB-INF/templates/header.jsp"%>
</head>

<body>

<nav class="menu" tabindex="0">
		<div class="smartphone-menu-trigger"></div>
		<header class="logo">
			<img
				src="${pageContext.request.contextPath}/resources/theme/images/logo.jpg">
		</header>
		<ul>
			<li tabindex="0" class="icon-results"><span><a
					href="<c:url value="/logout" />">Login</a></span></li>		
		</ul>
		 <div class="switch switch-blue">
            <input type="radio" class="switch-input" name="english-french" value="en" id="en" checked>
            <label for="en" class="switch-label switch-label-off">EN</label>
            <input type="radio" class="switch-input" name="english-french" value="fr" id="fr">
            <label for="fr" class="switch-label switch-label-on">FR</label>
            <span class="switch-selection"></span>
          </div>
	</nav>


 <div class="container loginForm">


        <h1>Login</h1>
        <c:if test="${param.error != null}">
        <div class="errorblock">
            Your login attempt was not successful, please try again.<br /> 
            Cause : ${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
        </div>

    </c:if>

        <form name='f' action="login" method='POST'>
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />

            <div class="form-row form-container">
                <table>
                    <tr>
                        <td>
                            <label for="username" class="col-xs-3 col-form-label mr-2">Username:</label>
                        </td>
                        <td>
                            <input type='text' class="form-control" name='username' required>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <label for="password" class="col-xs-3 col-form-label mr-2">Password:</label>
                        </td>
                        <td>
                            <input type='password' class="form-control" name='password' required>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2">
                        	 <button class="btn btn-secondary" type="reset" name="reset" value="reset">Cancel</button>
                            <button class="btn btn-info" type="submit" name="submit" value="submit">Submit</button>
                        </td>
                    </tr>
                </table>
            </div>
        </form>
    </div>
</body>

</html>