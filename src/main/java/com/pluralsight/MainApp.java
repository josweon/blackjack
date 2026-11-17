package com.pluralsight;

public class MainApp {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Hand hand1 = new Hand("Rick");
        Hand hand2 = new Hand("North");
        Hand hand3 = new Hand("Baker");

// deal 5 cards
        deck.shuffle();
        for(int i = 0; i < 2; i++) {
// get a card from the deck
            Card card1 = deck.deal();
            Card card2 = deck.deal();
            Card card3 = deck.deal();
// deal that card to the hand

            hand1.deal(card1);
            hand2.deal(card2);
            hand3.deal(card3);
        }

        int hand1Value = hand1.getValue();
        int hand2Value = hand2.getValue();
        int hand3Value = hand3.getValue();

        System.out.println("--Revealing Hands");
        System.out.printf("%s's hand(%d): %s%n", hand1.getPlayer(), hand1Value, hand1.revealHand());
        System.out.printf("%s's hand(%d): %s%n", hand2.getPlayer(), hand2Value, hand2.revealHand());
        System.out.printf("%s's hand(%d): %s%n", hand3.getPlayer(), hand3Value, hand3.revealHand());


        if (hand1Value > hand2Value &&  hand1Value > hand3Value){
            System.out.printf("\nBlackjack, %s wins!", hand1.getPlayer());
        } else if (hand2Value > hand1Value && hand2Value > hand3Value) {
            System.out.printf("\nBlackjack, %s wins!", hand2.getPlayer());
        } else {
            System.out.printf("\nBlackjack, %s wins!", hand3.getPlayer());
        }
    }
}