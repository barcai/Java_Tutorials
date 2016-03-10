package week8;

import static org.junit.Assert.assertTrue;

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
		for (Video vid: inventory) {
			if (vid == video) {
				vid.returnToStore();
				return true;
			}
		}
		System.out.println("Sorry, this video did not come from this store");
		return false;
	}
	
	public void rateVideo(Video video, int rating) {
		video.addRating(rating);
	}
	
	public double getAverageRatingForVideo(Video video) {
		return video.getAverageRating();
	}
	
	public Video[] getCheckedOut() {
		int counter = 0;
		int i = 0;
		for (Video vid: inventory) {
			if (vid.isCheckedOut()) {
				counter ++;
			}
		}
		Video[] checkedOutVids = new Video[counter];
		for (Video vid: inventory) {
			if (vid.isCheckedOut()) {
				checkedOutVids[i] = vid;
				i++;
			}
		}
		return checkedOutVids;
	}
	
	public Video mostPopular() {
		double highestRating = 1;
		Video highestVid = inventory.get(0);
		for (Video vid: inventory) {
			double rating = vid.getAverageRating();
			if (rating > highestRating) {
				highestVid = vid;
				highestRating = rating;
			}
		}
		return highestVid;
	}
	
	public static void main(String[] args) {
		VideoStore videoStore = new VideoStore();
		
		videoStore.addVideo("RED");
        videoStore.addVideo("Presto");
        videoStore.addVideo("Kiwi!");
        videoStore.addVideo("Skhizein");
        
	}
}
