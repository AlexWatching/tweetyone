package edu.javacource.blackjack.model;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private List<BlackjackCard> cardList;

    public Hand() {
        this.cardList = new ArrayList<BlackjackCard>();
    }

    public List<BlackjackCard> getCardList(){
        return  cardList;
    }

    public void setCardList(List<BlackjackCard> cardList){
        this.cardList =cardList;
    }
}
