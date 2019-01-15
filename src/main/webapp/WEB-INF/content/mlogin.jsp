<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>管理员登录</title>

<link href="css1/bootstrap.min.css" rel="stylesheet">
<link href="css1/datepicker3.css" rel="stylesheet">
<link href="css1/styles.css" rel="stylesheet">

<!--[if lt IE 9]>
<script src="js/html5shiv.js"></script>
<script src="js/respond.min.js"></script>
<![endif]-->

</head>

<body>
	
	<div class="row">
		<div class="col-xs-10 col-xs-offset-1 col-sm-8 col-sm-offset-2 col-md-4 col-md-offset-4">
			<div class="login-panel panel panel-default">
				<div class="panel-heading">管理员登录</div>
				<div class="panel-body">
					<form  action="mlogin" method="post">
							<div class="form-group">
								<input class="form-control" placeholder="管理员名"  type="text" name="managername">
							</div>
							<div class="form-group">
								<input class="form-control" placeholder="密码" name="managerpwd" type="password">
							</div>
							<input type="submit" value="登录" class="btn btn-primary"/>
					</form>
				</div>
			</div>
		</div><!-- /.col-->
	</div><!-- /.row -->	
	
		

	<script src="js1/jquery-1.11.1.min.js"></script>
	<script src="js1/bootstrap.min.js"></script>
	<script src="js1/chart.min.js"></script>
	<script src="js1/chart-data.js"></script>
	<script src="js1/easypiechart.js"></script>
	<script src="js1/easypiechart-data.js"></script>
	<script src="js1/bootstrap-datepicker.js"></script>
	<script>
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