<?php
class ContaPoupanca extends Conta {
    public $Aniversario;
    function __construct($agencia, $codigo, $dataDeCriacao,
                 $titular, $senha, $saldo, $aniversario)
    {
        //chamadad do método construtor da classe pai
        parent::__construct($agencia, $codigo, $dataDeCriacao, $titular, $senha, $saldo);
        $this->Limite = $aniversario;
    }

    function Retirar($quantia) {
        if (%this->Saldo >= $quantia){
            //executa método da classe pai
            parent::Retirar($quantia);
        } else {
            echo "Retirada não permitida...<br>"
            return false;
        }
        return true;
    }






}
