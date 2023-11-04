package Lab8;

import java.util.ArrayList;

public class Question3 {
    static class Employee {
        public final int salary;
        public final String name;

        Employee(int salary, String name) {
            this.salary = salary;
            this.name = name;
        }
        void work() {
            System.out.println("Employee is Working");
        }

        void getSalary() {
            System.out.println("Employee Salary: " + salary);
        }

        void displayEmployee() {
            System.out.println("Employee Name: " + name);
            System.out.println("Employee Salary: " + salary);
        }
    }

    static class HRManager extends Employee {
        ArrayList<Employee> manager = new ArrayList<Employee>();

        HRManager(int salary, String name) {
            super(salary, name);
        }

        void work() {
            System.out.println("HRManager is Working");
        }

        void addEmployee(Employee e) {
            manager.add(e);
        }

        void displayEmployees() {
            for(Employee e: manager) {
                System.out.println("----------------------------\n");
                e.displayEmployee();
            }
        }

    }

    public static void main(String[] args) {
        Employee e1 = new Employee(50000, "John Doe");
        Employee e2 = new Employee(60000, "Jane Smith");
        HRManager hr = new HRManager(100000, "Bob Johnson");

        e1.getSalary();

        hr.addEmployee(e1);
        hr.addEmployee(e2);
        hr.displayEmployees();
    }
}
