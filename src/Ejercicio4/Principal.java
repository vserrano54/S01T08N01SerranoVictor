package Ejercicio4;

import java.util.List;

public class Principal {
	
	public static void main(String args[]) {
		
		List<String> meses = List.of("Enero", "Febrero","Marzo","Abril","Mayo","Junio","Julio","Agostp","Septiembre","Octubre", "Noviembre","Diciembre");
		
		Operacion operacion = Principal::imprimir;
		operacion.realizarOperacion(meses);
			
		System.out.println();
		
	}
	
	public static void imprimir(List<String>  meses){
		System.out.println("Meses del Año");
		System.out.println();
		meses.forEach(mes -> System.out.println(mes));
	}

}
