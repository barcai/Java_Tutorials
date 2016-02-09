package week7;

import java.util.ArrayList;

public class Dalek3 {

	private ArrayList<String> sayings = new ArrayList<String>();
	
	public void setSayings(String[] sayings) {
		for (String saying: sayings) {
			this.sayings.add(saying);
		}
	}
	
	public void speak() {
		int len = this.sayings.size();
		if (len == 0) {
			System.out.println("No utterances installed!");
		} else {
			System.out.println(this.sayings.get((int) (Math.random() * len)));
		}
	}
	
	public void addSaying(String s) {
		this.sayings.add(s);
	}
	
	public static void main(String[] args) {

	    Dalek3 d1 = new Dalek3();
	    String[] u1 = { "Exterminate, Exterminate!", "I obey!",
	            "Exterminate, annihilate, DESTROY!", "You cannot escape.",
	            "Daleks do not feel fear.", "The Daleks must survive!" };
	    d1.setSayings(u1);

	    System.out.println("\nDalek d1 says: ");
	    for (int i = 0; i < 10; i++) {
	        d1.speak();
	    }

	    System.out.println("\nDalek d2 says: ");
	    Dalek3 d2 = new Dalek3();
	    String[] u2 = { "I obey!" };
	    d2.setSayings(u2);

	    for (int i = 0; i < 10; i++) {
	        d2.speak();
	    }

	}

}
