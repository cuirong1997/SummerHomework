<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>后台管理</title>
<link href="css1/bootstrap.min.css" rel="stylesheet">
<link href="css1/datepicker3.css" rel="stylesheet">
<link href="css1/bootstrap-table.css" rel="stylesheet">
<link href="css1/styles.css" rel="stylesheet">


<!--[if lt IE 9]>
<script src="js/html5shiv.js"></script>
<script src="js/respond.min.js"></script>
<![endif]-->

</head>
<body>
<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#sidebar-collapse">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#"><span>“包拯”</span>三农电子商务平台后台管理</a>
				<ul class="user-menu">
					<li class="dropdown pull-right">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown"><span class="glyphicon glyphicon-user"></span> ${sessionScope.manager.manager_name } <span class="caret"></span></a>
						<ul class="dropdown-menu" role="menu">
							<li><a href="mlogin"><span class="glyphicon glyphicon-log-out"></span> 退出</a></li>
						</ul>
					</li>
				</ul>
			</div>
		</div><!-- /.container-fluid -->
	</nav>
		
	<div id="sidebar-collapse" class="col-sm-3 col-lg-2 sidebar">
		<form role="search">
			<div class="form-group">
				<input type="text" class="form-control" placeholder="Search">
			</div>
		</form>
		<ul class="nav menu">
			<li class="parent ">
				<a href="#">
					<span class="glyphicon glyphicon-pencil"></span>滞销蔬果管理 <span data-toggle="collapse" href="#sub-item-1" class="icon pull-right"><em class="glyphicon glyphicon-s glyphicon-plus"></em></span> 
				</a>
				<ul class="children collapse" id="sub-item-1">
					<li>
						<a class="" href="updategood">
							<span class="glyphicon glyphicon-pencil"></span> 滞销蔬果信息修改
						</a>
					</li>
					<li>
						<a class="" href="addgood">
							<span class="glyphicon glyphicon-pencil"></span> 滞销蔬果信息添加
						</a>
					</li>
				</ul>
			</li>
			<li class="parent ">
				<a href="#">
					<span class="glyphicon glyphicon-pencil"></span> 承包土地管理 <span data-toggle="collapse" href="#sub-item-2" class="icon pull-right"><em class="glyphicon glyphicon-s glyphicon-plus"></em></span> 
				</a>
				<ul class="children collapse" id="sub-item-2">
					<li>
						<a class="" href="updateland">
							<span class="glyphicon glyphicon-pencil"></span>承包土地信息修改
						</a>
					</li>
					<li>
						<a class="" href="addland">
							<span class="glyphicon glyphicon-pencil"></span> 承包土地信息添加
						</a>
					</li>
				</ul>
			</li>
			<li class="parent ">
				<a href="#">
					<span class="glyphicon glyphicon-pencil"></span> 评论管理<span data-toggle="collapse" href="#sub-item-3" class="icon pull-right"><em class="glyphicon glyphicon-s glyphicon-plus"></em></span> 
				</a>
				<ul class="children collapse" id="sub-item-3">
					<li>
						<a class="" href="mcomment">
							<span class="glyphicon glyphicon-pencil"></span> 评论查看
						</a>
					</li>
				</ul>
			</li>
			<li class="parent ">
				<a href="#">
					<span class="glyphicon glyphicon-pencil"></span> 订单管理 <span data-toggle="collapse" href="#sub-item-4" class="icon pull-right"><em class="glyphicon glyphicon-s glyphicon-plus"></em></span> 
				</a>
				<ul class="children collapse" id="sub-item-4">
					<li>
						<a class="" href="morder">
							<span class="glyphicon glyphicon-pencil"></span> 订单信息修改
						</a>
					</li>
				</ul>
			</li>
			<li class="parent ">
				<a href="#">
					<span class="glyphicon glyphicon-pencil"></span> 用户管理 <span data-toggle="collapse" href="#sub-item-5" class="icon pull-right"><em class="glyphicon glyphicon-s glyphicon-plus"></em></span> 
				</a>
				<ul class="children collapse" id="sub-item-5">
					<li>
						<a class="" href="muser">
							<span class="glyphicon glyphicon-pencil"></span> 用户信息查看
						</a>
					</li>
				</ul>
			</li>
			<li class="parent ">
				<a href="#">
					<span class="glyphicon glyphicon-pencil"></span> 新闻管理 <span data-toggle="collapse" href="#sub-item-6" class="icon pull-right"><em class="glyphicon glyphicon-s glyphicon-plus"></em></span> 
				</a>
				<ul class="children collapse" id="sub-item-6">
					<li>
						<a class="" href="mnews">
							<span class="glyphicon glyphicon-pencil"></span> 新闻查看修改
						</a>
					</li>
					<li>
						<a class="" href="addnews">
							<span class="glyphicon glyphicon-pencil"></span> 添加新闻
						</a>
					</li>
				</ul>
			</li>
			<li class="parent ">
				<a href="#">
					<span class="glyphicon glyphicon-pencil"></span> 爱心计划 <span data-toggle="collapse" href="#sub-item-7" class="icon pull-right"><em class="glyphicon glyphicon-s glyphicon-plus"></em></span> 
				</a>
				<ul class="children collapse" id="sub-item-7">
					<li>
						<a class="" href="mlove">
							<span class="glyphicon glyphicon-pencil"></span> 爱心计划信息修改
						</a>
					</li>
				</ul>
			</li>
			<li role="presentation" class="divider"></li>
		</ul>
	</div><!--/.sidebar-->
	
		
	<div class="col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main">
		<div class="row">
			<div class="col-lg-12">
				<h2>“包拯”后台管理系统</h2>
			</div>
			
			<div class="col-md-6">
				<div class="panel panel-blue">
					<div class="panel-heading dark-overlay">用户管理模块</div>
					<div class="panel-body">
						<p>管理员可以在这个模块内查看用户注册信息以及注销用户</p>
						<br/>
					</div>
				</div>
			</div><!--/.col-->
			
			<div class="col-md-6">
				<div class="panel panel-teal">
					<div class="panel-heading dark-overlay">滞销蔬果模块</div>
					<div class="panel-body">
						<p>管理员可以在这个模块内，管理网站售出滞销蔬果。对网站所售的蔬果进行添加、修改、删除等操作。</p>
					</div>
				</div>
			</div><!--/.col-->
			
			<div class="col-md-6">
				<div class="panel panel-orange">
					<div class="panel-heading dark-overlay">承包土地模块</div>
					<div class="panel-body">
						<p>管理员可以在这个模块内，管理网站售出待承包土地。对网站所售的土地进行添加、修改、删除等操作。</p>
					</div>
				</div>
			</div><!--/.col-->
			
			<div class="col-md-6">
				<div class="panel panel-red">
					<div class="panel-heading dark-overlay">评论管理模块</div>
					<div class="panel-body">
						<p>管理员可以在这个模块内，查看用户对于所售出蔬果及土地的评价。还可以对评价做出处理。</p>
					</div>
				</div>
			</div><!--/.col-->
			<div class="col-md-6">
				<div class="panel panel-blue">
					<div class="panel-heading dark-overlay">订单管理模块</div>
					<div class="panel-body">
						<p>管理员可以在这个模块内查看订单信息以及对订单状态进行修改</p>
						<br/>
					</div>
				</div>
			</div><!--/.col-->
			<div class="col-md-6">
				<div class="panel panel-teal">
					<div class="panel-heading dark-overlay">新闻模块</div>
					<div class="panel-body">
						<p>管理员可以在这个模块内，对网站所展示的新闻消息进行添加、修改、删除等操作。</p>
						<br/>
					</div>
				</div>
			</div><!--/.col-->
			<div class="col-md-6">
				<div class="panel panel-orange">
					<div class="panel-heading dark-overlay">爱心计划模块</div>
					<div class="panel-body">
						<p>管理员可以在这个模块内查看爱心计划的订单信息以及对订单状态进行修改</p>
						<br/>
					</div>
				</div>
			</div><!--/.col-->
		</div><!--/.row-->
	</div>
		

	<script src="js1/jquery-1.11.1.min.js"></script>
	<script src="js1/bootstrap.min.js"></script>
	<script src="js1/chart.min.js"></script>
	<script src="js1/chart-data.js"></script>
	<script src="js1/easypiechart.js"></script>
	<script src="js1/easypiechart-data.js"></script>
	<script src="js1/bootstrap-datepicker.js"></script>
	<script src="js1/bootstrap-table.js"></script>
	<script>
		$('#calendar').datepicker({
		});

		!function ($) {
		    $(document).on("click","ul.nav li.parent > a > span.icon", function(){          
		        $(this).find('em:first').toggleClass("glyphicon-minus");      
		    }); 
		    $(".sidebar span.icon").find('em:first').addClass("glyphicon-plus");
		}(window.jQuery);

		$(window).on('resize', function () {
		  if ($(window).width() > 768) $('#sidebar-collapse').collapse('show')
		})
		$(window).on('resize', function () {
		  if ($(window).width() <= 767) $('#sidebar-collapse').collapse('hide')
		})
	</script>	
</body>
</html>