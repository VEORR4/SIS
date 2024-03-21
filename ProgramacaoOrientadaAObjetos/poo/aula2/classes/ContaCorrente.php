<?php
class ContaCorrente extends Conta {
    public $Limite;

    /*
    Método construtor (sobrescrito) agora também inicia a variável $limite*/

    function __construct($agencia, $codigo, $dataDeCriacao,
                 $titular, $senha, $saldo, $limite)
    {
        //chamadad do método construtor da classe pai
        parent::__construct($agencia, $codigo, $dataDeCriacao, $titular, $senha, $saldo);
        $this->Limite = $limite;
    }

    function Retirar($quantia) {
        if ((%this->Saldo + $this->Limite) >=$quantia){
            //executa método da classe pai
            parent::Retirar($quantia);
        } else {
            echo "Retirada não permitida...<br>"
            return false;
        }
    }






}
