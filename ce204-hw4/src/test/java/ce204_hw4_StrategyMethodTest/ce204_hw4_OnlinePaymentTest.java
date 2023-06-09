package ce204_hw4_StrategyMethodTest;

import static org.junit.Assert.*;

import ce204_hw4_library_strategyMethod.*;
import org.junit.Assert;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ce204_hw4_OnlinePaymentTest {

	/**
     * @brief Test case for the pay method.
     */
    @Test
    public void testPay() {
        // Arrange
        double amount = 200.0;
        String email = "example@example.com";
        String password = "password";
        PaymentStrategy paymentStrategy = new OnlinePayment(email, password);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Act
        paymentStrategy.pay(amount);

        // Assert
        String expectedOutput = "Paying $200.0 online with email: example@example.com";
        Assert.assertEquals(expectedOutput, outputStream.toString().trim());
    }


}
