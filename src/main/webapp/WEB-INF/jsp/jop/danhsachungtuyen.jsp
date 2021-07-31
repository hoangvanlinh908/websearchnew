<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!-- End banner Area -->

<h2 style="margin-left: 30%;">Danh sách ứng tuyển</h2>
<div class="col-lg-12 post-list">
    <table class="table">
        <thead>
        <tr>
            <th scope="col">id</th>
            <th scope="col">Mã ứng viên</th>
            <th scope="col">Ngày đăng ký</th>
            <th scope="col">Tình trạng</th>
            <th scope="col">File cv</th>
            <th scope="col">Thao tác</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${finlistuv}" var="finalluv" varStatus="i" begin="0" end="100">
            <tr>
                <td >${i.index+1}</td>
                <td>${finalluv.getMaUngVien()}</td>
                <td>${finalluv.getNgayDangKy()}</td>
                <td>${finalluv.getTinhTrang()}</td>
                <td>${finalluv.getFileCV()}</td>

                <td>
                    <c:if test="${finalluv.getTinhTrang() == 'Chưa duyệt'}">
                    <a class="btn btn-xs btn-info" href="/duyet?id=${finalluv.getId()}">Duyệt</a>
                    </c:if>
                    <c:if test="${finalluv.getTinhTrang() != 'Chưa duyệt'}">
                    <a class="btn btn-xs btn-info" href="/duyet?id=${finalluv.getId()}">Hủy duyệt</a>
                    </c:if>
                </td>
                <td>
                    <a class="btn btn-xs btn-info" href="/xemcv?id=${finalluv.getMaUngVien()}">xem</a>
                </td>
                <td>
                    <a class="btn btn-xs btn-danger" href="/deletehoso1?id=${finalluv.getId()}">xóa</a>

                </td>
            </tr>

            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
