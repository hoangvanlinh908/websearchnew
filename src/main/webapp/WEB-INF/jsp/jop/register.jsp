
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!-- End banner Area -->
<form:form class="form-area"  action="/register" modelAttribute="register" method="post"  enctype="multipart/form-data">
    <h2 style="margin-left: 30%;">Đăng Ký nhà tuyển dụng</h2>
    <div class="single-post d-flex flex-row">

        <div class="col-lg-12 form-group" style="margin: 0 auto;padding:50px;">

            <h4>Email</h4>
            <form:input path="Email" cssClass="form-control" placeholder="Email"/>
            <form:errors path="Email"/>
            <p style="color: red;">${mss}</p>
            <h4>MatKhau</h4>
            <form:input path="MatKhau" cssClass="form-control" placeholder="MatKhau"/>
            <form:errors path="MatKhau"/>
            <h4>TenCongTy</h4>
            <form:input path="TenCongTy" cssClass="form-control" placeholder="TenCongTy"/>
            <form:errors path="TenCongTy"/>
            <h4>LinhVuc</h4>
            <form:input path="LinhVuc" cssClass="form-control" placeholder="LinhVuc"/>
            <form:errors path="LinhVuc"/>
            <h4>SoLuoc</h4>
            <form:input path="SoLuoc" cssClass="form-control" placeholder="SoLuoc"/>
            <form:errors path="SoLuoc"/>
            <h4>DiaChi</h4>
            <form:input path="DiaChi" cssClass="form-control" placeholder="DiaChi"/>
            <form:errors path="DiaChi"/>
            <h4>MaSoThue</h4>
            <form:input path="MaSoThue" cssClass="form-control" placeholder="MaSoThue"/>
            <form:errors path="MaSoThue"/>
            <h4>DoiTuong</h4>
            <form:input path="DoiTuong" cssClass="form-control" placeholder="DoiTuong"/>
            <form:errors path="DoiTuong"/>
            <h4>Logo</h4>
            <div class="form-group ">


                <div class="col-10">
                    <input type="file" name="Logo">
                </div>
            </div>
            <button type="submit" class="primary-btn mt-20 text-white" style="float: right;">Đăng Ký</button>
            <div class="mt-20 alert-msg" style="text-align: left;"></div>
        </div>
    </div>
</form:form>