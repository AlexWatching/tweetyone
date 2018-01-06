package edu.javacource.blackjack.model;

public class BlackjackCard {
//    特殊牌面
    public final static int ACE=1;
    public final static int JACK=11;
    public final static int QUEEN=12;
    public final static int KING =13 ;

//    花色
    public final static int DIAMOND =0;
    public final static int CLUBS =1;
    public final static int HEART=2;
    public final static int SPADES =3;

    private int value;
    private int suit;

    public BlackjackCard(int value, int suit) {
        this.value = value;
        this.suit = suit;
    }

    public BlackjackCard() {
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getSuit() {
        return suit;
    }

    public void setSuit(int suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
        return "Black jackCard{"+
                "value="+value+
                ",suit="+suit+
                '}';
    }

    public char getSuitSymbol(){
        char ch='D';
        switch (suit) {
            case BlackjackCard.DIAMOND:
                ch='D';
                break;
            case BlackjackCard.HEART:
                ch='H';
                break;
            case BlackjackCard.CLUBS:
                ch='C';
                break;
            case BlackjackCard.SPADES:
                ch='S';


            // TODO: 2018/1/6


        }
        return ch;
    }

    public int getScore(){
        int score;
        switch (value)
        {
            case JACK:

            case QUEEN:
            case KING:
                score=10;
                break;
            case ACE:
                score =1;
            default:
                score = value;
        }
        return score;
    }

}
