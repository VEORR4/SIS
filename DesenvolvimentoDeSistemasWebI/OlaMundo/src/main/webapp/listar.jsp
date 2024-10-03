<%@page import="org.libertas.MedicamentoDAO"%>
<%@page import="org.libertas.Medicamento"%>
<%@ page import="java.util.LinkedList" %>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Lista de Medicamentos</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
<jsp:useBean id="mdao" scope="page" class="org.libertas.MedicamentoDAO"/>
<div class="container mt-5">
    <h2 class="text-center">Lista de Medicamentos</h2>
    <table class="table table-bordered">
        <thead>
            <tr>
                <th>Nome</th>
                <th>Marca</th>
                <th>Validade</th>
            </tr>
        </thead>
        <tbody>
            <m:forEach var="m" items="${mdao.listar()}">
                <tr>
                    <td>${c.nomeMedicamento}</td>
                    <td>${c.marcaMedicamento}</td>
                    <td>${c.validadeMedicamento}</td>

                    <td>
                        <a href="formulario.jsp?idMedicamento=${m.idMedicamento}" class="btn btn-info btn-sm">Alterar</a>
                        <a href="excluir.jsp?idMedicamento=${m.idMedicamento}" class="btn btn-secondary btn-sm">Excluir</a>
                    </td>
                </tr>
            </m:forEach>
        </tbody>
    </table>
    <div class="text-center">
        <a href="formulario.jsp" class="btn btn-primary">Adicionar Novo Medicamento</a>
        <a href="index.jsp" class="btn btn-secondary">Início</a>
    </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js" integrity="sha384-0pUGZvbkm6XF6gxjEnlmuGrJXVbNuzT9qBBavbLwCsOGabYfZo0T0to5eqruptLy" crossorigin="anonymous"></script>

</body>
</html>
