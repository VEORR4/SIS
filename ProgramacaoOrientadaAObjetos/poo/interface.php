<?php
#interface aluno
interface IAluno
{
    function getNome();

    function setNome($nome);
}

#classe aluno
class Aluno implements IAluno
{
    private string $nome;
    #atribui o nome do aluno
    function setNome($nome)
    {
        $this->nome = $nome;
    }
    function getNome()
    {
        return $this->nome;
    }
}
#instancia novo Aluno
$joaninha = new Aluno();
#chama métodos quaisquer
$joaninha->setNome('Joana Maranhão');
echo $joaninha->getNome();