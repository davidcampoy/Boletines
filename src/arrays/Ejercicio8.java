package arrays;

import java.util.Arrays;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		int nums1[][][] = {{{8,5,6}, {4,2,8}}, {{7,3,5}, {2,2,3}}};
		int nums2[][][] = new int[3][3][4];
		int i, j, k;
		
		for(i = 0; i < 3; i++) {			
			for(j = 0; j < 3; j++) {		
				for(k = 0; k < 4; k++) {	
					
					nums2[i][j][k] = 0;
					
				}
			}
		}
		
		System.out.println("\t\tAntes de copiar los valores");
		
		System.out.println("Primer array");
		
		for(i = 0; i < 2; i++) {			
			System.out.println("Tabla " + (i + 1));
			
			for(j = 0; j < 2; j++) {		
				
				for(k = 0; k < 3; k++) {	
					
					System.out.print(nums1[i][j][k]);
					System.out.print("  ");
					
				}
				
				System.out.println();
			}
			
			System.out.println();			
		}
		
		System.out.println("Segundo array");
		
		for(i = 0; i < 3; i++) {			
			System.out.println("Tabla " + (i + 1));
			
			for(j = 0; j < 3; j++) {		
				
				for(k = 0; k < 4; k++) {	
					
					System.out.print(nums2[i][j][k]);
					System.out.print("  ");
					
				}
				
				System.out.println();
			}
			
			System.out.println();			
		}
		
		for(i = 0; i < 2; i++) {			
			System.out.println("Tabla " + (i + 1));
			
			for(j = 0; j < 2; j++) {		
				
				for(k = 0; k < 3; k++) {	
					
					nums2[i][j][k] = nums1[i][j][k];
				}
			}		
		}
		
		System.out.println("\t\tDespués de copiar los valores");
		
		System.out.println("Primer array");
		
		for(i = 0; i < 2; i++) {			
			System.out.println("Tabla " + (i + 1));
			
			for(j = 0; j < 2; j++) {		
				
				for(k = 0; k < 3; k++) {	
					
					System.out.print(nums1[i][j][k]);
					System.out.print("  ");
					
				}
				
				System.out.println();
			}
			
			System.out.println();			
		}
		
		System.out.println("Segundo array");
		
		for(i = 0; i < 3; i++) {			
			System.out.println("Tabla " + (i + 1));
			
			for(j = 0; j < 3; j++) {		
				
				for(k = 0; k < 4; k++) {	
					
					System.out.print(nums2[i][j][k]);
					System.out.print("  ");
					
				}
				
				System.out.println();
			}
			
			System.out.println();			
		}

	}

}
