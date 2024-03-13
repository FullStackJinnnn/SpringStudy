<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ attribute name="member" %>

	<header class="primary">
			<div class="firstbar">
				<div class="container">
					<div class="row">
						<div class="col-md-3 col-sm-12">
							<div class="brand">
								<a href="index.html">
									<img src="css/user/images/logo.png" alt="Magz Logo">
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
								<c:if test="${sessionScope.member == null}">
								<li><a href="signUp"><i class="ion-person-add"></i><div>Sign Up</div></a></li>
								<li><a href="/signIn"><i class="ion-person"></i><div>Sign In</div></a></li>
								</c:if>
								<c:if test="${sessionScope.member != null}">
								<li><a href="mainPage"><i class="ion-person"></i><div>Sign Out</div></a></li>
								</c:if>	

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
							<img src="css/user/images/logo.png" alt="Magz Logo">
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
						
							<li class="dropdown magz-dropdown"><a href="category.html">Market Post<i class="ion-ios-arrow-right"></i><div class="badge">Hot</div></a>
								<ul class="dropdown-menu">
									<li><a href="SellPost">Sell</a></li>
									<li><a href="BuyPost">Buy</a></li>
									<li><a href="FreecyclePost">Freecycle</a></li>
								</ul>
							</li>
							<li class="dropdown magz-dropdown"><a href="#">Headhunt Photos</a>
							<li class="dropdown magz-dropdown"><a href="#">Jobhunt Post</a>
							<li class="dropdown magz-dropdown"><a href="#">Free Post</a>
							</li>
						</ul>
					</div>
				</div>
			</nav>
			<!-- End nav -->
		</header>