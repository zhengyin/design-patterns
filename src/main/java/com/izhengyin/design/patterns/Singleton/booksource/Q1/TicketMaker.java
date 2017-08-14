package com.izhengyin.design.patterns.Singleton.booksource.Q1;

public class TicketMaker {
    private int ticket = 1000;
    public int getNextTicketNumber() {
        return ticket++;
    }
}
