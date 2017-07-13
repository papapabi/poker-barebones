package com.pokergame.backend;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Joshua Isaac
 */
public class Player implements Serializable {

    private static final long serialVersionUID = 69696969;

    public static final double DEFAULT_CASH = 10000.00;
    public static final double ADMIN_CASH = 9999999999.00;

    private String username;
    private String password;
    private double cash;
    
    public ArrayList<Card> cardsInHand = new ArrayList<>(); // 5 cards in hand
    
    public ArrayList<Card> getCardsInHand() {
        return this.cardsInHand;
    }

    public void setCardsInHand(ArrayList<Card> cards) {
        this.cardsInHand = new ArrayList<>(cards);
    }
    
    public void removeCards() {
        cardsInHand.clear();
    }

    public void addCard(Card card) {
        cardsInHand.add(card);
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return this.username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }

    public double getCash() {
        return this.cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }
    
    public int handLength(){
        int HandLength = cardsInHand.size();
        return HandLength;
    }
    
    public boolean isBankrupt() {
        return (this.cash == 0);
    }

} // end Player
