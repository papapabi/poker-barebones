package com.pokergame.backend;

import java.util.*;
import com.pokergame.backend.Card.Rank;
import com.pokergame.backend.Card.Suit;

/**
 *
 * @author Joshua Isaac
 */
public class Checker {

    private List<Integer> makeHistogram(Player player) {
        int[] rankCount = new int[15]; // 0-13, uses 1-13
        ArrayList<Card> cardsInHand = player.getCardsInHand();
        for (Card card : cardsInHand) {
            int rank = card.getRankValue();
            rankCount[rank]++; //counts each rank
        }

        Arrays.sort(rankCount);  //sorts from lowest to highest

        int j = 0;
        for (int i = 0; i < rankCount.length; i++) {
            if (rankCount[i] != 0) {
                rankCount[j++] = rankCount[i];
            }
        }
        int[] newArray = new int[j];
        System.arraycopy(rankCount, 0, newArray, 0, j);

        List<Integer> histogram = new ArrayList<>(newArray.length);

        for (int i = newArray.length - 1; i >= 0; i--) {
            histogram.add(newArray[i]);
        }
        return histogram;
    }

    /**
     *
     * @param player
     * @return
     */
    public Combination evaluateHand(Player player) {
        List<Integer> histogram = this.makeHistogram(player); //makes a histogram high to low
        ArrayList<Card> cardsInHand = player.getCardsInHand();
        List<Card> cpyHandCards = new ArrayList<>(cardsInHand.size());
        for (Card card : cardsInHand) {
            cpyHandCards.add(new Card(card));
        }

        if (cpyHandCards.contains(new Card(Rank.KING, Suit.CLUBS))
                || cpyHandCards.contains(new Card(Rank.KING, Suit.DIAMONDS))
                || cpyHandCards.contains(new Card(Rank.KING, Suit.HEARTS))
                || cpyHandCards.contains(new Card(Rank.KING, Suit.SPADES))) {
            Rank.ACE.setRank(14);
        } else {
            Rank.ACE.setRank(1);
        }

        Collections.sort(cpyHandCards, new RankComparator()); // sorted from lowest to hightest, rank-wise

        if (histogram.contains(4) && histogram.contains(1)) {
            return new Combination(4, "Quads");
        } else if (histogram.contains(3) && histogram.contains(2)) {
            return new Combination(2.5, "Full House");
        } else if (histogram.contains(3)) {
            return new Combination(1.5, "Triples");
        } else if (histogram.contains(2)) {
            if (histogram.indexOf(2) != histogram.lastIndexOf(2)) {
                return new Combination(1.25, "Two Pair");
            } else {
                return new Combination(1, "Pair");
            }
        } else {
            boolean first = true;
            boolean straight = false;
            boolean flush = true;
            int prevSuit = 0;
            for (Card card : cpyHandCards) {
                if (first) {
                    prevSuit = card.getSuitValue();
                    first = false;
                    continue;
                }
                if (card.getSuitValue() != prevSuit) { //not a flush when one card isn't the same as the others
                    flush = false;
                    break;
                }
            } //end for 

            int lastIndex = cpyHandCards.size() - 1;

            if (cpyHandCards.get(lastIndex).getRankValue() - cpyHandCards.get(0).getRankValue() == 4) {
                straight = true;
                if (straight && flush) {
                    if (cpyHandCards.get(0).getRankValue() == 1
                            || cpyHandCards.get(lastIndex).getRankValue() == 14) { // there is an ace somewhere in there, yo
                        if (cpyHandCards.get(0).getRankValue() == 1) { // if the ace is in the first position (a baby flush)
                            return new Combination(6, "Baby Flush");
                        } else if (cpyHandCards.get(lastIndex).getRankValue() == 14) { // otherwise it's in the last position (a royal flush)
                            return new Combination(8, "Royal Flush");
                        }
                    } // else, it is just a regular straight flush
                    return new Combination(5, "Straight Flush");
                }
            } // not a straight flush
            if (flush) {
                return new Combination(2, "Flush");
            } else if (straight) {
                return new Combination(1.75, "Straight");
            }
        } // end else
        return new Combination(0, "nothing");
    } // end evaluateHand

    static class RankComparator implements Comparator<Card> {

        @Override
        public int compare(Card a, Card b) {
            return Integer.compare(a.getRankValue(), b.getRankValue());
        }
    }
} // end class
