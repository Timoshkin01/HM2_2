package com.company;

public class Main {

    public static void main(String[] args) {
        Printable print[] = {createObject("oneObject"), createObject("twoObject"), createObject("treeObject")};
        for (Printable printable: print){
            printable.print();
        }
    }

    public static Printable createObject(String className) {

        switch (className){
            case "oneObject":
                Second second= new Second(2, "second");
                return second;

            case "twoObject":
                Third third = new Third(3, "third");
                return third;

            case "treeObject":
                Fourth fourth = new Fourth(4, "fourth");
                return fourth;
        }
        return null;
    }
}

