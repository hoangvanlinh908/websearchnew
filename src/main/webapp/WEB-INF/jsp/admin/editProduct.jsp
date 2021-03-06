<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <title>Product manager</title>

    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-md-2">
        </div>
        <div class="col-md-8">
            <div class="card">
                <div class="card-body">
                    <div class="row">
                        <div class="col-md-12">
                            <h4>Edit product</h4>
                            <hr>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-12">
                            <form:form action="/admin/edit-product" method="post" modelAttribute="editProductForm" enctype="multipart/form-data">
                                <form:hidden path="id"/>

                                <div class="form-group row">
                                    <form:label path="name" class="col-2 col-form-label">Name</form:label>
                                    <div class="col-10">
                                        <form:input path="name"  placeholder="Name" class="form-control here"/>
                                    </div>
                                    <form:errors path="name"/>
                                </div>
                                <div class="form-group row">
                                    <form:label path="description" class="col-2 col-form-label">Description</form:label>
                                    <div class="col-10">
                                        <form:input path="description" placeholder="Description" class="form-control here"/>
                                    </div>
                                    <form:errors path="description"/>
                                </div>
                                <div class="form-group row">
                                    <form:label path="quantity" class="col-2 col-form-label">Quantity</form:label>
                                    <div class="col-10">
                                        <form:input path="quantity" placeholder="Quantity" class="form-control here"/>
                                    </div>
                                    <form:errors path="quantity"/>
                                </div>
                                <div class="form-group row">
                                    <form:label path="price" class="col-2 col-form-label">Price</form:label>
                                    <div class="col-10">
                                        <form:input path="price" placeholder="Price" class="form-control here"/>
                                    </div>
                                    <form:errors path="price"/>
                                </div>

                                <div class="form-group row">
                                    <form:label path="categoryId" class="col-2 col-form-label">Category</form:label>
                                    <div class="col-10">
                                        <form:select path="categoryId">
                                            <form:options items="${categories}" itemLabel="name" itemValue="id"/>
                                        </form:select>
<%--                                        <form:input path="price" placeholder="Price" class="form-control here"/>--%>
                                    </div>
                                    <form:errors path="categoryId"/>
                                </div>
                                <div class="form-group row">
                                    <label class="col-2 col-form-label">Edit<label>
                                    <div class="col-10">
                                        <input type="file" name="productImage">
                                    </div>
                                </div>

                                <div class="form-group row">
                                    <div class="offset-12 col-10">
                                        <button name="submit" type="submit" class="btn btn-primary">Edit product</button>
                                    </div>
                                </div>
                            </form:form>
                        </div>
                    </div>

                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
