package finalfop;
public class CloudPackage extends Cloud{
    //field for the numbers of core
    private int numOfCore ; 
    
    //field for the memory
    private int memory;
    
    //field for price per hour
    private double pricePerHour;

    //constructor that contains the above field
    public CloudPackage(String cloudPackage, int numOfCore, int memory, double pricePerHour) {
        super(cloudPackage);
        this.numOfCore = numOfCore;
        this.memory = memory;
        this.pricePerHour = pricePerHour;
    }
    
    //check method
    public boolean check(Job job){
        //如果job的memory大过这个package的memory
        //那么这个package就无法完成那个job了
        //所以return false
        if(job.getMemory() > this.memory){
            return false;
        }
        
        //如果job的memory没有大过这个memory的话，就代表说这个package可以完成那个job
        //所以return true
        return true;
    }
    
    //totalCost method
    public double totalCost(Job job){
        //一个task要一个小时
        //numOfCore越多就越快，如果是两个，速度就变两倍，需要的时间就会除二，所以就除numOfCore
        //最后numOfTask/numOfCore就找到要花多少个小时来完成这个task了
        //所以拿来乘pricePerHour就是答案了
        //这边还有一个要注意的是，不可以直接return job.getNumOfTask()*pricePerHour/numOfCore
        //要不然的话，你过后用toString method inherits from Cloud class就会拿到0cost了，因为totalCost in那个class还是0
        totalCost = job.getNumOfTask()*pricePerHour/numOfCore;
        return totalCost;
    }
}
