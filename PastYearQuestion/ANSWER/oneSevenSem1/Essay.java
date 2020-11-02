class Essay extends onesevensem1.GradedActivity {
    private int grammer;
    private int spelling;
    private int length;
    private int content;

    public Essay(int grammer, int spelling, int length, int content) {
        this.grammer = grammer;
        this.spelling = spelling;
        this.length = length;
        this.content = content;
        score = grammer + spelling + length + content;
    }

    public String toString() {
        return "Essay score: " +
                "\nGrammer: " + grammer +
                "\nSpelling: " + spelling +
                "\nLength: " + length +
                "\nContent: " + content +
                super.toString();
    }
}
