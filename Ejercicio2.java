import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio2 {

	public static void main(String[] args) {
	
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce un número: "));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce otro número: "));
		JOptionPane.showMessageDialog(null, "La frase introducida es: " + (num1*num2));
	
	}

}
