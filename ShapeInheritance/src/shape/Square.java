package shape;

public class Square extends Shape{
    private double side;

    public Square(){
        this.side=0;
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String name, double side) {
        super(name);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public double area(){
        return Math.pow(this.side,2);
    }
    public double perimeter(){
        return 4*this.side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
