package PastPapers;

import java.util.ArrayList;
import java.util.Arrays;

public class Rabbit {
	
	private Integer[][] r;
	private int n;
	
	public Rabbit (int n) {
		this.n = n;
		this.r = new Integer[n][];
	}
	
	public void init() {
		if (n < 2) {
			// Doing nothing perfectly
		} else {
			r[0] = new Integer[] {1};
			r[1] = new Integer[] {1, 0};
			
			for (int i = 2; i < n; i++) {
				r[i] = new Integer[r[i-1].length + r[i-2].length];
				System.arraycopy(r[i-1], 0, r[i], 0, r[i-1].length);
				System.arraycopy(r[i-2], 0, r[i], r[i-1].length, r[i-2].length);
			}
		}
	}
	
	public String toString() {
		String result = "";
		for (int i = 0; i < this.n; i++) {
			result += "[";
			for (int j = 0; j < r[i].length - 1; j++) {
				result += r[i][j] + ", ";
			}
			result += r[i][r[i].length-1] + "]\n";
		}
		
		return result;
	}
	
	public int subsequenceIndex(Integer[] yoloTarget) {
		for (int i = 0; i < n; i++) {
			if (Arrays.equals(r[i], yoloTarget)) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main (String[] args) {
		Rabbit r = new Rabbit(Integer.parseInt(args[0]));
		r.init();
		System.out.println(r);
		System.out.println(r.subsequenceIndex(new Integer[] {1,1,0}));
		System.out.println(r.subsequenceIndex(new Integer[] {1,0,1}));
	}
}
