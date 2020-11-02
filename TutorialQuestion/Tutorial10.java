package TutorialQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Tutorial10 {
}

//1
abstract class DiscountPolicy {

    double discount, discountRate;

    public abstract double discount(int count, double itemCost);

}

class BulkDiscount extends DiscountPolicy {

    int minimum;

    BulkDiscount(int a, double b) {
        minimum = a;
        discountRate = b;
    }

    @Override
    public double discount(int count, double itemCost) {
        if (count > minimum) {
            discount = itemCost * discountRate;
        } else {
            discount = 0;
        }
        return discount;
    }
}

class OtherDiscount extends DiscountPolicy {

    @Override
    public double discount(int count, double itemCost) {
        if (count == 3 || count == 4 || count == 5) {
            discountRate = 0.1;
        } else if (count == 6 || count == 7 || count == 8) {
            discountRate = 0.2;
        } else if (count > 8) {
            discountRate = 0.3;
        } else {
            discountRate = 0;
        }
        discount = itemCost * discountRate;
        return discount;
    }
}

class combineDiscount extends DiscountPolicy {

    double max;
    DiscountPolicy discount1, discount2;

    combineDiscount(DiscountPolicy a, DiscountPolicy b) {
        discount1 = a;
        discount2 = b;
    }

    double computeDiscount() {
        if (discount1.discount > discount2.discount) {
            max = discount1.discount;
        } else {
            max = discount2.discount;
        }
        return max;
    }

    @Override
    public double discount(int count, double itemCost) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

class testDiscount {

    public static void main(String[] args) {
        DiscountPolicy a = new BulkDiscount(3, 0.1);
        DiscountPolicy b = new OtherDiscount();
        combineDiscount c = new combineDiscount(a, b);
        System.out.println(a.discount(7, 100));
        System.out.println(b.discount(7, 100));
        System.out.println(c.computeDiscount());
    }
}

//2
interface Interest {

    double computeInterest();
}

class SavingAccount implements Interest {

    double balance, interest, interestRate;

    SavingAccount(double a) {
        balance = a;
        interestRate = 0.05 / 12;
    }

    @Override
    public double computeInterest() {
        interest = balance * interestRate;
        return interest;
    }
}

class FixedAccount implements Interest {

    double balance, interest, interestRate;

    FixedAccount(double a) {
        balance = a;
        interestRate = 0.3 / 12;
    }

    @Override
    public double computeInterest() {
        interest = balance * interestRate;
        return interest;
    }
}

class testInterest {

    public static void main(String[] args) {
        SavingAccount a = new SavingAccount(6000);
        FixedAccount b = new FixedAccount(6000);
        System.out.println(a.computeInterest());
        System.out.println(b.computeInterest());
    }
}

//3

class Person implements Comparable<Person> {

    String name;

    Person(String a) {
        name = a;
    }

    public String getName() {
        return name;
    }

    void display() {
        System.out.println("The name is " + name);
    }

//    @Override
    public int compareTo(Person o) {
        return this.name.compareToIgnoreCase(o.getName());
    }

    @Override
    public String toString() {
        return name;
    }
}

class testPerson {

    public static void main(String[] args) {
        Person[] students = {new Person("D"), new Person("C"),
            new Person("B") , new Person("a")};
        Arrays.sort(students);
        for (Person student : students) {
            System.out.println(student + "");
        }
    }
}

//      StringTokenizer
//      StringBuilder