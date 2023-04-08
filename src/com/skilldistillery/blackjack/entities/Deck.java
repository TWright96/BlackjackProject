package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	List<Card> deck = new ArrayList<>();

	public Deck() {
		Rank[] ranks = Rank.values();
		Suit[] suits = Suit.values();

		for (Suit suit : suits) {
			for (Rank rank : ranks) {
				Card card = new Card(suit, rank);
				deck.add(card);
			}
		}

	}

	public List<Card> getDeck() {
		return deck;
	}

	public int checkDeckSize() {
     return deck.size();
	}

	public void shuffle() {
		Collections.shuffle(deck);
	}

	public Card dealCard() {
		Card topCard = deck.remove(0);
		return topCard;
	}
//public int cardsLeftInDeck() {
//	
//}
}
