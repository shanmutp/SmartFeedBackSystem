<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="com.smartfeedback.vo.CourseVO,java.util.Map,java.util.Set"%>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Education &mdash; Free Website Template, Free HTML5
	Template by freehtml5.co</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description"
	content="Free HTML5 Website Template by freehtml5.co" />
<meta name="keywords"
	content="free website templates, free html5, free template, free bootstrap, free website template, html5, css3, mobile first, responsive" />
<meta name="author" content="freehtml5.co" />

<!-- 
	//////////////////////////////////////////////////////

	FREE HTML5 TEMPLATE 
	DESIGNED & DEVELOPED by FreeHTML5.co
		
	Website: 		http://freehtml5.co/
	Email: 			info@freehtml5.co
	Twitter: 		http://twitter.com/fh5co
	Facebook: 		https://www.facebook.com/fh5co

	//////////////////////////////////////////////////////
	 -->

<!-- Facebook and Twitter integration -->
<meta property="og:title" content="" />
<meta property="og:image" content="" />
<meta property="og:url" content="" />
<meta property="og:site_name" content="" />
<meta property="og:description" content="" />
<meta name="twitter:title" content="" />
<meta name="twitter:image" content="" />
<meta name="twitter:url" content="" />
<meta name="twitter:card" content="" />

<link
	href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700"
	rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Roboto+Slab:300,400"
	rel="stylesheet">

<!-- Animate.css -->
<link rel="stylesheet" href="css/animate.css">
<!-- Icomoon Icon Fonts-->
<link rel="stylesheet" href="css/icomoon.css">
<!-- Bootstrap  -->
<link rel="stylesheet" href="css/bootstrap.css">

<!-- Magnific Popup -->
<link rel="stylesheet" href="css/magnific-popup.css">

<!-- Owl Carousel  -->
<link rel="stylesheet" href="css/owl.carousel.min.css">
<link rel="stylesheet" href="css/owl.theme.default.min.css">

<!-- Flexslider  -->
<link rel="stylesheet" href="css/flexslider.css">

<!-- Pricing -->
<link rel="stylesheet" href="css/pricing.css">

<!-- Theme style  -->
<link rel="stylesheet" href="css/style.css">

<!-- Modernizr JS -->
<script src="js/modernizr-2.6.2.min.js"></script>
<!-- FOR IE9 below -->
<!--[if lt IE 9]>
	<script src="js/respond.min.js"></script>
	<![endif]-->

<%
	CourseVO vo = (CourseVO) request.getAttribute("vo");
%>
<%
	if (vo != null) {
%>
<script>
	function setSelected(select_id, value) {
		if (value != null) {
			var mySelect = document.getElementById(select_id);
			mySelect.value = value;

		}

	}
</script>
<%
	}
%>

</head>
<%
	if (vo != null) {
%>

<body
	onLoad='setSelected("courseID",<%=vo.getCourseID()%>);
	setSelected("courseName",<%=vo.getCourseName()%>);
	setSelected("courseDescription",<%=vo.getCourseDescription()%>);'>
	<%
		} else {
	%>

<body>
	<%
		}
	%>

	<div class="fh5co-loader"></div>

	<div id="page">
		<nav class="fh5co-nav" role="navigation">
			<div class="top">
				<div class="container">
					<div class="row">
						<div class="col-xs-12 text-right">
							<p class="site">www.SmartFeedback.com</p>

							<p class="num">Call: 044 2745 4863</p>

						</div>
					</div>
				</div>
			</div>
			<div class="top-menu">
				<div class="container">
					<div class="row">
						<div class="col-xs-2">
							<div id="fh5co-logo">
								<a href="index.html"><i class="icon-study"></i>Educ<span>.</span></a>
							</div>
						</div>
						<div class="col-xs-10 text-right menu-1">
							<ul>
								<li><a href="index.html">Home</a></li>
								<li class="has-dropdown">
								<li class="has-dropdown"><a href="#">Resgistration</a>
									<ul class="dropdown">
										<li><a
											href="file:///C:/Users/hp/Dropbox/360/SmartFeedback/website/StudentRegistration.html">Student
												Resgistration</a></li>
										<li><a
											href="file:///C:/Users/hp/Dropbox/360/SmartFeedback/website/StaffRegistration.html">Staff
												Resgistration</a></li>
									</ul></li>
								<li class="has-dropdown"><a href="#">Course Management</a>
									<ul class="dropdown">
										<li><a
											href="file:///C:/Users/hp/Dropbox/360/SmartFeedback/website/AddCourse.html">Add
												Course</a></li>
										<li><a
											href="file:///C:/Users/hp/Dropbox/360/SmartFeedback/website/Add%20Specialization.html">Add
												Specialization</a></li>
										<li><a
											href="file:///C:/Users/hp/Dropbox/360/SmartFeedback/website/Add%20Subjects.html">Add
												Subject</a></li>
									</ul></li>
								<li><a href="teacher.html">User</a></li>

								<li><a href="Feedback.html">Feedback</a></li>
								<li class="btn-cta"><a href="#"><span>Login</span></a></li>
								<li class="btn-cta"><a href="#"><span>Create a
											Course</span></a></li>
							</ul>
						</div>
					</div>

				</div>
			</div>
		</nav>
		<div id="fh5co-contact">
			<div class="container">
				<div class="row">
					<div class="col-md-12 col-md-push-4 animate-box">
						<img src="9.jpg">
					</div>
				</div>
			</div>
		</div>

		<div id="fh5co-contact">
			<div class="container">
				<div class="row">
					<div class="col-md-5 col-md-push-1 animate-box">

						<div class="fh5co-contact-info">
							<img src="2.jpg">

						</div>

					</div>
					<div class="col-md-6 animate-box">

						<%
							if (vo == null) {
						%>
						<h3>Add Course</h3>
						<fieldset>
							<%
								} else {
							%>
							<p class="bg-success">Course sucessfully added</p>
							<fieldset disabled>
								<%
									}
								%>

								<%
									Map<Integer, String> specMap = (Map<Integer, String>) application.getAttribute("specialization");
									Map<Integer, String> courseMap = (Map<Integer, String>) application.getAttribute("course");
								%>
								<form action="AddCourse" method="post">
									<div class="row form-group">
										<div class="col-md-12">
											<!-- <label for="fname">First Name</label> -->
											Course Name : <input type="text" name="courseName"
												id="courseID">
										</div>
									</div>


									<div class="row form-group">
										<div class="col-md-12">
											<!-- <label for="message">Message</label> -->
											Course Description :
											<input type ="text" name="courseDescription">
										</div>
									</div>
									<%
										if (vo == null) {
									%>
									<div class="form-group">
										<input type="submit" value="Submit" class="btn btn-primary">
									</div>
									<%
										}
									%>

								</form>
					</div>



				</div>

			</div>
		</div>

		<div id="fh5co-register"
			style="background-image: url(images/img_bg_2.jpg);">
			<div class="overlay"></div>
			<div class="row">
				<div class="col-md-8 col-md-offset-2 animate-box"></div>
			</div>
		</div>

		<footer id="fh5co-footer" role="contentinfo"
			style="background-image: url(images/img_bg_4.jpg);">
			<div class="overlay"></div>
			<div class="container">
				<div class="row row-pb-md">
					<div class="col-md-3 fh5co-widget">
						<h3>About Education</h3>
						<p>Facilis ipsum reprehenderit nemo molestias. Aut cum
							mollitia reprehenderit. Eos cumque dicta adipisci architecto
							culpa amet.</p>
					</div>
					<div class="col-md-2 col-sm-4 col-xs-6 col-md-push-1 fh5co-widget">
						<h3>Learning</h3>
						<ul class="fh5co-footer-links">
							<li><a href="#">Course</a></li>
							<li><a href="#">Blog</a></li>
							<li><a href="#">Contact</a></li>
							<li><a href="#">Terms</a></li>
							<li><a href="#">Meetups</a></li>
						</ul>
					</div>

					<div class="col-md-2 col-sm-4 col-xs-6 col-md-push-1 fh5co-widget">
						<h3>Learn &amp; Grow</h3>
						<ul class="fh5co-footer-links">
							<li><a href="#">Blog</a></li>
							<li><a href="#">Privacy</a></li>
							<li><a href="#">Testimonials</a></li>
							<li><a href="#">Handbook</a></li>
							<li><a href="#">Held Desk</a></li>
						</ul>
					</div>

					<div class="col-md-2 col-sm-4 col-xs-6 col-md-push-1 fh5co-widget">
						<h3>Engage us</h3>
						<ul class="fh5co-footer-links">
							<li><a href="#">Marketing</a></li>
							<li><a href="#">Visual Assistant</a></li>
							<li><a href="#">System Analysis</a></li>
							<li><a href="#">Advertise</a></li>
						</ul>
					</div>

					<div class="col-md-2 col-sm-4 col-xs-6 col-md-push-1 fh5co-widget">
						<h3>Legal</h3>
						<ul class="fh5co-footer-links">
							<li><a href="#">Find Designers</a></li>
							<li><a href="#">Find Developers</a></li>
							<li><a href="#">Teams</a></li>
							<li><a href="#">Advertise</a></li>
							<li><a href="#">API</a></li>
						</ul>
					</div>
				</div>

				<div class="row copyright">
					<div class="col-md-12 text-center">
						<p>
							<small class="block">&copy; 2016 Free HTML5. All Rights
								Reserved.</small> <small class="block">Designed by <a
								href="http://freehtml5.co/" target="_blank">FreeHTML5.co</a>
								Demo Images: <a href="http://unsplash.co/" target="_blank">Unsplash</a>
								&amp; <a href="https://www.pexels.com/" target="_blank">Pexels</a></small>
						</p>
					</div>
				</div>

			</div>
		</footer>
	</div>

	<div class="gototop js-top">
		<a href="#" class="js-gotop"><i class="icon-arrow-up"></i></a>
	</div>

	<!-- jQuery -->
	<script src="js/jquery.min.js"></script>
	<!-- jQuery Easing -->
	<script src="js/jquery.easing.1.3.js"></script>
	<!-- Bootstrap -->
	<script src="js/bootstrap.min.js"></script>
	<!-- Waypoints -->
	<script src="js/jquery.waypoints.min.js"></script>
	<!-- Stellar Parallax -->
	<script src="js/jquery.stellar.min.js"></script>
	<!-- Carousel -->
	<script src="js/owl.carousel.min.js"></script>
	<!-- Flexslider -->
	<script src="js/jquery.flexslider-min.js"></script>
	<!-- countTo -->
	<script src="js/jquery.countTo.js"></script>
	<!-- Magnific Popup -->
	<script src="js/jquery.magnific-popup.min.js"></script>
	<script src="js/magnific-popup-options.js"></script>
	<!-- Google Map -->
	<script
		src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCefOgb1ZWqYtj7raVSmN4PL2WkTrc-KyA&sensor=false"></script>
	<script src="js/google_map.js"></script>
	<!-- Count Down -->
	<script src="js/simplyCountdown.js"></script>
	<!-- Main -->
	<script src="js/main.js"></script>
	<script>
		var d = new Date(new Date().getTime() + 1000 * 120 * 120 * 2000);

		// default example
		simplyCountdown('.simply-countdown-one', {
			year : d.getFullYear(),
			month : d.getMonth() + 1,
			day : d.getDate()
		});

		//jQuery example
		$('#simply-countdown-losange').simplyCountdown({
			year : d.getFullYear(),
			month : d.getMonth() + 1,
			day : d.getDate(),
			enableUtc : false
		});
	</script>
</body>
</html>

