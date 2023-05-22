package Ejercicio5;

public class Principal {
	
	public static void main(String args[]) {
		
		ValorPi valorpi = Principal::pi;
		//valorpi.getPiValue(3.1416);
		Double pi = valorpi.getPiValue(3.1416);
		System.out.println("El valor de pi es: " + pi);
		
	}
	
	public static double pi(Double p){
		return p;
	}

}
