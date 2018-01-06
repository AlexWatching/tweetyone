package edu.javacource.blackjack.message;

public class Head {
    private int length;
    private int commandID;

    public Head(int commandID) {
        this.commandID=commandID;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getCommandID() {
        return commandID;
    }

    public void setCommandID(int commandID) {
        this.commandID = commandID;
    }

    @Override
    public String toString() {
        return "Head{" +
                "length="+ length+
                ", commandID=" + commandID+
                '}';
    }
}
