import java.util.Scanner;

public class ContarPalabras {

    public static void main(String[] args) {
            
        Scanner scanner= new Scanner(System.in);
        System.out.println("dame una cadena de palabras");
        String cadena=scanner.nextLine();

        int contar = 0;
        String vocales = "aeiouAeiou";
        
        for (int i =0; i<cadena.length(); i++) {
            if (vocales.indexOf(cadena.charAt(i)) != -1) {
                contar++;
            }
        }
        System.out.println("numero de vocales "+ contar);
    }
}
