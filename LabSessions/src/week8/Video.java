package week8;

import java.util.ArrayList;

public class Video {
	
	private String title;
	private boolean checkedOut;
	private ArrayList<Integer> rating;
	
	public Video(String title) {
		this.title = title;
		this.checkedOut = false;
		this.rating = new ArrayList<Integer>();
	}
	
	public String getTitle() {
		return this.title;
	}

	public boolean addRating(int rating) {
		if (rating < 1 || rating > 5) {
			System.out.println(rating + " should be between 1 and 5.");
			return false;
		} else {
			this.rating.add(rating);
			return true;
		}
	}
	
	public double getAverageRating() {
		// If no rating has been added
		if (this.rating.size() == 0) {
			return 0.0;
		}
		
		int sum = 0;
		
		for (int rt : this.rating) {
			sum += rt;
		}
		return (((double) sum)/this.rating.size());
	}
	
	public boolean checkOut() {
		if (this.checkedOut) {
			System.out.println(this + " is already checked out.");
			return false;
		} else {
			this.checkedOut = true;
			return true;
		}
	}
	
	public boolean returnToStore() {
		if (!this.checkedOut) {
			System.out.println(this + " is not checked out.");
			return false;
		} else {
			this.checkedOut = false;
			return true;
		}
	}
	
	public boolean isCheckedOut() {
		return this.checkedOut;
	}
	
	@Override
	public String toString() {
		return ("Video[title=\"" + 
				this.title + 
				"\", checkedOut="+
				this.checkedOut + "]");
	}
}
