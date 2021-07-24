
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!-- End banner Area -->
<form:form class="form-area"  action="/kinhnghiem" modelAttribute="kinhnghiem" method="post"  enctype="multipart/form-data">
    <h2 style="margin-left: 30%;">kinh nghiệm</h2>
    <div class="single-post d-flex flex-row">

        <div class="col-lg-12 form-group" style="margin: 0 auto;padding:50px;">

            <h4>KinhNghiem</h4>
            <form:input path="KinhNghiem" cssClass="form-control" placeholder="KinhNghiem"/>
            <form:errors path="KinhNghiem"/>
            <h4>SoNam</h4>
            <form:input path="SoNam" cssClass="form-control" placeholder="SoNam"/>
            <form:errors path="SoNam"/>
            <h4>CapBacHienTai</h4>
            <form:input path="CapBacHienTai" cssClass="form-control" placeholder="CapBacHienTai"/>
            <form:errors path="CapBacHienTai"/>
            <h4>CongTy</h4>
            <form:input path="CongTy" cssClass="form-control" placeholder="CongTy"/>
            <form:errors path="CongTy"/>
            <h4>ChucVu</h4>
            <form:input path="ChucVu" cssClass="form-control" placeholder="ChucVu"/>
            <form:errors path="ChucVu"/>
            <h4>ThoiGianBD</h4>
            <form:input path="ThoiGianBD" cssClass="form-control" placeholder="ThoiGianBD"/>

            <h4>ThoiGianKT</h4>
            <form:input path="ThoiGianKT" cssClass="form-control" placeholder="ThoiGianKT"/>

            <h4>MoTaCV</h4>
            <form:input path="MoTaCV" cssClass="form-control" placeholder="MoTaCV"/>
            <form:errors path="MoTaCV"/>
            <button type="submit" class="primary-btn mt-20 text-white" style="float: right;">Thêm</button>
            <div class="mt-20 alert-msg" style="text-align: left;"></div>
        </div>
    </div>
</form:form>