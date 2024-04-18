<?php

// class ContaPoupanca extends Conta
final class ContaPoupanca extends Conta {
    public $Aniversario;

    function _construct($agencia, $codigo, $dataDeCriacao, $titular, $senha, $saldo, $aniversario){
        parent::__construct($agencia, $codigo, $dataDeCriacao, $titular, $senha, $saldo);
        $this->Aniversario = $aniversario;
    }

    function Retirar($quantia) {
        if ($this->Saldo  >= $quantia){
            parent::Retirar($quantia);
        } else {
            echo "Retirada não permitida... <br>";
            return false;
        }
        return false;
    }

    function Transferir($Conta, $Valor) {
        if ($this-> Retirar($Valor)) 
        {
            $Conta->Depositar($Valor);
        }
    }
}
