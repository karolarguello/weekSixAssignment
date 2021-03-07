package weekSixAssignment;

public class Card {
// Card Fields value and name
	private int value;
	private String name;
	
	public Card (int newValue, String name) {
		value = newValue;
		
		switch (newValue) {
		case 2:
			name = "Two";
			break;
		case 3:
			name = "Three";
			break;
		case 4:
			name = "four";
			break;
		case 5:
			name = "five";
			break;
		case 6:
			name = "Six";
			break;
		case 7:
			name = "Seven";
			break;
		case 8:
			name = "Eight";
			break;
		case 9:
			name = "Nine";
			break;
		case 10:
			name = "Ten";
			break;
		case 11:
			name = "Jack";
			break;
		case 12:
			name = "Queen";
			break;
		case 13:
			name = "King";
			break;
		case 14:
			name = "Ace";
			break;
		}
	}
	//Method to describe
	public String describe() {
		System.out.println("Card:" + value + "of" + "name");
		return name + "of" + value; 
		
	}
	//Getter and Setters Methods
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	



}
