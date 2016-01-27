package week4;

public class ArrayFront9 {

	public static boolean arrayFront9(int[] nums) {
		int len;
		
		if (nums.length < 4) {
			len = nums.length;
		} else {
			len = 4;
		}
		
		for (int i = 0; i < len; i++) {
			if (nums[i] == 9) {
				return true;
			}
		}
		
		return false;
	}
	
    public static void main(String[] args) {
        int N = args.length;
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(args[i]);
        }
        System.out.println(arrayFront9(nums));
    }
}
