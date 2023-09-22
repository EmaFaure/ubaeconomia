//6) Realizar un algoritmo que rellene un array de tamaño N con valores aleatorios
//y le pida al usuario un número a buscar en el vector. El programa mostrará
//donde se encuentra el número y si se encuentra repetido.

package ejercitacion;
import java.util.Scanner;
import java.util.Random;
public class Ejercicio6 {	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();
	        
	        System.out.print("Ingrese el tamaño del array: ");
	        int N = scanner.nextInt();	        
	        
	        int[] array = new int[N];
	        for (int i = 0; i < N; i++) {
	            array[i] = random.nextInt(100);  
	        }
	      
	        System.out.print("Ingrese un número para buscar: ");
	        int numeroBuscar = scanner.nextInt();
	       
	        int ocurrencias = 0;
	        for (int i = 0; i < N; i++) {
	            if (array[i] == numeroBuscar) {
	                ocurrencias++;
	                System.out.println("El número " + numeroBuscar + " se encuentra en la posición " + i);
	            }
	        }

	        if (ocurrencias == 0) {
	            System.out.println("El número " + numeroBuscar + " no se encuentra en el array.");
	        } else if (ocurrencias > 1) {
	            System.out.println("El número " + numeroBuscar + " está repetido en el array.");
	        }
	      
	        scanner.close();
	    }
}


