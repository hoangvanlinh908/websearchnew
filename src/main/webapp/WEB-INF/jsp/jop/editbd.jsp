
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<style>
    input ,textarea{
        margin: 20px;

    }


</style>
<!-- End banner Area -->
<form:form class="form-area"  action="/editbd" modelAttribute="editbd" method="post"  enctype="multipart/form-data">
    <h2 style="margin-left: 30%;">Chỉnh sửa bài đăng</h2>
    <div class="single-post d-flex flex-row">

        <div class="col-lg-12 form-group" style="margin: 0 auto;padding:50px;">
            <form:hidden path="MaNhaTuyenDung" cssClass="form-control" placeholder="MaNhaTuyenDung"/>
            <form:hidden path="MaBaiDang" cssClass="form-control" placeholder="MaBaiDang"/>
            <h4>Tiêu đề bài đăng</h4>
            <form:input path="TieuDe" cssClass="form-control" placeholder="Tiêu đề bài đăng"/>
            <p style="color: red"><form:errors path="TieuDe"/></p>
              <h4>Số lượng tuyển dụng</h4>
            <form:input path="SLTuyenDung" cssClass="form-control" placeholder="Số lượng tuyển dụng"/>
            <p style="color: red"><form:errors path="SLTuyenDung"/></p>
            <h4>Tính chất</h4>
            <form:input path="TinhChat" cssClass="form-control" placeholder="Tính chất"/>
            <p style="color: red"><form:errors path="TinhChat"/></p>
            <h4>Mức lương</h4>
            <form:input path="MucLuong" cssClass="form-control" placeholder="Mức lương"/>
            <p style="color: red"><form:errors path="MucLuong"/></p>
            <h4>Địa chỉ làm việc</h4>
            <form:input path="DiaChiLamViec" cssClass="form-control" placeholder="Địa chỉ làm việc"/>
            <p style="color: red"><form:errors path="DiaChiLamViec"/></p>
            <h4>Tiêu chí</h4>
            <form:input path="TieuChi" cssClass="form-control" placeholder="Tiêu chí"/>
            <p style="color: red"><form:errors path="TieuChi"/></p>
            <h4>Chi tiết công việc</h4>
            <form:textarea path="ChiTietCV" cssClass="form-control" placeholder="ChiTietCV"/>
            <p style="color: red"><form:errors path="ChiTietCV"/></p>

            <div class="form-group" >
                <h4 style="float: none;">Ngành nghề</h4>
                <div class="col-10" >
                    <form:select path="MaNganhNghe" cssClass="float-none">
                        <form:options  items="${listnn}" itemLabel="TenNganhNghe" itemValue="MaNganhNghe" />
                    </form:select>
                </div>

            </div>
            <h4>Hình ảnh</h4>
            <div class="form-group ">
            <div>

                <div class="col-10">
                    <input type="file" name="HinhAnh">
                </div>
                <img src="/imgbd/${editbd1.getHinhAnh()}" height="80px" width="80px">
            </div>
            </div>
            <button type="submit" class="primary-btn mt-20 text-white" style="float: right;">Sửa Bài</button>
            <div class="mt-20 alert-msg" style="text-align: left;"></div>
        </div>
    </div>
</form:form>