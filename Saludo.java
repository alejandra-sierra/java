import javax.swing.JOptionPane;

public class Saludo {
    public static void main(String[] args) {
        String nombre;
        nombre = JOptionPane.showInputDialog("Como te llamas?");
        System.out.println("Hola "+ nombre);
    }
}
