<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!-- End banner Area -->
<form:form class="form-area"  action="/nophoso" modelAttribute="nophoso" method="post"  enctype="multipart/form-data">
    <h2 style="margin-left: 30%;">Đăng Ký hồ sơ</h2>
    <div class="single-post d-flex flex-row">

        <div class="col-lg-8 form-group" style="margin: 0 auto;padding:50px;">

            <h4>File cv</h4>
            <form:input path="FileCV" cssClass="form-control" placeholder="File cv"/>
            <p style="color: red">${thongbao}</p>
            <button type="submit" class="primary-btn mt-20 text-white" style="float: right;">Đăng Ký</button>
            <div class="mt-20 alert-msg" style="text-align: left;"></div>
        </div>
    </div>
</form:form>
