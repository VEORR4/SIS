<?php
$xml = simplexml_load_file('paises2.xml');

//exibe as informações do objeto criado
$xml->populacao = '220 milhões';
$xml->religiao = 'cristianismo';
$xml->geografia->clima = 'temperado';
$xml->addChild('presidente', 'Chapolin Colorado');
//exibindo o novo xml
echo $xml->asXML();
//grava no arquivo paises2.xml
file_put_contents('paises2.xml', $xml->xml->asXML());
