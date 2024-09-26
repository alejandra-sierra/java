//19

import java.util.Scanner;

public class Votar {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);

        System.out.print ("Cuantos años tienes?");
        int edad = scanner.nextInt();

        int legal=18;

        if (edad>=legal)
        {System.out.println("PUEDES VOTAR");}
        else
        {System.out.println ("NO POEDES VOTAR");}

        scanner.close();
    }
}
