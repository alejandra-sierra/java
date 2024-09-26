//8

import java.util.Scanner;

public class RadioCirculo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Cual es el radio del circulo?");
        int a = scanner.nextInt();

        double resultado = 3.14 * a * a;
        System.out.println("El area del circulo es " + resultado);

        scanner.close();
    }
       

}
