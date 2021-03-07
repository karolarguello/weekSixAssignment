package weekSixAssignment;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Instantiate a Deck and Two Players, call shuffle method on the Deck
		Deck deck = new Deck();
		Player player1 = new Player ("Karol");
		Player player2 = new Player("Matilda");
		deck.shuffle();
		
		// For Loop to call Draw method
		for (int i = 0; i <52; i++) {
			if (i % 2 == 0) {
				player1.draw(deck);
			} else {
				player2.draw(deck);
			}
		}
		// For Loop 26 to Flip for each method

		for (int i = 0; i < 26; i++) {
			Card Karol = player1.flip();
			Card Matilda = player2.flip();
			if (Karol.getValue() > Matilda.getValue()) {
				player1.incrementScore();
			} else if (Karol.getValue() < Matilda.getValue()) {
				player2.incrementScore();
			}
		}
		// Compare final Score
		System.out.println("Final Score: ");
		System.out.println("Karol's final score :" + " " + player1.getScore());
		System.out.println("Matilda's final score :" + " " + player2.getScore());
		
		if (player1.getScore() > player2.getScore()) {
			System.out.println("Karol wins WAR!");
		} else if (player1.getScore() < player2.getScore()) {
			System.out.println("MatildA wins WAR!");
		} else {
			System.out.println("DARW!");
			
		}
		
}
}
