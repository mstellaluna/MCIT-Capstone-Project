<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
 --%>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <meta author="Mary Mule">
    <title>Student Management System</title>

    <!-- BOOTSTRAP 4 AND CUSTOM CSS FILE IMPORT-->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
        integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
  
        <link rel="stylesheet" href="./css/styles.css">

    <!-- FontAwesome CDN-->
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.1/css/all.css"
        integrity="sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr" crossorigin="anonymous">

    <!-- Google Font Import-->
    <link href="https://fonts.googleapis.com/css?family=Lora|Lato" rel="stylesheet"> 
</head>

<body>


    <nav class="menu" tabindex="0">
        <div class="smartphone-menu-trigger"></div>
        <header class="logo">
            <img src="./img/logo.jpg" />
        </header>
        <ul>
        	<li tabindex="0" class="icon-student"><i class="fas fa-home"></i><span><a href="index.html"> Home</a></span></li>
            <li tabindex="0" class="icon-student"><i class="fas fa-user"></i><span> <a href="addStudent.html">Student</a></span></li>
            <li tabindex="0" class="icon-course"><i class="fas fa-book"></i><span> <a href="addCourse.html">Course</a></span></li>
            <li tabindex="0" class="icon-results"><i class="fas fa-clipboard"></i><span><a href="addResults.html"> Results</a></span></li>
        </ul>
    </nav>



    <div class="container studentForm">
            <h1>Add Student</h1>
            <form action="student" method="post">
                <div class="form-group row">
                <label for="firstName" class="col-xs-3 col-form-label mr-2">First Name:</label>
                <div class="col-xs-6">
                <input type="text" class="form-control" id="firstName" name="firstName">
                </div>
                <label for="lastName" class="col-xs-3 col-form-label mr-2">Last Name:</label>
                <div class="col-xs-6">
                <input type="text" class="form-control" id="lastName" name="lastName">
                </div>
                </div>
                <div class="form-group row">
                    <label for="university" class="col-xs-3 col-form-label mr-2">University:</label>
                    <div class="col-xs-9">
                    <input type="text" class="form-control" id="university" name="university">
                    </div>
                    </div>
                    <div class="form-group row">
                        <label for="address" class="col-xs-3 col-form-label mr-2">Address:</label>
                        <div class="col-xs-9">
                        <input type="text" class="form-control" id="address" name="address">
                        </div>
                        </div>
                        <div class="form-group row">
                            <label for="city" class="col-xs-3 col-form-label mr-2">City:</label>
                            <div class="col-xs-9">
                            <input type="text" class="form-control" id="city" name="city">
                            </div>
                            </div>
                            <div class="form-group row">
                                <label for="state-province" class="col-xs-3 col-form-label mr-2">State/Province:</label>
                                <div class="col-xs-9">
                                <input type="text" class="form-control" id="state-province" name="state-province">
                                </div>
                                </div>
                                <div class="form-group row">
                                    <label for="zip-postalcode" class="col-xs-3 col-form-label mr-2">Zip/Postal Code:</label>
                                    <div class="col-xs-9">
                                    <input type="text" class="form-control" id="zip-postalcode" name="zip-postalcode">
                                    </div>
                                    </div>
                                    <div class="form-group row">
                                        <label for="country" class="col-xs-3 col-form-label mr-2">Country:</label>
                                        <div class="col-xs-9">
                                        <input type="text" class="form-control" id="country" name="country">
                                        </div>
                                        </div>
                                        <div class="form-group row">
                                            <label for="telephone" class="col-xs-3 col-form-label mr-2">Country:</label>
                                            <div class="col-xs-9">
                                            <input type="tel" class="form-control" id="telephone" name="telephone">
                                            </div>
                                            </div>
                                            <div class="form-group row">
                                                <label for="fax" class="col-xs-3 col-form-label mr-2">Fax:</label>
                                                <div class="col-xs-9">
                                                <input type="tel" class="form-control" id="fax" name="fax">
                                                </div>
                                                </div>
                        <div class="form-group row">
                            <label for="email" class="col-xs-3 col-form-label mr-2">Address:</label>
                            <div class="col-xs-9">
                            <input type="email" class="form-control" id="email" name="email">
                            </div>
                            </div> 
                            <div class="form-group row">
                                <label for="gender" class="col-xs-3 col-form-label mr-2">Gender:</label>
                                <div class="col-xs-9">
                                <input type="checkbox" class="form-control" id="male" name="male">Male
                                <input type="checkbox" class="form-control" id="female" name="female">Female
                                </div>
                                </div>  
                                <div class="form-group row">
                                    <label for="birthdate" class="col-xs-3 col-form-label mr-2">birthdate:</label>
                                    <div class="col-xs-9">
                                    <input type="number" class="form-control" id="day" name="day">DD /
                                    <input type="number" class="form-control" id="month" name="month">MM /
                                    <input type="number" class="form-control" id="year" name="year">YYYY /
                                    </div>
                                    </div>          
                <div class="form-group row">
                <div class="offset-xs-3 col-xs-9">
                        <button type="submit" name="addStudent" id="submit">Add Student</button>
                        <button type="submit" name="viewAllStudents" id="submit">View All Students</button>
                </div>
                </div>
                </form>
    </div>
</body>

</html>