package arrays;

public class Ejercicio12 {

	public static void main(String[] args) {
		
		int nums[] = {5, 4, 2, 8, 7, 6}, aid, count = 0;
		boolean arranged = false;
		int i, j, k;
		
		for(i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		
		System.out.println();
		
		do {
			count = 0;
			
			for(i = 0, j = 1; j < nums.length; i++, j++) {
				
				if(nums[i] > nums[j]) {
					aid = nums[i];
					nums[i] = nums[j];
					nums[j] = aid;
					
					for(k = 0; k < nums.length; k++) {
						System.out.print(nums[k] + " ");
					}
					
					System.out.println();
					
				}else {
					count++;
				}
				
			}
			
			if(count == nums.length - 1) {
				arranged = true;
			}
			
		}while(!arranged);

	}

}
