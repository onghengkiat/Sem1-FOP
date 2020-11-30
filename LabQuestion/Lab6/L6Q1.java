public class L6Q1 {
    public static void main(String[] args) {
        int triangleNumber = 0;
        System.out.print("The triangular numbers are " + triangleNumber);
        for (int i=1 ; i<21 ; i ++){
            triangleNumber += i ;
            System.out.print(" ," + triangleNumber);
        }
    }
}
