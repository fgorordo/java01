package ejercicio2;

public class CalcularIVA {
    public static void main(String[] args) {
        System.out.println("El total con iva es de " + calculator(200));
    }

    public static double calculator(double n) {
        double iva = n * 0.21;
        return n + iva;
    }
}
