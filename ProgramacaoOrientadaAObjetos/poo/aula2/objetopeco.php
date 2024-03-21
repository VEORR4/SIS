<?php
#carrega as classes
include_once 'classes/Pessoa.class.php'; 
include_once 'classes/Conta.class.php'; 
$carlos = new Pessoa(10, "Carlos da Silva", 1.85, 25, '10/04/1976', 'Ensino médio', 650.00);

echo "Manipulando o objeto {$carlos->Nome}: <br>";

echo "{$carlos->Nome} é formado em: {$carlos->Escolaridade} <br>";
$carlos->Formar('Técnico em Eletricidade');
echo "{$carlos->Nome} é formado em: {$carlos->Escolaridade} <br>";

$conta_carlos = new Conta(6677, 'CC.12345-5', '10/07/2022', $carlos, 9876, 567.89);

echo '<br';
echo "Manipulando a conta de: {$conta_carlos->Titular->Nome}<br>";
echo "O saldo atual é R\$ {$conta_carlos->ObterSaldo()} <br>";

$conta_carlos->Depositar(20);
echo "O saldo atual é R\$ {$conta_carlos->ObterSaldo()} <br>";

$conta_carlos->Retirar(10);
echo "O saldo atual é R\$ {$conta_carlos->ObterSaldo()} <br>";
