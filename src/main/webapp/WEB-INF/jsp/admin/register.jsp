<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <title>MyContact App</title>
    <link href="/images/logo.png" rel="shortcut icon" />

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <!-- Custom style -->
    <link href="/static/css/style.css" rel="stylesheet" />
</head>
<body>
    <div class="container" id="main-content">
        <div class="row d-flex justify-content-center">
            <h5 class="text-center">Register</h5>
        </div>

        <div class="row d-flex justify-content-center">
            <c:if test="${errorMessage != null}">
                <div class="alert alert-danger" role="alert">
                    ${errorMessage}
                </div>
            </c:if>
        </div>

        <div class="row d-flex justify-content-center">
            <form:form cssStyle="min-width: 300px;" action="/register" method="post" modelAttribute="registerForm">
                <div class="form-group">
                    <form:input path="username" cssClass="form-control" placeholder="Username"/>
                    <form:errors path="username"/>
                </div>

                <div class="form-group">
                    <form:password path="password" cssClass="form-control" placeholder="Password"/>
                    <form:errors path="password"/>
                </div>

                <div class="form-group">
                    <form:input path="name" cssClass="form-control" placeholder="Name"/>
                    <form:errors path="name"/>
                </div>

                <div class="form-group">
                    <button type="submit" class="btn btn-block btn-primary">
                        <i class="fa fa-save"></i> Create account
                    </button>
                </div>
            </form:form>
        </div>
    </div><!-- /.container -->

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>
