import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio4 {

	public static void main(String[] args) {

		int d = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la diagonal menor del rombo: "));
		int D = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la diagonal mayor del rombo: "));
		JOptionPane.showMessageDialog(null, "La área de un rombo es: " + (D*d/2));

	}

}
