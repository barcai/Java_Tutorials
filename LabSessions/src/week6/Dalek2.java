package week6;

public class Dalek2 {

	private String[] sayings = {};
	
	public void setSayings(String[] sayings) {
		this.sayings = sayings;
	}
	
	public void speak() {
		int len = this.sayings.length;
		if (len == 0) {
			System.out.println("No utterances installed!");
		} else {
			System.out.println(this.sayings[(int) (Math.random() * len)]);
		}
	}
	
	public static void main(String[] args) {

	    Dalek2 d1 = new Dalek2();
	    String[] u1 = { "Exterminate, Exterminate!", "I obey!",
	            "Exterminate, annihilate, DESTROY!", "You cannot escape.",
	            "Daleks do not feel fear.", "The Daleks must survive!" };
	    d1.setSayings(u1);

	    System.out.println("\nDalek d1 says: ");
	    for (int i = 0; i < 10; i++) {
	        d1.speak();
	    }

	    System.out.println("\nDalek d2 says: ");
	    Dalek2 d2 = new Dalek2();
	    String[] u2 = { "I obey!" };
	    d2.setSayings(u2);

	    for (int i = 0; i < 10; i++) {
	        d2.speak();
	    }

	}
	
}
