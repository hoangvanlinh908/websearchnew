<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!-- End banner Area -->
<c:forEach items="${text123}" var="deltail">
<div class="col-lg-12 post-list">
    <div class="single-post d-flex flex-row" >
        <div class="thumb" style="margin-left: 20px;margin-right: 20px">
            <img style="width: 100px;height: 100px" src="imgbd/${deltail.getHinhAnh()}" alt="">
            <ul class="tags">

                <li>
                    <a href="#">${deltail.nganhNghe.getTenNganhNghe()}</a>
                </li>
            </ul>
        </div>
        <div class="details">
            <div class="title d-flex flex-row justify-content-between">
                <div class="titles" style=" padding-right: 150px;">
                    <a href="/deltail-id?id=${deltail.getMaBaiDang()}"><h4>${deltail.getTieuDe()}</h4></a>
                    <h6>${deltail.getNgayDang()}</h6>
                </div>
                <ul class="btns">
                    <li><a href="#"><span class="lnr lnr-heart"></span></a></li>
                    <li><a href="#">Apply</a></li>
                </ul>
            </div>
            <p>
                Chi tiết công việc: ${deltail.getChiTietCV()}
            </p>
            <h5>Tính Chất công việc: ${deltail.getTinhChat()}</h5>
            <h5>Số lượng: ${deltail.getSLTuyenDung()}</h5>
            <p class="address"><span class="lnr lnr-map"></span> ${deltail.getDiaChiLamViec()}</p>
            <p class="address"><span class="lnr lnr-database"></span> ${deltail.getMucLuong()}</p>
        </div>
    </div>
    <div class="single-post job-details">
        <h4 class="single-title">Whom we are looking for</h4>
        <p>
            Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur.
        </p>
        <p>
            Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.
        </p>
    </div>
    <div class="single-post job-experience">
        <h4 class="single-title">Experience Requirements</h4>
        <ul>
            <li>
                <img src="img/pages/list.jpg" alt="">
                <span>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliquaut enim ad minim veniam.</span>
            </li>
            <li>
                <img src="img/pages/list.jpg" alt="">
                <span>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliquaut enim ad minim veniam.</span>
            </li>
            <li>
                <img src="img/pages/list.jpg" alt="">
                <span>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliquaut enim ad minim veniam.</span>
            </li>
            <li>
                <img src="img/pages/list.jpg" alt="">
                <span>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliquaut enim ad minim veniam.</span>
            </li>
            <li>
                <img src="img/pages/list.jpg" alt="">
                <span>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliquaut enim ad minim veniam.</span>
            </li>
            <li>
                <img src="img/pages/list.jpg" alt="">
                <span>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliquaut enim ad minim veniam.</span>
            </li>
        </ul>
    </div>
    <div class="single-post job-experience">
        <h4 class="single-title">Job Features &amp; Overviews</h4>
        <ul>
            <li>
                <img src="img/pages/list.jpg" alt="">
                <span>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliquaut enim ad minim veniam.</span>
            </li>
            <li>
                <img src="img/pages/list.jpg" alt="">
                <span>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliquaut enim ad minim veniam.</span>
            </li>
            <li>
                <img src="img/pages/list.jpg" alt="">
                <span>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliquaut enim ad minim veniam.</span>
            </li>
            <li>
                <img src="img/pages/list.jpg" alt="">
                <span>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliquaut enim ad minim veniam.</span>
            </li>
        </ul>
    </div>
    <div class="single-post job-experience">
        <h4 class="single-title">Education Requirements</h4>
        <ul>
            <li>
                <img src="img/pages/list.jpg" alt="">
                <span>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliquaut enim ad minim veniam.</span>
            </li>
            <li>
                <img src="img/pages/list.jpg" alt="">
                <span>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliquaut enim ad minim veniam.</span>
            </li>
            <li>
                <img src="img/pages/list.jpg" alt="">
                <span>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliquaut enim ad minim veniam.</span>
            </li>
        </ul>
    </div>
</div>
</c:forEach>