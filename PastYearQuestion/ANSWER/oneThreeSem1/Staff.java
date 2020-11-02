class Staff {
    protected String name;
    protected String ic;

    public Staff(String name, String ic) {
        this.name = name;
        this.ic = ic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIc() {
        return ic;
    }

    public void setIc(String ic) {
        this.ic = ic;
    }

    public String toString() {
        return "Full Name: " + name +
                "\nIC: " + ic + "\n";
    }
}
