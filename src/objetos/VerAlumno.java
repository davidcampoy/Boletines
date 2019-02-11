package objetos;

import proyectos.Teclado;
import proyectos.Teclado.Compare;
import proyectos.Teclado.Range;

public class VerAlumno {

	public static void main(String[] args) {
		
		String name;
		int matr;
		double not1, not2;
		
		System.out.println("Indica el nombre: ");
		name = Teclado.readString();
		
		System.out.println("Indica el nº de matrícula: ");
		matr = Teclado.compNum(0, Compare.Mayor);
		
		Alumno alumn1 = new Alumno(name, matr);
		
		System.out.println("Indica la primera nota: ");
		not1 = Teclado.rangNum(0.0, 10.0, Range.BothIncluded);
		
		System.out.println("Indica la segunda nota: ");
		not2 = Teclado.rangNum(0.0, 10.0, Range.BothIncluded);
		
		alumn1.ponNota(not1, not2);
		
		System.out.println(alumn1.toString());

	}

}
