
public class L6Q2 {
    public static void main(String[] args) {
        int triangle_height = 3;
        for (int i=0 ; i<triangle_height ; i++){ //Printing triangle
            multiPrint (triangle_height-i,' '); //left space
            multiPrint(i+1+i , '*'); //number of stars
            System.out.println(""); //Space a line
        }
        System.out.println(""); //Space a line
        int diamond_height = 5;
        int half_height = diamond_height/2;
        for (int i=0 ; i<half_height ; i++){ //Printing upper part of diamond
            multiPrint (half_height-i,' '); //left space
            multiPrint(i+1+i , '*'); //number of stars
            System.out.println(""); //Space a line
        }
        if(diamond_height%2 != 0) {
            multiPrint(half_height + 1 + half_height, '*');//Printing middle part
            System.out.println();
        }
        for(int i=half_height - 1;i>=0;i--){//Printing lower part of diamond
            multiPrint (half_height-i,' '); //left space
            multiPrint(i+1+i , '*'); //number of stars
            System.out.println(""); //Space a line
        }
    }
                
    public static void multiPrint (int n, char c){
        for (int i =0; i<n ; i++){
            System.out.print(c);
        }
    }
}
