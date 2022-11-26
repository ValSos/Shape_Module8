package main.java;

public class PrintName implements Nameable{
    public PrintName(Shape shape){
        shape.printName();
    }


    public static void main(String[] args) {
        Quad testQuad = new Quad("Quad");
        Triangle testTriangle = new Triangle("Triangle");
        Rhombus testRhombus = new Rhombus("Rhombus");
        Pentagon testPentagon = new Pentagon("Pentagon");
        Circle testCircle = new Circle("Circle");

        PrintName quad = new PrintName(testQuad);
        PrintName triangle = new PrintName(testTriangle);
        PrintName rhombus = new PrintName(testRhombus);
        PrintName pentagon = new PrintName(testPentagon);
        PrintName circle = new PrintName(testCircle);
    }


}
