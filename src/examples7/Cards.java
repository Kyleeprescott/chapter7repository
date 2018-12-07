package examples7;

public class Cards {

	public static void main(String[] args) {
		String []suits = {"Spades","Hearts","Dimonds","Clubs"};
		String[]ranks = {"Ace","2","3","4","5","6","7",
				"8","9","10","Jack","Queen", "King"};
		
		
		int [] deck = new int[52];
		for (int i =0; i< deck.length; i++) {
			deck [i]= i;
		}
for (int i=0; i<deck.length; i++) {
	int index = (int)(Math.random()*deck.length);
	int temp = deck[i];
	deck[i] = deck[index];
	deck[index] = temp;
	
}
for (int i = 0; i<5; i++) {
	String suit = suits[deck[i]/13];
	String rank = ranks[deck[i]%13];
	System.out.println("Card Number " + deck[i] +  ":"
			+rank+ " of " + suit);
	
}
	}

}
