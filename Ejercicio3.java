import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio3 {

	public static void main(String[] args) {

		int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la base de un rectándulo: "));
		int h = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la alura de un rectángulo: "));
		JOptionPane.showMessageDialog(null, "El área del rectángulo es: " + (2*b+2*h));

	}

}
