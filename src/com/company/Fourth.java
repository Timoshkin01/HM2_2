package com.company;

public class Fourth extends First {
    private String numbering;

    public Fourth(Integer number, String numbering) {
        super(number);
        this.numbering = numbering;
    }

    public String getNumberin(){return numbering;}

    @Override
    public void print() {
        System.out.println(getInfo() + "\nNumbering: " + numbering);
    }
}
