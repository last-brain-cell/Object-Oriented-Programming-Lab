package Lab8;

public class Question5 {
    public static class Shape {
        Shape() {
            System.out.println("Shape");
        }

        int getArea() {
            return -1;
        }

        int getPerimeter() {
            return -1;
        }
    }

    static class Rectangle extends Shape {
        private final int length, breadth;
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

        @Override
        int getPerimeter() {
            return 2*(length+breadth);
        }
    }

    static class Circle extends Shape {
        private final int radius;

        Circle(int radius) {
            super();
            this.radius = radius;
        }

        @Override
        int getArea() {
            return 22*radius*radius/7;
        }

        @Override
        int getPerimeter() {
            return 2*22*radius/7;
        }
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 6);
        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());

        Circle c = new Circle(10);
        System.out.println(c.getArea());
        System.out.println(c.getPerimeter());
    }
}
