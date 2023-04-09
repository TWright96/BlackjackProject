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

	public void addCard(Card card) {
		
		hand.add(card);

	}

	public void clear() {
		hand.clear();
	}

	public abstract int getHandValue();
	

	@Override
	public String toString() {
		return "Hand: " + hand;
	}
	
	

}
