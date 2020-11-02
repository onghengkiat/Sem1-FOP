package LabQuestion.Lab1;

public class L1Q3 {
    public static void main(String[] args) {
        //square
        //hard code ans
        System.out.println("Hard Code Answer");
        System.out.println("*********");
        System.out.println("*       *");
        System.out.println("*       *");
        System.out.println("*       *");
        System.out.println("*       *");
        System.out.println("*       *");
        System.out.println("*       *");
        System.out.println("*       *");
        System.out.println("*********");

        //dynamic answer
        System.out.println("Dynamic with Size:");
        int square_size = 9;
        for (int i = 0; i < square_size; i++) {
            /*
            This if statement refers to the condition where
            it is the first line or the last line of the square shape
            */
            if (i == 0 || i == square_size - 1) {
                //If the square size is 9, then shud be having 9 stars on this line
                for (int j = 0; j < square_size; j++)
                    System.out.print("*");
            } else {
                //On these lines, stars only exist in the first and last place.
                System.out.print("*");

                //So if the size is 9, it should be having 2 starts at first and last place
                //And also 7 spaces between them which is 9 - 2 (square_size - 2)
                for (int j = 0; j < square_size - 2; j++)
                    System.out.print(" ");

                //print the last star
                System.out.print("*");
            }
            //this is to space a line
            //instead of this, u can do System.out.print("*\n");
            //\n is an escape character which refers to next line
            System.out.println();
        }

        //simply spacing 2 lines to separate it with the next shape
        System.out.println("\n\n");

        //circle
        //hard code answer
        System.out.println("Hard code answer");
        System.out.println("  ***  ");
        System.out.println(" *   * ");
        System.out.println("*     *");
        System.out.println("*     *");
        System.out.println("*     *");
        System.out.println("*     *");
        System.out.println("*     *");
        System.out.println(" *   * ");
        System.out.println("  ***  ");


        // dynamic answer
        System.out.println("Dynamic with Size:");
        int width = 7;

        //what I found out from the circle is the height is bigger than the width 2 units.
        int height = width + 2;

        //This is the space from any one side
        //for example for the first line with circle_size = 9
        //there would be 2 spaces from each left and right
        //so the initial_side_space would be 2 spaces
        int initial_side_space = (width - 3) / 2;
        int side_space = initial_side_space;

        //print the first line which is 3 stars on the middle
        System.out.println(" ".repeat(side_space) + "*".repeat(3) + " ".repeat(side_space));
        //then the side_space is decreased for the next line
        side_space -- ;

        //the count is used to count, we already makes how many lines
        int count =  1;
        while(side_space > 0){
            count ++ ;
            int middle_space = width - side_space*2 - 2 ;
            System.out.println(" ".repeat(side_space) + "*" + " ".repeat(middle_space) + "*" + " ".repeat(side_space));
            side_space = side_space - 1;
        }

        /*
        so now we have completed the upper part, we look at the count of the lines we have made
        For example, if we have made 2 lines for the upper part (including the first line)
        which means we would need 2 lines for the lower part also
        So if the height required is 9, then we need to construct (9-2-2) which is 5 more lines for the middle part
         */

        int middle_line_required = height - count*2;
        for (int i = 0 ; i < middle_line_required ; i++){
            int middle_space = width - 2;
            System.out.println("*" + " ".repeat(middle_space) + "*");
        }

        //same goes to the lower part , its just looks similar to the upper part
        //but instead of decreasing side_space for next line, it would be increase side_space for next line
        // -1 here because the initial side space is for the first line
        // we would explicitly print the last line outside the while loop
        while(side_space < initial_side_space - 1){
            side_space ++;
            int middle_space = width - side_space*2 - 2 ;
            System.out.println(" ".repeat(side_space) + "*" + " ".repeat(middle_space) + "*" + " ".repeat(side_space));
        }

        //print the last line which same with the first line
        System.out.println(" ".repeat(initial_side_space) + "*".repeat(3) + " ".repeat(initial_side_space));
        System.out.println("\n\n");

        //tree
        //hard code answer
        System.out.println("Hard code answer:");
        System.out.println("  *  ");
        System.out.println(" *** ");
        System.out.println("*****");
        System.out.println("  *  ");
        System.out.println("  *  ");
        System.out.println("  *  ");
        System.out.println("  *  ");
        System.out.println("  *  ");

        System.out.println("Dynamic with Size:");
        //makes the ratio of top:body = 1:2
        int tree_height = 8 ;
        int tree_width = 5 ;

        //for the upper part, it would be starting with 1 star at the middle. so the side space would be
        int tree_side_space = (tree_width - 1)/2;
        //we would continue printing it until the side space is 0
        //lets count how many lines we have printed for the upper part, to ease the process of printing lower part
        int line_count = 0;
        while (tree_side_space >= 0 ){
            int num_of_stars = tree_width - tree_side_space*2;
            System.out.println(" ".repeat(tree_side_space) + "*".repeat(num_of_stars) + " ".repeat(tree_side_space));
            line_count++;
            tree_side_space --;
        }

        //now the lower part
        int lower_lines = tree_height - line_count;
        //the side space is same with the first line of the upper part
        tree_side_space = (tree_width - 1 )/2;
        for(int i =0 ; i < lower_lines; i++){
            System.out.println(" ".repeat(tree_side_space) + "*" + " ".repeat(tree_side_space));
        }

        System.out.println("\n\n");

        //diamond
        //hard code answer
        System.out.println("Hard code:");
        System.out.println("    *    ");
        System.out.println("   * *   ");
        System.out.println("  *   *  ");
        System.out.println(" *     * ");
        System.out.println("*       *");
        System.out.println(" *     * ");
        System.out.println("  *   *  ");
        System.out.println("   * *   ");
        System.out.println("    *    ");

        System.out.println("Dynamic with Size:");
        int diamond_size = 9;
        side_space = (diamond_size - 1) / 2;
        //prin the first line which only has 1 star
        System.out.println(" ".repeat(side_space) + "*" + " ".repeat(side_space));
        side_space -- ;

        //print the upper part
        while(side_space >= 0 ){
            int middle_space = diamond_size - side_space * 2 - 2;
            System.out.println(" ".repeat(side_space) + "*" + " ".repeat(middle_space) + "*" + " ".repeat(side_space));
            side_space -- ;
        }

        //print the lower part
        //the side space would be negative 1 after printing upper part, make it to be positive 1
        side_space = 1;
        int middle_space = diamond_size - 2 - side_space*2;
        while(middle_space > 0  ){
            System.out.println(" ".repeat(side_space) + "*" + " ".repeat(middle_space) + "*" + " ".repeat(side_space));
            side_space ++;
            middle_space = diamond_size - 2 - side_space*2;
        }
        //print the last line which only consists of 1 star
        System.out.println(" ".repeat(side_space) + "*" + " ".repeat(side_space));
    }
}
