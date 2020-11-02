class DayOfTheWeek{
    private int h, q,m,y,j,k ;
    
    public DayOfTheWeek(int q, int m , int y){
        this.q = q;
        this.m = m;
        this.y = y;
        j = y/100;
        k = y%100;
        if(m == 1 || m == 2){
            y --;
            j = y/100;
            k = y%100;
            h = (int)(( q + Math.floor(13*(m+1 + 12)/5) + k + Math.floor(k/4) + Math.floor(j/4) + 5*j)%7);
        }else{
            h = (int)(( q + Math.floor(13*(m+1)/5) + k + Math.floor(k/4) + Math.floor(j/4) + 5*j)%7);
        }
    }
    public boolean validDay(){
        switch(m){
            case 1 : if(q > 31)
                        return false;
                     break;
            case 2 : if(q > 29)
                        return false;
                     if(q == 29 && !leapYear() )
                         return false;
                     break;
            case 3 : if(q > 31)
                        return false;
                     break;
            case 4 : if(q > 30)
                        return false;
                     break;
            case 5 : if(q > 31)
                        return false;
                     break;
            case 6 : if(q > 30)
                        return false;
                     break;
            case 7 : if(q > 31)
                        return false;
                     break;
            case 8 : if(q > 31)
                        return false;
                     break;
            case 9 : if(q > 30)
                        return false;
                     break;
            case 10 : if(q > 31)
                        return false;
                     break;
            case 11 : if(q > 30)
                        return false;
                     break;
            case 12 : if(q > 31)
                        return false;
                     break;
            default : return false;
        }
        
        if(h < 0 || h > 6){
            return false;
        }
        
        return true;
    }
    
    public boolean leapYear(){
        if(y % 400 == 0){
            return true;
        }
        if(y % 4 == 0 && y % 100 != 0){
            return true;
        }
        return false;
    }
    
    public void displayDay(){
        System.out.print(q + "/" + m + "/" + y +" is ");
        if(validDay()){
            System.out.print("on ");
            switch(h){
                case 0 : System.out.println("Saturday");
                         break;
                case 1 : System.out.println("Sunday");
                         break;
                case 2 : System.out.println("Monday");
                         break;
                case 3 : System.out.println("Tuesday");
                         break;
                case 4 : System.out.println("Wednesday");
                         break;
                case 5 : System.out.println("Thursday");
                         break;
                case 6 : System.out.println("Friday");
                         break;
            }
        }else{
            System.out.println("invalid Input");
        }
    }
}

