package week5;

public class OneTimePadEncipher {
	
	public static int charToInt(char l) {
	      // Should convert a character to an integer, for example 'a' -> 0, 'b' -> 1
			l = Character.toLowerCase(l);
			return (int) l - (int) 'a';
	    }

	    public static char intToChar(int i) {
	      // Should convert an integer to a character, for example 0 -> 'a', b -> '1'
	      // it should always return lower case char
	    	return (char) (i + (int) 'a');
	    }

	    public static boolean isAlpha(char c) {
	      // You do not need to implement this method, but you may find it useful.
	    	return Character.isAlphabetic(c);
	    }

	    public static String encipher(String original, String onetimepad) {
	    	String ciphertext = "";
	    	original = original.toLowerCase();
	    	onetimepad = onetimepad.toLowerCase();
	    	for (int i = 0; i < original.length(); i++) {
	    		if (original.charAt(i) == ' ') {
	    			ciphertext += ' ';
	    		} else {
	    			int char1 = charToInt(original.charAt(i));
		    		int char2 = charToInt(onetimepad.charAt(i));
		    		int newCharNum = (char1 + char2) % 26;
		    		ciphertext += intToChar(newCharNum);
	    		}
	    	}
	    	
	    	return ciphertext;
	    }

		
	    public static void main(String[] args) {
	    	String ciphertext = encipher("IS THIS SECURE", "KEEPMEVERYVERYSAFE");
	    	System.out.print(ciphertext);
	    
	    	
	    }

}
