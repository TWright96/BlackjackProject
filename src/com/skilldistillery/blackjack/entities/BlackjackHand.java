package com.skilldistillery.blackjack.entities;

import java.util.List;

public class BlackjackHand extends Hand {

	public BlackjackHand() {

	}

	public BlackjackHand(List<Card> hand) {
		super(hand);
	}

	@Override
	public int getHandValue() {
		int sum = 0;
		for (Card card : hand) {

			sum = card.getRank().getValue() + sum;

		}
		return sum;

	}

	public boolean isBlackJack() {
		if (getHandValue() == 21) {
			
			return true;
		}

		else {
			return false;
		}
	}

	public boolean isBust() {
		if (getHandValue() >= 22) {

			return true;
		} else {
			return false;
		}
	}

}
