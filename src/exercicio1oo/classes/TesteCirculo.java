package exercicio1oo.classes;

public class Main {
    public static void main(String[] args) {
        // Criando um círculo com raio 5
        Circulo c = new Circulo(5);

        // Exibindo as informações
        System.out.println("Raio: " + c.raio);
        System.out.println("Área: " + c.calcularArea());
        System.out.println("Perímetro: " + c.calcularPerimetro());
    }
}


