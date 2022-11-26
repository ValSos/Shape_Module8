package main.java;

interface Nameable {
    public default void printName() {
        System.out.println("Shape");
    }
}
