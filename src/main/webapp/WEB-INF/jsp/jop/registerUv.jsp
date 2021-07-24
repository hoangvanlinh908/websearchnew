
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!-- End banner Area -->
<form:form class="form-area"  action="/registerUv" modelAttribute="registerUv" method="post"  enctype="multipart/form-data">
    <h2 style="margin-left: 30%;">Đăng Ký nhà Ứng viên</h2>
    <div class="single-post d-flex flex-row">

        <div class="col-lg-12 form-group" style="margin: 0 auto;padding:50px;">

            <h4>Email</h4>
            <form:input path="Email" cssClass="form-control" placeholder="Email"/>
            <form:errors path="Email"/>
            <h4>MatKhau</h4>
            <form:input path="MatKhau" cssClass="form-control" placeholder="MatKhau"/>
            <form:errors path="MatKhau"/>
            <h4>Hoten</h4>
            <form:input path="Hoten" cssClass="form-control" placeholder="Hoten"/>
            <form:errors path="Hoten"/>
            <h4>SDT</h4>
            <form:input path="SDT" cssClass="form-control" placeholder="SDT"/>
            <form:errors path="SDT"/>
            <h4>CMND</h4>
            <form:input path="CMND" cssClass="form-control" placeholder="CMND"/>
            <form:errors path="CMND"/>
            <h4>GioiTinh</h4>
            Nam <form:radiobutton path="GioiTinh"  value="Nam" />
            Nữ <form:radiobutton path="GioiTinh" value="Nữ"/>
            Giới tính khác <form:radiobutton path="GioiTinh" value="Giới tính khác"/>
            <form:errors path="GioiTinh"/>
            <h4>NgaySinh</h4>
            <form:input path="NgaySinh" cssClass="form-control" placeholder="NgaySinh"/>
            <form:errors path="NgaySinh"/>
            <h4>DiaChi</h4>
            <form:input path="DiaChi" cssClass="form-control" placeholder="DiaChi"/>
            <form:errors path="DiaChi"/>
            <h4>HonNhan</h4>
            Đã kết hôn <form:radiobutton path="HonNhan"  value="Đã kết hôn" />
            Chưa kết hôn <form:radiobutton path="HonNhan" value="Chưa kết hôn"/>
            <h4>ThanhTich</h4>
            <form:errors path="HonNhan"/>
            <form:input path="ThanhTich" cssClass="form-control" placeholder="ThanhTich"/>
            <form:errors path="ThanhTich"/>
            <button type="submit" class="primary-btn mt-20 text-white" style="float: right;">Đăng Ký</button>
            <div class="mt-20 alert-msg" style="text-align: left;"></div>
        </div>
    </div>
</form:form>