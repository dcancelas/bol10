package bol10_02;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Metodos {

    private int dato;
    private int select;
    Scanner sc = new Scanner(System.in);
    Random r = new Random();

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
    public int numAleatorio() {
        this.dato = r.nextInt(49)+1;
        return dato;
    }
    public int selectOpciones(String Mensaje, String select1, String select2, String select3) {
        String[] options = {select1, select2, select3};
        this.select = JOptionPane.showOptionDialog(null, Mensaje, "Adivina el número",
        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
        return select;
    }
}