//2) Dada una cantidad de grados centígrados se debe mostrar su equivalente en
//grados Fahrenheit utilizando un método/función que lo calcule y lo muestre por
//pantalla. La fórmula correspondiente es: F = 32 + (9 * C / 5).


package ejercitacion;
import java.util.Scanner;
public class Ejercicio2 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingresa la temperatura en grados Celsius: ");
		double celsius = scanner.nextDouble();
		scanner.close();

		double fahrenheit = convertir(celsius);
		System.out.println("La temperatura en grados Fahrenheit es: " + fahrenheit);
	}

	public static double convertir(double celsius) {

		return 32 + (9 * celsius / 5);
	}

}
