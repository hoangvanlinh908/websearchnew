<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!-- End banner Area -->

<h2 style="margin-left: 30%;">Danh sách bài đăng</h2>
<div class="col-lg-12 post-list">
    <table class="table">
        <thead>
        <tr>
            <th scope="col">id</th>
            <th scope="col">MaBaiDang</th>
            <th scope="col">TieuDe</th>
            <th scope="col">NgayDang</th>
            <th hidden scope="col">SLTuyenDung</th>
            <th hidden scope="col">TinhChat</th>
            <th hidden scope="col">MucLuong</th>
            <th hidden scope="col">DiaChiLamViec</th>
            <th hidden scope="col">TieuChi</th>
            <th hidden scope="col">ChiTietCV</th>
            <th scope="col">HinhAnh</th>

        </tr>
        </thead>
        <tbody>
<c:forEach items="${finallnntd}" var="finallbd" varStatus="i" begin="0" end="100">
        <tr>
            <td >${i.index+1}</td>
            <td>${finallbd.getMaBaiDang()}</td>
            <td>${finallbd.getTieuDe()}</td>
            <td>${finallbd.getNgayDang()}</td>
            <td hidden>${finallbd.getSLTuyenDung()}</td>
            <td hidden>${finallbd.getTinhChat()}</td>
            <td hidden>${finallbd.getMucLuong()}</td>
            <td hidden>${finallbd.getDiaChiLamViec()}</td>
            <td hidden>${finallbd.getTieuChi()}</td>
            <td hidden>${finallbd.getChiTietCV()}</td>

            <td><img src="/imgbd/${finallbd.getHinhAnh()}" height="50px" width="50px"></td>
            <td>
            <a class="btn btn-xs btn-danger" href="/deletebd?id=${finallbd.getMaBaiDang()}">xóa</a>
                <a class="btn btn-xs btn-info" style="margin-top: 10px" href="/editbd?id=${finallbd.getMaBaiDang()}">sửa</a>

            </td>

            <td>  <a class="btn btn-xs btn-info" href="/danhsachungtuyen?id=${finallbd.getMaBaiDang()}"> xem dánh sách ứng tuyển </a>
            </td>

<%--            <td>--%>
<%--                <a class="btn btn-xs btn-info" href="/danhsachungtuyen?id=${finallbd.getId()}"> sửa</a>--%>
<%--                <a class="btn btn-xs btn-danger" href="/deletehoso?id=${finallbd.getId()}">xóa</a>--%>
<%--            </td>--%>
        </tr>

        </tr>
</c:forEach>
        </tbody>
    </table>
</div>
