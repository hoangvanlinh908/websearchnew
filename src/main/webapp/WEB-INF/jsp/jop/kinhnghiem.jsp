
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!-- End banner Area -->
<form:form class="form-area"  action="/kinhnghiem" modelAttribute="kinhnghiem" method="post"  enctype="multipart/form-data">
    <h2 style="margin-left: 30%;">kinh nghiệm</h2>
    <div class="single-post d-flex flex-row">

        <div class="col-lg-12 form-group" style="margin: 0 auto;padding:50px;">
            <h4>Số năm</h4>
            <form:input path="SoNam" cssClass="form-control" placeholder="Số năm"/>
    <p style="color: red"><form:errors path="SoNam"/></p>
            <h4>Cấp bực hiện tại</h4>
            <form:input path="CapBacHienTai" cssClass="form-control" placeholder="Cấp bực hiện tại"/>
    <p style="color: red"><form:errors path="CapBacHienTai"/></p>
            <h4>Công ty</h4>
            <form:input path="CongTy" cssClass="form-control" placeholder="Công ty"/>
    <p style="color: red"><form:errors path="CongTy"/></p>
            <h4>Chức vụ</h4>
            <form:input path="ChucVu" cssClass="form-control" placeholder="Chức vụ"/>
    <p style="color: red"><form:errors path="ChucVu"/></p>
            <h4>Thời gian bắt đầu</h4>
            <input type="date" name="Thời gian bắt đầu">
    <p style="color: red"><form:errors path="ThoiGianBD"/></p>
<%--            <form:input path="ThoiGianBD" cssClass="form-control" placeholder="ThoiGianBD"/>--%>

            <h4>Thời gian kết thúc</h4>
            <input type="date" name="Thời gian kết thúc">
    <p style="color: red"><form:errors path="ThoiGianKT"/></p>
<%--            <form:input path="ThoiGianKT" cssClass="form-control" placeholder="ThoiGianKT"/>--%>

            <h4>Mô tả công việc</h4>
            <form:input path="MoTaCV" cssClass="form-control" placeholder="Mô ta công việc"/>
    <p style="color: red"><form:errors path="MoTaCV"/></p>
            <button type="submit" class="primary-btn mt-20 text-white" style="float: right;">Thêm</button>
            <div class="mt-20 alert-msg" style="text-align: left;"></div>
        </div>
    </div>
</form:form>
