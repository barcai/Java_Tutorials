package week5;

public class NbyN {
	
	public static int[][] nbyn(int N) {
		int[][] result = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int k = 0; k < N; k++) {
				if (i == k) {
					result[i][k] = i;
				} else {
					result[i][k] = 0;
				}
			}
		}
		return result;
	}
	
	public static void main (String[] args) {
		int[][] print = nbyn(10);
		for (int i = 0; i < 10; i++) {
			for (int k = 0; k < 10; k++) {
				if (k == 9) {
					System.out.print(print[i][k] + "\n");
				} else {
					System.out.print(print[i][k] + " ");
				}
			}
		}
	}

}
