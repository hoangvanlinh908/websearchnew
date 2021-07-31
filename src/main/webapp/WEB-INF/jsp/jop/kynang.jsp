
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!-- End banner Area -->
<form:form class="form-area"  action="/kynang" modelAttribute="kynang" method="post"  enctype="multipart/form-data">
    <h2 style="margin-left: 30%;">Kỷ Năng</h2>
    <div class="single-post d-flex flex-row">

        <div class="col-lg-12 form-group" style="margin: 0 auto;padding:50px;">

            <h4>Kỷ năng chuyên môn</h4>
            <form:input path="KyNangCM" cssClass="form-control" placeholder="Kỷ năng chuyên môn"/>
            <form:errors path="KyNangCM"/>
            <h4>Mức độ</h4>
            <form:input path="MucDo" cssClass="form-control" placeholder="Mức độ"/>
            <form:errors path="MucDo"/>
            <h4>Mô tả</h4>
            <form:input path="MoTa" cssClass="form-control" placeholder="Mô tả"/>
            <form:errors path="MoTa"/>
            <button type="submit" class="primary-btn mt-20 text-white" style="float: right;">Thêm</button>
            <div class="mt-20 alert-msg" style="text-align: left;"></div>
        </div>
    </div>
</form:form>