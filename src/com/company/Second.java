package com.company;

public class Second extends First{
    private String numbering;

    public Second(Integer number, String numbering) {
        super(number);
        this.numbering = numbering;
    }

    public String getNumberin(){return numbering;}

    @Override
    public void print() {
        System.out.println(getInfo() + "\nNumbering: " + numbering);
    }
}
