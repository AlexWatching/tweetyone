package edu.javacource.blackjack.model;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ServerCommunicator {
    private ServerSocket serverSocket;
    private List<Player> playerList;

    public ServerCommunicator() {
        playerList = new ArrayList<Player>();
    }

    public void listen(){

        try {
            serverSocket = new ServerSocket(9527);
            Socket socket = serverSocket.accept();
            String userName = "jack";
            Player player = new Player(userName,socket.getInputStream(),socket.getOutputStream());
            playerList.add(player);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
