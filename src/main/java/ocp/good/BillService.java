public class BillService {
    public double applyDiscount(double amount, DiscountStrategy strategy) {
        return amount - (amount * strategy.getDiscount());
    }
}
