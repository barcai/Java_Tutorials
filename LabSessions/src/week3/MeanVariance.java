package week3;

public class MeanVariance {
	public static void main(String[] args) {
		Double[] nums = new Double[args.length];
		Double average;
		Double sum = 0.0;
		Double variance_sum = 0.0;
		Double variance;
		
		for(int i = 0; i < args.length; i++){
			nums[i] = Double.parseDouble(args[i]);
			sum += nums[i];
		}
		average = sum/nums.length;
		for (int i = 0; i < nums.length; i++){
			variance_sum += Math.pow((nums[i]-average), 2);
		}
		variance = variance_sum/nums.length;
		System.out.println(average);
		System.out.println(variance);
	}
}
