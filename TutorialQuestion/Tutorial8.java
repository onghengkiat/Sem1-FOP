package TutorialQuestion;

public class Tutorial8 {

    public static void main(String[] args) {
        //1g
        Student student1 = new Student();
        //1h
        student1.mutator("123456789");

        //1j
        Animal cat = new Animal("cat");
        //1k
        Number num1 = new Number(20);
        Number num2 = new Number(40);
        
    }
}
//1a
class Student {
    //1b
    String contactNum;
    //1c
    Student() {
        contactNum = null;
    }
    //1d
    Student(String s) {
        contactNum = s;
    }
    //1e
    public String accessor() {
        return contactNum;
    }

    public void mutator(String a) {
        contactNum = a;
    }
    //1f
    public void display() {
        System.out.println(contactNum);
    }
}
//1i
class Animal {

    String type;

    Animal(String s) {
        type = s;
    }
}

class Number {

    int value;
    Number(int a) {
        value = a;
    }
    
}

//2a
class Digit{
    static int ans=1;
    //2b
    int variable;
    //2c
    Digit (int a){
        variable = a;
    }
    //2d
    public int digitMultiplication(){
        while(variable != 0){
        ans *= variable%10 ;
        variable /= 10;
        }
        return ans;
    }
    
    //2e
    public void display(){
        System.out.println(ans);
    }
}

//2f
class TesterDigit{
    public static void main(String[] args) {
        Digit digit1= new Digit(4567);
        digit1.digitMultiplication();
        digit1.display();
    }
}

//3
class twoDimensionCoordinate{
    int xCoordinate,yCoordinate;
    twoDimensionCoordinate(int x, int y){
        xCoordinate = x;
        yCoordinate = y;
    }
    void setXCoordinate(int x){
        xCoordinate =x;
    }
    void setYCoordinate(int y){
        yCoordinate = y;
    }
    int getXCoordinate(){
        return xCoordinate;
    }
    int getYCoordinate(){
        return yCoordinate;
    }
    void display(){
        System.out.println("The x coordinate is " + xCoordinate);
        System.out.println("The y coordinate is " + yCoordinate);
    }
    
}

//4 dont know
class Payment{
    String paymentMethod;
    int cash;
    int chequeAmount, chequeNumber;
    int cardAmount , validationCode;
    String cardHolderName,cardType,expirationDate;
    Payment(String s){
        paymentMethod = s;
    }
    void paymentInformation(int a){
        cash = a;
    }
    void paymentInformation(int a, int b){
        chequeAmount = a;
        chequeNumber = b;
    }
    void paymentInformation(int a,int b,String c, String d, String e){
        cardAmount = a;
        validationCode =b;
        cardHolderName = c;
        cardType = d;
        expirationDate = e;
    }
    
}

//5
class Connection{
    int numberOfConnection=0;
    
    Connection(){
        numberOfConnection ++;
    }
    
    void disconnect(){
        numberOfConnection --;
    }
    
    void display(){
        System.out.println("The number of connections to the server is " + numberOfConnection);
    }
}
