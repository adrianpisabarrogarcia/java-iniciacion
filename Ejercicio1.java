import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Utilizando la consola entrada y salida de datos
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un mensaje");
		String frase =  entrada.nextLine();
		int a = entrada.nextInt();
		System.out.println("El mensaje introducido es: "+frase+".");
		System.out.println("El numero introducido es: "+a+".");

		
		
		/*
		
		//Utilizando herencia (interfaz gráfica entrada y salida de datos
		String frase;
		frase = JOptionPane.showInputDialog(null,"Introduce un mensaje");
		JOptionPane.showMessageDialog(null, "La frase introducida es: "+ frase);
		*/

	}
}
