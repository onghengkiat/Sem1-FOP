class Q4{
    public static void main(String[] args) {
        Account recordA = new Account(1234 , 10000, 7.77);
        System.out.println("The information about account A is as follows: ");
        recordA.displayRecordInfo();

        System.out.println("");

        System.out.println("The information about account B is as follows: ");
        Account recordB = new Account(1001, 20000, 8);
        recordB.displayRecordInfo();
        System.out.println("The monthly interest rate is: " + recordB.getMonthlyInterestRate());
        recordB.deposit(1500);
        recordB.withdraw(500);
    }
}
