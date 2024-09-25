//6

import java.util.Scanner;

public class SumaNumeros {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("que numeros quieres sumar?");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a + b);

        scanner.close();

    }
}
