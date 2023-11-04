package Lab8;

public class Question2 {
    public static class Shape {
        Shape() {
            System.out.println("Shape");
        }

        int getArea() {
            return -1;
        }
    }

    static class Rectangle extends Shape {
        private final int length;
        private final int breadth;
        Rectangle(int length, int breadth) {
            super();
            this.length = length;
            this.breadth = breadth;
            System.out.println("This is a Rectangle");
        }

        @Override
        int getArea() {
            return length*breadth;
        }
    }

    public static void main(String[] args) {
        Shape shape = new Shape();
        Rectangle r = new Rectangle(5, 6);

        System.out.println(shape.getArea());
        System.out.println(r.getArea());
    }
}
