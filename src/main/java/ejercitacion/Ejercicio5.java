//5) Realizar un programa que pida dos números enteros positivos por teclado y
//muestre por pantalla el siguiente menú:
//MENU
//1. Sumar
//2. Restar
//3. Multiplicar
//4. Dividir
//5. Salir
//El usuario deberá elegir una opción y el programa deberá mostrar el resultado
//por pantalla y luego volver al menú. El programa deberá ejecutarse hasta que
//se elija la opción 5. Tener en cuenta que, si el usuario selecciona la opción 5,
//en vez de salir del programa directamente, se debe mostrar el siguiente
//mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)? Si
//el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se
//vuelve a mostrar el menú.
//Nota: Para resolver este ejercicio se recomienda crear una función para cada
//opción.

package ejercitacion;

import java.util.Scanner;

public class Ejercicio5 {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int num1, num2;
		char choice;

		do {
			displayMenu();
			System.out.print("Elija una opción: ");
			choice = scanner.next().charAt(0);
			

			switch (choice) {
			case '1':
				num1 = getNumber("Ingrese el primer número: ");
				num2 = getNumber("Ingrese el segundo número: ");
				System.out.println("El resultado es: " + sumar(num1, num2));
				break;

			case '2':
				num1 = getNumber("Ingrese el primer número: ");
				num2 = getNumber("Ingrese el segundo número: ");
				System.out.println("El resultado es: " + restar(num1, num2));
				break;

			case '3':
				num1 = getNumber("Ingrese el primer número: ");
				num2 = getNumber("Ingrese el segundo número: ");
				System.out.println("El resultado es: " + multiplicar(num1, num2));
				break;

			case '4':
				num1 = getNumber("Ingrese el primer número: ");
				num2 = getNumber("Ingrese el segundo número: ");
				System.out.println("El resultado es: " + dividir(num1, num2));
				break;

			case '5':
				char confirmExit = confirmarSalida();
				if (confirmExit == 'S' || confirmExit == 's') {
					System.out.println("¡Hasta luego!");
					return;
				}
				break;

			default:
				System.out.println("Opción no válida. Intente de nuevo.");
				break;
			}
		} while (true);
	}

	private static void displayMenu() {
		System.out.println("MENU");
		System.out.println("1. Sumar");
		System.out.println("2. Restar");
		System.out.println("3. Multiplicar");
		System.out.println("4. Dividir");
		System.out.println("5. Salir");
	}

	private static int getNumber(String message) {
		System.out.print(message);
		return scanner.nextInt();
	}

	private static int sumar(int num1, int num2) {
		return num1 + num2;
	}

	private static int restar(int num1, int num2) {
		return num1 - num2;
	}

	private static int multiplicar(int num1, int num2) {
		return num1 * num2;
	}

	private static double dividir(int num1, int num2) {
		if (num2 != 0) {
			return (double) num1 / num2;
		} else {
			System.out.println("No es posible dividir por cero.");
			return Double.NaN;
		}
	}

	private static char confirmarSalida() {
		System.out.print("¿Está seguro que desea salir del programa (S/N)? ");
		return scanner.next().charAt(0);
	}
}



