import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio6 {

	public static void main(String[] args) {

		double radio = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el radio de una circunferencia: "));
		double resultado = Math.PI * Math.pow(radio, 2);
		JOptionPane.showMessageDialog(null, "El área del radio es: " + resultado);
		


	}

}
