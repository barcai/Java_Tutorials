package week3;

public class Mode {
	public static void main(String[] args) {
		int[] dataset = new int[args.length];
		int[] count = new int[10];
		int highest = 0;
		
		for (int i = 0; i < args.length; i++) {
			dataset[i] = Integer.parseInt(args[i]);
			count[dataset[i]]++;
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.print("[" + i + "s: " + count[i] + "]");
			if (count[i] != 0){
				System.out.print(" ");
			}
			for (int i1 = 0; i1 < count[i]; i1++) {
				System.out.print(".");
			}
			if (count[highest] < count[i]) {
				highest = i;
			}
			System.out.println();
		}
		
		System.out.println("Mode: " + highest);
		
	}
}
