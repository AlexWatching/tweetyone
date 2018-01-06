package edu.javacource.blackjack.model;

public class GameServer {
    private Deck deck = new Deck();
    private ServerCommunicator server;

    public GameServer(){
        server = new ServerCommunicator();
        server.listen();
    }
}
