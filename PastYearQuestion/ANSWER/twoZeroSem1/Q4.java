package finalfop;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        //一开始的标题
        System.out.println("Reading from log file...");
        //repeat 40次 "*"
        System.out.println("*".repeat(40));
        System.out.println("Records read from log file\n");

        ArrayList<String[]> recordQ = new ArrayList<String[]>();
        ArrayList<String[]> recordS = new ArrayList<String[]>();
        ArrayList<String[]> recordE = new ArrayList<String[]>();

        //算total number of record同一时间顺便display record
        //顺便再把那些record分类放进去arrayList里面
        int totalNumOfRecord = calculateNumOfRecord(recordQ, recordS, recordE);

        //找users name 和jobs submitted
        ArrayList<String> users = new ArrayList<String>();
        ArrayList<Integer> jobSubmitted = new ArrayList<Integer>();

        findUser(recordS, users, jobSubmitted);
        printUser(users, jobSubmitted);

        printJobStatus(recordS, recordE);
        
    }

    public static int calculateNumOfRecord(ArrayList<String[]> recordQ, ArrayList<String[]> recordS, ArrayList<String[]> recordE) {
        int totalNumOfRecord = 0;

        //read the file
        try {
            //for sampleLog ,不用放.txt
            Scanner inputStream = new Scanner(new FileInputStream("sampleLog"));

            while (inputStream.hasNextLine()) {

                //拿那个line
                String line = inputStream.nextLine();

                //把那个line(record)的每个attribute分出来，然后放进去array里面
                String[] record = line.split(" ");

                //每当妳拿到一个新的line就代表说number of record ++了
                totalNumOfRecord++;

                //顺便把那个record 分类放进去arrayList里面
                putRecord(record, recordQ, recordS, recordE);

                //把这个record print 出来
                printRecord(record, totalNumOfRecord);
            }

            //最后的时候display出来总共多少个records
            System.out.println("\ntotal records read: " + totalNumOfRecord + "\n");

            inputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
        } catch (IOException e) {
            System.out.println("Problem with file output");
        }

        return totalNumOfRecord;
    }

    public static void printRecord(String[] record, int numOfRecord) {

        //for每个record的标题
        System.out.println("Record " + numOfRecord);

        //把每个attribute print出来
        for (String attribute : record) {
            System.out.println("\t" + attribute);
        }
    }

    //把那些record分类放进去arrayList里面
    public static void putRecord(String[] record, ArrayList<String[]> recordQ, ArrayList<String[]> recordS, ArrayList<String[]> recordE) {
        //type of record一定都是会放在第二个attribute那边
        //然后用;来split，它就在第二个elements
        //for example : 00:44:56;Q;14126.ce2.dicc.um.edu.my;queue=um
        //会变成{00:44:56, Q, 14126.ce2.dicc.um.edu.my, queue=um}
        String type = record[1].split(";")[1];

        //Q return 1 , S return 2, E return 3
        if (type.equalsIgnoreCase("Q")) {
            recordQ.add(record);
        } else if (type.equalsIgnoreCase("S")) {
            recordS.add(record);
        } else if (type.equalsIgnoreCase("E")) {
            recordE.add(record);
        }
    }

    //number of jobs submitted是看s record的，s record的数量就是total number of jobs submitted
    //所以当一个同样的user名字出现在两个s record里面，代表说那个user submit了两个jobs
    public static void findUser(ArrayList<String[]> recordS, ArrayList<String> users, ArrayList<Integer> jobSubmitted) {
        for (int i = 0; i < recordS.size(); i++) {
            //recordS.get(i)[1]是因为那个user name在那个recordS的第二个attribute，所以拿index 1
            //然后用";|="来split它，用=的原因是，我们不要user=weng只要weng而已，所以要再split它
            //比如说00:45:00;S;14126.ce2.dicc.um.edu.my;user=weng
            //就会变成{00:45:00, S, 14126.ce2.dicc.um.edu.my, user, weng}，所以我们要的名字就在index4，就可以拿到weng了
            String name = recordS.get(i)[1].split(";|=")[4];

            //接下来这个concept和第三题找mode的完全一样做法，只是variable不一样而已
            if (!users.contains(name)) {
                users.add(name);
                jobSubmitted.add(0);
            }
            int indexOfName = users.indexOf(name);
            jobSubmitted.set(indexOfName, jobSubmitted.get(indexOfName) + 1);
        }
    }

    //把那些user和job submitted print out出来
    public static void printUser(ArrayList<String> users, ArrayList<Integer> jobSubmitted) {
        //先print标题
        System.out.println("*".repeat(40));
        System.out.println("Print user submission stat\n");

        //according to the sample output, it is 16 spaces
        System.out.println("User" + " ".repeat(16) + "Jobs Submitted");
        System.out.println("-".repeat(4) + " ".repeat(16) + "-".repeat(14));

        //接下来开始print out user
        for (int i = 0; i < users.size(); i++) {
            String name = users.get(i);
            int numOfJobsSubmitted = jobSubmitted.get(i);

            //" ".repeat(20 - name.length())是因为包括那个名字，总共空了20格，才开始print number of jobs submitted
            System.out.println(name + " ".repeat(20 - name.length()) + numOfJobsSubmitted);
        }
    }

    public static void printJobStatus(ArrayList<String[]> recordS, ArrayList<String[]> recordE) {
        //print标题
        System.out.println("\n" + "*".repeat(40));
        System.out.println("Print Job Status\n");

        System.out.println("Job ID" + " ".repeat(5) + "Submitted (queue)" + " ".repeat(6) + "Started (start time)" + " ".repeat(2) + "Exited (end time/error)");
        System.out.println("-".repeat(6) + " ".repeat(5) + "-".repeat(17) + " ".repeat(6) + "-".repeat(20) + " ".repeat(2) + "-".repeat(23));

        //找job id
        for (int i = 0; i < recordS.size(); i++) {
            //id for recordS.get(i)肯定是在第二个attribute所以用recordS.get(i)[1]
            //然后会拿到这样的东西00:45:00;S;14126.ce2.dicc.um.edu.my;user=weng 就用.split(";|\\.ce2\\.dicc\\.um\\.edu\\.my")
            //这样就可以拿到[00:45:00, S, 14126, , user=weng]
            //所以我们要的id就会在3个element也就是说index 2所以拿第二个index的
            String id = recordS.get(i)[1].split(";|\\.ce2\\.dicc\\.um\\.edu\\.my")[2];

            //之后就print出来，11-id.length()是因为，算上那个id总共空了11格才开始print submitted的东西
            System.out.print(id + " ".repeat(11 - id.length()));

            //找到了id接下来开始找它的queue，在第五个attribute for recordS就是说是index4
            //queue=um
            //我们不要queue=,只要um而已，所以就split("=")拿到 [queue, um]，所以我们要的东西在第二个element就拿index1就好了
            String queue = recordS.get(i)[4].split("=")[1];

            //之后就print出来，19-queue.length()是因为，算上那个queue总共空了19格才开始print started的东西
            System.out.print("Y (" + queue + ")" + " ".repeat(19 - queue.length()));

            //记下来就开始找startTime，这个是在第9个attribute也就是说index8
            //和那个queue一样，我们会拿到start=1488329100之类的东西，我们不要start=，所以我们就split("=")
            //就会拿到[start, 1488329100]，所以我们要的东西在第二个element就是index1
            String startTime = recordS.get(i)[8].split("=")[1];

            //之后就print出来，18-startTime.length()是因为，算上那个startTime总共空了18格才开始print end的东西
            System.out.print("Y (" + startTime + ")" + " ".repeat(18 - startTime.length()));
            
            printEndTime(recordE, id, i);
        }
    }

    public static void printEndTime(ArrayList<String[]> recordE , String id , int i) {
        //最后一个步骤了就是找出endTime/Error
        //这个就要从recordE 那边来找了
        //set一个gotEndTime = false, 如果没有一个recordE是和这个recordS的id是一样的，代表说没有error status所以就print null
        boolean gotExitStatus = false;

        for (int j = 0; j < recordE.size(); j++) {
            //和刚刚上面拿id的方法一样
            String idForRecordE = recordE.get(j)[1].split(";|\\.ce2\\.dicc\\.um\\.edu\\.my")[2];
            if (idForRecordE.equalsIgnoreCase(id)) {
                gotExitStatus = true;
                //有exit status的话就来check 那个exit status
                //如果不是1 的话就是error BY JACK

                //exitStatus 是在第18个attribute所以是index 17 , recordE.get(i)[17]
                //然后就会拿到这样的东西Exit_status=134 可是我们不要_和=所以就split("(_)|(=)")
                //就会变成[Exit, status, 134]我们只需要那个号码，所以拿index2
                String exitStatus = recordE.get(j)[17].split("_|=")[2];

                //所以接下来我们就拿index2 来check，看看131是不是1，不是的话就代表说是error了
                if (!exitStatus.equalsIgnoreCase("1")) {
                    //然后就把那个error status print出来
                    //Error: + Exit + status
                    System.out.println("Error: Exit Status " + exitStatus);
                } else {
                    //如果没有问题的话，就去找end time
                    //endTime是在第17个attribute所以是index16 , recordE.get(i)[16];
                    //就会拿到end=1488340389，可是我们不要end=，所以split("=")就会拿到[end, 1488340389]，所以我们要的东西在index1
                    String endTime = recordE.get(i)[16].split("=")[1];
                    System.out.println(endTime);
                }

            }
        }
        if (gotExitStatus == false) {
            System.out.println("null");
        }
    }

}
