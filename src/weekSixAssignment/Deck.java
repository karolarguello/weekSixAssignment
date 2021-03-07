package weekSixAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	List<Card> card = new ArrayList<Card>();
	List<String> names = Arrays.asList("Hearts", "Clubs", "Diamonds", "Spades");
	
	public Deck() {
		for (int i = 2; i <= 14; i++) {
			
			for (String name : names) {
				card.add(new Card(i, name));
			}
			
		}
		
	}		

	//Shuffle Method
	public void shuffle() {
		Collections.shuffle(card);
	}
	
	// Draw method
	public Card draw() {
		return card.remove(0);
	}
}
