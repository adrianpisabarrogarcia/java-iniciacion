import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio7 {

	public static void main(String[] args) {

		double cateto1= Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce el cateto 1: "));
		double cateto2= Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce el cateto 1: "));
		double hipotenusa = Math.sqrt(Math.pow(cateto1, 2)+Math.pow(cateto2, 2));
		JOptionPane.showMessageDialog(null, "La hipotenusa del triangulo es: " + hipotenusa);



	}

}
