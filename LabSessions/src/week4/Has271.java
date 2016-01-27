package week4;

public class Has271 {
	
	public static boolean has271(int[] nums){
		int counter = 0;
		
		if (nums.length < 3) {
			return false;
		}
		
		while(counter < (nums.length-1)) {
			if (nums[counter] == nums[counter+1] - 5 && nums[counter+1] == nums[counter+2] +6){
				return true;
			} else {
				counter++;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(has271(new int[] { 5, 5, 5 }) + 
				"\n" +
				has271(new int[] { 1, 1, 2, 2, 2, 1 }) +
				"\n"+
				has271(new int[] { 1, 1, 2, 2, 1 }));
	}

}
