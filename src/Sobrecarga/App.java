package Sobrecarga;

public class App {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        int resultadoInteiro = calculadora.somar(10, 9);
        double resultadoDouble = calculadora.somar(4.0, 7.0);

        System.out.printf("Resultados: " + resultadoInteiro + " " + resultadoDouble);
    }
}
