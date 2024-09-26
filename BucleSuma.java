//21

import java.util.Scanner;

public class BucleSuma {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int suma = 0;

        while(suma<=1000)
            
        {System.out.println("Que numero quieres sumar?");
        int numero = scanner.nextInt();
        suma +=numero;
            
        if (suma>1000)
            {System.out.println("Se ha pasado de 1000");}
            else
            {System.out.println("el resutado es "+ suma);}
        }
    
    }
    
}


