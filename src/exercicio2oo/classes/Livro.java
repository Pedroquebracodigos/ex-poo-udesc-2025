package exercicio2oo.classes;

class Livro {
    String titulo;
    String autor;
    int anoPublicacao;

    void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + anoPublicacao);
    }
}