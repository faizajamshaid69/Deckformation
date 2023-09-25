package com.deckformation;

public class Card {
    private final String suit;
    private final String rank;
    Card(String suit,String rank){
        this.suit=suit;
        this.rank=rank;}

    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return String.format("%s%s",this.suit,this.rank);
    }
}

