package week5;

public class OneTimePadDecipher {
	
	public static String decipher(String encipheredText, String onetimepad) {
		String decipherText = "";
		onetimepad = onetimepad.toLowerCase();
		for (int i = 0; i < encipheredText.length(); i++) {
    		if (encipheredText.charAt(i) == ' ') {
    			decipherText += ' ';
    		} else {
    			int char1 = OneTimePadEncipher.charToInt(encipheredText.charAt(i));
	    		int char2 = OneTimePadEncipher.charToInt(onetimepad.charAt(i));
	    		int newCharNum = (char1 - char2);
	    		if (newCharNum < 0) {
	    			newCharNum += 26;
	    		}
	    		decipherText += OneTimePadEncipher.intToChar(newCharNum % 26);
    		}
    	}
		
		return decipherText.toUpperCase();
	}
	
	public static void main (String[] args) {
		String decipherText = decipher("wconlahzgzgleuai", "YOULLNEVERREADMYONETIMEPAD");
		System.out.println(decipherText);
	}
	
}
