<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>

<nav class="menu" tabindex="0">
        <div class="smartphone-menu-trigger"></div>
        <header class="logo">
            <img src="${pageContext.request.contextPath}/resources/theme/images/logo.jpg">
        </header>
        

    <!-- Sidebar -->
    <div id="sidebar-container" class="sidebar-expanded">
        <!-- Bootstrap List Group -->
        <ul class="list-group borderless">
            <!-- Menu with submenu -->
             <security:authorize access="hasRole('ROLE_USER')">
                           <a href="/CollegeGradingSystem/" class="list-group-item list-group-item-action">
                <div class="d-flex w-100 justify-content-start align-items-center">
                    <span class="fa fa-home fa-fw mr-3"></span>
                    <span class="menu-collapsed">Home</span>    
                </div>
            </a>  
            </security:authorize>
            <security:authorize access="hasAnyRole('ROLE_ADMIN','ROLE_STUDENT_ADMIN')">
            <a href="#submenu1" data-toggle="collapse" aria-expanded="false" class=" list-group-item list-group-item-action flex-column align-items-start">
                <div class="d-flex w-100 justify-content-start align-items-center">
                    <span class="fa fa-user fa-fw mr-3"></span> 
                    <span class="menu-collapsed">Student</span>
                    <span class="submenu-icon ml-auto"></span>
                </div>
            </a>
            <!-- Submenu content -->
            <div id='submenu1' class="collapse sidebar-submenu">
                <a href="/CollegeGradingSystem/student/student_add" class="list-group-item list-group-item-action bg-dark text-white">
                    <span class="menu-collapsed">Add Student</span>
                </a>
                <a href="/CollegeGradingSystem/course/course_add_student" class="list-group-item list-group-item-action bg-dark text-white">
                    <span class="menu-collapsed">Course Registration</span>
                </a>
                <a href="/CollegeGradingSystem/student/student_list" class="list-group-item list-group-item-action bg-dark text-white">
                    <span class="menu-collapsed">View All Students</span>
                </a>
            </div>
            </security:authorize>
            <security:authorize access="hasAnyRole('ROLE_ADMIN','ROLE_PROGRAM_ADMIN')">
            <a href="#submenu2" data-toggle="collapse" aria-expanded="false" class="list-group-item list-group-item-action flex-column align-items-start">
                <div class="d-flex w-100 justify-content-start align-items-center">
                    <span class="fa fa-book fa-fw mr-3"></span>
                    <span class="menu-collapsed">Course</span>
                    <span class="submenu-icon ml-auto"></span>
                </div>
            </a>
            <!-- Submenu content -->
            <div id='submenu2' class="collapse sidebar-submenu">
                <a href="/CollegeGradingSystem/course/course_add" class="bg-dark list-group-item list-group-item-action  text-white">
                    <span class="menu-collapsed">Add Course</span>
                </a>
                <a href="/CollegeGradingSystem/course/course_list" class="bg-dark list-group-item list-group-item-action  text-white">
                    <span class="menu-collapsed">View All Courses</span>
                </a>
            </div>
            </security:authorize>
              <!-- Menu with submenu -->
              <security:authorize access="hasAnyRole('ROLE_ADMIN','ROLE_PROGRAM_ADMIN')">
            <a href="#submenu3" data-toggle="collapse" aria-expanded="false" class="list-group-item list-group-item-action flex-column align-items-start">
              <div class="d-flex w-100 justify-content-start align-items-center">
                  <span class="fa fa-id-badge fa-fw mr-3"></span> 
                  <span class="menu-collapsed">Teacher</span>
                  <span class="submenu-icon ml-auto"></span>
              </div>
          </a>
          <!-- Submenu content -->
          <div id='submenu3' class="collapse sidebar-submenu">
              <a href="/CollegeGradingSystem/teacher/teacher_add" class="bg-dark list-group-item list-group-item-action  text-white">
                  <span class="menu-collapsed">Add Teacher</span>
              </a>
              <a href="/CollegeGradingSystem/course/course_add_teacher" class="bg-dark list-group-item list-group-item-action  text-white">
                  <span class="menu-collapsed">Assign to Course</span>
              </a>
              <a href="/CollegeGradingSystem/teacher/teacher_list" class="bg-dark list-group-item list-group-item-action  text-white">
                  <span class="menu-collapsed">View All Teachers</span>
              </a>
          </div>
          </security:authorize>
          <!-- Menu with submenu -->
          <a href="#submenu4" data-toggle="collapse" aria-expanded="false" class=" list-group-item list-group-item-action flex-column align-items-start">
            <div class="d-flex w-100 justify-content-start align-items-center">
                <span class="fa fa-pencil-square-o fa-fw mr-3"></span> 
                <span class="menu-collapsed">Results</span>
                <span class="submenu-icon ml-auto"></span>
            </div>
        </a>
        <!-- Submenu content -->
        <div id='submenu4' class="collapse sidebar-submenu">
            <a href="/CollegeGradingSystem/results/results_add" class="bg-dark list-group-item list-group-item-action  text-white">
                <span class="menu-collapsed">Add Results</span>
            </a>
            <a href="/CollegeGradingSystem/results/results_list" class="bg-dark list-group-item list-group-item-action  text-white">
                <span class="menu-collapsed">View All Results</span>
            </a>
        </div> 
        <!-- Menu with submenu -->
        <a href="#submenu5" data-toggle="collapse" aria-expanded="false" class="list-group-item list-group-item-action flex-column align-items-start">
          <div class="d-flex w-100 justify-content-start align-items-center">
              <span class="fa fa-credit-card fa-fw mr-3"></span> 
              <span class="menu-collapsed">Payment</span>
              <span class="submenu-icon ml-auto"></span>
          </div>
      </a>
      <!-- Submenu content -->
  
      <div id='submenu5' class="collapse sidebar-submenu">
          <a href="/CollegeGradingSystem/payment/payment_add" class="bg-dark list-group-item list-group-item-action  text-white">
              <span class="menu-collapsed">Add Payment</span>
          </a>
          <a href="/CollegeGradingSystem/payment/payment_list" class="bg-dark list-group-item list-group-item-action text-white">
              <span class="menu-collapsed">View All Payments</span>
          </a>
      </div>  
      <!-- Menu with submenu -->
      <security:authorize access="hasAnyRole('ROLE_ADMIN','ROLE_PROGRAM_ADMIN')">
      <a href="#submenu6" data-toggle="collapse" aria-expanded="false" class="list-group-item list-group-item-action flex-column align-items-start">
        <div class="d-flex w-100 justify-content-start align-items-center">
            <span class="fa fa-building fa-fw mr-3"></span> 
            <span class="menu-collapsed">Location</span>
            <span class="submenu-icon ml-auto"></span>
        </div>
    </a>
    <!-- Submenu content -->
    <div id='submenu6' class="collapse sidebar-submenu">
        <a href="/CollegeGradingSystem/locations/location_add" class="bg-dark list-group-item list-group-item-action  text-white">
            <span class="menu-collapsed">Add Location</span>
        </a>
        <a href="/CollegeGradingSystem/locations/location_list" class="bg-dark list-group-item list-group-item-action text-white">
            <span class="menu-collapsed">View All Locations</span>
        </a>
    </div>
    </security:authorize>
    <!-- Menu with submenu -->
    <security:authorize access="hasAnyRole('ROLE_ADMIN','ROLE_PROGRAM_ADMIN')">
    <a href="#submenu7" data-toggle="collapse" aria-expanded="false" class="list-group-item list-group-item-action flex-column align-items-start">
      <div class="d-flex w-100 justify-content-start align-items-center">
          <span class="fa fa-calendar fa-fw mr-3"></span> 
          <span class="menu-collapsed">Schedule</span>
          <span class="submenu-icon ml-auto"></span>
      </div>
  </a>
  <!-- Submenu content -->
  <div id='submenu7' class="collapse sidebar-submenu">
      <a href="/CollegeGradingSystem/schedule/schedule_add" class="bg-dark list-group-item list-group-item-action  text-white">
          <span class="menu-collapsed">Create Schedule</span>
      </a>
      <a href="/CollegeGradingSystem/schedule/schedule_list" class="bg-dark list-group-item list-group-item-action  text-white">
          <span class="menu-collapsed">View All Schedules</span>
      </a>
  </div>   
  </security:authorize> 
    <security:authorize access="hasRole('ROLE_USER')">    
                      <a href="/CollegeGradingSystem/logout" class="list-group-item list-group-item-action">
                <div class="d-flex w-100 justify-content-start align-items-center">
                    <span class="fa fa-sign-out fa-fw mr-3"></span>
                    <span class="menu-collapsed">Logout</span>    
                </div>
            </a>  
</security:authorize>       
        </ul>


    
</div>

        
    </nav>
