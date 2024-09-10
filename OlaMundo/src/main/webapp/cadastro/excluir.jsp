<%@page import="org.libertas.Pessoa"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body
	<%
		Pessoa p = new Pessoa();
		
		//receba o parametro id e atribua no objetp pessoa o valor do idpessoa
		p.setIdpessoa(Integer.parseInt(request.getParameter("id")));
		//declare o PessoaDAO
		PessoaDao pdao = new PessoaDao();
		//execute o metodo excluir
		pdao.excluir(p);
		//adicione um link pra voltar pra pagina lista.jsp
		
		%>

		Registro excluído com sucesso</br>
		
</body>
</html>