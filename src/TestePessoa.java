package exercicio1oo.testes;

import exercicio1oo.classes.Pessoa;

public class TestePessoa {
    public static void main(String[] args) {
        // Instanciação da classe Pessoa
        Pessoa pessoa = new Pessoa();

        // Atribuição de valores aos atributos
        pessoa.nome = "João da Silva";
        pessoa.idade = 30;
        pessoa.cpf = "123.456.789-00";

        // Teste do método e atributos
        System.out.println("--- Testando a classe Pessoa ---");
        pessoa.exibirDetalhes();
        System.out.println("------------------------------\n");

        // Opcional: Teste com outro objeto para garantir o funcionamento
        Pessoa outraPessoa = new Pessoa();
        outraPessoa.nome = "Maria Oliveira";
        outraPessoa.idade = 25;
        outraPessoa.cpf = "987.654.321-11";
        System.out.println("--- Testando outra instância de Pessoa ---");
        outraPessoa.exibirDetalhes();
        System.out.println("----------------------------------------\n");
    }
}