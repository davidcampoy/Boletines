package proyecto3;

import proyectos.Teclado;
import proyectos.Teclado.Range;

public class Menu {
	
	Mosaico mosaico = new Mosaico();
	
	public void mostrarMenu() {
		
		int select;
		boolean exit = false;
		
		do {
			
			System.out.println("Menu del mosaico\n\t1.-Crear mosaico\n\t2.-Mostrar mosaico\n\t3.-Clonar mosaico\n\t4.-Salir");
			select = Teclado.rangNum(1, 4, Range.BothIncluded);
			
			if(select == 1) {
				
				crearMosaico();
				
			}else if(select == 2) {
				
				mostrarMosaico();
				
			}else if(select == 3) {
				
				clonarMosaico();
				
			}else {
				
				exit = true;
				
			}
			
		}while(!exit);
		
	}
	
	private void crearMosaico() {
		
		int mode;
		
		System.out.println("Elige cómo deseas hacer el mosaico: \n\t1.-Modo manual\n\t2.-Modo automático");
		mode = Teclado.rangNum(1, 2, Range.BothIncluded);
		
		if(mode == 1) {
			mosaico.manual();
		}else {
			mosaico.automatico();
		}
		
	}
	
	private void mostrarMosaico() {
		
		
		
	}
	
	private void clonarMosaico() {
		
		
		
	}

}
