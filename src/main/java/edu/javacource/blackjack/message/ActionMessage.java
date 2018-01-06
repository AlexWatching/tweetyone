package edu.javacource.blackjack.message;

public abstract class ActionMessage {
    protected byte[] body;
    protected Head head;

//    将待发送的数据编码
    public abstract byte[] encode();
//    解析接收的数据
    public abstract void decode();
}
