package week3;

public class Sieve {
	public static void main(String[] args) {
		int limit = Integer.parseInt(args[0]);
		int[] nums = new int[limit - 1];
		
		for (int i = 2; i <= limit; i++){
			nums[i-2] = i;
		}
		
		int p = 2;
		System.out.print(p);
		
		while (p <= limit) {
			System.out.print(" ");
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] % p == 0) {
					nums[i] = 0;
				}
			}
			int a = 0;
			while (a < nums.length && nums[a] == 0) {
				a++;
			}
			if (a != nums.length) {
				p = nums[a];
				System.out.print(p);
				
			} else {
				p = limit + 1;
			}
		}
		
		System.out.println();
		
	}
}
