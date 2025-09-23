package exercicio2oo.testes;

import exercicio1oo.classes.Aluno;

public class TesteAluno {
    public static void main(String[] args) {
        // Instanciação da classe exercicio1oo.classes.Pessoa
        Aluno aluno = new Aluno();

        // Atribuição de valores aos atributos
        aluno.nome = "João da Silva";
        aluno.idade = 30;
        aluno.cpf = "123.456.789-00";

        // Teste do método e atributos
        System.out.println("--- Testando a classe exercicio1oo.classes.Pessoa ---");
        aluno.exibirDetalhes();
        System.out.println("------------------------------\n");

        // Opcional: Teste com outro objeto para garantir o funcionamento
        Aluno outraAluno = new Aluno();
        outraAluno.nome = "Maria Oliveira";
        outraAluno.idade = 25;
        outraAluno.cpf = "987.654.321-11";
        System.out.println("--- Testando outra instância de exercicio1oo.classes.Pessoa ---");
        outraAluno.exibirDetalhes();
        System.out.println("----------------------------------------\n");
    }
}