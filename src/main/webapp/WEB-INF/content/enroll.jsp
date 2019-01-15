<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zxx">
	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>用户注册</title>
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
				<h2>用户注册</h2>
				<ul class="breadcrumb">
					<li><a href="#">首页</a></li>
					<li>我的账户</li>
					<li>用户注册</li>
				</ul>
			</div>
		</div>
		<!-- Login page -->
		<div class="m-t-60">
			<div class="container">
				<div class="bg-img-2 position-left">
					<div class="row">
						<div class="col-sm-6 col-sm-offset-3">
							<div class="box p-40 p-xs-20 bg-white">
								<form action="intouser" method="post">
									<div class="form-group">
										<label class="control-label" for="input-email">用户名：</label>
										<input type="text" name="user_name" placeholder="输入用户名" id="input-first-name" class="form-control form-item">
									</div>
									<div class="form-group">
										<label class="control-labe" for="input-email">邮箱地址</label>
										<input type="text" name="user_email" value="" placeholder="邮箱地址" id="input-email" class="form-control form-item">
									</div>
									<div class="form-group">
										<label class="control-labe" for="input-email">身份证号/护照</label>
										<input type="text" name="user_sfid" value="" placeholder="身份证号/护照" id="input-id" class="form-control form-item">
									</div>
									<div class="form-group">
										<label class="control-label" for="input-email">电话号码</label>
										<input type="text" name="user_tel" value="" placeholder="电话号码" id="input-phone" class="form-control form-item">
									</div>
									<div class="form-group">
										<label class="control-label" for="input-password">密码</label>
										<input type="password" name="user_pwd" value="" placeholder="密码" id="input-password" class="form-control form-item">
									</div>
									<div class="form-group">
										<label class="control-label" for="input-password">地址</label>
										<input type="text" name="user_address" value="" placeholder="地址" id="input-password" class="form-control form-item">
									</div>
									<button type="submit" class="btn ht-btn bg-6 m-t-30">注册</button>
								</form>
							</div>
						</div>
					 </div>
				 </div>
			</div>
		</div>
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

