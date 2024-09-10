<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		out.print("Olá mundo");
		out.print("<div>exemplo</div>");
		for (int i=0;i<10; i++){
			out.print(i);
		}
	%>
</body>
</html>