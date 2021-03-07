package weekSixAssignment;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private List<Card> hand = new ArrayList<>();
	private int score = 0;
	private String name;
	
	public Player (String name) {
		this.name = name;
		this.score = 0;
	}
	// Describe method
		public String describe() {
			StringBuilder playerDescribre = new StringBuilder();
			
			for (Card card:hand) {
				playerDescribre.append(card.describe());
			}
			return playerDescribre.toString();
		}
	
	// Flip method
		public Card flip () {
			return hand.remove(0);
		}
	
	// Draw method
		public void draw (Deck deck) {
			hand.add(deck.draw());
		}
	
	// incrementScore method
		public void incrementScore() {
			score++;
		}
		
		public int getScore() {
			return score;
		}
		
}
