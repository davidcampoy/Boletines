package objetos;

import objetos.Alimento.cantidad;
import proyectos.Teclado;
import proyectos.Teclado.Range;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		String nombre, origenAnimal;
		char vitaminas, minerales;
		int lipidos, hidratosCarbono, proteinas;
		int i, option;
		
		Alimento food[] = new Alimento[2];
 		
		for(i = 0; i < 2; i++) {
			
			System.out.println("Indica el nombre del alimento: ");
			nombre = Teclado.readString();
			
			System.out.println("Indica el porcentaje de lípidos: ");
			lipidos = Teclado.rangNum(0, 100, Range.BothIncluded);
			
			System.out.println("Indica el porcentaje de hidratos de carbono: ");
			hidratosCarbono = Teclado.rangNum(0, 100, Range.BothIncluded);
			
			System.out.println("Indica el porcentaje de proteinas: ");
			proteinas = Teclado.rangNum(0, 100, Range.BothIncluded);
			
			System.out.println("¿Es de origen animal? (1.-Si\t2.-No) ");
			option = Teclado.rangNum(1, 2, Range.BothIncluded);
			
			if(option == 1) {
				origenAnimal = "Si";
			}else {
				origenAnimal = "No";
			}
			
			System.out.println("Indica la cantidad de vitaminas que posee: (1.-ALTO 2.-MEDIO 3.-BAJO)");
			option = Teclado.rangNum(1, 3, Range.BothIncluded);
			
			if(option == 1) {
				
				vitaminas = cantidad.ALTO.getCantidad();
				
			}else if(option == 2){
				
				vitaminas = cantidad.MEDIO.getCantidad();
				
			}else {
				
				vitaminas = cantidad.BAJO.getCantidad();
				
			}
			
			System.out.println("Indica la cantidad de minerales que posee: (1.-ALTO 2.-MEDIO 3.-BAJO)");
			option = Teclado.rangNum(1, 3, Range.BothIncluded);
			
			if(option == 1) {
				
				minerales = cantidad.ALTO.getCantidad();
				
			}else if(option == 2){
				
				minerales = cantidad.MEDIO.getCantidad();
				
			}else {
				
				minerales = cantidad.BAJO.getCantidad();
				
			}
			
			if(i == 1) {
				
				food[i] = new Alimento(nombre, lipidos, hidratosCarbono, proteinas, origenAnimal, vitaminas, minerales);
				
			}else {
				
				food[i] = new Alimento(nombre);
				
				food[i].setLipidos(lipidos);
				food[i].setHidratosCarbono(hidratosCarbono);
				food[i].setProteinas(proteinas);
				food[i].setOrigenAnimal(origenAnimal);
				food[i].setVitaminas(vitaminas);
				food[i].setMinerales(minerales);
				
			}
			
		}
		
		for(i = 0; i < 2; i++) {
			
			System.out.println(food[i].toString());
			
			System.out.printf("Contenido energético: %.2f kcal/g\n", food[i].calculaContenidoEnergetico());
			
			if(food[i].esDietetico() == true) {
				System.out.println("Es dietético.");
			}else {
				System.out.println("No es dietético.");
			}
			
			if(food[i].esRecomendableParaDeportistas() == true) {
				System.out.println("Alimento recomendado para deportistas.");
			}else {
				System.out.println("No se recomienda este alimento a deportistas.");
			}
			
			System.out.println();
			
		}

	}

}
