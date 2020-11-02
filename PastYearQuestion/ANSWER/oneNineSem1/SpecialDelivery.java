class SpecialDelivery extends Delivery {

    private boolean weekendDelivery;
    private boolean nightTimeDelivery;
    private static double totalCost = 0;

    public static double getTotalCost() {
        return totalCost;
    }

    public SpecialDelivery(String sender, String recipient, double weight, boolean weekendDelivery, boolean nightTimeDelivery) {
        super(sender, recipient, weight);
        this.weekendDelivery = weekendDelivery;
        this.nightTimeDelivery = nightTimeDelivery;
        totalCost += totalCost();
    }

    public double totalCost() {
        double cost = super.totalCost();

        if (weekendDelivery) {
            cost += 50;
        }

        if (nightTimeDelivery) {
            cost *= 1.2;
        }

        return cost;
    }

    public String toString() {
        if (weekendDelivery && nightTimeDelivery) {
            return super.toString() + "\nWeekend Delivery " + "\nNight Time Delivery";
        }

        if (weekendDelivery) {
            return super.toString() + "\nWeekend Delivery";
        }

        if (nightTimeDelivery) {
            return super.toString() + "\nNight Time Delivery";
        }

        return super.toString();
    }

}
