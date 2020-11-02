package finalfop;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        //拿location1的latitude 和longitude
        System.out.println("Location 1");
        double lat1 = requestInput();
        double lon1 = requestInput();
        
        //拿location2的latitude 和longitude
        System.out.println("Location 2");
        double lat2 = requestInput();
        double lon2 = requestInput();
        
        //算它们之间的距离
        double distance = calculateDistance(lat1, lon1, lat2, lon2);
        
        //print latitude & longitude给location 1，in five decimals
        System.out.printf("Location 1 : %.5f Latitude , %.5f Longitude" , lat1, lon1);
        System.out.println("");
        
        //print latitude & longitude给location 2，in five decimals
        System.out.printf("Location 2 : %.5f Latitude , %.5f Longitude" , lat2, lon2);
        System.out.println("");
        
        //print out distance in 2 decimals
        System.out.printf("Distance : %.2f KM" , distance);
        System.out.println("");
    }
    
    //叫user给input
    //这个是return double，代表说我会直接return latitude/longitude的decimal degree
    //因为我在user input的时候顺便convert去decimal degree了
    public static double requestInput(){
        Scanner input = new Scanner(System.in);
        //拿input
        System.out.print("Enter Direction: [N, S, E, W]: ");
        char direction = input.next().charAt(0);
        System.out.print("Enter Degree, Minute and Second : ");
        
        //直接convert那些input去decimal degree
        //第一个nextDouble()是degree, 第二个是minute, 第三个是second
        return convertDecimalDegree(direction , input.nextDouble() , input.nextDouble() , input.nextDouble());
    }
    
    //把user input的direction，degree，minute和second通过formula转换成decimal degree
    public static double convertDecimalDegree(char direction , double degree , double minute , double second){
        //放formula进去
        //这边要注意的是题目的formula给到不清楚，那个sign其实是for whole(degree + (minute*60+second)/3600)
        double decimalDegree = degree + (minute * 60 + second) / 3600;
        
        //如果direction是S或者W要乘-1
        if(direction == 'S' || direction == 'W'){
            decimalDegree *= -1;
        }
        return decimalDegree;
    }
    
    //算距离
    public static double calculateDistance(double lat1, double lon1, double lat2, double lon2){
        //也是丢formula而已
        //要注意的是，用Math.sin的时候，angle要in radians， 然后就是sin square 和sin(sin)是不一样的东西来的
        double a = Math.pow(Math.sin(Math.toRadians((lat1-lat2) / 2)),2) 
                + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2))
                * Math.pow(Math.sin(Math.toRadians((lon1 - lon2) / 2)),2);
        //也是跟着formula丢进去
        double c = 2*Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        
        //6371是地球的radius
        double d = c*6371;
        return d;
    }
}
