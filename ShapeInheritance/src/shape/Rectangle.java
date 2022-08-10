package shape;

public class Rectangle extends Shape{
    private double sideOne;
    private double sideTwo;

    public Rectangle(){
        this.sideOne=0;
        this.sideTwo=0;
    }

    public Rectangle(double sideOne, double sideTwo) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    public Rectangle(String name, double sideOne, double sideTwo) {
        super(name);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    public double getSideOne() {
        return sideOne;
    }

    public void setSideOne(double sideOne) {
        this.sideOne = sideOne;
    }

    public double getSideTwo() {
        return sideTwo;
    }

    public void setSideTwo(double sideTwo) {
        this.sideTwo = sideTwo;
    }

    public double area(){
        return this.sideOne*this.sideTwo;
    }
    public double perimeter(){
        return 2*(this.sideOne+this.sideTwo);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "sideOne=" + sideOne +
                ", sideTwo=" + sideTwo +
                '}';
    }
}
