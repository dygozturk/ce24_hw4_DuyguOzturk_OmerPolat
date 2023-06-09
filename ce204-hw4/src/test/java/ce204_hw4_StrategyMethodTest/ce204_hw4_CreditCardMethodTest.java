package ce204_hw4_StrategyMethodTest;



import ce204_hw4_library_strategyMethod.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ce204_hw4_CreditCardMethodTest {

	/**
     * @brief Test case for the pay method.
     */
    @Test
    public void testPay() {
        // Arrange
        double amount = 100.0;
        String cardNumber = "1234567890123456";
        String expirationDate = "12/25";
        String cvv = "123";
        PaymentStrategy paymentStrategy = new CreditCardPayment(cardNumber, expirationDate, cvv);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Act
        paymentStrategy.pay(amount);

        // Assert
        String expectedOutput = "Paying $100.0 with credit card: 1234567890123456";
        Assert.assertEquals(expectedOutput, outputStream.toString().trim());
    }
}
