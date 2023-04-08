package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Hand {

	public Hand() {

	}

	List<Card> hand = new ArrayList<>();

	public Hand(List<Card> hand) {
		this.hand = hand;
	}

	public void addCard() {
		Card addCard = new Card();
		hand.add(addCard);

	}

	public void clear() {
		hand.clear();
	}

	public abstract int getHandValue();
	// to get value of hand get the value of the cards in the hand list

}
