public class L10Q1 {
    public static void main(String[] args) {
        Employee worker1 = new permanentEmployee("Ong Heng Kiat", 'B');
        Employee worker2 = new contractStaff("Lee Hong Yan", 1000);
        Employee worker3 = new temporaryStaff("Ong Zi Jing ", 10);
        worker1.display();
        worker2.display();
        worker3.display();
    }
}

abstract class Employee {

    protected String name;
    protected double salary;

    public Employee(String name) {
        this.name = name;
    }

    abstract void display();
}

class permanentEmployee extends Employee {

    public permanentEmployee(String name, char category) {
        super(name);
        if (category == 'A') {
            this.salary = 4000;
        }
        else if (category == 'B') {
            this.salary = 3000;
        }
        else if (category == 'C') {
            this.salary = 2000;
        }
    }

    @Override
    public void display() {
        System.out.println("The worker " + this.name + " has a salary of " + this.salary + " for this month");
    }
}

class contractStaff extends Employee {

    public contractStaff(String name, double sales) {
        super(name);
        this.salary = 500 + sales * 0.5;
    }

    @Override
    public void display() {
        System.out.println("The worker " + this.name + " has a salary of " + this.salary + " for this month");
    }
}

class temporaryStaff extends Employee {

    public temporaryStaff(String name, int hour) {
        super(name);
        this.salary = 15 * hour;
    }

    @Override
    public void display() {
        System.out.println("The worker " + this.name + " has a salary of " + this.salary + " for this month");
    }
}

