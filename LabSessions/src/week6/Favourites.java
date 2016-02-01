package week6;

public class Favourites {
	
	private static final int numberOfTracks = 5;
	
	private int count = 0;
	private MusicTrack[] favs = new MusicTrack[5];
	
	public void addTrack(String artist, String title) {
		if (count < numberOfTracks) {
			this.favs[count] = new MusicTrack(artist, title);
			count++;
		} else {
			System.out.println("Sorry, can't add: " + new MusicTrack(artist, title));
			System.out.println();
		}
	}
	
	public void showFavourites() {
		for (MusicTrack track : favs) {
			if (track != null) {
				System.out.println(track);
			}
		}
	}
	
	public static void main(String[] args) {
		Favourites favourites = new Favourites();
		favourites.addTrack("Fun", "Some Nights");
		favourites.addTrack("Oliver Tank", "Help You Breathe");
		favourites.addTrack("Horse Feathers", "Fit Against the Country");
		favourites.addTrack("Emile Sande", "Country House");
		favourites.addTrack("Fun", "Walking the Dog");
		favourites.addTrack("Porcelain Raft", "Put Me To Sleep");
		favourites.showFavourites();
	}

}
