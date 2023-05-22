package Ejercicio1;


import java.util.ArrayList;
import java.util.List;

public class Principal {
	
	public static void main(String args[]) {
		
		List<String> listaPalabras = new ArrayList<>();
		
		listaPalabras.add("Cabaña");
		listaPalabras.add("Cacao");
		listaPalabras.add("Cadena");
		listaPalabras.add("Cafe");
		listaPalabras.add("Colegio");
		listaPalabras.add("Cintura");
		listaPalabras.add("Cerebro");
		listaPalabras.add("Cien");
		listaPalabras.add("Coleccion");
		
		//listaPalabras.forEach(lista -> System.out.println(lista));
		System.out.println("Palabra que contienen la letra O");
		System.out.println();
		listaPalabras.stream().filter(x -> x.contains("o")).forEach(lista -> System.out.println(lista));
		
	}

}
