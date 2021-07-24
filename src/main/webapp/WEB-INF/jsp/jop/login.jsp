<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!-- End banner Area -->
<form class="form-area "action="/login" method="post" >
    <h2 style="margin-left: 30%;">Đăng Nhập nhà tuyển dụng</h2>
    <div class="single-post d-flex flex-row">

        <div class="col-lg-6 form-group" style="margin: 0 auto;padding:20px">

            <input name="Email" placeholder="Email" pattern="[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\.[A-Za-z]{1,63}$" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Enter email address'" class="common-input mb-20 form-control" required="" type="text">

            <input name="MatKhau" placeholder="passwork"  class="common-input mb-20 form-control" required="" type="password">
            <h2 style="color: red"> ${errorMessage}</h2>
            <button class="primary-btn mt-20 text-white" style="float: right;">Đăng Nhập</button>
            <div class="mt-20 alert-msg" style="text-align: left;"></div>
        </div>
    </div>
</form>