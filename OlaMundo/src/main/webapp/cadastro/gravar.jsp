<%@page import="org.libertas.Pessoa"%>
<%@page import="org.libertas.PessoaDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%PessoaDao dao = new PessoaDao();
	Pessoa p = new Pessoa();
	p.setIdpessoa(Integer.parseInt((request.getParameter("idpessoa")));
	p.setNome(request.getParameter("nome"));
	p.setTelefone(request.getParameter("telfone"));
	p.setEmail(request.getParameter("email"));
	p.setCidade(request.getParameter("cidade"));
	
	//salva a pessoa
	if(p.getIdpessoa()>0){
		dao.alterar(p);
		}else{
			dao.inserir(p);
		}
	%>
	<h1>Pessoa salva com sucesso!</h1>
	<a href="index.jsp">Ok</a>

</body>
</html>