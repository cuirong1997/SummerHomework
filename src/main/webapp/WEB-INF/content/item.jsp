<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zxx">
	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>商品详情</title>
		<!-- JqueryUI -->
		<link rel="stylesheet" type="text/css" href="css/jquery-ui.css">
		<!-- Bootstrap -->
		<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
		<!-- Awesome font icons -->
		<link rel="stylesheet" type="text/css" href="css/font-awesome.min.css" media="screen">
		<!-- Owlcoursel -->
		<link rel="stylesheet" type="text/css" href="css/owl-coursel/owl.carousel.css">
		<link rel="stylesheet" type="text/css" href="css/owl-coursel/owl.transitions.css">
		<!-- Magnific-popup -->
		<link rel="stylesheet" type="text/css" href="css/magnific-popup/magnific-popup.css">
		<!-- Magnific-popup -->
		<link rel="stylesheet" type="text/css" href="css/magnific-popup/magnific-popup.css">
		<!-- Style -->
		<link rel="stylesheet" type="text/css" href="css/style.css" media="screen">
		<!-- Fw -->
		<link rel="stylesheet" type="text/css" href="css/fw.css" media="screen">
	</head>
	<body>
		<div class="preloader">
			<i class="fa fa-spinner"></i>
		</div>
<header>
	<div class="container">
		<div class="row top-header">
			<div class="col-sm-3 text-left">
				<a href="#" class="logo">
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
		<div class="heading-inner-page">
			<div class="container">
				<h2>商品详情</h2>
				<ul class="breadcrumb">
					<li><a href="#">首页</a></li>
					<li><a href="#">产品</a></li>
					<li><a href="#">滞销蔬菜</a></li>
					<li>${item1.good_name }</li>
				</ul>
			</div>
		</div>
		<!-- Product -->
		<section class="m-t-30"> 
			<div class="container">
					<div class="row">
						<!-- Product image gallery -->
						<div class="col-sm-6 col-md-7">
							<ul class="thumbnails p-0">
								<li>
									<a class="thumbnail img-large image-zoom" href="images/${item1.good_image}" title="iPhone">
										<img src="images/${item1.good_image}" alt="iPhone">
									</a>
								</li>
								<li class="image-additional">
									<a class="thumbnail image-zoom" href="images/${item1.good_image1}" title="iPhone">
										<img src="images/${item1.good_image1}" title="iPhone" alt="iPhone">
									</a>
								</li>
								<li class="image-additional">
									<a class="thumbnail image-zoom" href="images/${item1.good_image2}" title="iPhone">
										<img src="images/${item1.good_image2}" title="iPhone" alt="iPhone">
									</a>
								</li>
							</ul>
						</div>
						<!-- Product decr -->
						<div class="col-sm-6 col-md-5">
							<div class="product-pare m-t-xs-60">
								<h1>${item1.good_name}</h1>
								<ul class="list-unstyled m-b-20">
									<li><span>果实大小:</span>${item1.good_dx}</li>
									<li><span>成熟:</span>${item1.good_time}</li>
									<li><span>株距:</span>${item1.good_distance}</li>
									<li><span>厂房/种植地区面积:</span>${item1.good_area}</li>
								</ul>
								<p>${item1.good_remark}</p>
								<p class="product-price">${item1.good_price}/斤</p>
								<p>库存：${item1.good_store}斤</p>
								<p>销量：${item1.good_sell}斤</p>
								<form action="intocart?good_id=${item1.good_id}" method="post">
									<div class="quantily-wrap">
										<label class="control-label" for="input-quantity"></label>
										<input type="number" name="good_number" value="1" size="2" id="input-quantity" class="form-control form-item">
									</div>
									<button type="submit" class="btn ht-btn bg-3 m-t-0">加入购物车</button>
								</form>
								<div class="m-t-30">
								<a href="comment?good_id=${item1.good_id}">查看商品评论</a> / <a href="#comment">写评论</a>
								</div>
							</div>
						</div>
					</div><!-- End row -->
				<!-- Tabs -->
				<div class="row m-t-30">
					<div class="col-sm-9">
						<div class="p-30 bore">
							<h3 class="title">描述</h3>
							<p>${item1.good_detail}</p>
							<h5>营养成分</h5>
							${item1.good_contain}
						</div>
						<div class="p-30 bore" id="comment">
						<form class="form-horizontal p-30 bore m-t-30" action="addcom?good_id=${item1.good_id}" method="post">
							<h3 class="title">写评论</h3>
							<div class="form-group required">
								<div class="col-sm-12">
									<textarea name="com_con" rows="5" class="form-control form-item"></textarea>
									<div class="help-block">
										<span class="text-danger">注意:</span> 不支持HTML代码!
									</div>
								</div>
							</div>
							<div class="buttons clearfix">
								<div class="">
									<input type="submit" class="btn btn-primary ht-btn bg-6" value="发表评论"/>
								</div>
							</div>
						</form>
						</div>
					</div>
					<div class="col-sm-3">
						<div class="banner bg-img-13">
							<div class="caption text-center">
								<h2 class="heading-size-3 f-bold">100%</h2>
								<h3 class="heading-size-5 f-normal">信誉保证</h3>
							</div>
						</div>
					</div>
				</div>
			</div>
		</section>
		<!-- Process order -->
		<section  class="process">
			<div class="container">
				<div class="row">
					<div class="col-sm-6 col-md-4">	
						<div class="media ht-media">
							<div class="media-left">
								<i class="fa fa-phone bg-6"></i>
							</div>
							<div class="media-body">
								<h5 class="media-heading">Support 24/7: 0123-456-789</h5>
							</div>
						</div>
					</div>
					<div class="col-sm-6 col-md-4">	
						<div class="media ht-media">
							<div class="media-left">
								<i class="fa fa-truck bg-2"></i>
							</div>
							<div class="media-body">
								<h5 class="media-heading">Free shipping on all orders</h5>
							</div>
						</div>
					</div>
					<div class="col-sm-6 col-md-4">	
						<div class="media ht-media">
							<div class="media-left">
								<i class="fa fa-undo bg-3"></i>
							</div>
							<div class="media-body">
								<h5 class="media-heading">100% money back guarantee</h5>
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

