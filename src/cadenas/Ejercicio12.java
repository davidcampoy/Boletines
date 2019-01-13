package cadenas;
import java.util.Scanner;

public class Ejercicio12 {
	
	/*
	 * 1.- Pedir al usuario que introduzca dos cadenas.
	 * 2.- Contar cuantas veces aparece la segunda cadena en la primera.
	 * 3.- Mostrar el número de veces que aparece.
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String s1, s2;
		int count = 0, aid = 0;
		
		System.out.println("Introduce una cadena: ");
		s1 = scan.nextLine();
		
		System.out.println("Introduce la palabra a buscar: ");
		s2 = scan.nextLine();
		
		scan.close();
		
		for(int i = 0; i < s1.length(); i++) { // Se busca letra por letra la primera cadena hasta coincidir con la primera letra de la segunda cadena.
			
			if(s1.charAt(i) == s2.charAt(0)) { // Una vez se da la coincidencia, se comprueba que coincidan las demás letras con la segunda cadena.
				
				for(int j = 0; j < s2.length(); j++) {
					
					if(s1.charAt(i + j) == s2.charAt(j)) { // Si coincide la letra en determinada posición de la primera cadena con la de la segunda cadena, se suma 1 a la variable auxiliar.
						
						aid++;
						
					}
					
				}
				
			}
			
			if(aid == s2.length()) { // Si la variable auxiliar coincide con la longitud de la segunda cadena, eso querrá decir que la palabra coincide con la segunda cadena, con lo que se suma 1 al contador.
				count++;
			}
			
			aid = 0;
			
		}
		
		System.out.println("Coincidencias: " + count);

	}

}
