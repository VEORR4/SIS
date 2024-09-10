<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ligou na madruga</title>
</head>
<body>
	<%
		for (int i=0; i<11; i++){
		out.print("<div>");
		for (int x=0; x<11; x++){
			out.print(x + " x " + i + " = " + x * i + "<br>");
		}
		out.print("</div>");
		out.print("<hr>");
		
		}
		%>

</body>
</html>