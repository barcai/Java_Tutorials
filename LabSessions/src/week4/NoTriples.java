package week4;

public class NoTriples {
	
	public static boolean noTriples(int[] nums){
		int counter = 0;
		
		if (nums.length < 3) {
			return true;
		}
		
		while(counter < (nums.length-1)) {
			if (nums[counter] == nums[counter+1] && nums[counter] == nums[counter+2]){
				return false;
			} else {
				counter++;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(noTriples(new int[] { 5, 5, 5 }) + 
				"\n" +
				noTriples(new int[] { 1, 1, 2, 2, 2, 1 }) +
				"\n"+
				noTriples(new int[] { 1, 1, 2, 2, 1 }));
	}
}
