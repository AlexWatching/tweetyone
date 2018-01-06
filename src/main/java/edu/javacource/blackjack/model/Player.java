package edu.javacource.blackjack.model;

import java.io.InputStream;
import java.io.OutputStream;

public class Player {

    private String userName;
    private InputStream in;
    private OutputStream out;
    private Hand hand;

    public Player(String userName, InputStream in, OutputStream out) {
        this.userName = userName;
        this.in = in;
        this.out = out;
        hand = new Hand();
    }
}
