<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <title>Product manager</title>

    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <!------ Include the above in your HEAD tag ---------->

    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css" rel="stylesheet"
          integrity="#" crossorigin="anonymous">
</head>
<body>
<div class="container-fluid">
    <div class="row">

        <div class="col-md-9">
            <div class="card">
                <div class="card-body">
                    <div class="row">
                        <div class="col-md-2 border-right">
                            <h4>User</h4>
                        </div>
                        <div class="col-md-6">
                            <a href="/admin/add-category" type="button" class="btn btn-sm btn-primary">Add User</a>
                        </div>

                    </div>
                    <div class="row">
                        <div class="col-md-12">
                            <table class="table table-hover ">
                                <thead class="bg-light ">
                                <tr>

                                    <th>Id</th>
                                    <th>Name</th>
                                    <th>Slug</th>
                                    <th>Sorting</th>


                                </tr>
                                </thead>
                                <tbody >
                                <c:forEach items="${categories}" var="category">
                                    <tr>

                                        <td>${category.id}</td>
                                        <td><small>${category.name}</small></td>
                                        <td><small>${category.slug}</small></td>
                                        <td>${category.sorting}</td>

                                    </tr>

                                </c:forEach>


                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>