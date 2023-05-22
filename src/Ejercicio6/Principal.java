package Ejercicio6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Principal {
	
	public static void main(String args[]) {
		
		List<Object> lista = new ArrayList<>();
		
		lista.add("Barcelona");
		lista.add(14);
		lista.add("Victor");
		lista.add("Eduardo");
		lista.add(12);
		lista.add("Serrano");
		lista.add("Melgara");
		lista.add(1978);
		lista.add("Sant Martí");
		
		Collections.sort(lista, Comparator.comparing(l -> l.toString().length()));
		
		System.out.println("Lista ordenada: " + lista);
	}
	
	
	

}
