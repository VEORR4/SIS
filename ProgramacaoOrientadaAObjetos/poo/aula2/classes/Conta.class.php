<?php

Class Conta {
    public $Agencia;
    public $Codigo;
    public $DataDeCriacao;
    public $Titular;
    public $Senha;
    public $Saldo;
    public $Cancelada;

    function __construct($agencia, $codigo, $dataDeCriacao, $titular, $senha, $saldo){
        $this->Agencia = $agencia;
        $this->Codigo = $codigo;
        $this->DataDeCriacao = $dataDeCriacao;
        $this->Titular = $titular;
        $this->Senha = $senha;
        #chamada a outro metodo da Classe

        $this->Depositar($saldo);
        $this->Cancelada = false;
    }

    /*Método Retirar Diminui o Saldo em $quantia*/
    
    function Retirar($quantia){
        if ($quantia> 0){
            $this->Saldo -= $quantia;
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



 #metodo destrutor, finaliza o objeto

    function __destruct(){
        echo "<br>
        Objeto Conta {$this->Codigo} de {$this->Titular->Nome}
        finalizada...
        <br>";
        }
    }
