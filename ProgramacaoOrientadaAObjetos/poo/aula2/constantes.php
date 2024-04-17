<?php

class Biblioteca {
    const Nome = "GTK";
}

class Aplicacao extends Biblioteca {
    const Ambiente = "Gnome Desktop";
    const Versao = "3.8";

    function __construct($Nome){
        echo parent::Nome . self::Ambiente . self::Versao . $Nome . "<br>";
    }
}