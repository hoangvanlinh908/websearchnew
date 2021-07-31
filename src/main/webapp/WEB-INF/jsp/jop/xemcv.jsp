<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<h3>Thông tin ứng viên</h3>
<!-- End banner Area -->
      <p style="color: #0b0b0b">Thông tin cá nhân</p>

<div class="col-lg-12 post-list">
<c:forEach items="${ungvien}" var="ungvien" varStatus="i" begin="0" end="100">
    <p>Tên: ${ungvien.getHoten()} </p>
    <p>Email: ${ungvien.getEmail()} </p>
    <p>SDT: ${ungvien.getSDT()} </p>
    <p>CMND: ${ungvien.getCMND()} </p>
    <p>Giới tính: ${ungvien.getGioiTinh()} </p>
    <p>Ngày sinh: ${ungvien.getNgaySinh()} </p>
    <p>Hôn nhân: ${ungvien.getHonNhan()} </p>
</c:forEach>
</div>
<p style="color: #0b0b0b">Học Vấn</p>
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
        <c:forEach items="${listhocvan1}" var="hocvan" varStatus="i" begin="0" end="100">
            <tr>
                <td>${hocvan.getBangCap()}</td>
                <td>${hocvan.getTruong()}</td>
                <td>${hocvan.getThoiGianTN()}</td>
                <td>${hocvan.getNgoaiNgu()}</td>
                <td>${hocvan.getTrinhDo()}</td>
                <td>${hocvan.getMoTa()}</td>
            </tr>

            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
<p style="color: #0b0b0b">Kinh nghiệm</p>
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
        <c:forEach items="${listkinhnghiem1}" var="kinhnghiem" varStatus="i" begin="0" end="100">
            <tr>
                <td>${kinhnghiem.getSoNam()}</td>
                <td>${kinhnghiem.getCapBacHienTai()}</td>
                <td>${kinhnghiem.getCongTy()}</td>
                <td>${kinhnghiem.getChucVu()}</td>
                <td>${kinhnghiem.getThoiGianBD()}</td>
                <td>${kinhnghiem.getThoiGianKT()}</td>
                <td>${kinhnghiem.getMoTaCV()}</td>
              
               
            </tr>

            </tr>
        </c:forEach>
        </tbody>
    </table>

</div>
<p style="color: #0b0b0b">Kỷ năng</p>
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
        <c:forEach items="${listkynang1}" var="kynang" varStatus="i" begin="0" end="100">
            <tr>
                <td >${kynang.getKyNangCM()}</td>
                <td >${kynang.getMucDo()}</td>
                <td >${kynang.getMoTa()}</td>
               
            </tr>

            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

