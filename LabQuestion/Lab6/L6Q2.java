
public class L6Q2 {
    public static void main(String[] args) {
        for (int i=0 ; i<5 ; i++){ //Printing triangle
            //left space
            multiPrint (5-i,' ');
            //number of stars
            multiPrint(i+1+i , '*');
            System.out.println(""); //Space a line
        }

        System.out.println("\n\n");

        for (int i=0 ; i<=3 ; i++){ //Printing upper and middle part of diamond
            //left space
            multiPrint (5-i,' ');
            //number of stars
            multiPrint(i+1+i , '*');
            System.out.println(""); //Space a line
        }

        multiPrint(5-4, ' ');
        multiPrint(4 + 1 + 4, '*');
        System.out.println();

        for(int i=3;i>=0;i--){//Printing lower part of diamond
            //left space
            multiPrint (5-i,' ');

            //number of stars
            multiPrint(i+1+i , '*');
            System.out.println(""); //Space a line
        }
    }

    public static void multiPrint (int n, char c){
        for (int i =0; i<n ; i++){
            System.out.print(c);
        }
    }
}
