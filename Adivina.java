//22

import java.util.Scanner;

public class Adivina {
    
    public static void main(String[] args) {
            
        Scanner scanner= new Scanner(System.in);
        double aleatorio = (int) (Math.random()*100) + 1;
    
        int intento =0;
            
        while (aleatorio!=intento){
    
            System.out.println("Que numero crees que es?");
            intento = scanner.nextInt();
                
            if (intento>aleatorio)
                {System.out.println("Numero es menor");}
            else if (intento<aleatorio)
                {System.out.println ("Numero es mayor");}
            else
                {System.out.println ("Enhorabuena el numero es " + intento);}
            }
            scanner.close();
        }
}
    

