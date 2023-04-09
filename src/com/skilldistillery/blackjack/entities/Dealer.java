package com.skilldistillery.blackjack.entities;



public class Dealer extends Player {

	
	private Deck deck1 = new Deck();

	public Dealer() {

	}

	public Dealer(BlackjackHand hand) {
		super(hand);
	}

	public void dealerShuffle() {
		
		deck1.shuffle();
	}
public BlackjackHand dealerLogic(Hand hand) {
	while (hand.getHandValue() < 17) {
		System.out.println("Dealer will hit.");
	hand.addCard(dealCard());
	return bjh;
		
	}
	
	if (hand.getHandValue() >= 17 ) {
		System.out.println("Dealer will stand.");
	}
	return bjh;
	
	
		
	}


	public Card dealCard() {

		return deck1.dealCard();

	}
	
	

	
}
	
	
	


