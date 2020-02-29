<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
.<style>
.header {
  padding: 80px;
  text-align: center;
  background: #1abc9c;
  color: white;
}

/* Increase the font size of the heading */
.header h1 {
  font-size: 40px;
}
</style>
</head>
<body>
<table border="3">
	<thead>
<div class="header">
<% out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");%></br>
<%out.println("Name :"+(session.getAttribute("Name"))); %></br>
<%out.println("Usn :"+(session.getAttribute("Usn"))); %></br>
<% out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");%></br>
<th>EDU</th>
<th>MARKS</th>
</tr></thead>
<tbody>
<tr>
<td>Tenth Marks  </td>
<td><%out.println((session.getAttribute("Ten"))); %></td>
</tr>
<tr>
<td>Inter Marks  </td>
<td><%out.println((session.getAttribute("Inter"))); %></td>
</tr>
<tr>
<td>BE Marks  </td>
<td><%out.println((session.getAttribute("BE"))); %></td>
</tr>

</tbody>
</table>
</div>
</body>
</html>