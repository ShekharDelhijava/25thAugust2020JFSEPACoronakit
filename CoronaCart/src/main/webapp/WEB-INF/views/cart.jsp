<%@include file="commonTemplates/header.jsp" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<div class="container-wrapper">
	<div class="container">
		<section>
			<div class="jumbotron">
				<div class="container">
					<h1>Cart</h1>
					
					<p>All the selected products in your shopping cart</p>
				</div>
			</div>
		</section>
		
		<script src="<c:url value="/resources/js/controller.js"/>"></script>
<%@ include file="commonTemplates/footer.jsp" %>