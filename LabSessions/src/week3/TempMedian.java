package week3;

import java.util.Arrays;

public class TempMedian {
	public static void main(String[] args) {
		int[] temps = new int[args.length];
		Double median;
		
		temps[0] = Integer.parseInt(args[0]);
		
		for (int i = 1; i < args.length; i++){
			if (args[i].equals(".")) {
				temps[i] = temps[i-1];
			} else if (args[i].equals("+")){
				temps[i] = temps[i-1] + 1;
			} else if (args[i].equals("-")){
				temps[i] = temps[i-1] - 1;
			}
		}
		
		int len = temps.length;
		
		for (int num: temps){
			System.out.print(num + " ");
		}
		System.out.println();
		
		Arrays.sort(temps);
		
		for (int num: temps){
			System.out.print(num + " ");
		}
		System.out.println();
		
		if (len % 2 == 1) {
			median = (double) temps[(len + 1)/2 - 1];
		} else {
			median = (temps[(len/2)-1] + temps[len/2]) / 2.0;
		}
		
		System.out.println(median);
		
	}
}
