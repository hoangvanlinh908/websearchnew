<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!-- End banner Area -->
<H3>Thông Tin cá nhân</H3>

<div class="col-lg-12 post-list">
    <c:forEach items="${ungvien1}" var="ungvien" varStatus="i" begin="0" end="100">
        <p>Tên: ${ungvien.getHoten()} </p>
        <p>Email: ${ungvien.getEmail()} </p>
        <p>SDT: ${ungvien.getSDT()} </p>
        <p>CMND: ${ungvien.getCMND()} </p>
        <p>GioiTinh: ${ungvien.getGioiTinh()} </p>
        <p>NgaySinh: ${ungvien.getNgaySinh()} </p>
        <p>Hôn nhân: ${ungvien.getHonNhan()} </p>
    </c:forEach>
</div>
<h3>Học Vấn</h3>
<div class="col-lg-12 post-list">
    <table class="table">
        <thead>
        <tr>
            <th scope="col">BangCap</th>
            <th scope="col">Truong</th>
            <th scope="col">ThoiGianTN</th>
            <th  scope="col">NgoaiNgu</th>
            <th  scope="col">TrinhDo</th>
            <th  scope="col">MoTa</th>


        </tr>
        </thead>
        <tbody>
        <c:forEach items="${listhocvan}" var="hocvan" varStatus="i" begin="0" end="100">
            <tr>
                <td>${hocvan.getBangCap()}</td>
                <td>${hocvan.getTruong()}</td>
                <td>${hocvan.getThoiGianTN()}</td>
                <td>${hocvan.getNgoaiNgu()}</td>
                <td>${hocvan.getTrinhDo()}</td>
                <td>${hocvan.getMoTa()}</td>
                <td >
                <a class="btn btn-xs btn-danger" href="/deletehocvan?id=${hocvan.getMaHocVan()}">xóa</a>
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
<h3>Kinh Nghiệm</h3>
<div class="col-lg-6 post-list">
    <table class="table">
        <thead>
        <tr>

            <th scope="col">SoNam</th>
            <th scope="col">CapBacHienTai</th>
            <th scope="col">CongTy</th>
            <th scope="col">ChucVu</th>
            <th scope="col">ThoiGianBD</th>
            <th scope="col">ThoiGianKT</th>
            <th scope="col">MoTaCV</th>



        </tr>
        </thead>
        <tbody>
        <c:forEach items="${listkynghiem1}" var="kinhnghiem" varStatus="i" begin="0" end="100">
            <tr>
                <td>${kinhnghiem.getSoNam()}</td>
                <td>${kinhnghiem.getCapBacHienTai()}</td>
                <td>${kinhnghiem.getCongTy()}</td>
                <td>${kinhnghiem.getChucVu()}</td>
                <td>${kinhnghiem.getThoiGianBD()}</td>
                <td>${kinhnghiem.getThoiGianKT()}</td>
                <td>${kinhnghiem.getMoTaCV()}</td>
                <td >
                <a class="btn btn-xs btn-danger" href="/deletekinhnghiem?id=${kinhnghiem.getMaKinhNghiem()}">xóa</a>
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
<h3>Kỷ Năng</h3>
<div class="col-lg-12 post-list">
    <table class="table">
        <thead>
        <tr>
            <th scope="col">KyNangCM</th>
            <th scope="col">MucDo</th>
            <th scope="col">MoTa</th>



        </tr>
        </thead>
        <tbody>
        <c:forEach items="${listkynang}" var="kynang" varStatus="i" begin="0" end="100">
            <tr>
                <td >${kynang.getKyNangCM()}</td>
                <td >${kynang.getMucDo()}</td>
                <td >${kynang.getMoTa()}</td>
                <td >
                <a class="btn btn-xs btn-danger" href="/deletekynang?id=${kynang.getMaKyNang()}">xóa</a>
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

