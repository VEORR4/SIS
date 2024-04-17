<?php
abstract Class Conta {
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
        $this->Saldo = $saldo;

        $this->Depositar($saldo);
        $this->Cancelada = false;
    }

    function Retirar($quantia) {
        if ($quantia>0){
            $this->Saldo -= $quantia;
        }
    }

    function Depositar($quantia) {
        if ($quantia>0){
            $this->Saldo += $quantia;
        }
    }

    function ObterSaldo() {
        return $this->Saldo;
    }

    abstract function Transferir($Conta, $Valor);

    function __destruct() {
        echo "<br>
        Objeto Conta {$this->Codigo} de {$this->Titular->Nome} finalizada...
        <br>";
    }
}