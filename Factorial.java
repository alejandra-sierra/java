//24

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("FACTORIAL");
        int principal = scanner.nextInt();

        double resultado = 1;

        for (int i=1; i<=principal; i++)
        {resultado*=i;}
        System.out.println( "El factorial de "+principal +" es "+ resultado);       
    }

}
