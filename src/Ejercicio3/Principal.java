package Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	
	public static void main(String args[]) {
		
		List<String> meses = new ArrayList<>();
		
		meses.add("Enero");
		meses.add("Febrero");
		meses.add("Marzo");
		meses.add("Abril");
		meses.add("Mayo");
		meses.add("Junio");
		meses.add("Julio");
		meses.add("Agosto");
		meses.add("Septiembre");
		meses.add("Octubre");
		meses.add("Noviembre");
		meses.add("Diciembre");
		
		System.out.println();
		System.out.println("Meses del Año");
		System.out.println();
		meses.forEach(mes -> System.out.println(mes));
		
	
	}

}
