// 1) Escribir un programa que pida una frase y la muestre toda en mayúsculas y
//después toda en minúsculas. Nota: investigar la función toUpperCase() y
//toLowerCase() en Java.

package ejercitacion;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingresa una frase: ");
		String frase = scanner.nextLine();
		scanner.close();

		String mayusculas = frase.toUpperCase();
		System.out.println("Frase en mayúsculas: " + mayusculas);

		String minusculas = frase.toLowerCase();
		System.out.println("Frase en minúsculas: " + minusculas);

	}
}
		