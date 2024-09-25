//5

import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {
        // NOMBRE (texto)
        Scanner scanner = new Scanner(System.in);

        System.out.println("Como te llamas?");
        String nombre = scanner.nextLine();

        // EDAD (NUMERO ENTERO)
        System.out.println("cuantos años tienes?");
        int edad = scanner.nextInt();

        // ALTURA (numero decimal)
        System.out.println("cuanto mides (en metros)?");
        float altura = scanner.nextFloat();

        scanner.close();

        System.out.println("Hola " + nombre);
        System.out.println("Tienes " + edad + " años");
        System.out.println("Mides " + altura + " metros");

    }

}
