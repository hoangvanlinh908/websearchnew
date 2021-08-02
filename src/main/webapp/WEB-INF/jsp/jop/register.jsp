
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
<form:form class="form-area"  action="/register" modelAttribute="register" method="post"  enctype="multipart/form-data">
    <h2 style="margin-left: 30%;">Đăng Ký nhà tuyển dụng</h2>
    <div class="single-post d-flex flex-row">

        <div class="col-lg-12 form-group" style="margin: 0 auto;padding:50px;">

            <h4>Email</h4>
            <form:input path="Email" cssClass="form-control" placeholder="Email"/>
            <p style="color: red"><form:errors path="Email"/></p>
            <p style="color: red;">${mss}</p>
            <h4>Mật khẩu</h4>
            <input type="password" name="MatKhau" class="form-control" placeholder="Mật khẩu">
<%--            <form:input path="MatKhau" cssClass="form-control" placeholder="MatKhau"/>--%>
            <p style="color: red"><form:errors path="MatKhau"/></p>
            <h4>Tên công ty</h4>
            <form:input path="TenCongTy" cssClass="form-control" placeholder="Tên công ty"/>
            <p style="color: red"><form:errors path="TenCongTy"/></p>
            <h4>Lỉnh vực</h4>
            <div class="form-group" >

                <div class="col-10" >

                    <form:select path="LinhVuc" cssClass="float-none">
                        <form:options  items="${listnn}" itemLabel="TenNganhNghe" itemValue="MaNganhNghe" />
                    </form:select>
                </div>

            </div>
            <p style="color: red"><form:errors path="LinhVuc"/></p>
            <h4>Sơ lược</h4>
            <form:input path="SoLuoc" cssClass="form-control" placeholder="Sơ lược"/>
            <p style="color: red"><form:errors path="SoLuoc"/></p>
            <h4>Địa chỉ</h4>
            <form:input path="DiaChi" cssClass="form-control" placeholder="Địa chỉ"/>
            <p style="color: red"><form:errors path="DiaChi"/></p>
            <h4>Mã số thuế</h4>
            <form:input path="MaSoThue" cssClass="form-control" placeholder="Mã số thuế"/>
            <p style="color: red"><form:errors path="MaSoThue"/></p>
            <h4>Đối tượng</h4>
            <form:input path="DoiTuong" cssClass="form-control" placeholder="Đối tượng"/>
            <p style="color: red"><form:errors path="DoiTuong"/></p>
            <h4>Logo</h4>
            <div class="form-group ">


                <div class="col-10">
                    <input type="file" name="Logo" onchange="return validateFileExtension(this)">
                </div>
            </div>
            <button type="submit" class="primary-btn mt-20 text-white" style="float: right;">Đăng Ký</button>
            <div class="mt-20 alert-msg" style="text-align: left;"></div>
        </div>
    </div>
</form:form>
<script type="text/javascript">
    function validateFileExtension(fld) {
        if(!/(\.png|\.PNG|\.jpg|\.jpeg)$/i.test(fld.value)) {
            alert("Chon file ảnh có đuôi jpg,png,jpeg.");
            fld.form.reset();
            fld.focus();
            return false;
        }
        return true;
    } </script>