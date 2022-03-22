package com.company;

public abstract class First implements Printable{
    private Integer number;

    public First(Integer number) {
        this.number = number;
    }

    public String getInfo(){
        return "Number: " + number;
    }
}