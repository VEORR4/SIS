<?php

Class Pessoa{
    public  $Codigo;
    public  $Nome;
    public  $Altura;
    public  $Idade;
    public  $Nascimento;
    public  $Escolaridade;
    public  $Salario;

    function __construct($codigo, $nome, $altura, $idade, $nascimento, $escolaridade, $salario){
        $this->Codigo = $codigo;
        $this->Nome = $nome;
        $this->Altura = $altura;
        $this->Idade = $idade;
        $this->Nascimento = $nascimento;
        $this->Escolaridade = $escolaridade;
        $this->Salario = $salario;
        
    }
     
    /*Metodo Crescer aumenta a altura em $centimetros*/
    function Crescer($centimetros){
        if ($centimetros>0){
            $this->Altura += $centimetros;
        }
    }

    /*Método Formar altera a escolaridade para $*titulacao*/
    function Formar($titulacao) {
        $this->Escolaridade = $titulacao;
    }

    /*
    Método Envelhecer Aumenta a idade em $Anos*/
    
    function Envelhecer($anos){
        if ($anos>0){
            $this->Idade += $anos;
        }
    }
}