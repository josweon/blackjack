package com.pluralsight;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards;
    private String player;

    public Hand(String player){
        this.player = player;
        cards = new ArrayList<>();
    }

    // A Card is dealt to the Hand and the Hand is responsible
    // to store the card
    public void deal(Card card){
        cards.add(card);
    }

    public int getSize(){
        return cards.size();
    }

    public String getPlayer(){
        return this.player;
    }

    public String revealHand() {
        String hand = "";
        for (Card c: this.cards) {
            c.flip();
            hand += c.getSuit() + "." + c.getValue() + ",";
            c.flip();
        }
        return hand;
    }

    // The Hand uses the methods of each card to determine
    // the value of each card - and adds up all values
    public int getValue(){
        int value = 0;

        for(Card card: cards){
            card.flip(); // turn the card over to see the value
            value += card.getPointValue();
            card.flip(); // hide the card again
        }

        return value;
    }
}