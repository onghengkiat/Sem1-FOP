class Main {
    public static void main(String[] args) {
        Rebate r = new Rebate("John Lim", "1111222233334444");
        Point p = new Point("John Lim", "5555666677778888");

        r.pay(124.80, "Grocery");
        r.pay(64.60, "Other");
        r.pay(95.40, "Fuel");
        r.pay(100.00, "Utility");
        r.pay(220.00, "Other");

        p.pay(124.80, "Saturday");
        p.pay(64.60, "Friday");
        p.pay(95.40, "Sunday");
        p.pay(100.00, "Friday");
        p.pay(220.00, "Tuesday");

        r.getReward();
        System.out.println(r.toString());

        p.getReward();
        System.out.println(p.toString());

        if (r.getTotalReward() > p.getTotalReward()) {
            System.out.println("The best card is Cash Rebate Card");
        } else {
            System.out.println("The best card is Point Reward Card");
        }
    }
}
