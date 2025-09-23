package exercicio2oo.classes;

public class Circulo {
    // Atributo com visibilidade de pacote (sem modificador de acesso explícito)
    double raio;

    // Construtor
    public Circulo(double raio) {
        this.raio = raio;
    }

    // Métodos auxiliares
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}




