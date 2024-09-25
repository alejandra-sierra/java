import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("de que numero quieres saber el valor absoluto?");
        double a = scanner.nextDouble();
        double absoluto = Math.abs(a);

        System.out.println("valor absoluto de " + a + absoluto);
    }

} 
