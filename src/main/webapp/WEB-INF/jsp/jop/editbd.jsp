
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

            <h4>TieuDe</h4>

            <form:input path="TieuDe" cssClass="form-control" placeholder="TieuDe"/>
            <form:errors path="TieuDe"/>
              <h4>SLTuyenDung</h4>
            <form:input path="SLTuyenDung" cssClass="form-control" placeholder="SLTuyenDung"/>
            <form:errors path="SLTuyenDung"/>
            <h4>TinhChat</h4>
            <form:input path="TinhChat" cssClass="form-control" placeholder="TinhChat"/>
            <form:errors path="TinhChat"/>
            <h4>MucLuong</h4>
            <form:input path="MucLuong" cssClass="form-control" placeholder="MucLuong"/>
            <form:errors path="MucLuong"/>
            <h4>DiaChiLamViec</h4>
            <form:input path="DiaChiLamViec" cssClass="form-control" placeholder="DiaChiLamViec"/>
            <form:errors path="DiaChiLamViec"/>
            <h4>TieuChi</h4>
            <form:input path="TieuChi" cssClass="form-control" placeholder="TieuChi"/>
            <form:errors path="TieuChi"/>
            <h4>ChiTietCV</h4>
            <form:textarea path="ChiTietCV" cssClass="form-control" placeholder="ChiTietCV"/>
            <form:errors path="ChiTietCV"/>

            <div class="form-group" >
                <h4 style="float: none;">MaNganhNghe</h4>
                <div class="col-10" >
                    <form:select path="MaNganhNghe" cssClass="float-none">
                        <form:options  items="${nganhnghe}" itemLabel="TenNganhNghe" itemValue="MaNganhNghe" />
                    </form:select>
                </div>

            </div>
            <h4>HinhAnh</h4>
            <div class="form-group ">
            <div>

                <div class="col-10">
                    <input type="file" name="HinhAnh">
                </div>
                <img src="/imgbd/${editbd.getHinhAnh()}" height="80px" width="80px">
            </div>
            </div>
            <button type="submit" class="primary-btn mt-20 text-white" style="float: right;">Sửa Bài</button>
            <div class="mt-20 alert-msg" style="text-align: left;"></div>
        </div>
    </div>
</form:form>