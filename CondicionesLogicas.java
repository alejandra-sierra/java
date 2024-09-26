//20

import java.util.Scanner;

public class CondicionesLogicas {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("NUMERO PARA COMPROBAR");
        Float numero = scanner.nextFloat();

        if (numero % 2==0 && numero>=0)
        {System.out.println( "este numero es par y positivo");}
        else
        {System.out.println( "Este numero no es par o no es positivo");}
        
        if (numero <0 || numero % 3==0)
        {System.out.println ("El numero es divisible entre 3 o negativo");}
        else
        {System.out. println ("el numero no es negativo o no es divisible entre 3");}
        
        scanner.close();
    }
}
