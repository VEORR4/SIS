<?php

$umidade = readline('Insira o valor da umidade: ');
$vai_chover = ($umidade>90);

if ($vai_chover){
     echo 'Está chovendo';
} else {
     echo 'Não vai chover';
}