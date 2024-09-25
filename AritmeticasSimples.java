//7

import java.util.Scanner;

public class AritmeticasSimples {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Que operacion quieres hacer?");
        float operacion = scanner.nextFloat();

        System.out.println("el resustado es " + operacion);

        scanner.close();
    }
}
