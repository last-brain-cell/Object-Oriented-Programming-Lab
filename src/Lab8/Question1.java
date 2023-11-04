package Lab8;

import java.beans.VetoableChangeListener;

public class Question1 {
    public static class Vehicle {
        void drive() {
            System.out.println("Repairing a Vehicle");
        }
    }

    static class Car extends Vehicle {
//        @Override
        void drive() {
            System.out.println("Repairing a car!");
        }
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        Car c = new Car();

        v.drive();
        c.drive();
    }
}
