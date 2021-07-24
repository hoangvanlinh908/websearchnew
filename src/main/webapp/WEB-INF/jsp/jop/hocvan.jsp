
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!-- End banner Area -->
<form:form class="form-area"  action="/hocvan" modelAttribute="hocvan" method="post"  enctype="multipart/form-data">
    <h2 style="margin-left: 30%;">Học vấn</h2>
    <div class="single-post d-flex flex-row">

        <div class="col-lg-12 form-group" style="margin: 0 auto;padding:50px;">

            <h4>Bằng Cấp </h4>
            <form:input path="BangCap" cssClass="form-control" placeholder="BangCap"/>
            <form:errors path="BangCap"/>
            <h4>Trường</h4>
            <form:input path="Truong" cssClass="form-control" placeholder="Truong"/>
            <form:errors path="Truong"/>
            <h4>THời gian tốt nghiệp</h4>
            <form:input path="ThoiGianTN" cssClass="form-control" placeholder="ThoiGianTN"/>

            <h4>Ngoại ngữ</h4>
            <form:input path="NgoaiNgu" cssClass="form-control" placeholder="NgoaiNgu"/>
            <form:errors path="NgoaiNgu"/>
            <h4>Trình Độ</h4>
            <form:input path="TrinhDo" cssClass="form-control" placeholder="TrinhDo"/>
            <form:errors path="TrinhDo"/>
            <h4>Mô tả</h4>
            <form:input path="MoTa" cssClass="form-control" placeholder="MoTa"/>
            <form:errors path="MoTa"/>
            <button type="submit" class="primary-btn mt-20 text-white" style="float: right;">Thêm</button>
            <div class="mt-20 alert-msg" style="text-align: left;"></div>
        </div>
    </div>
</form:form>