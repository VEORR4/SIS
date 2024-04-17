<?php
class Aplicacao {
    static $Quantidade;

    /* metodo Construtor
    incrementa a $Quantidade de Aplicações
    */

    function __construct($Nome) {

        //incrementa propriedade estática
        self::$Quantidade++;
        $i = self::$Quantidade;
        echo "Nova aplicação nº $i: $Nome<br>";
    }
}

new Aplicacao('Dia');
new Aplicacao('Gimp');
new Aplicacao('Gnumeric');
new Aplicacao('Abiword');
new Aplicacao('Evolution');
echo 'Quantidade de Aplicações = ' . Aplicacao::$Quantidade. '<br>';