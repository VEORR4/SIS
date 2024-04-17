<?php
class ContaCorrente extends Conta {
    public $Limite;

    function _construct($agencia, $codigo, $dataDeCriacao, $titular, $senha, $saldo, $limite){

        parent::__construct($agencia, $codigo, $dataDeCriacao, $titular, $senha, $saldo);
        $this->Limite = $limite;
    }

    function Retirar($quantia) {
        if (($this->Saldo + $this->Limite) >= $quantia){
            parent::Retirar($quantia);
        } else {
            echo "Retirada não permitida... <br>";
            return false;
        }
        return false;
    }
}