package Ejercicio8;

import java.util.Arrays;
import java.util.Comparator;

public class Principal {
	
	public static void main(String args[]) {
		
		String cadenaOriginal= "It Academy";
		
		OperacionReverse operacionreverse = Principal::getReverse;
		String  cadenaRevertida = operacionreverse.reverse("It Academy");
		
		System.out.println("Cadena Original: " + cadenaOriginal);
		System.out.println("Cadena revertida: " + cadenaRevertida);
			
	}
	
	public static String getReverse(String cadena) {

        String resultado="";
        
        for (String c : cadena.split(" ")) {
        	resultado += new StringBuilder(c).reverse().toString() + " ";
        }
        
        return resultado;
	}
	
}

