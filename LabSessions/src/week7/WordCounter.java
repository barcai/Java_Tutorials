package week7;

import java.util.HashMap;
import week4.StdDraw;

public class WordCounter {
	
	private HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();
	
	public WordCounter(String[] tokens){
		wordLengthFreq(tokens);
	}
	
	public void wordLengthFreq(String[] tokens) {
		freq.clear();
		for (String word: tokens) {
			int len = word.length();
			if (freq.get(len) != null) {
				int k = freq.get(len)+1;
				freq.put(len, k);
			} else {
				freq.put(len, 1);
			}
		}
	}
	
	public HashMap<Integer, Integer> getFreqDist(){
		return freq;
	}
	
	public int maxVal() {
		int max = 0;
        for (int i : freq.values()) {
            if (i > max) {
                max = i;
            }
        }
        return max;
	}
	
	public double[] map2array() {
		if (freq.size() == 0){
			return new double[] {};
		}
		
		int maxkey = -1;
		for (int x: freq.keySet()){
			if (maxkey < x) maxkey = x;
		}
		
		int max = maxVal();
		
		double[] data = new double[maxkey+1];
		for (int i = 0; i < data.length; i++) {
			if (freq.get(i) != null) {
				data[i] = ((double) freq.get(i))/max*100;
			} else {
				data[i] = 0;
			}
		}
		return data; 
	}
	
	public static void main(String[] args) {
		Tokenizer tokenizer = new Tokenizer("./assets/melville-moby_dick.txt");
		String[] tokens = tokenizer.getTokens();

		WordCounter wordCounter = new WordCounter(tokens);
		System.out.println(wordCounter.getFreqDist());
		double[] points = wordCounter.map2array();

		int n = points.length;
		StdDraw.clear();
		StdDraw.setXscale(0, n - 1);
		StdDraw.setYscale(0, 100);
		StdDraw.setPenRadius(0.5 / n);
		for (int i = 0; i < n; i++) {
		    StdDraw.line(i, 0, i, points[i]);
		}
	}
}
