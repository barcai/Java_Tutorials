package week7;

public class NoughtsAndCrosses {
	
	private int[][] board;
	
	public NoughtsAndCrosses(int[][] board) {
		this.board = board;
	}
	
	 public boolean isDraw() {
		 // Checking for vertical and horizontal winning states
		 // with the for loop
		 for (int i = 0; i < 3; i++) {
			 if (this.board[i][0] == this.board[i][1] && 
					 this.board[i][0] == this.board[i][2] &&
					 this.board[i][0] != 0) {
				 return false;
			 }
			 if (this.board[0][i] == this.board[1][i] && 
					 this.board[0][i] == this.board[2][i] &&
					 this.board[0][i] != 0) {
				 return false;
			 }
		 }
		 // Checking for cross winning states
		 if (this.board[0][0] == this.board[1][1] && 
				 this.board[0][0] == this.board[2][2] &&
				 this.board[1][1] != 0) {
			 return false;
		 } else if (this.board[0][2] == this.board[1][1] && 
				 this.board[0][2] == this.board[2][0] &&
				 this.board[1][1] != 0) {
			 return false;
		 } else {
			 return true;
		 }
	 }
	 
	 public int whoWon() {
		 for (int i = 0; i < 3; i++) {
			 if (this.board[i][0] == this.board[i][1] && 
					 this.board[i][0] == this.board[i][2] &&
					 this.board[i][0] != 0) {
				 return this.board[i][0];
			 }
			 if (this.board[0][i] == this.board[1][i] && 
					 this.board[0][i] == this.board[2][i] &&
					 this.board[0][i] != 0) {
				 return this.board[0][i];
			 }
		 }
		 // Checking for cross winning states
		 if (this.board[0][0] == this.board[1][1] && 
				 this.board[0][0] == this.board[2][2] &&
				 this.board[1][1] != 0) {
			 return this.board[1][1];
		 } else if (this.board[0][2] == this.board[1][1] && 
				 this.board[0][2] == this.board[2][0] &&
				 this.board[1][1] != 0) {
			 return this.board[1][1];
		 } else {
			 return 0;
		 }
	 }
	 
	 public static void main(String[] args) {
		 int[][] board = { { 2, 1, 1 },
                 		   { 0, 1, 2 },
                 		   { 1, 0, 2 }, };

		 NoughtsAndCrosses nc = new NoughtsAndCrosses(board);

		 System.out.println(nc.isDraw()); // false
		 System.out.println(nc.whoWon()); // NOUGHTS
	 }
}
