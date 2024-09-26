//17

import java.util.Scanner;

public class SumaResta {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Que operacion quieres hacer ( suma, resta, multiplicacion o division)?");
        String operacion = scanner.nextLine();
        
        System.out.println ("¿con que numeros?");
        double numero1 = scanner.nextInt();
        double numero2 = scanner.nextInt();

        switch (operacion) {
                        case "suma" -> System.out.println(numero1+numero2);
            case "resta" -> System.out.println(numero1-numero2);
            case "division" -> System.out.println(numero1/numero2);
            case "multiplicacion" -> System.out.println(numero1*numero2);

        }

    }
}
