
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<style>
    input, textarea {
        margin: 20px;

    }


</style>
<!-- End banner Area -->
<form:form class="form-area"  action="/Dangbai" modelAttribute="dangbai" method="post"  enctype="multipart/form-data">
    <h2 style="margin-left: 30%;">Đăng Bài</h2>
    <div class="single-post d-flex flex-row">

        <div class="col-lg-12 form-group" style="margin: 0 auto;padding:50px;">

            <h4>Tiêu đề bài đăng</h4>

            <form:input path="TieuDe" cssClass="form-control" placeholder="Tiêu đề bài đăng"/>
            <form:errors path="TieuDe"/>
              <h4>Số lượng tuyển dụng</h4>
            <form:input path="SLTuyenDung" cssClass="form-control" placeholder="Số lượng tuyển dụng"/>
            <form:errors  path="SLTuyenDung" cssClass="error"/>
            <h4>Tính chất</h4>
            <form:input path="TinhChat" cssClass="form-control" placeholder="Tính chất"/>
            <form:errors path="TinhChat"/>
            <h4>Mức lương</h4>
            <form:input path="MucLuong" cssClass="form-control" placeholder="Mức lương"/>
            <form:errors path="MucLuong"/>
            <h4>Địa chỉ làm việc</h4>
            <form:input path="DiaChiLamViec" cssClass="form-control" placeholder="Địa chỉ làm việc"/>
            <form:errors path="DiaChiLamViec"/>
            <h4>Tiêu chí</h4>
            <form:input path="TieuChi" cssClass="form-control" placeholder="Tiêu chí"/>
            <form:errors path="TieuChi"/>
            <h4>Chi tiết Công việc</h4>
            <form:textarea path="ChiTietCV" cssClass="form-control" placeholder="Chi tiết Công việc"/>
            <form:errors path="ChiTietCV"/>

            <div class="form-group" >
                <h4 style="float: none;">Ngành Nghề</h4>
                <div class="col-10" >
                    <form:select path="MaNganhNghe" cssClass="float-none">
                        <form:options  items="${listnn}" itemLabel="TenNganhNghe" itemValue="MaNganhNghe" />
                    </form:select>
                </div>

            </div>
            <h4>Hình ảnh</h4>
            <div class="form-group ">


                <div class="col-10">
                    <input type="file" name="HinhAnh">
                </div>
            </div>
            <button type="submit" class="primary-btn mt-20 text-white" style="float: right;">Đăng Bài</button>
            <div class="mt-20 alert-msg" style="text-align: left;"></div>
        </div>
    </div>
</form:form>