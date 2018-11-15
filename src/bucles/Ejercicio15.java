package bucles;
import java.util.Scanner;
import java.util.Random;

public class Ejercicio15 {
	
	/*
	 * 1.- Pedir al usuario que piense un número del 0 al 9, una vocal, o una consonante (a excepción de la ñ).
	 * 3.- El programa primero deberá adivinar si es un número, vocal o consonante. Para ello tendrá dos intentos. Si falla, el programa termina.
	 * 4.- En caso de acertar, deberá acertar, según el tipo del dato pensado por el usuario, cual es el número o dato concreto.
	 * 5.- Para los números tendrá 3 intentos, las vocales 2 intentos, y para las consonantes 5 intentos. 
	 * 6.- En el caso de las consonantes, el usuario deberá, además, indicar al programa si la consonante que ha indicado es mayor o menor a la correcta por orden alfabético.
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		String vocals = "aeiou", consonants = "bcdfghjklmnpqrstvwxyz", answer = "";
		boolean end = false;
		int rndVocal, rndCons = 0, rndNum, option, firstTries = 2, vocalTries = 2, numTries = 3, consTries = 5, minCons = 0, maxCons = consonants.length();
		
		System.out.println("Piensa un número (del 0 al 9), una vocal, o una consonante (a excepción de la ñ)...");
		System.out.println("1.- Número.\n2.- Vocal\n3.- Consonante\n");
		
		do {
			option = rand.nextInt(3 + 1 - 1)+1;
			
			System.out.printf("¿Has pensado en la opción %d?\n", option);
			
			System.out.println("si / no: ");
			answer = scan.nextLine();
			
			if(answer.equals("si")) {
				if(option == 1) {	// En caso de ser un número.
					do {
						rndNum = rand.nextInt(9);
						
						System.out.printf("¿El número es %d?\n", rndNum);
						
						System.out.println("si / no");
						answer = scan.nextLine();
												
						if(answer.equals("si")) {
							System.out.println("He ganado!");
							end = true;
							
						}else if(answer.equals("no")) {
							numTries--;
							
							if(numTries == 0) {	// Terminar el programa en caso de acabarse los intentos.
								end = true;
							}
						}
						
					}while(!end);
					
				}else if(option == 2) {	// En caso de ser una vocal.
					do {
						rndVocal = rand.nextInt(vocals.length());
						
						System.out.println("¿La vocal es " + vocals.charAt(rndVocal) + "?");
						
						System.out.println("si / no");
						answer = scan.nextLine();
						
						if(answer.equals("si")) {
							System.out.println("He ganado!");
							end = true;
							
						}else if(answer.equals("no")) {
							vocalTries--;
							
							if(vocalTries == 0) {	// Terminar el programa en caso de acabarse los intentos.
								end = true;
							}
						}
					}while(!end);
					
				}else if(option == 3) { // En caso de ser una consonante.
					do {
						if(consTries == 5) {
							rndCons = rand.nextInt(consonants.length());
							
						}else {
							rndCons = rand.nextInt(maxCons - minCons + 1) + minCons;
						}
						
						System.out.println("¿La consonante es " + consonants.charAt(rndCons) + "?");
						
						System.out.println("si / mayor / menor: ");
						answer = scan.nextLine();
						
						if(answer.equals("si")) {
							System.out.println("He ganado!");
							end = true;
							
						}else if(answer.equals("mayor")) {
							minCons = rndCons + 1;
							consTries--;
							
							if(consTries == 0) {
								end = true;
							}
						}else if(answer.equals("menor")) {
							maxCons = rndCons - 1;
							consTries--;
							
							if(consTries == 0) {
								end = true;
							}
						}
												
					}while(!end);
				}
				
			}else if(answer.equals("no")){
				firstTries--;
				
				if(firstTries == 0) { // Terminar el programa en caso de acabarse los intentos.
					end = true;
				}
			}
			
		}while(!end);
		
		scan.close();
		
		if(firstTries <=0 || numTries == 0 || vocalTries == 0 || consTries == 0) {
			System.out.println("Se me acabaron los intentos...");
		}

	}

}
