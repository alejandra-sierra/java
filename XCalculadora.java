import javax.swing.JOptionPane;

public class XCalculadora {
    public static void main(String[] args) {
        String operacion;
        operacion = JOptionPane.showInputDialog("Que calculo quieres hacer?");
        String resultado=operacion;
        System.out.println("El resultado es "+ resultado);


    }
}
