
import java.util.Scanner;

public class PalabraNumero {
    public static void main(String[] args) {
        
        Scanner scanner= new Scanner(System.in);

        System.out.print("numero en texto");
        String texto= scanner.nextLine();

        try {
            int numero=Integer.parseInt(texto);
            Int resultado = (numero+10);
        } finally {
            System.out.println("la suma de "+ texto +" mas diez es igual a : "+ resultado);
        }
    scanner.close();
    }
}
