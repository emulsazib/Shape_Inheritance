package shape;

public class Main {
    public static void main(String[] args) {
        Shape s1=new Square("Square",5);
        double area= ((Square) s1).area();
        System.out.println(area);

        double perimeter=((Square)s1).perimeter();
        System.out.println(perimeter);
    }
}
