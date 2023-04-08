package com.skilldistillery.blackjack.entities;

public class Player {

	protected BlackjackHand bjh = new BlackjackHand();

	public Player() {

	}

	public Player(BlackjackHand hand) {
		this.bjh = hand;

	}

	public BlackjackHand addCardToHand(Card playersCard) {
		bjh.addCard(playersCard);
		return bjh;

	}


	public int addHandNums() {
		return bjh.getHandValue();

	}

	public BlackjackHand playersHand() {

		return bjh;
	}

}
