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
        <p>Giới tính: ${ungvien.getGioiTinh()} </p>
        <p>Ngày sinh: ${ungvien.getNgaySinh()} </p>
        <p>Hôn nhân: ${ungvien.getHonNhan()} </p>
    </c:forEach>
</div>
<h3>Học Vấn</h3>
<div class="col-lg-12 post-list">
    <table class="table">
        <thead>
        <tr>
            <th scope="col">Bằng cấp</th>
            <th scope="col">Trường </th>
            <th scope="col">Thời gian tốt Nghiệp</th>
            <th  scope="col">NGoại ngữ</th>
            <th  scope="col">Trình độ</th>
            <th  scope="col">Mô tã</th>


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

            <th scope="col">Số năm</th>
            <th scope="col">Cấp bậc hiện tại</th>
            <th scope="col">Công ty</th>
            <th scope="col">Chức vụ</th>
            <th scope="col">Thời gian bắt đầu</th>
            <th scope="col">Thời gian kết thúc</th>
            <th scope="col">Mô ta công việc</th>



        </tr>
        </thead>
        <tbody>
        <c:forEach items="${listkinhnghiem}" var="kinhnghiem" varStatus="i" begin="0" end="100">
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
            <th scope="col">Kỷ năng</th>
            <th scope="col">Mức độ</th>
            <th scope="col">Mô tả</th>



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

