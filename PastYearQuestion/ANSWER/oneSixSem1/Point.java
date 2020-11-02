class Point extends CreditCard {
    private double friday = 0, saturday = 0, sunday = 0, other = 0;

    public Point(String name, String cardNumber) {
        super(name, cardNumber);
        cardType = "Point Reward";
    }

    public void pay(double amount, String day) {
        if (day.equalsIgnoreCase("friday")) {
            friday += (int) amount * 2;
        } else if (day.equalsIgnoreCase("saturday")) {
            saturday += (int) amount * 3;
        } else if (day.equalsIgnoreCase("sunday")) {
            sunday += (int) amount * 4;
        } else {
            other += (int) amount;
        }
    }

    public double getReward() {
        totalReward = (friday + saturday + sunday + other) * 0.01;
        return totalReward;
    }
}
