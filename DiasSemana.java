//18

import java.util.Scanner;

public class DiasSemana {
    
    public static void main (String [] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("numero");
        int dia = scanner.nextInt();
        
        switch (dia) {
            case 1 -> System.out.println ("Lunes");
            case 2 -> System.out.println ("Martes");
            case 3 -> System.out.println ("Miercoles");
            case 4 -> System.out.println ("Jueves");
            case 5 -> System.out.println ("Viernes");
            case 6 -> System.out.println ("Sabado");
            case 7 -> System.out.println ("Domingo");
        }
    }
}
