package week6;

public class DNAStrand {

	private String dna;
	
	public DNAStrand(String dna) {
		this.dna = dna;
	}
	
	public boolean isValidDNA() {
		if (this.dna.length() == 0) return false;
		char[] dnaArray = this.dna.toCharArray();
		for (int i = 0; i < this.dna.length(); i++) {
			if ("ATGC".contains(Character.toString(dnaArray[i])) == false) {
				return false;
			}
		}
		return true;
	}
	
	public String complementWC() {
		char[] original = this.dna.toCharArray();
		String complement = "";
		for (char strand: original) {
			if (strand == 'A') {
				complement += "T";
			} else if (strand == 'T') {
				complement += "A";
			} else if (strand == 'G') {
				complement += "C";
			} else if (strand == 'C') {
				complement += "G";
			}
		}
		return complement;
	}
	
	public String palindromeWC() {
		char[] complement = complementWC().toCharArray();
		String palindrome = "";
		for (int i = 0; i < complement.length; i++) {
			palindrome += complement[(complement.length - i - 1)];
		}
		String result = palindrome.toString();
		return result;
	}
	
	public boolean containsSequence(String seq) {
		return this.dna.contains(seq);
	}
	
	public String toString() {
		return this.dna;
	}
	
	public static void main(String[] args) {
		System.out.println(new DNAStrand("AGTC").palindromeWC());
	}
	
}
