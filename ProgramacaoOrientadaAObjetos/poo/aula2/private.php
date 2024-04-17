<?php

include_once 'classes/Funcionario.class.php';

$pedro = new Funcionario;
//$pedro->Salario = 'Oitocentos e setenta e seis';
$pedro->SetSalario(876);

echo 'Salario: R$ ' .  $pedro->GetSalario();

