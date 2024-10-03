<%@page import="org.libertas.Medicamento"%>
<%@page import="org.libertas.MedicamentoDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastrar Medicamentos</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
<jsp:useBean id="m" scope="page" class="org.libertas.Medicamento"/>
<jsp:useBean id="mdao" scope="page" class="org.libertas.MedicamentoDAO"/>
<jsp:setProperty property="*" name="m"/>

${m=mdao.consultar(m.idMedicamento)}


<div class="container mt-5">
    <h2 class="text-center">Cadastro de Medicamentos</h2>
    <form action="gravar.jsp" method="post">
    <input type="hidden" name="idMedicamento" value="${m.idMedicamento}"/>
        <div class="mb-3 d-flex justify-content-center">
            <div>
                <label for="nome" class="form-label">Nome do Medicamento</label>
                <input type="text" class="form-control" name="nomeMedicamento" id="nome" value="${m.nomeMedicamento}" required style="width: 100%; max-width: 800px;">
            </div>
        </div>

        <div class="mb-3 d-flex justify-content-center">
            <div>
                <label for="marcaMedicamento" class="form-label">Marca</label>
                <input type="text" class="form-control" name="marcaMedicamento" id="marcaMedicamento" value="${m.marcaMedicamento}"required style="width: 100%; max-width: 800px;">
            </div>
        </div>

        <div class="mb-3 d-flex justify-content-center">
            <div>
                <label for="validadeMedicamento" class="form-label">Validade</label>
                <input type="text" class="form-control" name="validadeMedicamento" id="validadeMedicamento" value="${m.validadeMedicamentop}"required style="width: 100%; max-width: 800px;">
            </div>
        </div>s
		
        <div class="text-center">
            <button type="submit" class="btn btn-primary">Enviar</button>
        </div>
    </form>
</div>

<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js" integrity="sha384-0pUGZvbkm6XF6gxjEnlmuGrJXVbNuzT9qBBavbLwCsOGabYfZo0T0to5eqruptLy" crossorigin="anonymous"></script>
</body>
</html>