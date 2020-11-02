class Rebate extends CreditCard {

    private double fuel = 0, utility = 0, grocery = 0, other = 0;

    public Rebate(String name, String cardNumber) {
        super(name, cardNumber);
        cardType = "Cash Rebate";
    }

    public void pay(double amount, String type) {
        if (type.equalsIgnoreCase("grocery")) {
            grocery += amount;
        }
        if (type.equalsIgnoreCase("utility")) {
            utility += amount;
        }
        if (type.equalsIgnoreCase("fuel")) {
            fuel += amount;
        }
        if (type.equalsIgnoreCase("other")) {
            other += amount;
        }
    }

    public double getReward() {
        totalReward = fuel * 0.08 + utility * 0.05 + grocery * 0.02 + other * 0.002;
        if (fuel >= 100) {
            totalReward += fuel / 100 * 8;
        }
        return totalReward;
    }
}
