class PartTimeStaff extends onethreesem1.Staff {
    private int workingHour;

    public PartTimeStaff(String name, String ic, int workingHour) {
        super(name, ic);
        this.workingHour = workingHour;
    }

    public int getWorkingHour() {
        return workingHour;
    }

    public void setWorkingHour(int workingHour) {
        this.workingHour = workingHour;
    }

    public int getSalary() {
        return 50 * workingHour;
    }

    public String toString() {
        return super.toString() + "Number of working hours: " + workingHour
                + "\nSalary: RM " + getSalary() + "\n";
    }

}
