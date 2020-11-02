package finalfop;
public class Cloud {
    //field for cloud package 其实是那个cloud package的名字
    private String cloudPackage;
    
    //field for totalCost if using this package
    protected double totalCost;

    //accessor
    public double getTotalCost() {
        return totalCost;
    }

    //constructor
    public Cloud(String cloudPackage) {
        this.cloudPackage = cloudPackage;
    }
    
    //toString method
    public String toString(){
        //total cost要output in 2 decimals
        return String.format("Cloud Package : " + cloudPackage + "  Total Cost= %.2f" ,totalCost);
    }
}
