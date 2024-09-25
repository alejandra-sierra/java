//3

public class IntercambioDeVariables {
    public static void main(String[] args) {
        int h = 5;
        int j = 30;
        System.out.println(h + j - h);
        System.out.println(j + h - j);

        // con tercera variable
        String a = "flor";
        String b = "petalo";
        String temp;
        temp = a;
        a = b;
        b = temp;

        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

}
