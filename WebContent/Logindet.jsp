<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
out.println("Welcome "+(session.getAttribute("Name")));%></br>
<% out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");%></br>
<%out.println("Name :"+(session.getAttribute("Name"))); %></br>
<%out.println("Age :"+(session.getAttribute("Age"))); %></br>
<% out.println("Joining :"+(session.getAttribute("Joining")));%></br>
<% out.println("Subject :"+(session.getAttribute("Subject")));%></br>
<% out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");%></br>
<h4>Enter Student Results<a href="/Vtu/Studentmarks.html"> Click...</a></h4>
</body>
</html>