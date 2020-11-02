package finalfop;
public class Job {
    //field for the name of the job
    private String name;
    
    //field for the number of tasks
    private int numOfTask;
    
    //field for the memory
    private int memory;

    
    //accessor for all the field
    public String getName() {
        return name;
    }

    public int getNumOfTask() {
        return numOfTask;
    }

    public int getMemory() {
        return memory;
    }

    //constructor that contains the above field
    public Job(String name, int numOfTask, int memory) {
        this.name = name;
        this.numOfTask = numOfTask;
        this.memory = memory;
    }
 
    //toString method
    public String toString(){
        return "Job Name : " + name + " Memory = " + memory + " Number of Task = " + numOfTask;
    }
    
}
