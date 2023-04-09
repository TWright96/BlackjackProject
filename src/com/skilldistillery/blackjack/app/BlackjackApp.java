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
		String response;
		
		System.out.println("PLAY BLACK JACK");
		do {
		dealCards();
		playersOptions();
		if (!player.playersHand().isBlackJack()) {
			if(!dealer.playersHand().isBlackJack()) {
			if (!player.playersHand().isBust()) {
				dealerPlaying();
			 }
			}
		}
		if (!dealer.playersHand().isBust() && !player.playersHand().isBust()) {
			announceWinner();
		}
		System.out.println("\nAnother round?");
		response = scan.nextLine();
		
		if(response.equals("no")) {
			System.out.println("\nThanks for playing. If you or someone you know has a \ngambling addiction please call 1-800-GET-HELP.");
			break;
		}
		if (response.equals("yes")) {
			player.playersHand().clear();
			dealer.playersHand().clear();
			continue;
		}
		
// the dealer must hit if their hand is less than 17 , if the dealers hand is 17+ they must stand	
	} while (response.equals("yes"));
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

	public void playersOptions() {
		do {
			if (player.playersHand().isBlackJack()) {
				System.out.println("!!!BLACKJACK!!!, YOU WIN, COLLECT YOUR MONEY!");
				break;
			}
			if (dealer.playersHand().isBlackJack()) {
				System.out.println("Dealer has BLACKJACK, you lose.");
				break;
			}
			if (player.playersHand().isBust()) {
				System.out.println("You BUST, you lose.");
				break;
			}
			String choice;
			System.out.println("Hit or stand?");
			choice = scan.nextLine();
			if (choice.equals("hit")) {
				System.out.println("Your " + player.addCardToHand(dealer.dealCard()));
				System.out.println("Your hand value: " + player.addHandNums());
			}
			if (choice.equals("stand")) {
				System.out.println("Your hand value: " + player.addHandNums());
				break;
			}
			if (player.playersHand().isBust()) {
				System.out.println("You BUST, You lose.");
				break;
			}
		} while (!player.playersHand().isBlackJack());
	}

	public void dealerPlaying() {
		
		System.out.println("Dealer is playing....");
		System.out.println("Dealers " + dealer.dealerLogic(dealer.playersHand()));
		System.out.println("Dealers hand value: " + dealer.addHandNums());
		if (dealer.playersHand().isBust()) {
			System.out.println("Dealer BUST, You win, collect some money!");
		}
	}

	public void announceWinner() {
		
		if (player.playersHand().isBlackJack()) {
			System.out.println("!!!BLACK JACK YOU WIN!!!COLLECT YOUR MONEY!!!");
		}
		if (dealer.playersHand().isBlackJack()) {
			System.out.println("Dealer has BLACKJACK, You lose. Dealer takes all.");
		}
		if (player.playersHand().isBlackJack() && dealer.playersHand().isBlackJack()) {
			System.out.println("You and Dealer have BLACKJACK. \nPUSH!");
		} else {
			if (player.addHandNums() > dealer.addHandNums()) {
				System.out.println("You win!!! Collect some money!");
			}
			if (player.addHandNums() < dealer.addHandNums()) {
				System.out.println("You lose. Dealer takes all.");
			}
			if (player.addHandNums() == dealer.addHandNums()) {
				System.out.println("PUSH!");
			}
		}
	}
}
