
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
<form:form class="form-area"  action="/edit-UV" modelAttribute="editUV" method="post"  enctype="multipart/form-data">
    <h2 style="margin-left: 30%;">Đăng Ký Ứng viên</h2>
    <div class="single-post d-flex flex-row">

        <div class="col-lg-12 form-group" style="margin: 0 auto;padding:50px;">
            <form:hidden path="MaUngVien" cssClass="form-control" placeholder="MaUngVien"/>
            <h4>Email</h4>
            <input  class="form-control" type="text" name="Email" value="${editUV.getEmail()}" readonly>
            <p style="color: red"><form:errors path="Email"/></p>
            <p style="color: red;">${msss}</p>
            <h4>Mật khẩu</h4>
            <input type="password" value="${editUV.getMatKhau()}"  name="MatKhau" class="form-control" placeholder="Mật khẩu">
            <p style="color: red"><form:errors path="MatKhau" /></p>
            <h4>Họ tên</h4>
            <form:input path="Hoten" cssClass="form-control" placeholder="Hoten"/>
            <p style="color: red"><form:errors path="Hoten"/></p>
            <h4>Số điện thoại</h4>
            <form:input path="SDT" cssClass="form-control" placeholder="SDT"/>
            <p style="color: red"><form:errors path="SDT"/></p>
            <h4>Chứng minh nhân dân</h4>
            <form:input path="CMND" cssClass="form-control" placeholder="CMND"/>
            <p style="color: red"><form:errors path="CMND"/></p>
            <h4>Giới tính</h4>
            Nam <form:radiobutton path="GioiTinh"  value="Nam" />
            Nữ <form:radiobutton path="GioiTinh" value="Nữ"/>
            Giới tính khác <form:radiobutton path="GioiTinh" value="Giới tính khác"/>
            <p style="color: red"><form:errors path="GioiTinh"/></p>
            <h4>Ngày sinh</h4>
            <input type="date" value="${editUV.getNgaySinh()}" name="NgaySinh">
            <p style="color: red"><form:errors path="NgaySinh"/></p>
            <h4>Địa chỉ</h4>
            <form:input path="DiaChi" cssClass="form-control" placeholder="DiaChi"/>
            <p style="color: red"><form:errors path="DiaChi"/></p>
            <h4>Hô nhân</h4>
            Đã kết hôn <form:radiobutton path="HonNhan"  value="Đã kết hôn" />
            Chưa kết hôn <form:radiobutton path="HonNhan" value="Chưa kết hôn"/>
            <h4>Thành tích</h4>
            <p style="color: red"><form:errors path="HonNhan"/></p>
            <form:input path="ThanhTich" cssClass="form-control" placeholder="ThanhTich"/>
            <p style="color: red"><form:errors path="ThanhTich"/></p>
            <button type="submit" class="primary-btn mt-20 text-white" style="float: right;">Đăng Ký</button>
            <div class="mt-20 alert-msg" style="text-align: left;"></div>
        </div>
    </div>
</form:form>