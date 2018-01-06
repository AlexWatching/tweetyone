package edu.javacource.blackjack.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<BlackjackCard> cardList;
    private int top;
    private static final int CARDNUMBER = 52;

    public Deck() {
        cardList =new ArrayList<BlackjackCard>(CARDNUMBER);
        top=0;
        initialize();
    }

    public void initialize(){
        for (int suit = BlackjackCard.DIAMOND;suit<BlackjackCard.SPADES;suit++){
            for (int value = BlackjackCard.ACE; value < BlackjackCard.KING; value++) {
                cardList.add(new BlackjackCard(suit, value));
            }
        }
    }

    public BlackjackCard getTopCard() {
        BlackjackCard blackJackCard = cardList.get(top);
        cardList.remove(blackJackCard);
        top++;
        return blackJackCard;
//        return cardList.get(top++);
    }

//洗牌
    public void shuffle(){
        Collections.shuffle(cardList);
    }

//    开始新的一局
    public void newSet(){
        cardList.clear();
        initialize();
        shuffle();
    }

    public List<BlackjackCard> getCardList() {
        return cardList;
    }

    public void setCardList(List<BlackjackCard> cardList){
        this.cardList = cardList;
    }
}
