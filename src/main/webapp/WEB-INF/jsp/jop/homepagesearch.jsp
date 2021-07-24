<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!-- start banner Area -->


<!-- Start post Area -->

            <c:forEach items="${search2}" var="findBD">
                <div class="single-post d-flex flex-row" >
                    <div class="thumb" style="margin-left: 20px;margin-right: 20px">
                        <img style="width: 100px;height: 100px" src="imgbd/${findBD.getHinhAnh()}" alt="">
                        <ul class="tags">

                            <li>
                                <a href="#">${findBD.nganhNghe.getTenNganhNghe()}</a>
                            </li>
                        </ul>
                    </div>
                    <div class="details">
                        <div class="title d-flex flex-row justify-content-between">
                            <div class="titles" style=" padding-right: 150px;">
                                <a href="/deltail-id?id=${findBD.getMaBaiDang()}"><h4>${findBD.getTieuDe()}</h4></a>
                                <h6>${findBD.getNgayDang()}</h6>
                            </div>
                            <ul class="btns">
                                <li><a href="#"><span class="lnr lnr-heart"></span></a></li>
                                <li><a href="/nophoso?id=${findBD.getMaBaiDang()}">Apply</a></li>
                            </ul>
                        </div>
                        <p>
                            Chi tiết công việc: ${findBD.getChiTietCV()}
                        </p>
                        <h5>Tính Chất công việc: ${findBD.getTinhChat()}</h5>
                        <h5>Số lượng: ${findBD.getSLTuyenDung()}</h5>
                        <p class="address"><span class="lnr lnr-map"></span> ${findBD.getDiaChiLamViec()}</p>
                        <p class="address"><span class="lnr lnr-database"></span> ${findBD.getMucLuong()}</p>
                    </div>
                </div>
                </c:forEach>

                <a class="text-uppercase loadmore-btn mx-auto d-block" href="category.html">Load More job Posts</a>
