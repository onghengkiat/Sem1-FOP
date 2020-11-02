class PartTimeStaff extends onesevensem2.Staff {
    private int workingHour;

    public PartTimeStaff(String name, String ic, int workingHour) {
        super(name, ic);
        this.workingHour = workingHour;
    }

    public int getSalary() {
        return 40 * workingHour;
    }

    public String toString() {
        return super.toString() + "Number of working hours: " + workingHour
                + "\nSalary: RM " + getSalary() + "\n";
    }

}
