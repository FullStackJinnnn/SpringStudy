<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
		<meta name="description" content="Magz is a HTML5 & CSS3 magazine template is based on Bootstrap 3.">
		<meta name="author" content="Kodinger">
		<meta name="keyword" content="magz, html5, css3, template, magazine template">
		<!-- Shareable -->
		<meta property="og:title" content="HTML5 & CSS3 magazine template is based on Bootstrap 3" />
		<meta property="og:type" content="article" />
		<meta property="og:url" content="http://github.com/nauvalazhar/Magz" />
		<meta property="og:image" content="https://raw.githubusercontent.com/nauvalazhar/Magz/master/images/preview.png" />
		<title>Magz &mdash; Responsive HTML5 &amp; CSS3 Magazine Template</title>
		<!-- Bootstrap -->
		<link rel="stylesheet" href="scripts/bootstrap/bootstrap.min.css">
		<!-- IonIcons -->
		<link rel="stylesheet" href="scripts/ionicons/css/ionicons.min.css">
		<!-- Toast -->
		<link rel="stylesheet" href="scripts/toast/jquery.toast.min.css">
		<!-- OwlCarousel -->
		<link rel="stylesheet" href="scripts/owlcarousel/dist/assets/owl.carousel.min.css">
		<link rel="stylesheet" href="scripts/owlcarousel/dist/assets/owl.theme.default.min.css">
		<!-- Magnific Popup -->
		<link rel="stylesheet" href="scripts/magnific-popup/dist/magnific-popup.css">
		<link rel="stylesheet" href="scripts/sweetalert/dist/sweetalert.css">
		<!-- Custom style -->
		<link rel="stylesheet" href="css/style.css">
		<link rel="stylesheet" href="css/skins/all.css">
		<link rel="stylesheet" href="css/demo.css">

	<style>
	.btn-upload {
	   width: 100%;
	   height: 5rem;
	   margin-top: 10px;
	   background: FF6666;
	   border: 1px solid #FF6666;
	   border-radius: 10px;
	   cursor: pointer;
	   display: flex;
	   align-items: center;
	   justify-content: center;
	   color: #FF6666;
	}
	
	.btn-upload:hover {
	   background: #FF6666;
	   color: white;
	}
	
	#previewDiv {
	    border-radius: 50%;
	    border: 1px solid gray;
	}


	[type="radio"], span {
  vertical-align: middle;
}

[type="radio"] {
  appearance: none;
  border: max(2px, 0.1em) solid gray;
  border-radius: 50%;
  width: 1.25em;
  height: 1.25em;
  transition: border 0.5s ease-in-out;
}

[type="radio"]:checked {
  border: 0.4em solid tomato;
}

[type="radio"]:focus-visible {
  outline-offset: max(2px, 0.1em);
  outline: max(2px, 0.1em) dotted tomato;
}

[type="radio"]:hover {
  box-shadow: 0 0 0 max(4px, 0.2em) lightgray;
  cursor: pointer;
}

[type="radio"]:hover + span {
  cursor: pointer;
}

	</style>
	</head>

	<body>
		<header class="primary">
			<div class="firstbar">
				<div class="container">
					<div class="row">
						<div class="col-md-3 col-sm-12">
							<div class="brand">
								<a href="index.html">
									<img src="images/logo.png" alt="Magz Logo">
								</a>
							</div>						
						</div>
						<div class="col-md-6 col-sm-12">
							<form class="search" autocomplete="off">
								<div class="form-group">
									<div class="input-group">
										<input type="text" name="q" class="form-control" placeholder="Type something here">									
										<div class="input-group-btn">
											<button class="btn btn-primary"><i class="ion-search"></i></button>
										</div>
									</div>
								</div>
								<div class="help-block">
									<div>Popular:</div>
									<ul>
										<li><a href="#">HTML5</a></li>
										<li><a href="#">CSS3</a></li>
										<li><a href="#">Bootstrap 3</a></li>
										<li><a href="#">jQuery</a></li>
										<li><a href="#">AnguarJS</a></li>
									</ul>
								</div>
							</form>								
						</div>
						<div class="col-md-3 col-sm-12 text-right">
							<ul class="nav-icons">
								<li><a href="register.html"><i class="ion-person-add"></i><div>Register</div></a></li>
								<li><a href="login.html"><i class="ion-person"></i><div>Login</div></a></li>
							</ul>
						</div>
					</div>
				</div>
			</div>

			<!-- Start nav -->
			<nav class="menu">
				<div class="container">
					<div class="brand">
						<a href="#">
							<img src="images/logo.png" alt="Magz Logo">
						</a>
					</div>
					<div class="mobile-toggle">
						<a href="#" data-toggle="menu" data-target="#menu-list"><i class="ion-navicon-round"></i></a>
					</div>
					<div class="mobile-toggle">
						<a href="#" data-toggle="sidebar" data-target="#sidebar"><i class="ion-ios-arrow-left"></i></a>
					</div>
					<div id="menu-list">
						<ul class="nav-list">
							<li class="for-tablet nav-title"><a>Menu</a></li>
							<li class="for-tablet"><a href="login.html">Login</a></li>
							<li class="for-tablet"><a href="register.html">Register</a></li>
							<li><a href="category.html">Standard</a></li>
							<li class="dropdown magz-dropdown">
								<a href="category.html">Pages <i class="ion-ios-arrow-right"></i></a>
								<ul class="dropdown-menu">
									<li><a href="index.html">Home</a></li>
									<li class="dropdown magz-dropdown">
										<a href="#">Authentication <i class="ion-ios-arrow-right"></i></a>
										<ul class="dropdown-menu">
											<li><a href="login.html">Login</a></li>
											<li><a href="register.html">Register</a></li>
											<li><a href="forgot.html">Forgot Password</a></li>
											<li><a href="reset.html">Reset Password</a></li>
										</ul>
									</li>
									<li><a href="category.html">Category</a></li>
									<li><a href="single.html">Single</a></li>
									<li><a href="page.html">Page</a></li>
									<li><a href="search.html">Search</a></li>
									<li><a href="contact.html">Contact</a></li>
									<li class="dropdown magz-dropdown">
										<a href="#">Error <i class="ion-ios-arrow-right"></i></a>
										<ul class="dropdown-menu">
											<li><a href="403.html">403</a></li>
											<li><a href="404.html">404</a></li>
											<li><a href="500.html">500</a></li>
											<li><a href="503.html">503</a></li>
										</ul>
									</li>
								</ul>
							</li>
							<li class="dropdown magz-dropdown"><a href="#">Dropdown <i class="ion-ios-arrow-right"></i></a>
								<ul class="dropdown-menu">
									<li><a href="category.html">Internet</a></li>
									<li class="dropdown magz-dropdown"><a href="category.html">Troubleshoot <i class="ion-ios-arrow-right"></i></a>
										<ul class="dropdown-menu">
											<li><a href="category.html">Software</a></li>
											<li class="dropdown magz-dropdown"><a href="category.html">Hardware <i class="ion-ios-arrow-right"></i></a>
												<ul class="dropdown-menu">
													<li><a href="category.html">Main Board</a></li>
													<li><a href="category.html">RAM</a></li>
													<li><a href="category.html">Power Supply</a></li>
												</ul>
											</li>
											<li><a href="category.html">Brainware</a>
										</ul>
									</li>
									<li><a href="category.html">Office</a></li>
									<li class="dropdown magz-dropdown"><a href="#">Programming <i class="ion-ios-arrow-right"></i></a>
										<ul class="dropdown-menu">
											<li><a href="category.html">Web</a></li>
											<li class="dropdown magz-dropdown"><a href="category.html">Mobile <i class="ion-ios-arrow-right"></i></a>
												<ul class="dropdown-menu">
													<li class="dropdown magz-dropdown"><a href="category.html">Hybrid <i class="ion-ios-arrow-right"></i></a>
														<ul class="dropdown-menu">
															<li><a href="#">Ionic Framework 1</a></li>
															<li><a href="#">Ionic Framework 2</a></li>
															<li><a href="#">Ionic Framework 3</a></li>
															<li><a href="#">Framework 7</a></li>
														</ul>
													</li>
													<li><a href="category.html">Native</a></li>
												</ul>
											</li>
											<li><a href="category.html">Desktop</a></li>
										</ul>
									</li>
								</ul>
							</li>
							<li class="dropdown magz-dropdown magz-dropdown-megamenu"><a href="#">Mega Menu <i class="ion-ios-arrow-right"></i> <div class="badge">Hot</div></a>
								<div class="dropdown-menu megamenu">
									<div class="megamenu-inner">
										<div class="row">
											<div class="col-md-3">
												<div class="row">
													<div class="col-md-12">
														<h2 class="megamenu-title">Trending</h2>
													</div>
												</div>
												<ul class="vertical-menu">
													<li><a href="#"><i class="ion-ios-circle-outline"></i> Mega menu is a new feature</a></li>
													<li><a href="#"><i class="ion-ios-circle-outline"></i> This is an example</a></li>
													<li><a href="#"><i class="ion-ios-circle-outline"></i> For a submenu item</a></li>
													<li><a href="#"><i class="ion-ios-circle-outline"></i> You can add</a></li>
													<li><a href="#"><i class="ion-ios-circle-outline"></i> Your own items</a></li>
												</ul>
											</div>
											<div class="col-md-9">
												<div class="row">
													<div class="col-md-12">
														<h2 class="megamenu-title">Featured Posts</h2>
													</div>
												</div>
												<div class="row">
													<article class="article col-md-4 mini">
														<div class="inner">
															<figure>
																<a href="single.html">
																	<img src="images/news/img10.jpg" alt="Sample Article">
																</a>
															</figure>
															<div class="padding">
																<div class="detail">
																	<div class="time">December 10, 2016</div>
																	<div class="category"><a href="category.html">Healthy</a></div>
																</div>
																<h2><a href="single.html">Duis aute irure dolor in reprehenderit in voluptate</a></h2>
															</div>
														</div>
													</article>
													<article class="article col-md-4 mini">
														<div class="inner">
															<figure>
																<a href="single.html">
																	<img src="images/news/img11.jpg" alt="Sample Article">
																</a>
															</figure>
															<div class="padding">
																<div class="detail">
																	<div class="time">December 13, 2016</div>
																	<div class="category"><a href="category.html">Lifestyle</a></div>
																</div>
																<h2><a href="single.html">Duis aute irure dolor in reprehenderit in voluptate</a></h2>
															</div>
														</div>
													</article>
													<article class="article col-md-4 mini">
														<div class="inner">
															<figure>
																<a href="single.html">
																	<img src="images/news/img14.jpg" alt="Sample Article">
																</a>
															</figure>
															<div class="padding">
																<div class="detail">
																	<div class="time">December 14, 2016</div>
																	<div class="category"><a href="category.html">Travel</a></div>
																</div>
																<h2><a href="single.html">Duis aute irure dolor in reprehenderit in voluptate</a></h2>
															</div>
														</div>
													</article>
												</div>
											</div>
										</div>								
									</div>
								</div>
							</li>
							<li class="dropdown magz-dropdown magz-dropdown-megamenu"><a href="#">Column <i class="ion-ios-arrow-right"></i></a>
								<div class="dropdown-menu megamenu">
									<div class="megamenu-inner">
										<div class="row">
											<div class="col-md-3">
												<h2 class="megamenu-title">Column 1</h2>
												<ul class="vertical-menu">
													<li><a href="#">Example 1</a></li>
													<li><a href="#">Example 2</a></li>
													<li><a href="#">Example 3</a></li>
													<li><a href="#">Example 4</a></li>
													<li><a href="#">Example 5</a></li>
												</ul>
											</div>
											<div class="col-md-3">
												<h2 class="megamenu-title">Column 2</h2>
												<ul class="vertical-menu">
													<li><a href="#">Example 6</a></li>
													<li><a href="#">Example 7</a></li>
													<li><a href="#">Example 8</a></li>
													<li><a href="#">Example 9</a></li>
													<li><a href="#">Example 10</a></li>
												</ul>
											</div>
											<div class="col-md-3">
												<h2 class="megamenu-title">Column 3</h2>
												<ul class="vertical-menu">
													<li><a href="#">Example 11</a></li>
													<li><a href="#">Example 12</a></li>
													<li><a href="#">Example 13</a></li>
													<li><a href="#">Example 14</a></li>
													<li><a href="#">Example 15</a></li>
												</ul>
											</div>
											<div class="col-md-3">
												<h2 class="megamenu-title">Column 4</h2>
												<ul class="vertical-menu">
													<li><a href="#">Example 16</a></li>
													<li><a href="#">Example 17</a></li>
													<li><a href="#">Example 18</a></li>
													<li><a href="#">Example 19</a></li>
													<li><a href="#">Example 20</a></li>
												</ul>
											</div>
										</div>
									</div>
								</div>
							</li>
							<li class="dropdown magz-dropdown"><a href="#">Dropdown Icons <i class="ion-ios-arrow-right"></i></a>
								<ul class="dropdown-menu">
									<li><a href="#"><i class="icon ion-person"></i> My Account</a></li>
									<li><a href="#"><i class="icon ion-heart"></i> Favorite</a></li>
									<li><a href="#"><i class="icon ion-chatbox"></i> Comments</a></li>
									<li><a href="#"><i class="icon ion-key"></i> Change Password</a></li>
									<li><a href="#"><i class="icon ion-settings"></i> Settings</a></li>
									<li class="divider"></li>
									<li><a href="#"><i class="icon ion-log-out"></i> Logout</a></li>
								</ul>
							</li>
						</ul>
					</div>
				</div>
			</nav>
			<!-- End nav -->
		</header>

		<section class="login first grey">
			<div class="container">
				<div class="box-wrapper">				
					<div class="box box-border">
						<div class="box-body">
							<h4>Sing Up</h4>

							<form id="yourFormId" method="post" action="/join"
              enctype="multipart/form-data" onsubmit="return validateForm()">

							<!-- 프로필 이미지 등록 -->
								<div class="featured-author-center">
									<div class="actions" id="uploadDiv">
										<!-- 프로필 이미지 미리보기 -->
										<div style="display: flex; justify-content: center; align-items: center;">
											<div class="actions" id="previewDiv" style="border: 1px solid rgb(168, 168, 168); width: 20rem; height: 20rem; overflow: hidden;">
												<img id="preview" style="width: 100%; height: 100%; object-fit: cover;" src="img/default.png"/>
											</div>
										</div>
     										<label for="fileInput" class="btn-upload" >
     											Upload
											<input type="file" name="file" id="fileInput" style="display: none;"/>
										</label>
    									</div> 
								</div>
								
								<br>

                <!-- 회원 ID 입력 -->
								<div class="form-group">
                  <label>Email</label> 
									<div style="display: flex;">
										<input type="email" id="memberId" name="memberId" class="form-control"> 
										<a style="text-align: center; padding-top: 3%; width: 7rem;" 
										class="btn btn-magz btn-sm" onclick="checkID()">check</a>
									</div>
									<p id="IDErrMsg"></p>
								</div>
                  <!-- 회원 PW 입력 -->
								<div class="form-group">
									<label class="fw">Password</label>
									<input type="password" id="memberPw" name="memberPw" class="form-control">
								</div>
                  <!-- 회원 PW 체크 -->
								<div class="form-group">
									<label class="fw">Password Check</label>
									<input type="password" id="passwordCheck" name="passwordCheck" 
									class="form-control">
									<p id="pwError" class="error"></p>
								</div>
                     <!-- 회원 이름 입력 -->
								<div class="form-group">
									<label>Name</label>
									<input type="text" id="memberName" name="memberName" class="form-control">
								</div>
                   <!-- 회원 별칭 입력 -->
								<div class="form-group">
									<label>NickName</label>
									<div style="display: flex;">
										<input type="text" id="memberNickname" name="memberNickname" 
										class="form-control">
										<a style="text-align: center; padding-top: 3%; width: 7rem;" 
										class="btn btn-magz btn-sm" onclick="checkNickname()" >check</a>
									</div>
									<p id="nicknameErrMsg" class="error"></p>
								</div>
                     <!-- 회원 생일 체크 -->
								<div class="form-group">
									<label>Birth</label>
									<input type="date" name="memberBirth" class="form-control" 
									value="1990-01-01">
								</div>
                     <!-- 회원 폰번호 입력 -->
								<div class="form-group">
									<label>Phone Number</label>
									<div style="display: flex;">
										<input type="text" id="memberPh" name="memberPh" 
										class="form-control" maxlength="11" 
										oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');">
										<a id="phCheckBtn" style="text-align: center; padding-top: 3%; width: 7rem;" 
										class="btn btn-magz btn-sm" onclick="sendAuthenticationSMS()">send</a>
									</div>
									<br>
									<div style="display: flex;">
										<input type="text" name="memberPhChk" class="form-control">
										<a id="phCheckBtn" style="text-align: center; padding-top: 3%; width: 7rem;" 
										class="btn btn-magz btn-sm" >check</a>
									</div>
									<!-- 결과 확인 비동기 -->
									<input type="hidden" id="${result}" class="hiddenCheck"> 
									<p class="successPhCheck"></p>

									<span id="phErrMsg" class="error"></span>
								</div>
                   <!-- 회원 성별 체크 -->
								<div class="form-group">
									<label>Gender</label>
									<div style="text-align: center;">
									   <input type="radio" name="memberGender" value='male' style="margin-right: 8px; ">
										 <span style="margin-right: 8%; ">Male</span></input>
									   <input type="radio" name="memberGender" value='female' style="margin-right: 8px;">
										 <span>Female</span></input>
									</div>
								</div>
                     <!-- 회원 자기 소개말 입력  -->
								<div class="form-group">
									<label>Introduction</label>
									<textarea id="memberIntroduction" name="memberIntroduction" class="form-control"></textarea>
								</div>
                     <!-- 약관동의 -->
								<div class="form-group">
									<div style="border: 0.5px solid #E2E2E2;">
										<p>
                    1. 위치 정보의 수집 및 이용 목적  
                      1.1 회사는 위치 기반 서비스를 제공하기 위해 위치 정보를 수집 및 이용합니다. 
                      1.2 위치 정보는 다음과 같은 목적으로 수집 및 이용됩니다.
                       - 서비스 제공을 위한 위치 확인 
                       - 사용자 위치를 활용한 맞춤형 서비스 제공 
                       - 서비스 이용 통계 및 분석 자료 생성 - 위치 정보를 활용한 광고 서비스 제공  
                    2. 수집하는 위치 정보 항목  2.1 회사가 수집하는 위치 정보의 항목은 다음과 같습니다. 
                    - 현재 위치 또는 특정 지역의 위도, 경도 정보 - 기기 정보: 디바이스 ID, 디바이스 모델, 운영 체제 버전 등
                    3. 위치 정보 제3자 제공 및 파기  
                      3.1 회사는 원칙적으로 위치 정보를 제3자에게 제공하지 않습니다.
                          다만, 다음의 경우에는 제3자 제공이 가능합니다. 
                          - 이용자 동의를 받은 경우 
                          - 법령에 따라 제공이 요구되는 경우 
                      3.2 위치 정보는 이용자가 해당 서비스를 종료하거나 로그아웃한 시점부터 지체 없이 파기됩니다. 
                    4. 위치 정보의 보유 및 이용 기간  
                      4.1 위치 정보는 위치 기반 서비스 제공 목적을 달성한 후에는 지체 없이 파기됩니다. 
                      단, 관련 법규에 따라 일정 기간 동안 보관할 필요가 있는 경우에는 해당 기간 동안 보관됩니다.

                    5. 이용자의 권리  
                      5.1 이용자는 언제든지 위치 정보의 수집 및 이용에 대한 동의 철회 및 위치 정보의
                          삭제를 요청할 수 있습니다.  
                    6. 개인정보 보호책임자  6.1 회사는 위치 정보를 보호하고 개인정보와 관련된 불만 처리 및 
                       피해 구제 등을 위하여 아래와 같이 개인정보 보호책임자를 지정하고 있습니다. 
                       - 성명: [보호책임자의 성명] - 이메일: [보호책임자의 이메일] - 전화번호: [보호책임자의 전화번호]  
                    7. 개정 및 공지  
                      7.1 이 위치 기반 서비스 이용약관은 정부의 법령, 정책 또는 회사의 내부 운영정책 등의 변경에 따라
                          변경될 수 있습니다. 변경 사항에 대해서는 홈페이지를 통해 사전에 공지할 것입니다.
										</p>								
									</div>
								</div>
                     <!-- 약관 동의 체크 동의 후 이용가능 -->
								<div class="form-group text-left">
									<input type="checkbox" id="agreeTerms1" name="agreeTerms1" />
									<label for="horns">I accept terms of use</label>
								</div>
                   <!-- 회원 가입 버튼 -->
								<div class="form-group">
									<button class="btn btn-primary btn-block" >JOIN</button>
								</div>
                   <!-- 로그인 페이지로 이동 -->
								<div class="form-group text-center">
									<span class="text-muted">Already have an account?</span> <a href="login.html">Login</a>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</section>

		<!-- Start footer -->
		<footer class="footer">
			<div class="container">
				<div class="row">
					<div class="col-md-3 col-sm-6 col-xs-12">
						<div class="block">
							<h1 class="block-title">Company Info</h1>
							<div class="block-body">
								<figure class="foot-logo">
									<img src="images/logo-light.png" class="img-responsive" alt="Logo">
								</figure>
								<p class="brand-description">
									Magz is a HTML5 &amp; CSS3 magazine template based on Bootstrap 3.
								</p>
								<a href="page.html" class="btn btn-magz white">About Us <i class="ion-ios-arrow-thin-right"></i></a>
							</div>
						</div>
					</div>
					<div class="col-md-3 col-sm-6 col-xs-12">
						<div class="block">
							<h1 class="block-title">Popular Tags <div class="right"><a href="#">See All <i class="ion-ios-arrow-thin-right"></i></a></div></h1>
							<div class="block-body">
								<ul class="tags">
									<li><a href="#">HTML5</a></li>
									<li><a href="#">CSS3</a></li>
									<li><a href="#">Bootstrap 3</a></li>
									<li><a href="#">Web Design</a></li>
									<li><a href="#">Creative Mind</a></li>
									<li><a href="#">Standing On The Train</a></li>
									<li><a href="#">at 6.00PM</a></li>
								</ul>
							</div>
						</div>
						<div class="line"></div>
						<div class="block">
							<h1 class="block-title">Newsletter</h1>
							<div class="block-body">
								<p>By subscribing you will receive new articles in your email.</p>
								<form class="newsletter">
									<div class="input-group">
										<div class="input-group-addon">
											<i class="ion-ios-email-outline"></i>
										</div>
										<input type="email" class="form-control email" placeholder="Your mail">
									</div>
									<button class="btn btn-primary btn-block white">Subscribe</button>
								</form>
							</div>
						</div>
					</div>
					<div class="col-md-3 col-sm-6 col-xs-12">
						<div class="block">
							<h1 class="block-title">Latest News</h1>
							<div class="block-body">
								<article class="article-mini">
									<div class="inner">
										<figure>
											<a href="single.html">
												<img src="images/news/img12.jpg" alt="Sample Article">
											</a>
										</figure>
										<div class="padding">
											<h1><a href="single.html">Donec consequat lorem quis augue pharetra</a></h1>
										</div>
									</div>
								</article>
								<article class="article-mini">
									<div class="inner">
										<figure>
											<a href="single.html">
												<img src="images/news/img14.jpg" alt="Sample Article">
											</a>
										</figure>
										<div class="padding">
											<h1><a href="single.html">eu dapibus risus aliquam etiam ut venenatis</a></h1>
										</div>
									</div>
								</article>
								<article class="article-mini">
									<div class="inner">
										<figure>
											<a href="single.html">
												<img src="images/news/img15.jpg" alt="Sample Article">
											</a>
										</figure>
										<div class="padding">
											<h1><a href="single.html">Nulla facilisis odio quis gravida vestibulum </a></h1>
										</div>
									</div>
								</article>
								<article class="article-mini">
									<div class="inner">
										<figure>
											<a href="single.html">
												<img src="images/news/img16.jpg" alt="Sample Article">
											</a>
										</figure>
										<div class="padding">
											<h1><a href="single.html">Proin venenatis pellentesque arcu vitae </a></h1>
										</div>
									</div>
								</article>
								<a href="#" class="btn btn-magz white btn-block">See All <i class="ion-ios-arrow-thin-right"></i></a>
							</div>
						</div>
					</div>
					<div class="col-md-3 col-xs-12 col-sm-6">
						<div class="block">
							<h1 class="block-title">Follow Us</h1>
							<div class="block-body">
								<p>Follow us and stay in touch to get the latest news</p>
								<ul class="social trp">
									<li>
										<a href="#" class="facebook">
											<svg><rect width="0" height="0"/></svg>
											<i class="ion-social-facebook"></i>
										</a>
									</li>
									<li>
										<a href="#" class="twitter">
											<svg><rect width="0" height="0"/></svg>
											<i class="ion-social-twitter-outline"></i>
										</a>
									</li>
									<li>
										<a href="#" class="youtube">
											<svg><rect width="0" height="0"/></svg>
											<i class="ion-social-youtube-outline"></i>
										</a>
									</li>
									<li>
										<a href="#" class="googleplus">
											<svg><rect width="0" height="0"/></svg>
											<i class="ion-social-googleplus"></i>
										</a>
									</li>
									<li>
										<a href="#" class="instagram">
											<svg><rect width="0" height="0"/></svg>
											<i class="ion-social-instagram-outline"></i>
										</a>
									</li>
									<li>
										<a href="#" class="tumblr">
											<svg><rect width="0" height="0"/></svg>
											<i class="ion-social-tumblr"></i>
										</a>
									</li>
									<li>
										<a href="#" class="dribbble">
											<svg><rect width="0" height="0"/></svg>
											<i class="ion-social-dribbble"></i>
										</a>
									</li>
									<li>
										<a href="#" class="linkedin">
											<svg><rect width="0" height="0"/></svg>
											<i class="ion-social-linkedin"></i>
										</a>
									</li>
									<li>
										<a href="#" class="skype">
											<svg><rect width="0" height="0"/></svg>
											<i class="ion-social-skype"></i>
										</a>
									</li>
									<li>
										<a href="#" class="rss">
											<svg><rect width="0" height="0"/></svg>
											<i class="ion-social-rss"></i>
										</a>
									</li>
								</ul>
							</div>
						</div>
						<div class="line"></div>
						<div class="block">
							<div class="block-body no-margin">
								<ul class="footer-nav-horizontal">
									<li><a href="index.html">Home</a></li>
									<li><a href="#">Partner</a></li>
									<li><a href="contact.html">Contact</a></li>
									<li><a href="page.html">About</a></li>
								</ul>
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-md-12">
						<div class="copyright">
							COPYRIGHT &copy; MAGZ 2017. ALL RIGHT RESERVED.
							<div>
								Made with <i class="ion-heart"></i> by <a href="http://kodinger.com">Kodinger</a>
							</div>
						</div>
					</div>
				</div>
			</div>
		</footer>
		<!-- End Footer -->

		<!-- JS -->
		<script src="js/jquery.js"></script>
		<script src="js/jquery.migrate.js"></script>
		<script src="scripts/bootstrap/bootstrap.min.js"></script>
		<script>var $target_end=$(".best-of-the-week");</script>
		<script src="scripts/jquery-number/jquery.number.min.js"></script>
		<script src="scripts/owlcarousel/dist/owl.carousel.min.js"></script>
		<script src="scripts/magnific-popup/dist/jquery.magnific-popup.min.js"></script>
		<script src="scripts/easescroll/jquery.easeScroll.js"></script>
		<script src="scripts/sweetalert/dist/sweetalert.min.js"></script>
		<script src="scripts/toast/jquery.toast.min.js"></script>
	  <script src="jspJs/signUp.js"></script>
	  <script src="jspJs/checkID.js"></script>
 	  <script src="jspJs/checkNickname.js"></script>
 	  <script src="jspJs/smsCheck.js"></script>
 	  <script src="jspJs/sendAuthentication.js"></script>
  	<script src="jspJs/pwCheck.js"></script>
	  <script src="jspJs/joinValidation.js"></script>
		<script src="js/demo.js"></script>
		<script src="js/e-magz.js"></script>
		 <script>
   			var imgFile = $('#fileInput').val();            
   			var fileForm = /(.*?)\.(jpg|jpeg|png|gif|bmp|webp)$/;   // 이미지 업로드 제약
   			var maxSize = 30 * 1024 * 1024;                     // 파일 사이즈 제약
   			const preview = document.querySelector('#preview');      // 이미지 업로드시 미리보기 기능을 담당
   			var fileDOM = document.getElementById('fileInput');
   			var previewDiv = document.getElementById('previewDiv');   // 이미지 업로드 미리보기 태그
   
		window.onload = function() {
    var target = document.getElementById('fileInput'); // file 아이디 선언
    target.addEventListener('change', function() { // change 함수

        var file = target.files[0]; // 선택된 파일 가져오기
        if (file) {
            var fileName = file.name;
            var fileSize = file.size;

            // 파일 확장자 및 크기 검사
            if (!fileForm.test(fileName)) {
                alert('jpg, jpeg, png, gif, bmp, webp 파일만 업로드 가능합니다.');
                target.value = ''; // 파일 선택 초기화
                return; // 함수 종료
            } else if (fileSize > maxSize) {
                alert('파일 크기는 30MB 이하만 가능합니다.');
                target.value = ''; // 파일 선택 초기화
                previewDiv.style.display = 'none'; // 미리보기 숨기기
                return; // 함수 종료
            }
            // 미리보기 기능
            const reader = new FileReader();
            reader.onload = function(e) {
                previewDiv.style.display = 'block'; // 이미지가 업로드 되면 div를 보여주기
                preview.src = e.target.result;
            };
            reader.readAsDataURL(file);
        }
    });
};

       </script>

	</body>
</html>