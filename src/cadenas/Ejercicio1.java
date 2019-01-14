package cadenas;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String test = "";
		
		System.out.println("Introduce una cadena: ");
		test = scan.nextLine();
		
		scan.close();
		
		// A
		System.out.println("Comprobar que la cadena sea la palabra \"True\" : " + test.matches("True"));
		
		// B
		System.out.println("Comprobar que la cadena tenga tres letras, may�sculas o min�sculas: " + test.matches("[a-z || A-Z]{3}"));
		
		// C
		System.out.println("Comprobar que la cadena tenga 5 o m�s caract�res, a excepci�n de la \"�\", la \"z\" y la \"x\" : " + test.matches("[a-z || A-Z && [^��zZxX]]{5,}"));
		
		// D
		System.out.println("Comprobar que la cadena no empiece con un n�mero: " + test.matches("\\D{1}\\w*"));
		
		// E
		System.out.println("Comprobar que la cadena tenga varios caract�res excepto la b: " + test.matches("[a-z || A-Z && [^bB]]*"));
		
		// F
		System.out.println("Comprobar que la cadena tenga un n�mero positivo m�s peque�o que 300: " + test.matches("[0-2]{0,1}\\d{0,2}"));
		
		// G
		System.out.println("Comprobar que la cadena sea un n�mero de tel�fono: " + test.matches("\\d{9}"));
		
		// H
		System.out.println("Comprobar que la cadena sea un DNI: " + test.matches("\\d{8}[a-z || A-Z]{1}")); 
		
		// I
		System.out.println("Comprobar que la cadena sea un nombre: " + test.matches("[A-Z]{1}[a-z]{2,}"));
		
		// J
		System.out.println("Comprobar que la cadena empieze en vocal y luego tenga varias consonantes o ninguna: " + test.matches("[aeiouAEIOU]{1}[a-z || A-Z && [^aeiouAEIOU]]*"));
		
		// K
		System.out.println("Comprobar que la cadena sea un correo electr�nico: " + test.matches("\\w+[@]{1}[a-z]+[.]{1}[ce]{1}[os]{1}[m]{0,1}"));

	}

}
