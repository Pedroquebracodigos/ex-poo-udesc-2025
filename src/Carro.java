package exercicio1oo.classes;

class Carro {
    String marca;
    String modelo;
    int ano;

    void ligar() {
        System.out.println("O carro " + marca + " " + modelo + " está ligado.");
    }

    void desligar() {
        System.out.println("O carro " + marca + " " + modelo + " está desligado.");
    }
}