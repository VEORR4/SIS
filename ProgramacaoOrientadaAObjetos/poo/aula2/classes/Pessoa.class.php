<?php
class Pessoa {
    public $Codigo;
    public $Nome;
    public $Altura;
    public $Idade;
    public $Nascimento;
    public $Escolaridade;
    public $Salario;

    function __construct($codigo, $nome, $altura, $idade, $nascimento, $escolaridade, $salario) {
        $this->Codigo = $codigo;
        $this->Nome = $nome;
        $this->Altura = $altura;
        $this->Idade = $idade;
        $this->Nascimento = $nascimento;
        $this->Escolaridade = $escolaridade;
        $this->Salario = $salario;
    }

    function Crescer($centimetros) {
        if ($centimetros>0){
            $this->Altura += $centimetros;
        }
    }

    function Formar($titulacao) {
        $this->Escolaridade = $titulacao;
    }

    function Envelhecer($anos) {
        if ($anos>0){
            $this->Idade += $anos;
        }
    }

    function __destruct() {
        echo "Objeto {$this->Nome} finalizando... <br>";
    }
}