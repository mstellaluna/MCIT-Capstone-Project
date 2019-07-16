<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>

<nav class="menu" tabindex="0">
        <div class="smartphone-menu-trigger"></div>
        <header class="logo">
            <img src="${pageContext.request.contextPath}/resources/theme/images/logo.jpg">
        </header>
        <ul>
        <security:authorize access="hasRole('ROLE_USER')">
			<li tabindex="0"><span><a href="<c:url value="/index" />">Home</a></span></li>
			</security:authorize>		
			<security:authorize access="hasAnyRole('ROLE_ADMIN','ROLE_STUDENT_ADMIN')">
			<li tabindex="0"><span><a href="<c:url value="/student/student_add" />">Student</a></span></li>
			</security:authorize>
			<security:authorize access="hasAnyRole('ROLE_ADMIN','ROLE_PROGRAM_ADMIN')">
			<li tabindex="0"><span><a href="<c:url value="/course/course_add" />">Course</a></span></li>
			</security:authorize>
			<security:authorize access="hasAnyRole('ROLE_ADMIN','ROLE_PROGRAM_ADMIN')">
			<li tabindex="0"><span><a href="<c:url value="/teacher/teacher_add" />">Teacher</a></span></li>
			</security:authorize>
			<security:authorize access="hasAnyRole('ROLE_ADMIN','ROLE_TEACHER')">
			<li tabindex="0"><span><a href="<c:url value="/results/results_add" />">Results</a></span></li>
			</security:authorize>
			<security:authorize access="hasRole('ROLE_USER')">
			<li tabindex="0" class="icon-results"><span><a href="<c:url value="/logout" />">Logout</a></span></li>
			</security:authorize>			
        </ul>

        <div class="switch switch-blue">
            <input type="radio" class="switch-input" name="english-french" value="en" id="en" checked>
            <label for="en" class="switch-label switch-label-off">EN</label>
            <input type="radio" class="switch-input" name="english-french" value="fr" id="fr">
            <label for="fr" class="switch-label switch-label-on">FR</label>
            <span class="switch-selection"></span>
          </div>
    </nav>
