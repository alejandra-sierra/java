//16

import java.util.Scanner;

public class Bisiesto {
    
    public static void main (String[] arg){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Año");
        int año = scanner.nextInt();

        if (año % 4==0)
        {System.out.println ("bisiesto");}
        else
        {System.out.println("No bisiesto");}

        scanner.close();
    }
}
