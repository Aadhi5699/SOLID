public class DiscountCalculator {
    public double getDiscount(String type) {
        if (type.equals("diwali"))
            return 0.30;
        if (type.equals("newuser"))
            return 0.10;
        return 0.0;
    }
}
