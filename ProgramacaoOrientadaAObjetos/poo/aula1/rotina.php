<?php                                                          
class Computador
{
     var $cpu;
     function ligar()
{
     echo "Ligando computador a {$this->cpu}Mhz";
     }
}

$obj = new Computador;
$obj->cpu = "500Mhz\n";
$obj->ligar();

$novoobj = new Computador;
$novoobj->cpu = readline("insira velocidade CPU: ");
$novoobj->ligar();

