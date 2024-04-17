<?php

include 'classes/Funcionario.class.php';
include 'classes/Estagiario.class.php';


$pedrinho = new Funcionario;
$pedrinho->Nome = 'Pedrinho';


$mariana = new Estagiario;
$mariana->Nome = 'Mariana';


echo $pedrinho->Nome . '<br>';
echo $mariana->Nome;