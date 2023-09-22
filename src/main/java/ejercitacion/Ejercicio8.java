//8) Escriba un programa que averigüe si dos arrays de N enteros del mismo
//tamaño son iguales (la comparación deberá detenerse en cuanto se detecte
//alguna diferencia entre los elementos).


package ejercitacion;

public class Ejercicio8 {
	    
	    public static boolean sonArraysIguales(int[] arr1, int[] arr2) {
	       
	        if (arr1.length != arr2.length) {
	            return false;
	        }	        
	       
	        for (int i = 0; i < arr1.length; i++) {
	            if (arr1[i] != arr2[i]) {
	                return false;
	            }
	        }	        
	      
	        return true;
}

	    public static void main(String[] args) {
	        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
	        System.out.println("¿Los arrays son iguales? " + sonArraysIguales(array1, array2)); 

	        int[] array3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	        int[] array4 = {1, 2, 3, 4, 5, 6, 7, 11, 9, 10}; 
	        System.out.println("¿Los arrays son iguales? " + sonArraysIguales(array3, array4)); 
	    }
}




