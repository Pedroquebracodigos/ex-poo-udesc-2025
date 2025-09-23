package exercicio1oo.classes;

public class TesteLivro {
    public static void main(String[] args) {
        // Instanciação da classe Livro
        Livro livro = new Livro();

        // Atribuição de valores aos atributos
        livro.titulo = "Dom Casmurro";
        livro.autor = "Machado de Assis";
        livro.anoPublicacao = 1899;

        // Teste do método e atributos
        System.out.println("--- Testando a classe Livro ---");
        livro.mostrarInfo();
        System.out.println("------------------------------\n");
    }
}