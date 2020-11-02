package LabQuestion;

import java.util.Random;

public class LabQuestion8 {
    public static void main(String[] args) {
        System.out.println("Instance variable must have private modifier");
    }
}

//1
class Number {

    Random rnd = new Random();
    int[] array;

    Number() {
        array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(101);
        }
    }

    Number(int a) {
        array = new int[a];
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(101);
        }
    }

    Number(int a, int b) {
        array = new int[a];
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(b + 1);
        }
    }

    void displayAll() {
        System.out.println("All numbers generated are ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    void displayEven() {
        System.out.println("The even numbers are ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }
    }

    void displayPrime() {
        boolean prime = true;
        System.out.println("The prime numbers are ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 2; j < array[i] / 2; j++) {
                if (array[i] % j == 0) {
                    prime = false;
                }
            }
            if (array[i] == 2) {
                prime = true;
            }
            if (prime) {
                System.out.println(array[i]);
            }
        }
    }

    void displayMaximum() {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("The maximum number is " + max);
    }

    void displayMinimum() {
        int min = 99999;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("The maximum number is " + min);
    }

    void displayAverage() {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        int average = sum / array.length;
        System.out.println("The average is " + average);
    }

    void displaySquareNumber() {
        int squareNum = 0;
        for (int i = 0; i < array.length; i++) {
            squareNum += Math.pow(array[i], 2);
        }
        System.out.println("The square number is " + squareNum);
    }
}

class testerNumber {

    public static void main(String[] args) {
        Number a = new Number();
        a.displayAll();
        a.displayEven();
        a.displayPrime();
        a.displayMinimum();
        a.displayMaximum();
        a.displayAverage();
        a.displaySquareNumber();
    }
}

//2
class BankAccount {

    String name;
    int IC, passportNum, balance;

    BankAccount(String a, int b, int c, int d) {
        name = a;
        IC = b;
        passportNum = c;
        balance = d;
    }

    void deposit(int a) {
        balance += a;
    }

    void withdraw(int a) {
        balance -= a;
    }

    void displayBalance() {
        System.out.println("The balance of the account is " + balance);
    }

}

class TesterBankAccount {

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("ONGHENGKIAT", 000510121234, 12345, 1000000);
        account1.deposit(500);
        account1.withdraw(312);
        account1.displayBalance();
    }
}

//3
class WeightCalculator {

    int age, height;
    double recommendWeight;

    WeightCalculator(int a, int b) {
        age = a;
        height = b;
    }

    void recommendWeight() {
        recommendWeight = (height - 100 + age / 10) * 0.9;
    }

    void display() {
        System.out.println("Age is " + age);
        System.out.println("Height is " + height);
        System.out.println("RecommendWeight is " + recommendWeight);
    }
}

class TesterWeightCalculator {

    public static void main(String[] args) {
        WeightCalculator person1 = new WeightCalculator(19, 170);
        person1.recommendWeight();
        person1.display();
    }
}

//4
class Fraction {

    int numerator, denominator;

    Fraction() {
        numerator = 1;
        denominator = 1;
    }

    void setNumerator(int a) {
        numerator = a;
    }

    void setDenominator(int a) {
        denominator = a;
    }

    void getNumerator() {
        System.out.println("The numberator is " + numerator);
    }

    void getDenominator() {
        System.out.println("The denominator is " + denominator);
    }

    void displayFraction() {
        int gcd = 1, max;
        boolean GCD = false;
        if (denominator >= numerator) {
            max = denominator;
        } else {
            max = numerator;
        }
        for (int i = max; i > 2; i--) {
            if (denominator % i == 0 && numerator % i == 0) {
                GCD = true;
                gcd = i;
                break;
            }
        }
        if (GCD) {
            denominator /= gcd;
            numerator /= gcd;
        }
        System.out.println("The simplest fraction is " + numerator + " / " + denominator);
    }
}

class TesterFraction {

    public static void main(String[] args) {
        Fraction fraction1 = new Fraction();
        fraction1.setNumerator(6);
        fraction1.setDenominator(3);
        fraction1.getNumerator();
        fraction1.getDenominator();
        fraction1.displayFraction();
    }
}

//5
class Game {

    Random rnd = new Random();
    String name;
    int score = 0;

    Game(String a) {
        name = a;
    }

    void roll() {
        score += rnd.nextInt(6) + 1;
    }
}

class testerGame {

    public static void main(String[] args) {
        Game player1 = new Game("player1");
        Game player2 = new Game("player2");
        while (player1.score < 100 && player2.score < 100) {
            player1.roll();
            System.out.println("Player 1 score " + player1.score);
            if (player1.score >= 100) {
                System.out.println("Player1 wins ");
                break;
            }
            player2.roll();
            System.out.println("Player 2 score " + player2.score);
            if (player2.score >= 100) {
                System.out.println("Player2 wins");
                break;
            }
        }
    }
}

//6
class burgerStall {

    String ID;
    int numOfBurger = 0;
    static int sumOfBurger = 0;

    burgerStall(String a) {
        ID = a;
    }

    void sold(int a) {
        numOfBurger += a;
        sumOfBurger += a;
    }

    void display() {
        System.out.println("The number of burger sold by the stall is " + numOfBurger);
    }

    static void displaySum() {
        System.out.println("The total number of burgers sold is " + sumOfBurger);
    }
}

class testerBurgerStall {

    public static void main(String[] args) {
        burgerStall stall1 = new burgerStall("123");
        burgerStall stall2 = new burgerStall("321");
        stall1.sold(100);
        stall2.sold(200);
        stall1.display();
        stall2.display();
        burgerStall.displaySum();
    }
}

//7
class money {

    int RM100, RM50, RM10, RM5, RM1, sen50, sen20, sen10, sen5;
    double totalAmount;

    money(double a) {
        totalAmount = a;
    }

    void roundUp() {
        int temp = (int)(totalAmount*100);
        if (temp % 10 == 9 || temp % 10 == 4) {
            totalAmount += 0.01;
        } else if (temp % 10 == 8 || temp %10 == 3) {
            totalAmount += 0.02;
        } else if (temp % 10 == 7 || temp % 10 == 2) {
            totalAmount -= 0.02;
        } else if (temp % 10 == 6 || temp % 10 == 1) {
            totalAmount -= 0.01;
        } 
    }

    void calculate() {
        double temp = totalAmount;
        RM100 += temp / 100;
        temp -= RM100 * 100;
        RM50 += temp / 50;
        temp -= RM50 * 50;
        RM10 += temp / 10;
        temp -= RM10 * 10;
        RM5 += temp / 5;
        temp -= RM10 * 10;
        RM1 += temp / 1;
        temp -= RM1 * 1;
        sen50 += temp / 0.5;
        temp -= sen50 * 0.5;
        sen20 += temp / 0.2;
        temp -= sen20 * 0.2;
        sen10 += temp / 0.1;
        temp -= sen10 * 0.1;
        sen5 += temp / 0.05;
    }

    static money addition(money a, money b) {
        money c = new money(a.totalAmount - b.totalAmount);
        return c;
    }

    static money substraction(money a, money b) {
        money c = new money(a.totalAmount - b.totalAmount);
        return c;
    }

    void displayAmount() {
        System.out.printf("The total amount of money is %2.2f\n" , totalAmount);
        System.out.println("The number of RM100 is " + RM100);
        System.out.println("The number of RM50 is " + RM50);
        System.out.println("The number of RM10 is " + RM10);
        System.out.println("The number of RM5 is " + RM5);
        System.out.println("The number of RM1 is " + RM1);
        System.out.println("The number of 50 sen is " + sen50);
        System.out.println("The number of 20 sen is " + sen20);
        System.out.println("The number of 10 sen is " + sen10);
        System.out.println("The number of 5 sen is " + sen5 + " \n ");
    }
}

class TesterMoney {

    public static void main(String[] args) {
        money money1 = new money(102.21);
        money money2 = new money(51);
        money1.roundUp();
        money2.roundUp();
        money1.calculate();
        money2.calculate();
        money1.displayAmount();
        money2.displayAmount();
        money substractMoney = money.substraction(money1, money2);
        substractMoney.calculate();
        substractMoney.displayAmount();
        money additionMoney = money.addition(money1, money2);
        additionMoney.calculate();
        additionMoney.displayAmount();
    }
}
