package edu.javacource.blackjack.message;
import  edu.javacource.blackjack.model.*;

public class DealMessage extends ActionMessage {
    private BlackjackCard[] cards;    
    public DealMessage(BlackjackCard[] cards) {
        head = new Head(Command.DEAL);
        this.cards = cards;
    }

    // override???
    public byte[] encode() {
        StringBuffer buf = new StringBuffer();
        for(BlackjackCard card:cards){

        }
        return new byte[0];
    }

    public void decode() {

    }

    
}
