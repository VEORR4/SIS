<?php

include_once 'classes/Pessoa.class.php';
include_once 'classes/Conta.class.php';
include_once 'classes/ContaPoupanca.php';

$carlos = new Pessoa(10, "Carlos da Silva", 1.85, 25, "10/04/1976", "Ensino Médio", 650.00);
$contas = new ContaPoupanca(667, "CC.12345-7", "10/07/02", $carlos, 9876, 500.00, "10/07");