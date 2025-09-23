package exercicio2oo.testes;

import exercicio1oo.classes.Carro;

public class TesteCarro {
    public static void main(String[] args) {
        // Instanciação da classe Carro
        Carro carro = new Carro();

        // Atribuição de valores aos atributos
        carro.marca = "Volkswagen";
        carro.modelo = "Fusca";
        carro.ano = 1970;

        // Teste dos métodos e atributos
        System.out.println("--- Testando a classe Carro ---");
        System.out.println("Marca: " + carro.marca);
        System.out.println("Modelo: " + carro.modelo);
        System.out.println("Ano: " + carro.ano);
        carro.ligar();
        carro.desligar();
        System.out.println("------------------------------\n");
    }
}