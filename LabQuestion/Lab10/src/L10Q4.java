import java.io.*;
import java.util.Scanner;

public class L10Q4 {
    public static void main(String[] args) {
        //create file
        try {
            Scanner inputStream = new Scanner(new FileInputStream("appointment.txt"));
            inputStream.close();
        }catch (FileNotFoundException e){
            System.out.println("Creating file");
            try {
                PrintWriter outputStream = new PrintWriter(new FileOutputStream("appointment.txt"));
                outputStream.close();
            }catch(IOException f){
                System.out.println("Problem with creating file");
            }
        }catch (IOException e) {
            System.out.println("Problem with file output");
        }

        //set the time
        Appointment app1 = new Appointment(1,1,2000,1000,1200);

        //if search method returns true which means the slot is empty
        if(Appointment.search(app1.getDateStartTime() , app1.getDateEndTime())){
            //then save the appointment
            app1.saveAppointment();
        }else{
            //else dont save
            System.out.println("Please choose another date, the date is not available");
        }

        //same as above
        Appointment app2 = new Appointment(1,1,2000,900,1100);
        if(Appointment.search(app2.getDateStartTime() , app2.getDateEndTime())){
            app2.saveAppointment();
        }else{
            System.out.println("Please choose another date, the date is not available");
        }

        //apointment 3
        Appointment app3 = new Appointment(1,1,2000,1000,1100);
        if(Appointment.search(app3.getDateStartTime() , app3.getDateEndTime())){
            app3.saveAppointment();
        }else{
            System.out.println("Please choose another date, the date is not available");
        }

        //appointment 4
        Appointment app4 = new Appointment(1,1,2000,1300,1400);
        if(Appointment.search(app4.getDateStartTime() , app4.getDateEndTime())){
            app4.saveAppointment();
        }else{
            System.out.println("Please choose another date, the date is not available");
        }

        //appointment 5
        Appointment app5 = new Appointment(4,1,2000,1000,1200);
        if(Appointment.search(app5.getDateStartTime() , app5.getDateEndTime())){
            app5.saveAppointment();
        }else{
            System.out.println("Please choose another date, the date is not available");
        }

        //appointment 6
        Appointment app6 = new Appointment(1,1,2000,1100,1300);
        if(Appointment.search(app5.getDateStartTime() , app5.getDateEndTime())){
            app5.saveAppointment();
        }else{
            System.out.println("Please choose another date, the date is not available");
        }

        //in this case supposingly the appointment 2, 3 and 6 will return false
    }
}

interface Searchable {
    static boolean search(String dateStartTime, String dateEndTime){
        return true;
    };
}

class Appointment implements Searchable {
    //start time and end time mean which hours like 1000 or 1200 or 1350 in 24hours format
    //dateStartTime and dateEndTime combines the day,month,year and (start time / end time)
    //in the format day+month+year+start/end time
    private String dateStartTime,  dateEndTime;


    public Appointment(int day, int month, int year, int startTime, int endTime) {
        this.dateStartTime = day + "/" + month + "/" + year + "/" + startTime;
        this.dateEndTime = day + "/" + month + "/" + year + "/" + endTime;
    }

    public void saveAppointment() {
        try {
            //the "true" is to make sure that it doesn't rewrite the text file, it appends to the text file
            PrintWriter outputStream = new PrintWriter(new FileOutputStream("appointment.txt" ,true));

            //store the appointment in the textfile
            outputStream.println(this.dateStartTime);
            outputStream.println(this.dateEndTime);
            outputStream.println();
            outputStream.close();

            System.out.println("Appointment is saved");
        } catch (IOException e) {
            System.out.println("Problem with file output");
        }
    }

    public String getDateStartTime() {
        return dateStartTime;
    }

    public String getDateEndTime() {
        return dateEndTime;
    }

    public static boolean search(String dateStartTime, String dateEndTime) {
        try {
            Scanner inputStream = new Scanner(new FileInputStream("appointment.txt"));
            //  format : day/month/year/time
            String [] dateStartTimeArray = dateStartTime.split("/");
            String [] dateEndTimeArray = dateEndTime.split("/");
            int day = Integer.parseInt(dateStartTimeArray[0]);
            int month = Integer.parseInt(dateStartTimeArray[1]);
            int year = Integer.parseInt(dateStartTimeArray[2]);
            int start_time = Integer.parseInt(dateStartTimeArray[3]);
            int end_time = Integer.parseInt(dateEndTimeArray[3]);

            //to get the input from the textpad which is the old appointments that have been done before
            while (inputStream.hasNextLine()) {

                //getting the input according to the sequence on how we output them just now
                //index 0 = day, index 1= month , index 2 = year, index 3 = time
                //start time day/month/year/time
                //end time day/month/year/time
                //
                String [] appointmentDateStartTime = inputStream.nextLine().split("/");
                String [] appointmentDateEndTime = inputStream.nextLine().split("/");
                //capture the empty line
                inputStream.nextLine();

                int appointment_day = Integer.parseInt(appointmentDateStartTime[0]);
                int appointment_month = Integer.parseInt(appointmentDateStartTime[1]);
                int appointment_year = Integer.parseInt(appointmentDateStartTime[2]);
                int appointment_start_time = Integer.parseInt(appointmentDateStartTime[3]);
                int appointment_end_time = Integer.parseInt(appointmentDateEndTime[3]);

                //only compare them if day , month and year also the same which means at the same day
                if (appointment_day == day && appointment_month == month && appointment_year == year){

                    // if the start time is start before the start time of the saved appointment but end after it
                    //example recorded appointment : 10 - 12 , start time = 10
                    //new appointment : 9 - 13 , start time = 9, end time = 13
                    if(appointment_start_time <= end_time && appointment_start_time >= start_time){
                        return false;
                    }

                    //if the start time is start in between the time of the saved appointment ,then it is false
                    //example recorded appointment : 10 - 12 , start time = 10, end time = 12
                    //new appointment : 11 - 13 , start time = 11
                    else if(appointment_end_time >= start_time && appointment_start_time <= start_time){
                        return false;
                    }
                }
            }
            inputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("The file is not found");
        }
        return true;
    }
}
