package com.company;

public class Third extends First{
    private String numbering;

    public Third(Integer number, String numbering) {
        super(number);
        this.numbering = numbering;
    }

    public String getNumberin(){return numbering;}

    @Override
    public void print() {
        System.out.println(getInfo() + "\nNumbering: " + numbering);
    }
}
