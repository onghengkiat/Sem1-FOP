package finalfop;
public class Q5 {
    public static void main(String[] args) {
        //create object for all jobs in the table
        Job job1 = new Job("J1" , 252 , 20);
        Job job2 = new Job("J2" , 108 , 10);
        Job job3 = new Job("J3" , 72 , 25);
        
        //create object for all cloud packages in the table
        CloudPackage package1 = new CloudPackage("P2-15",4,15,1.24);
        CloudPackage package2 = new CloudPackage("P2-30",6,30,2.11);
        CloudPackage package3 = new CloudPackage("R5-20",4,20,1.38);
        CloudPackage package4 = new CloudPackage("R6-20",6,20,1.88);
        
        //之后放进array里面
        Job [] jobList = {job1,job2,job3};
        CloudPackage [] packageList = {package1, package2, package3, package4};
        
        //totalCost 来完成每一个jobs
        double totalCost = 0 ;
        
        //check每一个job
        for(int i = 0 ; i < jobList.length ; i ++){
            
            //这个是用来找那个package给到最便宜的cost和那个index
            //minIndexy也能用来check有没有那个package是memory够来execute这个package的，过后会用到，在for loop下面
            double minCost = Double.MAX_VALUE;
            int minIndex = -1 ;
            
            //看那一个package最适合它
            for(int j = 0 ; j < packageList.length ; j ++){
                
                //看有没有哪一个package是可以完成那个jobs的，就是说memory够的
                if(packageList[j].check(jobList[i])){
                    //够的话就来check看cost多少
                    //找看那个给到最低的cost
                    if(packageList[j].totalCost(jobList[i]) <= minCost){
                        minCost = packageList[j].totalCost(jobList[i]);
                        minIndex = j;
                    }
                }
            }
            
            //看看for这个job，最适合它的package是什么
            System.out.println(jobList[i].toString());
            
            //check完每个package了，现在就来看minIndex了
            //这代表说完全没有一个package够memory，可是这个在sample output里面没有，所以其实可以不用理它
            if(minIndex == -1){
                System.out.println("No valid package");
            }else{
                //拿最低cost的那个package，所以就是minIndex的
                System.out.println(packageList[minIndex].toString());
            }
            
            //完成一个job了，就来加一下totalCost
            totalCost += minCost;
            
            System.out.println("Total Cost : " + totalCost);
        }
    }
}
