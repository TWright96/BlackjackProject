package com.skilldistillery.blackjack.entities;

public enum Rank {
	TWO(2, "two"),
	THREE(3, "three"), 
	FOUR(4, "four"),
	FIVE(5, "five"), 
	SIX(6, "six"), 
	SEVEN(7, "seven"), 
	EIGHT(8, "eight"),
	NINE(9, "nine"),
	TEN(10, "ten"),
	JACK(10, "ten"),
	QUEEN(10, "ten"),
	KING(10, "ten"),
	ACE(11, "eleven");
final private int rank;
final private String rankNum;	
	//Rank(int rank) {
	//	this.rank = rank;
	//}
	Rank (int rank, String rankNum) {
	this.rank = rank;
	this.rankNum = rankNum;
	}
	
public int getValue() {
	return rank;
}

public String toString() {
	return rankNum;
}
}
