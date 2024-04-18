<?php
$xml = simplexml_load_file('paises.xml');

//exibe as informações do objeto criado
echo 'Nome: '.$xml->nome.'<br>';
echo 'Idioma: '.$xml->idioma.'<br>';
echo "<br>";
echo "*** Informações Geográficas ***<br>";
echo 'Clima: '.$xml->clima.'<br>';
echo 'Costa: '.$xml->costa.'<br>';
echo 'Pico: '.$xml->pico.'<br>';
