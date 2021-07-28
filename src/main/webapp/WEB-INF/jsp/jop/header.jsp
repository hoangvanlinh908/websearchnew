<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<head>
    <!-- Mobile Specific Meta -->
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- Favicon-->
    <link rel="shortcut icon" href="img/fav.png">
    <!-- Author Meta -->
    <meta name="author" content="codepixer">
    <!-- Meta Description -->
    <meta name="description" content="">
    <!-- Meta Keyword -->
    <meta name="keywords" content="">
    <!-- meta character set -->
    <meta charset="UTF-8">
    <!-- Site Title -->
    <title>Job Listing</title>

    <link href="https://fonts.googleapis.com/css?family=Poppins:100,200,400,300,500,600,700" rel="stylesheet">
    <!--
    CSS
    ============================================= -->
    <link rel="stylesheet" href="css/linearicons.css">
    <link rel="stylesheet" href="css/font-awesome.min.css">
    <link rel="stylesheet" href="css/bootstrap.css">
    <link rel="stylesheet" href="css/magnific-popup.css">
    <link rel="stylesheet" href="css/nice-select.css">
    <link rel="stylesheet" href="css/animate.min.css">
    <link rel="stylesheet" href="css/owl.carousel.css">
    <link rel="stylesheet" href="css/main.css">
</head>
<body>

<header id="header" id="home" style="width: ; text-align: center;">
    <div class="container">
        <div class="row align-items-center justify-content-between d-flex">
            <div id="logo">
                <a href="/home"><img src="img/logo.png" alt="" title="" /></a>
            </div>
            <nav id="nav-menu-container">
                <ul class="nav-menu">
                    <li class="menu-active"><a href="/home">Trang Chủ</a></li>
                    <li><a href="/home">Giới thiệu</a></li>
                    <li><a href="/home">Ngành nghề</a>
                        <ul>
                        <c:forEach items="${listnn}" var="textn">
                    <li><a href="/nganhnghe?id=${textn.getMaNganhNghe()}">${textn.getTenNganhNghe()}</a></li>
                    </c:forEach>
                        </ul>
                    </li>
                    <li><a href="/home">Giá</a></li>
                    <li><a href="/Dangbai">Đăng Bài</a></li>
                    <li><a href="/home">Liên hệ</a></li>
                    <c:if test="${text != null}">
                        <li class="menu-has-children"><a href="">Thông tin</a>

                            <ul>
                                <c:forEach items="${textn}" var="textn">
                                    <li><a href="/edit-NTD?id=${textn.getMaNhaTuyenDung()}">Chỉnh sửa thong tin </a></li>
                                </c:forEach>
                                <li><a href="/danhsachbd">Danh sách bài đăng</a></li>
                                <li><a href="/Dangbai">Đăng Bài</a></li>
                                <li><a href="/logout">Đẵng xuất</a></li>
                            </ul>
                        </li>
                    </c:if>
                    <c:if test="${textUV != null}">
                        <li class="menu-has-children"><a href="">Thông tin</a>

                            <ul><li><a href="/hoso">Công việc đã nộp</a></li>
                                <li><a href="/cv">Xem thông tin cá nhân</a></li>
                                <li><a href="/home">Cập nhập cv</a>
                                    <ul>
                                        <li><a href="/hocvan">Học Vấn</a></li>
                                        <li><a href="/kinhnghiem">Kinh nghiệm</a></li>
                                        <li><a href="/kynang">Kỷ Năng</a></li>
                                    </ul>

                                   </li>
                                <li><a href="/logout">Đẵng xuất</a></li>
                            </ul>
                        </li>
                    </c:if>

                    <c:if test="${text == null && textUV == null }">
                    <li><a style="margin-right: 10px;" class="ticker-btn" >Signup</a>
                        <ul>
                            <li><a href="/register">Đăng Ký Nhà Tuyển dụng </a></li>
                            <li><a href="/registerUv">Đăng Ký Ứng viên</a></li>
                        </ul></li>
                    <li><a style="margin-right: 10px;" class="ticker-btn" >Login</a>
                        <ul>
                            <li><a  href="/login">Nhà Tuyển dụng </a></li>
                            <li><a href="/loginUv">Ứng viên</a></li>
                        </ul>
                    </li>
                    </c:if>
                    <c:if test="${text != null }">
                        <li><a class="ticker-btn" href="/logout">Đẵng xuất</a></li>
<%--                        <li><a class="ticker-btn" href="">Chào ${text1.getTenCongTy}</a>--%>

                    </c:if>
                    <c:if test="${ textUV != null}">
                        <li><a class="ticker-btn" href="/logout">Đẵng xuất</a></li>
                        <%--                        <li><a class="ticker-btn" href="">Chào ${text1.getTenCongTy}</a>--%>

                    </c:if>
                </ul>
            </nav><!-- #nav-menu-container -->
        </div>
    </div>
</header><!-- #header -->
<section class="banner-area relative" id="home">
    <div class="overlay overlay-bg"></div>
    <div class="container">
        <div class="row fullscreen d-flex align-items-center justify-content-center">
            <div class="banner-content col-lg-12">
                <h1 class="text-white">
                    <span>Hơn 1500</span> việc làm được đăng tuần trước

                </h1>
                <form:form  class="serach-form-area" action="/search" method="post" modelAttribute="search">>
                    <div class="row justify-content-center form-wrap">
                        <div class="col-lg-4 form-cols">
                            <form:input path="TieuDe" cssClass="form-control" placeholder="TieuDe"/>

                        </div>
                        <div class="col-lg-3 form-cols">
                            <div class="default-select" id="default-selects2">
                                <form:select path="NganhNghe" cssClass="float-none">
                                    <option value="1">Tất cả các ngành nghề</option>
                                    <form:options  items="${listnn}" itemLabel="TenNganhNghe" itemValue="MaNganhNghe" />
                                </form:select>

                            </div>
                        </div>
                        <div class="col-lg-2 form-cols">
                            <form:button type="submit" class="btn btn-info">
                                <span class="lnr lnr-magnifier"></span> Search
                            </form:button>
                        </div>
                    </div>
                    </div>


            </form:form>
            <p class="text-white"> <span>Search by tags:</span> Tecnology, Business, Consulting, IT Company, Design, Development</p>
        </div>
    </div>
    </div>
</section>
<!-- End banner Area -->

<!-- Start features Area -->
<section class="features-area">
    <div class="container">
        <div class="row">
            <div class="col-lg-3 col-md-6">
                <div class="single-feature">
                    <h4>Đang tìm kiếm</h4>
                    <p>
                        Lorem ipsum dolor sit amet, consectetur adipisicing.
                    </p>
                </div>
            </div>
            <div class="col-lg-3 col-md-6">
                <div class="single-feature">
                    <h4>Đang áp dụng</h4>
                    <p>
                        Lorem ipsum dolor sit amet, consectetur adipisicing.
                    </p>
                </div>
            </div>
            <div class="col-lg-3 col-md-6">
                <div class="single-feature">
                    <h4>SBảo vệ</h4>
                    <p>
                        Lorem ipsum dolor sit amet, consectetur adipisicing.
                    </p>
                </div>
            </div>
            <div class="col-lg-3 col-md-6">
                <div class="single-feature">
                    <h4>Thông báo</h4>
                    <p>
                        Lorem ipsum dolor sit amet, consectetur adipisicing.
                    </p>
                </div>
            </div>
        </div>
    </div>
</section>
<!-- End features Area -->

<!-- Start popular-post Area -->
<section class="popular-post-area pt-100">
    <div class="container">
        <div class="row align-items-center">
            <div class="active-popular-post-carusel">
                <c:forEach items="${findBD}" var="fin">
                <div class="single-popular-post d-flex flex-row">
                    <div class="thumb">
                        <img class="img-fluid" src="imgbd/${fin.getHinhAnh()}" style="width: 250px;height: 70px;" alt="">
                        <a class="btns text-uppercase" href="/deltail-id?id=${fin.getMaBaiDang()}">xem bài đăng tuyển dụng</a>
                    </div>
                    <div class="details">
                        <a href="#"><h4>${fin.getTieuDe()}</h4></a>
                        <h6>${fin.getNgayDang()}</h6>
                        <p>
                                ${fin.getChiTietCV()}                        </p>
                    </div>
                </div>
                </c:forEach>
            </div>
        </div>
    </div>
</section>
<!-- End popular-post Area -->

<!-- Start feature-cat Area -->
<section class="feature-cat-area pt-100" id="category">
    <div class="container">
        <div class="row d-flex justify-content-center">
            <div class="menu-content pb-60 col-lg-10">
                <div class="title text-center">
                    <h1 class="mb-10">Các hạng mục công việc nổi bật</h1>
                    <p>Những người cực kỳ yêu thích hệ thống thân thiện với môi trường.</p>
                </div>
            </div>
        </div>
        <div class="row">
            <c:forEach items="${listnn}" var="textn">
            <div class="col-lg-2 col-md-4 col-sm-6">
                <div class="single-fcat">
                    <a href="/nganhnghe?id=${textn.getMaNganhNghe()}">
                        <img src="img/${textn.getLogo()}" alt="">
                    </a>
                    <p>${textn.getTenNganhNghe()}</p>
                </div>
            </div>
            </c:forEach>
        </div>
    </div>
</section>
<!-- End feature-cat Area -->
<section class="post-area section-gap">
    <div class="container">
        <div class="row justify-content-center d-flex">
            <div class="col-lg-8 post-list">
                <ul class="cat-list">
                    <li><a href="#">Recent</a></li>
                    <li><a href="#">Full Time</a></li>
                    <li><a href="#">Intern</a></li>
                    <li><a href="#">part Time</a></li>
                </ul>