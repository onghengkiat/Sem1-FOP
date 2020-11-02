import java.util.Scanner;

public class Q2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of tender : ");
        int n = input.nextInt();
        String [] name = new String [n] ;
        double [] price = new double [n];

        for(int i = 0 ; i < n ; i++){
            System.out.print("Enter name : ");
            input.nextLine();
            name[i] = input.nextLine();
            System.out.print("Enter reservation price : ");
            price[i] = input.nextDouble();
        }

        for(int i = 0 ; i < n-1 ; i++){
            for(int j = 0; j < n - 1 ; j++){
                if(price[j+1] > price[j]){
                    double temp = price[j+1];
                    price[j+1] = price[j];
                    price[j] = temp;

                    String temp1 = name[j+1];
                    name[j+1] = name[j];
                    name[j] = temp1;
                }
            }
        }

        System.out.println("List of tender : ");
        for(int i = 0 ; i < n ; i++){
            System.out.print(name[i]);
            if(i != n - 1){
                System.out.print(", ");
            }
        }
        System.out.println("");
        System.out.printf("The winner of BMW88 : %s {%.2f)" ,name[0], price[0]);
    }
}
