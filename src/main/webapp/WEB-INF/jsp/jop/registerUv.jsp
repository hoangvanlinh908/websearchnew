
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<style>
    input {
        margin: 20px;

    }


</style>
<!-- End banner Area -->
<form:form class="form-area"  action="/registerUv" modelAttribute="registerUv" method="post"  enctype="multipart/form-data">
    <h2 style="margin-left: 30%;">Đăng Ký Ứng viên</h2>
    <div class="single-post d-flex flex-row">

        <div class="col-lg-12 form-group" style="margin: 0 auto;padding:50px;">

            <h4>Email</h4>
            <form:input path="Email" cssClass="form-control" placeholder="Email"/>
            <form:errors path="Email"/>
            <p style="color: red;">${msss}</p>
            <h4>Mật khẩu</h4>
            <input type="password" name="MatKhau" class="form-control" placeholder="Mật khẩu">
            <form:errors path="MatKhau"/>
            <h4>Họ tên</h4>
            <form:input path="Hoten" cssClass="form-control" placeholder="Hoten"/>
            <form:errors path="Hoten"/>
            <h4>Số điện thoại</h4>
            <form:input path="SDT" cssClass="form-control" placeholder="SDT"/>
            <form:errors path="SDT"/>
            <h4>Chứng minh nhân dân</h4>
            <form:input path="CMND" cssClass="form-control" placeholder="CMND"/>
            <form:errors path="CMND"/>
            <h4>Giới tính</h4>
            Nam <form:radiobutton path="GioiTinh"  value="Nam" />
            Nữ <form:radiobutton path="GioiTinh" value="Nữ"/>
            Giới tính khác <form:radiobutton path="GioiTinh" value="Giới tính khác"/>
            <form:errors path="GioiTinh"/>
            <h4>Ngày sinh</h4>
            <input type="date" name="NgaySinh">
            <form:errors path="NgaySinh"/>
            <h4>Địa chỉ</h4>
            <form:input path="DiaChi" cssClass="form-control" placeholder="DiaChi"/>
            <form:errors path="DiaChi"/>
            <h4>Hô nhân</h4>
            Đã kết hôn <form:radiobutton path="HonNhan"  value="Đã kết hôn" />
            Chưa kết hôn <form:radiobutton path="HonNhan" value="Chưa kết hôn"/>
            <h4>Thành tích</h4>
            <form:errors path="HonNhan"/>
            <form:input path="ThanhTich" cssClass="form-control" placeholder="ThanhTich"/>
            <form:errors path="ThanhTich"/>
            <button type="submit" class="primary-btn mt-20 text-white" style="float: right;">Đăng Ký</button>
            <div class="mt-20 alert-msg" style="text-align: left;"></div>
        </div>
    </div>
</form:form>