//15

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println ("Numero par o impar?");
        int numero = scanner.nextInt();

        if (numero % 2==0){
        System.out.println ("Par");}
            else
        {System.out.println ("Impar");}

        scanner.close();
    }
}
