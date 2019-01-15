<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>“包拯”三农电子商务平台</title>

<link rel="stylesheet" type="text/css" href="css/jquery-ui.css">
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="css/font-awesome.min.css" media="screen">
<link rel="stylesheet" type="text/css" href="css/owl-coursel/owl.carousel.css">
<link rel="stylesheet" type="text/css" href="css/owl-coursel/owl.transitions.css">
<link rel="stylesheet" type="text/css" href="css/magnific-popup/magnific-popup.css">
<link rel="stylesheet" type="text/css" href="css/style.css" media="screen">
<link rel="stylesheet" type="text/css" href="css/fw.css" media="screen">
</head>
<body class="bg-m">

<div class="preloader">
	<i class="fa fa-spinner"></i>
</div>
<header>
	<div class="container">
		<div class="row top-header">
			<div class="col-sm-3 text-left">
				<a class="logo">
					<img src="images/logo.png" alt="logo">
				</a>
			</div>				
			<div class="col-sm-9">
				<ul class="top-link pull-right">
					<li class="hidden-xs"><a href="collect">收藏</a></li>
					<li class="hidden-xs"><a href="mlogin">管理员</a></li>
					<li class="dropdown hidden-xs">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown" id="dropdownMenu1" aria-haspopup="true" aria-expanded="false">我的账户 <span class="caret"></span></a>
						<ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
							<li><a href="p-update">修改密码</a></li>
							<li><a href="order">查看订单</a></li>
							<li><a href="mark">我的订单评价</a></li>
							<li><a href="love">我的爱心计划</a></li>
							
						</ul>
					</li>
					<li class="pull-right">
						<div class="cart dropdown">
							<a href="cart" class="cart-item dropdown-toggle" id="dropdownMenu2" >
								<i class="fa fa-cart-plus"></i>
							</a>
						</div>
					</li>
				</ul>
			</div>
		</div>
	</div>
	<div class="container">
		<div class="bg-mn color-inher">
			<div class="row m-0">
				<div class="col-sm-1 col-md-1 col-lg-2 p-0">
					<div class="dropdown category-bar">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="true">
							<i class="fa fa-bars"></i><span>分类</span>
						</a>
						<ul class="dropdown-menu display-block hidden-xs">
							<li><a href="allgood"><span><img src="images/22.jpg" width="50" alt="image"></span>滞销蔬果</a></li>
							<li><a href="allland"><span><img src="images/25.jpg" width="50" alt="image"></span>土地承包</a></li>
							<li><a href="alllove"><span><img src="images/16.jpg" width="50" alt="image"></span>爱心计划</a></li>
						</ul>
					</div>
				</div>
				<div class="col-sm-8 col-md-8 col-lg-7 p-0">
					<div class="main-menu">
						<nav class="navbar navbar-default menu">
							<div class="navbar-header">
								<button type="button" class="navbar-toggle collapsed m-r-xs-15" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
									<span class="sr-only">Toggle navigation</span>
									<span class="icon-bar"></span>
									<span class="icon-bar"></span>
									<span class="icon-bar"></span>
								</button>
							</div>
							<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
								<ul class="nav navbar-nav"> 
									<li><a href="index">首页</a></li>
									<li><a href="index#gssm">果蔬售卖</a></li>
									<li><a href="index#tdcb">土地承包</a></li>
									<li><a href="index#xxxx">相关消息</a></li>
									<li><a href="aboutus">关于我们</a></li>
								</ul>
							</div>
						</nav>
					</div>
				</div>	
				<div class="col-sm-3 col-md-3 col-lg-3 p-0">
					<div class="search-box m-l-xs-15 m-r-xs-15">
						<input type="text" class="form-item" placeholder="Search...">
						<button type="submit" class="fa fa-search"></button>
					</div>
				</div>
			</div>
		</div>
	</div>
</header>
<!-- Banner -->
<section class="m-t-0">
	<div class="container">
		<div class="row slider slider-1">
			<div class="owl" data-items="4" data-itemsDesktop="3" data-itemsDesktopSmall="2" data-itemsTablet="2" data-itemsMobile="1" data-transitionstyle="fade" data-singleItem="true" data-autoplay="true" data-pag="false" data-buttons="false">
				<div class="col-sm-8 col-md-9 pull-right">
					<div class="slider-item">
						<img src="images/bg-logo.png" alt="image">
						<div class="slider-caption">
						<h3 class="heading-size-3">100% 信誉保证</h3> 
							<h2 class="heading-size-1">蔬果销售</h1>
							<h4 class="heading-size-5">致力于解决农产品滞销问题</h4>
						</div>
					</div>
				</div>
				<div class="col-sm-8 col-md-9 pull-right">
					<div class="slider-item">
						<img src="images/bg-logo.png" alt="image">
						<div class="slider-caption">
							<h3 class="heading-size-3">我们提供最好的服务</h3> 
							<h2 class="heading-size-1">土地承包</h1>
							<h4 class="heading-size-5">“公司+农户 农产品包销”</h4>
						</div>
					</div>
				</div>
				<div class="col-sm-8 col-md-9 pull-right">
					<div class="slider-item">
						<img src="images/bg-logo.png" alt="image">
						<div class="slider-caption">
							<h3 class="heading-size-3">志愿+企业</h3>
							<h1 class="heading-size-1">爱心计划</h1>
							<h4 class="heading-size-5">贫困地区，我们在行动</h4>
						</div>
					</div>
				</div>
			</div>
		</div>	
	</div>
</section>
<section class="m-t-0">
	<div class="container">
		<div class="row m-0">
			<div class="col-sm-4 m-b-30 p-0">
				<div class="banner bg-img-8 bg-2">
					<div class="caption">
						<h2 class="heading-size-4">滞销蔬果</h2>
						<h3 class="heading-size-6 f-normal">质量保证</h3>
						<a href="allgood" class="btn ht-btn ht-btn-bg-2">了解更多</a>
					</div>
				</div>
			</div>
			<div class="col-sm-4 m-b-30 p-0">
				<div class="banner bg-img-0 bg-6">
					<div class="caption">
						<h2 class="heading-size-4">土地承包</h2>
						<h3 class="heading-size-6 f-normal">信誉保证</h3>
						<a href="allland" class="btn ht-btn ht-btn-bg-2">了解更多</a>
					</div>
				</div>
			</div>
			<div class="col-sm-4 p-0">
				<div class="banner bg-img-7 bg-3">
					<div class="caption">
						<h2 class="heading-size-4">爱心计划</h2>
						<h3 class="heading-size-6 f-normal">心存温暖</h3>
						<a href="alllove" class="btn ht-btn ht-btn-bg-2">了解更多</a>
					</div>
				</div>
			</div>
		</div>
	</div>
</section>
<!-- Product tabs -->
<div>
	<div class="container text-center m-t-30">
		<h3 class="title f-30">滞销蔬果</h3>
		<p>致力于解决农产品滞销</p>
		<p style="text-align:right;"><a href="allgood" class="btn ht-btn ht-btn-1"><i class="fa fa-long-arrow-right"></i>更多</a>	</p>
		<div class="ht-tabs ht-tabs-product text-center" id="gssm">
			<!-- Tab panes -->
			<div class="tab-content">
				<div role="tabpanel" class="tab-pane active" id="tab-description">
					<div class="row">
						<c:forEach items="${requestScope.good_list}" var="good" begin="0" end="7" step="1">
						<div class="col-sm-6 col-md-4 col-lg-3">
							<!-- Product item -->
							<div class="product-item">
								<a href="item.action?good_id=${good.good_id}">
									<img src="images/${good.good_image}" alt="image">
								</a>
								<div class="product-caption">
									<h4 class="product-name">
										<a href="#">${good.good_name}</a>
									</h4>
									<div class="product-price-group">
										<span class="product-price">${good.good_price}/斤</span>
									</div>
									<div class="ht-btn-group">
										<a href="#" class="wishlist_btn"><i class="fa fa-heart-o"></i></a>
										<a href="item.action?good_id=${good.good_id}">加入购物车</a>
										<a href="#" class="compare_btn"><i class="fa fa-exchange"></i></a>
									</div>
								</div>
							</div>
						</div>
						</c:forEach>
					</div>
				</div>
				<div role="tabpanel" class="tab-pane" id="tab-review">
				............
				</div>
			</div>
		</div>
	</div>
</div>
<!-- Testimonials -->
<section class="text-center m-t-30">
	<div class="container">
		<div class="bg-img-1">
			<div class="row">
				<div class="col-sm-8 col-sm-offset-4">
					<div class="testimonials">
						<h3 class="title f-30">土地承包信息反馈</h3>
						<div class="owl" data-items="4" data-itemsDesktop="3" data-itemsDesktopSmall="2" data-itemsTablet="2" data-itemsMobile="1" data-transitionstyle="fade" data-singleItem="true" data-autoplay="true" data-pag="true" data-buttons="false">
							<div class="testimonial-item">
								<span><img src="images/1.jpg" alt="image"></span>
								<p>公司通过“公司+农户+零售”的方式与当地菜农合作，菜农只管种植生产，产品由公司以不低于市场价的价格统一收购，并通过农超对接的方式供应到惠州和河源的11家卓佳平价商店，每日销售量多达三四十吨。“蔬菜卖给公司，一般都能比市场价高出一两毛钱。”</p>	
								<strong>内蒙古农户 崔蓉</strong>
							</div>
							<div class="testimonial-item">
								<span><img src="images/2.jpg" alt="image"></span>
								<p>公司通过“公司+农户+零售”的方式与当地菜农合作，菜农只管种植生产，产品由公司以不低于市场价的价格统一收购，并通过农超对接的方式供应到惠州和河源的11家卓佳平价商店，每日销售量多达三四十吨。“蔬菜卖给公司，一般都能比市场价高出一两毛钱。”</p>	
								<strong>内蒙古商户 崔蓉</strong>
							</div>
							<div class="testimonial-item">
								<span><img src="images/3.jpg" alt="image"></span>
								<p>公司通过“公司+农户+零售”的方式与当地菜农合作，菜农只管种植生产，产品由公司以不低于市场价的价格统一收购，并通过农超对接的方式供应到惠州和河源的11家卓佳平价商店，每日销售量多达三四十吨。“蔬菜卖给公司，一般都能比市场价高出一两毛钱。”</p>	
								<strong>×××公司总裁 崔蓉</strong>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</section>
<!-- Product slider-->
<section class="text-center">
	<div class="container" id="tdcb">
		<h3 class="title f-30">待承包土地</h3>
		<p>来自源产地的美味，给客户最佳的体验。</p>
		<p style="text-align:right;"><a href="allland" class="btn ht-btn ht-btn-1"><i class="fa fa-long-arrow-right"></i>更多</a>	</p>
		<div class="row">
			
			<div class="owl" data-items="4" data-itemsDesktop="3" data-itemsDesktopSmall="2" data-itemsTablet="2" data-itemsMobile="1" data-transitionstyle="backslide" data-singleItem="false" data-autoplay="false" data-pag="false" data-buttons="false">
				<c:forEach items="${requestScope.land_list}" var="land">
				<div class="col-lg-12">
					<!-- Product item -->
					<div class="product-item">
						<a href="litem.action?land_id=${land.land_id}">
							<img src="images/${land.land_image}" alt="image">
						</a>
						<div class="product-caption">
							<h4 class="product-name">
								<a href="#">${land.land_name}</a>
							</h4>
							<div class="product-price-group">
								<span class="product-price">${land.land_output}</span>
							</div>
							<div class="ht-btn-group">
								<a href="#" class="wishlist_btn"><i class="fa fa-heart-o"></i></a>
								<a href="litem.action?land_id=${land.land_id}">了解详细信息</a>
								<a href="#" class="compare_btn"><i class="fa fa-exchange"></i></a>
							</div>
						</div>
					</div>
				</div>
				</c:forEach>
			</div>
		</div>
	</div>
</section>
<section class="m-t-30">
	<div class="container text-center" id="xxxx">
		<h3 class="title f-30">信息平台</h3>
		<p>最新的农产品信息，最及时的解决方案</p>	
		<p style="text-align:right;"><a href="news" class="btn ht-btn ht-btn-1"><i class="fa fa-long-arrow-right"></i>更多</a>	</p>
		<div class="row m-t-30">
			<div class="owl" data-items="3" data-itemsDesktop="3" data-itemsDesktopSmall="2" data-itemsTablet="2" data-itemsMobile="1" data-transitionstyle="fade" data-singleItem="false" data-autoplay="false" data-pag="false" data-buttons="false">
				<div class="col-sm-12">
					<div class="blog-item m-b-0">
						<a href="#" class="blog-img">
							<img src="images/banner1.jpg" alt="image">
						</a>	
						<div class="blog-caption">
							<ul class="blog-date">
								<li><i class="fa fa-clock-o"></i>11 04, 2016</li>
								<li><a href="#"><i class="fa fa-comments-o"></i>3</a></li>
							</ul>
							<h3 class="blog-heading"><a href="#">西瓜大量开园诚招客商</a></h3>
							<p>大量西瓜开园上市，外地客户免费食宿，由于瓜多收购商偏少，价格偏低。</p>
							<a href="#" class="btn ht-btn ht-btn-1"><i class="fa fa-long-arrow-right"></i>详细信息</a>
						</div>
					</div>
				</div><!--end blog-->
				<div class="col-sm-12">
					<div class="blog-item m-b-0">
						<a href="#" class="blog-img">
							<img src="images/banner2.jpg" alt="image">
						</a>	
						<div class="blog-caption">
							<ul class="blog-date">
								<li><i class="fa fa-clock-o"></i>11 04, 2016</li>
								<li><a href="#"><i class="fa fa-comments-o"></i>3</a></li>
							</ul>
							<h3 class="blog-heading"><a href="#">新疆哈密正宗哈密瓜</a></h3>
							<p>新疆哈密瓜在内地水果市场最特色的产品，值得水果市场老板的选择，有眼力的老板抓紧联系。</p>
							<a href="#" class="btn ht-btn ht-btn-1"><i class="fa fa-long-arrow-right"></i>详细信息</a>
						</div>
					</div>
				</div><!--end blog-->
				<div class="col-sm-12">
					<div class="blog-item m-b-0">
						<a href="#" class="blog-img">
							<img src="images/banner3.jpg" alt="image">
						</a>	
						<div class="blog-caption">
							<ul class="blog-date">
								<li><i class="fa fa-clock-o"></i>11 04, 2016</li>
								<li><a href="#"><i class="fa fa-comments-o"></i>3</a></li>
							</ul>
							<h3 class="blog-heading"><a href="#">内蒙古赤峰市喀喇沁旗西红柿</a></h3>
							<p>本地区西红柿大量上市中 本地区柿子硬度高 口感好 上色亮 一直畅销于南方与全国市场。</p>
							<a href="#" class="btn ht-btn ht-btn-1"><i class="fa fa-long-arrow-right"></i>详细信息</a>
						</div>
					</div>
				</div>
				<div class="col-sm-12">
					<div class="blog-item m-b-0">
						<a href="#" class="blog-img">
							<img src="images/banner4.jpg" alt="image">
						</a>	
						<div class="blog-caption">
							<ul class="blog-date">
								<li><i class="fa fa-clock-o"></i>Nov 04, 2016</li>
								<li><a href="#"><i class="fa fa-comments-o"></i>3</a></li>
							</ul>
							<h3 class="blog-heading"><a href="#">Indeterminate Tomatoes</a></h3>
							<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore.</p>
							<a href="#" class="btn ht-btn ht-btn-1"><i class="fa fa-long-arrow-right"></i>Read more</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</section>
<!-- Footer -->
<footer class="color-inher">
	<div class="footer-top">
		<div class="container">
			<div class="row">
				<div class="col-sm-3 m-b-xs-30">
					<h3 class="title">相关信息</h3>
					<ul>
						<li><a href="aboutus">关于我们</a></li>
						<li>条款&条件</li>
					</ul>
				</div>
				<div class="col-sm-3 m-b-xs-30">
					<h3 class="title">订单</h3>
					<ul>
						<li><a href="order">我的订单</a></li>
						<li><a href="cart">购物车</a></li>
						<li><a href="collect">收藏</a></li>
						<li><a href="interest">使用指南</a></li>
					</ul>
				</div>
				<div class="col-sm-3 m-b-xs-30">
					<h3 class="title">相关网站</h3>
					<ul>
						<li><a href="http://www.moa.gov.cn/">中华人民共和国农业部</a></li>
						<li><a href="http://www.nongnet.com/">农产品信息网</a></li>
						<li><a href="http://www.cast.net.cn/">中国农业科技信息网</a></li>
						<li><a href="http://www.agri.cn/">中国农业信息网</a></li>
					</ul>
				</div>
			</div>
		</div>
	</div>
</footer>
<!-- jQuery -->
<script src="js/jquery/jquery-2.2.4.min.js"></script>
<!-- JqueryUI -->
<script src="js/jquery/jquery-ui.js"></script>
<!-- Bootstrap -->
<script src="js/bootstrap/bootstrap.min.js"></script>
<!-- Owl-coursel -->
<script src="js/owl-coursel/owl.carousel.js"></script>
<!-- Magnific-popup -->
<script src="js/magnific-popup/jquery.magnific-popup.min.js"></script>
<!-- Script -->
<script src="js/script.js"></script>
</body>
</html>