package com.skilldistillery.blackjack.entities;

public class Dealer extends Player {

	private Deck deck1 = new Deck();

	public Deck getDeck1() {
		return deck1;
	}

	public void setDeck1(Deck deck1) {
		this.deck1 = deck1;
	}

	public Dealer() {

	}

	public void dealerShuffle() {
		deck1.shuffle();
	}

	public BlackjackHand dealerLogic() {
		while (bjh.getHandValue() < 17) {
			bjh.addCard(dealCard());
			System.out.println("Dealer will hit.");
		}
		return bjh;
	}

	public Card dealCard() {
		return deck1.dealCard();
	}

}
