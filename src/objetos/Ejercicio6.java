package objetos;

import proyectos.Teclado;
import proyectos.Teclado.Compare;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		Dimensiones paquetes[] = new Dimensiones[2];
		
		float x, y, z;
		int i;
		
		for(i = 0; i < 2; i++) {
			
			System.out.printf("Paquete %d:\n", i+1);
			
			System.out.println("Indica la dimensión X: ");
			x = Teclado.compNum(0f, Compare.Mayor_o_igual);
			
			System.out.println("Indica la dimensión Y: ");
			y = Teclado.compNum(0f, Compare.Mayor_o_igual);
			
			System.out.println("Indica la dimensión Z: ");
			z = Teclado.compNum(0f, Compare.Mayor_o_igual);
			
			paquetes[i] = new Dimensiones(x, y, z);
			
		}
		
		System.out.println();
		
		for(i = 0; i < 2; i++) {
			System.out.printf("Paquete %d:\n", i+1);
			System.out.println(paquetes[i].toString());;
		}
		
		System.out.println("\nSoluciones: ");
		System.out.println(paquetes[0].apilarPaquetes(paquetes[1], 10));

	}

}
