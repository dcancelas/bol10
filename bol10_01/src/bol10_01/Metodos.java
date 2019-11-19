package bol10_01;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Metodos {

    private int dato;
    Scanner sc = new Scanner(System.in);

    public void mensaje(String Mensaje) {
        JOptionPane.showMessageDialog(null, Mensaje, "Adivina el número", JOptionPane.PLAIN_MESSAGE);
    }
    public void mensajeError(String ERROR) {
        JOptionPane.showMessageDialog(null, ERROR, "Adivina el número", JOptionPane.ERROR_MESSAGE);
    }
    public int pedirDatos(String Mensaje) {
        String datoString = JOptionPane.showInputDialog(null, Mensaje, "Adivina el número",
        JOptionPane.INFORMATION_MESSAGE);
        this.dato = Integer.parseInt(datoString);
        return dato;
    }
}