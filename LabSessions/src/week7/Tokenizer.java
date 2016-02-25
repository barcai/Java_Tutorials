package week7;

import week4.In;

public class Tokenizer {
	
	private String[] tokens = {};
	
	public Tokenizer() {
	}
	
	public Tokenizer(String fname) {
		tokensFromFile(fname);
	}
	
	public void tokensFromFile(String fname) {
		In file = new In(fname);
		String data = file.readAll();
		tokenize(data);
	}
	
	public void tokenize(String str) {
		tokens = str.split("\\W+");
	}
	
	public String[] getTokens(){
		return tokens;
	}
	
	public int getNumberTokens() {
		return tokens.length;
	}
}
