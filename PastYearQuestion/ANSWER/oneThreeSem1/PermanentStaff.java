class PermanentStaff extends onethreesem1.Staff {
    private String grade;

    public PermanentStaff(String name, String ic, String grade) {
        super(name, ic);
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getSalary() {
        if (grade.equalsIgnoreCase("A01")) {
            return 5000;
        } else if (grade.equalsIgnoreCase("A02")) {
            return 4000;
        } else if (grade.equalsIgnoreCase("A03")) {
            return 3000;
        } else if (grade.equalsIgnoreCase("A04")) {
            return 2000;
        } else {
            return 0;
        }
    }

    public String toString() {
        return super.toString() + "Grade: " + grade +
                "\nSalary: RM " + getSalary() + "\n";
    }

}
