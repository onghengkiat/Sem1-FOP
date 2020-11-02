import java.util.Scanner;

class Q2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the initial tuition fee (i.e year 1): ");
        double tuitionFee = input.nextDouble();
        System.out.print("Enter the yearly rate of increment (e.g enter 5.2 for 5.2%): ");
        double rateOfIncrement = input.nextDouble();
        System.out.print("Enter the year for which you wish to compute the tuition fee for: ");
        int year = input.nextInt();
        System.out.println("\nComputed tuition fee for year " + year + " is: " + computeFee(tuitionFee, rateOfIncrement, year));
    }

    //question output macam salah ?
    public static double computeFee(double initialTuitionFee , double rateOfIncrement, int year){
        double tuitionFee = initialTuitionFee;
        for(int i = 1 ; i < year ; i++){
            tuitionFee += tuitionFee * (rateOfIncrement/100);
        }
        return tuitionFee;
    }
}
