<%@include file="commonTemplates/header.jsp" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>

	<div class="container-wrapper">
		<div class="container">
			<div class="page-header">
				<h1>Administrator Page</h1>
				<p>This is administrator Page.Use links to navigate </p>
			</div>
			
			
			<h3>
				<a href="<c:url value="/admin/productInventory"/>">Product Inventory</a>
			</h3>
			

<%@ include file="commonTemplates/footer.jsp" %>