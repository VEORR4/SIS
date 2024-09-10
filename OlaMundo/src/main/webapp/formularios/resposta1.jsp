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
		String n = request.getParameter("nome");
		int a = Integer.parseInt(request.getParameter("ano"));
		
		//calcular idade
		int idade = 2024 - a;
		
		//out.print(n + "nasceu no ano de" + a + "e tem" + idade + "anos de idade");
	%>
	
	
	
	<div>
		<%= n %> nasceu no ano de <%= a %> e tem <%= idade %> anos de idade.
	</div>

	

</body>
</html>