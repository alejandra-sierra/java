//13

public class Dados {
    public static void main(String[] args) {
        
    double dado1 = (int) (Math.random()*6) + 1;
    double dado2 = (int) (Math.random()*6)+1;
    double total = dado1 + dado2;
    System.out.println("Te ha salido "+ dado1 + " y "+ dado2 + " el total es "+ total);
    }
}
