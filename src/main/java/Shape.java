package main.java;

public class Shape implements Nameable{

    private final String name;
    //Тест
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
