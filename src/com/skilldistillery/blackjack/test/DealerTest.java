package com.skilldistillery.blackjack.test;

import java.util.Scanner;

import com.skilldistillery.blackjack.entities.Card;
import com.skilldistillery.blackjack.entities.Deck;

public class DealerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DealerTest dealer = new DealerTest();
		dealer.run();

	}

	public void run() {
		Deck deck = new Deck();
		deck.shuffle();
		
		System.out.println("Current num of cards in deck: " + deck.checkDeckSize());

		Scanner scan = new Scanner(System.in);
		System.out.println("how many cards");
		int numCardsIWant = scan.nextInt();
		scan.nextLine();
		
		int sumOfCards = 0;
		for ( int cardNumDealt = 0;cardNumDealt < numCardsIWant; cardNumDealt++) {
			Card dealtCard = deck.dealCard();
			sumOfCards += dealtCard.getRank().getValue();
			System.out.println("You now have: " + dealtCard + " " + deck.checkDeckSize() + "cards left");
		}
		
		scan.close();
		
	}

}
