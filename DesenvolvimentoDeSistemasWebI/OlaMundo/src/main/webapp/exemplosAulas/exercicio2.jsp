<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Falou laranjinha</title>
</head>
<body>
	<h1>Sequência de Fibonacci:</h1>
		<%
			int a =1;
			int b =1;
			for (int i=0; i<20; i++){
				out.print(a + " ");
				int c = a + b;
				a=b;
				b=c;
			}
				
				
				

			%>

</body>
</html>