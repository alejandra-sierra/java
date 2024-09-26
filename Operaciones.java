//11

import java.util.Scanner;

public class Operaciones {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //ABSOLUTO

        System.out.println("de que numero quieres saber el valor absoluto?");
        double a = scanner.nextDouble();
        double absoluto = Math.abs(a);

        System.out.println("valor absoluto de " + a + " es " + absoluto);

        //EXPONENCIAL

        System.out.println("Cual es la base?");
        double b = scanner.nextDouble();
        System.out.println("Y el exponencial?");
        double c = scanner.nextDouble();
        double exponencial = Math.pow(b,c);

        System.out.println("el resultado de " +b+"^"+c+" = " + exponencial);

        //RAIZ CUADRADA

        System.out.println("de que numero quieres saber la raiz cuadrada?");
        double d = scanner.nextDouble();
        double raiz= Math.sqrt(d);

        System.out.println("raiz cuadrada de " + d + " es " + raiz);

        scanner.close();
    }

} 
