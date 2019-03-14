package proyecto3;

import proyectos.Teclado;
import proyectos.Teclado.Compare;
import proyectos.Teclado.Range;

public class Mosaico {
	
	private String figuras[];
	private int filas, columnas;
	private Color color;
	private int altura;
	
//	public Mosaico(int filas, int columnas, Color color, int altura) {
//		this.filas = filas;
//		this.columnas = columnas;
//		this.color = color;
//		this.altura = altura;
//	}
	
	void manual() {
		
		int numFiguras, altura;
		
		System.out.println("¿Cuántas figuras desea usar?: (Máx 5)");
		numFiguras = Teclado.rangNum(1, 5, Range.BothIncluded);
		
		figuras = new String[numFiguras];
		
		do {
			
			System.out.println("Indica la altura que tendrán las figuras: (La altura debe ser impar y como mínimo 7)");
			altura = Teclado.compNum(7, Compare.Mayor_o_igual);
			
		}while(altura % 2 == 0);
		
		System.out.println("Indica las filas del mosaico: ");
		filas = Teclado.compNum(4, Compare.Mayor_o_igual);
		
		System.out.println("Indica las columnas del mosaico: ");
		columnas = Teclado.compNum(4, Compare.Mayor_o_igual);
		
	}
	
	void automatico() {
		
		
		
	}

}
