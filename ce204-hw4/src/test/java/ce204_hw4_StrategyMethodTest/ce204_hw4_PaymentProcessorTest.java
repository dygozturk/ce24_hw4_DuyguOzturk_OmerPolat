package ce204_hw4_StrategyMethodTest;

import ce204_hw4_library_strategyMethod.*;
import org.junit.Assert;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ce204_hw4_PaymentProcessorTest {

	/**
     * @brief Test case for the processPayment method.
     */
    @Test
    public void testProcessPayment() {
        // Arrange
        double amount = 100.0;
        PaymentStrategy paymentStrategy = new CashPayment();
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.setPaymentStrategy(paymentStrategy);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Act
        paymentProcessor.processPayment(amount);

        // Assert
        String expectedOutput = "Paying $100.0 in cash";
        Assert.assertEquals(expectedOutput, outputStream.toString().trim());
    }

}
