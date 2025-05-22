package SOLID;

public class OCP_01 {

    /*
     * TASK:
     * How to add a new discount type (customerType) without
     * violating OCP (Open/Closed Principle)?
     */
    
    public interface Discount {
        double calculateDiscount(double amount);
    }
    public static class RegularDiscount implements Discount {
        @Override
        public double calculateDiscount(double amount) {
            return amount * 0.1;
        }
    }
    public static class PremiumDiscount implements Discount {
        @Override
        public double calculateDiscount(double amount) {
            return amount * 0.2;
        }
    }
    public static class VIPDiscount implements Discount {
        @Override
        public double calculateDiscount(double amount) {
            return amount * 0.3;
        }
    }

    public static class DiscountCalculator {
      public double calculate(Discount discount, double amount) {
            return discount.calculateDiscount(amount);
        }
    }

    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();
        Discount regularDiscount = new RegularDiscount();
        Discount premiumDiscount = new PremiumDiscount();
        Discount vipDiscount = new VIPDiscount();


        double regularDiscountAmount = calculator.calculate(regularDiscount, 100.0);
        double premiumDiscountAmount = calculator.calculate(premiumDiscount, 100.0);
        double vipDiscountAmount = calculator.calculate(vipDiscount, 100.0);
        
        System.out.println("VIP Discount: " + vipDiscountAmount);
        System.out.println("Regular Discount: " + regularDiscountAmount);
        System.out.println("Premium Discount: " + premiumDiscountAmount);
    }
}
