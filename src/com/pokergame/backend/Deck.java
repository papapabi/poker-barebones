package com.pokergame.backend;

/**
 *
 * @author Joshua Isaac
 */
import java.util.*;
import com.pokergame.backend.Card.*;

public final class Deck implements Iterable<Card> {

    private static final int NUMBER_OF_CARDS = 52;

    private ArrayList<Card> cards;
    private int cardsInDeck;

    /**
     *
     */
    public Deck() {
        cards = new ArrayList<>();
        int i = 0;
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(i, new Card(rank, suit));
                i++;
            }
        }
        cardsInDeck = NUMBER_OF_CARDS;
    }

    /**
     *
     * @param shuffled automatically shuffles the deck in the constructor call
     * if set to true; otherwise, the deck is still arranged.
     */
    public Deck(boolean shuffled) {
        cards = new ArrayList<>();
        int i = 0;
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(i, new Card(rank, suit));
                i++;
            }
        }
        if (shuffled == true) {
            shuffle();
        }
        cardsInDeck = NUMBER_OF_CARDS;
    }

    @Override
    public Iterator<Card> iterator() {
        Iterator<Card> icard = cards.iterator();
        return icard;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Card card : this.cards) {
            sb.append(card);
        }
        return sb.toString();
    } //end toString

    public void shuffle() {
        Collections.shuffle(this.cards);
    } //end shuffle

    public int size() {
        return cards.size();
    }

    public Card draw() {
        if (this.cardsInDeck == 0) {
            return null; //return an exception next time
        }
        return cards.remove((0));
    }

    public int cardsInDeck() {
        return this.cardsInDeck;
    }

} // end Deck
