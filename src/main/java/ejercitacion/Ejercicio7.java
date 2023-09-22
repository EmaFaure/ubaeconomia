//7) Realizar un algoritmo que calcule la suma de todos los elementos de un array
//de tamaño N, con los valores ingresados por el usuario.


package ejercitacion;
import java.util.Scanner;
public class Ejercicio7 {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Ingrese el tamaño del array: ");
	        int N = scanner.nextInt();
	        
	        int[] array = new int[N];
	        System.out.println("Ingrese los elementos del array:");
	        for (int i = 0; i < N; i++) {
	            System.out.print("Elemento " + (i + 1) + ": ");
	            array[i] = scanner.nextInt();
	        }
	     
	        int suma = 0;
	        for (int i = 0; i < N; i++) {
	            suma += array[i];
	        }
	       
	        System.out.println("La suma de los elementos del array es: " + suma);
	        
	        scanner.close();
	    }
}


