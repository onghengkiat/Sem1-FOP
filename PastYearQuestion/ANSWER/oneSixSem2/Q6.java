class Q6{
    public static void main(String[] args) {
        FinancialRecord recordA = new FinancialRecord(1234 , 10000, 7.77);
        System.out.println("The information about financial record A is as follows: ");
        recordA.displayRecordInfo();

        System.out.println("");

        System.out.println("The information about financial record B is as follows: ");
        FinancialRecord recordB = new FinancialRecord(1001, 20000, 8);
        recordB.displayRecordInfo();
        System.out.println("The monthly interest rate is: " + recordB.getMonthlyInterestRate());
        recordB.deposit(1500);
        recordB.withdraw(500);
    }
}
