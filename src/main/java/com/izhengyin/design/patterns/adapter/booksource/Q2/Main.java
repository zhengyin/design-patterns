package com.izhengyin.design.patterns.adapter.booksource.Q2;

import com.izhengyin.design.patterns.adapter.booksource.A2.FileProperties;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileIO f = (FileIO) new FileProperties();
        try {
            f.readFromFile("file.txt");
            f.setValue("year", "2004");
            f.setValue("month", "4");
            f.setValue("day", "21");
            f.writeToFile("newfile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
