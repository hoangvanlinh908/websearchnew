
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
<form:form class="form-area"  action="/edit" modelAttribute="nhatuyendung" method="post"  enctype="multipart/form-data">
    <h2 style="margin-left: 30%;">CHỉnh sửa nhà tuyển dụng</h2>
    <div class="single-post d-flex flex-row">

        <div class="col-lg-12 form-group" style="margin: 0 auto;padding:50px;">
            <form:hidden path="MaNhaTuyenDung" cssClass="form-control" placeholder="MaNhaTuyenDung"/>
            <h4>Email</h4>
            <form:input readonly="false" path="Email" cssClass="form-control" placeholder="Email"/>
            <form:errors path="Email"/>
            <h4>Mật khẩu</h4>
            <input type="password" name="MatKhau" class="form-control" placeholder="Mật khẩu">
            <form:errors path="MatKhau"/>
            <h4>Tên công ty</h4>
            <form:input path="TenCongTy" cssClass="form-control" placeholder="Tên công ty"/>
            <form:errors path="TenCongTy"/>
            <h4>Lĩnh vực</h4>
            <div class="form-group" >
                <div class="col-10" >
                    <form:select path="LinhVuc" cssClass="float-none">
                        <form:options  items="${listnn}" itemLabel="TenNganhNghe" itemValue="MaNganhNghe" />
                    </form:select>
                </div>

            </div>
            <form:errors path="LinhVuc"/>
            <h4>Sơ lược</h4>
            <form:input path="SoLuoc" cssClass="form-control" placeholder="Sơ lược"/>
            <form:errors path="SoLuoc"/>
            <h4>Địa chỉ</h4>
            <form:input path="DiaChi" cssClass="form-control" placeholder="Địa chỉ"/>
            <form:errors path="DiaChi"/>
            <h4>Mã số thuế</h4>
            <form:input path="MaSoThue" cssClass="form-control" placeholder="Mã số thuế"/>
            <form:errors path="MaSoThue"/>
            <h4>Đối tượng</h4>
            <form:input path="DoiTuong" cssClass="form-control" placeholder="Đối tượng"/>
            <form:errors path="DoiTuong"/>
            <h4>Logo</h4>
            <div class="form-group ">


                <div class="col-10">
                    <input type="file" name="Logo">
                </div>
                <img src="/imglogo/${nhatuyendung.getLogo()}" height="80px" width="80px">
            </div>
            <button type="submit" class="primary-btn mt-20 text-white" style="float: right;">Sửa</button>
            <div class="mt-20 alert-msg" style="text-align: left;"></div>
        </div>
    </div>
</form:form>