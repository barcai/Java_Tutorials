package week3;

public class ArrayRotate {
	public static void main(String[] args) {
		int[] nums = new int[args.length];
		for (int i = 1; i < args.length; i++) {
			nums[(i-1)] = Integer.parseInt(args[i]);
		}
		nums[args.length-1] = Integer.parseInt(args[0]);
		for (int element: nums) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
}
