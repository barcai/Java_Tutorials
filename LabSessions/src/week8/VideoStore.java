package week8;

import java.util.ArrayList;

public class VideoStore {
	
	private ArrayList<Video> inventory = new ArrayList<Video>();
	
	public boolean addVideo(String title) {
		for (Video vid: inventory){
			if (vid.getTitle().equals(title)) {
				System.out.println(title + " is already in stock.");
				return false;
			}
		}
		inventory.add(new Video(title));
		return true;
	}
	
	public Video getVideo(String title) {
		for (Video vid: inventory){
			if (vid.getTitle().equals(title)) {
				return vid;
			}
		}
		System.out.println("Sorry, cannot find the requested video in the catalogue");
		return null;
	}
	
	public boolean checkOutVideo(String title) {
		for (Video vid: inventory){
			if (vid.getTitle().equals(title)) {
				if (!vid.isCheckedOut()) {
					vid.checkOut();
					return true;
				} else {
					vid.checkOut();
					return false;
				}
			}
		}
		System.out.println("Sorry, cannot find the requested video in the catalogue");
		return false;
	}
	
	public boolean returnVideo(Video video) {
		return video.returnToStore();
	}
	
	public void rateVideo(Video video, int rating) {
		video.addRating(rating);
	}
	
	public double getAverageRatingForVideo(Video video) {
		return video.getAverageRating();
	}
	
	public Video[] getCheckedOut() {
		int counter = 0;
		for (Video vid: inventory) {
			if (vid.isCheckedOut()) {
				counter +=1;
			}
		}
		Video[] checkedOutVids = new Video[counter];
		counter = 0;
		for (Video vid: inventory) {
			if (vid.isCheckedOut()) {
				checkedOutVids[counter] = vid;
				counter +=1;
			}
		}
		return checkedOutVids;
	}
	
	public Video mostPopular() {
		double highestRating = 1;
		Video highestVid = null;
		for (Video vid: inventory) {
			if (vid.getAverageRating() > highestRating) {
				highestVid = vid;
			}
		}
		return highestVid;
	}
}
