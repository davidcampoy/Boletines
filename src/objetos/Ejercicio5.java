package objetos;

import proyectos.Teclado;
import proyectos.Teclado.Compare;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		String model = "", result[], aid[];
		double power;
		boolean traction;
		char tract;
		int i = 1, j;
		
		result = new String[1];
		aid = new String[1];
		
		do {
			
			System.out.println("Indica el modelo: ");
			model = Teclado.readString();
			
			if(!model.equals("fin") && !model.equals("FIN")) {
				System.out.println("Indica la potencia: ");
				power = Teclado.compNum(0.0, Compare.Mayor);
				
				do {
					
					System.out.println("¿Posee tracción a las cuatro ruedas? (s/n)");
					tract = Teclado.readChar();
					
				}while(tract != 's' && tract != 'S' && tract != 'n' && tract != 'N');
				
				if(tract == 's' || tract == 'S') {
					traction = true;
				}else {
					traction = false;
				}
				
				Vehiculo model1 = new Vehiculo(model);
				
				model1.setPotencia(power);
				model1.setCRuedas(traction);
				
				if(i == 1) {
					
					result[i-1] = model1.toString();
					
					i++;
					
				}else {
					
					aid = result.clone();
					
					result = new String[i];
					
					for(j = 0; j < aid.length; j++) {
						result[j] = aid[j];
					}
					
					result[i-1] = model1.toString();
					
					i++;
					
				}
				
			}
			
		}while(!model.equals("fin") && !model.equals("FIN"));
		
		System.out.println();
		
		for(String result1 : result) {
			System.out.println(result1);
		}

	}

}
