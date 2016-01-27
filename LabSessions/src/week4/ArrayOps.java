package week4;

public class ArrayOps {

    public static double findMax(double[] data) {
    	double max = data[0];
    	
    	for (int i = 0; i < data.length; i++){
    		if (data[i] > max) {
    			max = data[i];
    		}
    	}
    	
    	return max;
    
    }

    public static double[] normalise(double data[]) {
    	double sum = 0;
        double[] result = new double[data.length]; 
        for (int i = 0; i < data.length; i++) {
        	result[i] = data[i];
        	sum += data[i];
        }
        for (int i = 0; i < data.length; i++) {
        	result[i] /= sum;
        }
        
        return result;
    }

    public static void normaliseInPlace(double data[]) {
    	double sum = 0;
        for (int i = 0; i < data.length; i++) {
        	sum += data[i];
        }
        for (int i = 0; i < data.length; i++) {
        	data[i] /= sum;
        }
    }

    public static double[] reverse(double[] data) {
        double[] result = new double[data.length];
        
        for (int i = 0; i < data.length; i++) {
        	result[i] = data[(data.length-1)-i];
        }
        
        return result;
    }

    public static void reverseInPlace(double[] data) {
        int l = data.length;
        for (int j = 0; j < l / 2; j++)
        {
            double temp = data[j];
            data[j] = data[l - j - 1];
            data[l - j - 1] = temp;
        }
    }

    public static void swap(double[] data1, double[] data2) {
    	for (int i = 0; i < data1.length; i++) {
    		double temp = data1[i];
    		data1[i] = data2[i];
    		data2[i] = temp;
    	}
    }

}