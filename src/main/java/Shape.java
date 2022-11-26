package main.java;

public class Shape implements Nameable{

    private final String name;
    public Shape(String name) {
        this.name = name;
    }
    @Override
    public void printName() {
        System.out.println(this.getName());
    }

    public String getName() {
        return name;
    }


}
