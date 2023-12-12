package task1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

//import static org.assertj.core.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;



public class CalculatorTest {


        @Test
        @DisplayName("Test - Correct calculation of discount")
        public void calculatingDiscountShouldCorrect() {
            double resultTest = Calculator.calculatingDiscount(100000, 10);
            assertEquals(90000, resultTest, "Inequality in result");
        }


        @Test
        @DisplayName("Test - Purchase amount above zero")
        public void purchaseAmountPositive() {
        assertThrows(IllegalArgumentException.class, () ->
                    Calculator.calculatingDiscount(-100000, 10), "Purchase amount must be more than 0");
        }


        @Test
        @DisplayName("Test - Discount amount above zero")
        public void discountAmountBelowPurchaseAmount() {
            assertThrows(IllegalArgumentException.class, () ->
                    Calculator.calculatingDiscount(100000, -10), "Discount must in the range from 0 to 100%");
        }

    @Test
    @DisplayName("Test - Discount amount below purchase amount")
    public void discountAmountAboveZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                Calculator.calculatingDiscount(100000, 150000), "Discount must in the range from 0 to 100%");
    }
    }
