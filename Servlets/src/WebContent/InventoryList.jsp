<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="java.util.*,com.mvc.*" %>
    

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inventory Table</title>

<!-- CSS goes in the document HEAD or added to your external stylesheet -->
<style type="text/css">
table.imagetable {
	font-family: verdana,arial,sans-serif;
	font-size:11px;
	color:#333333;
	border-width: 1px;
	border-color: #999999;
	border-collapse: collapse;
}
table.imagetable th {
	background:#b5cfd2 url('cell-blue.jpg');
	border-width: 1px;
	padding: 8px;
	border-style: solid;
	border-color: #999999;
}
table.imagetable td {
	background:#dcddc0 url('cell-grey.jpg');
	border-width: 1px;
	padding: 8px;
	border-style: solid;
	border-color: #999999;
}
</style>


</head>

	<%
	
	   List<Inventory> inventory=(List<Inventory>) request.getAttribute("INVENTORYLIST");
	  
	
	%>

<body>

<%-- show data without format only as String method in object	<%= inventory %> --%>
	
	<table class="imagetable">
		<tr>
			<th>Id Article</th>
			<th>Name</th>
			<th>Description</th>
			<th>Location</th>
			<th>Price</th>
			<th>Stock</th>
			<th>Weight</th>
			<th>Size</th>
		
		</tr>
		
		<% for (Inventory tempInventory:inventory){ %>
		
		<tr>
			<td><%= tempInventory.getId() %></td>
			<td><%= tempInventory.getName() %></td>
			<td><%= tempInventory.getDescription() %></td>
			<td><%= tempInventory.getLocation() %></td>
			<td><%= tempInventory.getPrice() %></td>
			<td><%= tempInventory.getStock() %></td>
			<td><%= tempInventory.getWeight() %></td>
			<td><%= tempInventory.getSize() %></td>
		</tr>	
		                                           
		                                           
		<% } %>
	
	</table>

</body>
</html>