package task1;

public class Calculator {

        public static double calculatingDiscount(double purchaseAmount, int discountAmount) {
            double discountedAmount;

            if (purchaseAmount > 0) {
                if (discountAmount > 0 && discountAmount < purchaseAmount) {
                    discountedAmount = purchaseAmount - (purchaseAmount * discountAmount) / 100;
                } else {
                    throw new IllegalArgumentException("Discount must in the range from 0 to 100%");
                }
            } else {
                throw new IllegalArgumentException("Purchase amount must be more than 0");
            }
            return discountedAmount;
        }

}
