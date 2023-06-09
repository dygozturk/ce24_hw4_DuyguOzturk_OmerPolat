package ce204_hw4_StrategyMethodTest;

import static org.junit.Assert.*;
import ce204_hw4_library_strategyMethod.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ce204_hw4_CashPaymentTest {

	/**
     * @brief Test case for the pay method.
     */
    @Test
    public void testPay() {
        // Arrange
        double amount = 50.0;
        PaymentStrategy paymentStrategy = new CashPayment();
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Act
        paymentStrategy.pay(amount);

        // Assert
        String expectedOutput = "Paying $50.0 in cash";
        Assert.assertEquals(expectedOutput, outputStream.toString().trim());
    }
}

