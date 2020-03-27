<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="java.util.*,com.mvc.*" %>

<!DOCTYPE html>
	<html>
		<head>
			<meta charset="ISO-8859-1">
			<title>Iventory Request</title>

			<style type="text/css">
				.content-select select{
					appearance: none;
					-webkit-appearance: none;
					-moz-appearance: none;
					}
		
				.content-select select::-ms-expand {
    				display: none;
					}
				
				.content-select{
					max-width: 250px;
					position: relative;
					}
 
				.content-select select{
					display: inline-block;
					width: 100%;
					cursor: pointer;
				  	padding: 7px 10px;
				  	height: 42px;
				  	outline: 0; 
				  	border: 0;
					border-radius: 0;
					background: #f0f0f0;
					color: #7b7b7b;
					font-size: 1em;
					color: #999;
					font-family: 
					'Quicksand', sans-serif;
					border:2px solid rgba(0,0,0,0.2);
				    border-radius: 12px;
				    position: relative;
				    transition: all 0.25s ease;
					}
 
				.content-select select:hover{
					background: #B1E8CD;
					}
		
				.content-select i{
					position: absolute;
					right: 20px;
					top: calc(50% - 13px);
					width: 16px;
					height: 16px;
					display: block;
					border-left:4px solid #2AC176;
					border-bottom:4px solid #2AC176;
					transform: rotate(-45deg); /* Giramos el cuadrado */
					transition: all 0.25s ease;
					}
 
				.content-select:hover i{
					margin-top: 3px;
					}
				.button {
					  background-color: #4CAF50; /* Green */
					  border: none;
					  color: white;
					  padding: 15px 32px;
					  text-align: center;
					  text-decoration: none;
					  display: inline-block;
					  font-size: 16px;
					}
		</style>

		/head>

		<%	
		   ArrayList inventory= new ArrayList();
		   inventory.add("chair");
		   inventory.add("desk");
		   inventory.add("standard copy paper");
		   inventory.add("pen");
		   inventory.add("pencil");
		   inventory.add("highlighter");
		   inventory.add("Dell Monitor");
		   inventory.add("Dell USB Mouse");
		   inventory.add("Paper Clips 100ct");
		   inventory.add("rubberbands");
		   inventory.add("Dell Keyboard");
		   inventory.add("HDMI Cable, 3ft");
		   inventory.add("CAT5e Cable, 10ft");
		   inventory.add("small trask can");
		   inventory.add("stapler");
		   inventory.add("staplers");
		   inventory.add("Post-It notes, 200ct");
		   
		   
		%>

		<body>

 		<form action="ControlInventory" method="get">
 
 			<div class="content-select">
  			Name: <select name="Select1">
  				<%  for(int i = 0; i < inventory.size(); i++) {
        			   String option = (String)inventory.get(i);
 			  %>
  		 <option value="<%= option %>"><%= option %></option>
  		 <% } %>
 	 </select>
 	 <i></i>
	 </div>
 
  <br><br>
  
  <input type="submit" value="Send">
 
 
 </form>

</body>
</html>