package TutorialQuestion;
public class Tutorial9 {
    /*1a
    static boolean sameClass(Student s , Teacher t){
        if (s.getClass() == t.getClass()){
            return true;
        }
        else {
            return false;
        }
    }*/
    
    /*1b
    static boolean isClass (Student s){
        if(s instanceof Person){
            return true;
        }
        else{
            return false;
        }
    }*/
}
//2
class Organism {
    double initialSize, growthRate;
    Organism(){
        
    }
    Organism (double a, double b){
        initialSize = a;
        growthRate = b ;
    }
}

class animal extends Organism{ 
    double amountOfEatingNeed;
    animal(double a, double b , double c){
        super(a,b);
        amountOfEatingNeed =c;
    }
    void display(){
        System.out.println("The initial size is " + initialSize);
        System.out.println("The growth rate is " + growthRate);
        System.out.println("The amount of eating need is " + amountOfEatingNeed);
    }
        
}

//3
class PaySystem {
    int payRate, numOfHours;
    double totalPay;
    PaySystem (int a){
        payRate = a;
    }
    double totalPay(int a){
        numOfHours = a;
        totalPay = payRate * numOfHours;
        return totalPay;
    }
    void displayTotalPayment(){
        System.out.println("The total payment is " + totalPay);
    }
}

class RegularPay extends PaySystem{
    RegularPay(int a){
        super(a);
    }
}

class SpecialPay extends PaySystem{
    SpecialPay (int a){
        super (a);
    }
    double totalPay(int a){
        numOfHours = a;
        totalPay = payRate * numOfHours;
        return totalPay*1.3;
    }
    void displayTotalPayment(){ 
        System.out.println("The total payment is " + (double) totalPay*1.3);
    }
}

//4
class PurchaseSystem{
    String productCode;
    double unitPrice,totalPrice;
    int quantity;
    PurchaseSystem(String a, double b, int c){
        productCode = a;
        unitPrice = b;
        quantity = c;
    }
    
    void setTotalPrice(){
        totalPrice = unitPrice * quantity;
    }
    void displayTotalPrice(){
        System.out.println("The total price is " + totalPrice);
    }
}

class SugarPurchase extends PurchaseSystem{
    double sugarWeight;
    SugarPurchase(String a, double b, int c, double d){
        super(a,b,c);
        sugarWeight = d;
    }
    void setTotalPrice(){
        totalPrice = unitPrice * quantity*sugarWeight;
    }
    void displayTotalPrice(){
        System.out.println("The total price is " + totalPrice);
    }
}
