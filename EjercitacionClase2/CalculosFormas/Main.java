import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class Main {
    public static void main(String[] args) {
        try {
            System.setOut(new PrintStream(System.out, true, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        Circulo circulo = new Circulo(5.0);
        Rectangulo rectangulo = new Rectangulo(4.0, 6.0);

        mostrarResultados("Círculo", circulo);
        mostrarResultados("Rectángulo", rectangulo);
    }

    private static void mostrarResultados(String forma, CalculosFormas calculosFormas) {
        System.out.println("Resultados para " + forma + ":");
        System.out.println("Área: " + calculosFormas.calcularArea());
        System.out.println("Perímetro: " + calculosFormas.calcularPerimetro());
        System.out.println();
    }
}
