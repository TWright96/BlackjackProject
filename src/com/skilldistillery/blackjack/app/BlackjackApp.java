package com.skilldistillery.blackjack.app;

import java.util.Scanner;
import com.skilldistillery.blackjack.entities.Dealer;
import com.skilldistillery.blackjack.entities.Player;

public class BlackjackApp {
	private Scanner scan = new Scanner(System.in);
	private Dealer dealer = new Dealer();
	private Player player = new Player();

	public static void main(String[] args) {
		BlackjackApp bja = new BlackjackApp();

		bja.run();

	}

	public void run() {

		System.out.println("PLAY BLACK JACK");
		dealCards();

		 
		if (player.playersHand().isBlackJack()) {
			System.out.println("!!!BLACK JACK YOU WIN!!! \nCOLLECT YOUR MONEY");
		} else if (dealer.playersHand().isBlackJack()) {
			System.out.println("Dealer has BLACKJACK you lose.");
		} else {

			
				System.out.println("Hit or stand?");
				String choice;
				choice = scan.nextLine();

// the player continues to get cards until they either say stand or they bust
				if (choice.equals("hit")) {
					System.out.println("Your " + player.addCardToHand(dealer.dealCard()));
					System.out.println("Your hand value: " + player.addHandNums());
					
					if (player.playersHand().isBust()) {
						System.out.println("You lose.");
					//	break;
					}

				} 
				//else {
					//if (player.playersHand().isBust()) {
						System.out.println("You lose.");
						
					//}
					
// if the player busts the game is over announce "you lose"

// when the player says stand, now the dealer starts playing the dealer cards
// the dealer must hit if their hand is less than 17 , if the dealers hand is 17+ they must stand
// neither the player or the dealer is busted compare which player is closer to 21 and announce the winner	

					 
				
						{
					System.out.println("Dealer is playing....");
					System.out.println("Dealers " + dealer.dealerLogic(dealer.playersHand()));
					System.out.println("Dealers hand value: " + dealer.addHandNums());
					if(player.playersHand().isBust()) {
						System.out.println("You lose.");
					}
					if (dealer.playersHand().isBust()) {
						System.out.println("Dealer BUST \nYou win!");
					//	break;
					}
				}

				if (player.addHandNums() > dealer.addHandNums()) {

					System.out.println("You win!");
				//	break;
				}
				if (player.addHandNums() < dealer.addHandNums()) {
					System.out.println("You lose.");
				}
				if (player.addHandNums() == dealer.addHandNums()) {
					System.out.println("PUSH!");
					//break;
				}

				if (player.playersHand().isBlackJack()) {
					System.out.println("!!!BLACK JACK YOU WIN!!! \nCOLLECT YOUR MONEY");
				}
				//break;

		}
	
		
		
		}
		
	

	public void dealCards() {
		dealer.dealerShuffle();

		System.out.println("Your " + player.addCardToHand(dealer.dealCard()));
		

		System.out.println("Dealers " + dealer.addCardToHand(dealer.dealCard()));

		System.out.println("Your " + player.addCardToHand(dealer.dealCard()));

		System.out.println("Dealers " + dealer.addCardToHand(dealer.dealCard()));

		System.out.println("Your hand value: " + player.addHandNums());
		System.out.println("Dealers hand value: " + dealer.addHandNums());
	}
		 
}
//determine winner for round


