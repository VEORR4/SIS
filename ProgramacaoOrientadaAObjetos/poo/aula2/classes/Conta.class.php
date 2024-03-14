<?php

Class Conta {
    public $Agencia;
    public $Codigo;
    public $DataDeCriacao;
    public $Titular;
    public $Senha;
    public $Saldo;
    public $Cancelada;

    /*Método Retirar Diminui o Saldo em $quantia*/
    
    function Retirar($quantia){
        if ($quantia> 0){
            $this->Saldo -= $quantia
        }
    }

    /*Método Depositar aumenta o Saldo em $quantia*/

    function Depositar($quantia){
        if ($quantia> 0){
            $this->Saldo += $quantia;
        }
    }


    /*Método ObterSaldo retorna o saldo atual*/

    function ObterSaldo(){
        return $this->Saldo;
    }

}