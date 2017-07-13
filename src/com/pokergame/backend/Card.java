package com.pokergame.backend;

import java.util.Objects;
import javax.swing.ImageIcon;

/**
 *
 * @author Joshua Isaac
 */
public class Card implements Comparable<Card>, Cloneable {

    public enum Suit {

        CLUBS(1, "C"), DIAMONDS(2, "D"), HEARTS(3, "H"), SPADES(4, "S");

        private final int suitValue;
        private final String name;

        private Suit(int value, String name) { //only the enum Suit gets to use this constructor
            this.suitValue = value;
            this.name = name;
        }

        public int getValue() {
            return this.suitValue;
        }

        public String getName() {
            return this.name;
        }
    } // end inner class Suit

    public enum Rank {

        ACE(1, "1"), DEUCE(2, "2"), THREE(3, "3"), FOUR(4, "4"), FIVE(5, "5"), SIX(6, "6"),
        SEVEN(7, "7"), EIGHT(8, "8"), NINE(9, "9"), TEN(10, "10"), JACK(11, "11"), QUEEN(12, "12"), KING(13, "13");

        private int value;
        private final String name;

        private Rank(int value, String name) {
            this.value = value;
            this.name = name;
        }

        public int getRank() {
            return this.value;
        }

        public void setRank(int value) {
            this.value = value;
        }
       
        public String getRankName() {
            return this.name;
        }

    } // end inner class Rank


    private boolean isRevealed = true;

    private final Suit suit;
    private final Rank rank;
    private final ImageIcon image;
    public static final ImageIcon BACKIMAGE = new ImageIcon("images/redback.png");
    // back remains the same for every card

    public Card(Rank rank, Suit suit) {
        this.suit = suit;
        this.rank = rank;
        String imageFile = "images/" + rank.getRankName() + suit.getName() + ".png";
        this.image = new ImageIcon(imageFile);
    }

    //Copy constructor
    public Card(Card aCard) {
        this(aCard.getRank(), aCard.getSuit());
    }
    
    public boolean isRevealed() {
        return this.isRevealed;
    }
    
    public void setRevealed(boolean value) {
        this.isRevealed = value;
    }

    public Suit getSuit() {
        return this.suit;
    }

    public int getSuitValue() {
        return suit.getValue();
    }

    public String getSuitName() {
        return suit.getName();
    }

    public Rank getRank() {
        return this.rank;
    }
    
    public String getRankName() {
        return rank.getRankName();              
    }

    public int getRankValue() {
        return rank.getRank();
    }
    
    public ImageIcon getImage() {
        return this.image;
    }

    @Override
    public int compareTo(Card card) {
        final int LESS = -1;
        final int EQUAL = 0;
        final int GREATER = 1;

        //for optimization, object equality
        if (this == card) {
            return EQUAL;
        }

        if (this.getSuitValue() > card.getSuitValue()) {
            return GREATER;
        }
        if (this.getSuitValue() < card.getSuitValue()) {
            return LESS;
        }

        //if suits of the two cards are the same
        int rankOfThis = this.getRankValue();
        int rankOfCard = card.getRankValue();

        if (rankOfThis > rankOfCard) {
            return GREATER;
        }
        if (rankOfThis < rankOfCard) {
            return LESS;
        }

        assert this.equals(card) : "compareTo inconsistent with equals";

        //if all statements are vetoed
        return EQUAL;
    }// end compareTo

    @Override
    public boolean equals(Object o) {
        if (o instanceof Card) {
            return (this.compareTo((Card) o) == 0);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.suit);
        hash = 23 * hash + Objects.hashCode(this.rank);
        hash = 23 * hash + Objects.hashCode(this.image);
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getRank()).append(" of ").append(this.getSuit());
        return sb.toString();
    }

}// end Card

