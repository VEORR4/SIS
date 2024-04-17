<?php
include_once 'classes/Fornecedor.class.php';
include_once 'classes/Produto.class.php';

$fornecedor = new Fornecedor;
$fornecedor->Codigo = 848;
$fornecedor->RazaoSocial = 'Bom Gosto Alimentos S. A';
$fornecedor->Endereco = 'Rua Ipiranga';
$fornecedor->Cidade = 'Poços de Caldas';

$produto = new Produto;
$produto->Codigo = 462;
$produto->Descricao = 'Doce de Pêssego';
$produto->Preco = 1.24;
$produto->Fornecedor = $fornecedor;

echo 'Codigo: '.$produto->Codigo.'<br>';
echo 'Descricao: '.$produto->Descricao.'<br>';
echo 'Código Fornecedor: '.$produto->Fornecedor->Codigo.'<br>';
echo 'Razão Social: '.$produto->Fornecedor->RazaoSocial.'<br>';