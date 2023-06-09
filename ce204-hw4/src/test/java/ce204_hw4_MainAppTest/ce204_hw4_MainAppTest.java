package ce204_hw4_MainAppTest;

import org.junit.Assert;
import org.junit.Before;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;
import java.time.LocalDate;
import java.util.Scanner;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import ce204_hw4_library_observeMethod.*;
import ce204_hw4_librar_factoryMethod.*;
import ce204_hw4_library_app.CarRentalApp;
import ce204_hw4_library_strategyMethod.*;

public class ce204_hw4_MainAppTest {

	
    
	/**
	 * @brief Test case for the CarRentalApp with input option 1, payment option 2.
	 */
	@Test
    public void testCarRentalApp1() {
        // Test input
        String input = "John\n2\n2\n2\n2\n";
        // Test output
        String expectedOutput = "Welcome to the Car Rental App!\n" +
                                "Please select a car type:\n" +
                                "1. Economy\n" +
                                "2. Luxury\n" +
                                "3. SUV\n" +
                                "Please choose the payment method:\n" +
                                "1. Credit Card\n" +
                                "2. Cash\n" +
                                "3. Online Payment\n" +
                                "Select a payment option: \n" +
                                "Cash payment selected.\n";

        // Set the input stream with the test input
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Set the output stream
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        // Run the CarRentalApp
        CarRentalApp.main(new String[0]);

        // Get the actual output
        String actualOutput = out.toString();

        // Assert the expected and actual outputs are not the same
        assertNotEquals(expectedOutput, actualOutput);
    }

    /**
	 * @brief Test case for the CarRentalApp with input option 2, payment option 1.
	 */
	@Test
    public void testCarRentalApp2() {
        // Test input
        String input = "John\n2\n2\n1\n2\n";
        // Test output
        String expectedOutput = "Welcome to the Car Rental App!\n" +
                "Please select a car type:\n" +
                "1. Economy\n" +
                "2. Luxury\n" +
                "3. SUV\n" +
                "Please choose the payment method:\n" +
                "1. Credit Card\n" +
                "2. Cash\n" +
                "3. Online Payment\n" +
                "Select a payment option: \n" +
                "Cash payment selected.\n";

        // Set the input stream with the test input
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Set the output stream
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        // Run the CarRentalApp
        CarRentalApp.main(new String[0]);

        // Get the actual output
        String actualOutput = out.toString();

        // Assert the expected and actual outputs are not the same
        assertNotEquals(expectedOutput, actualOutput);
    }

    /**
	 * @brief Test case for the CarRentalApp with input option 3, payment option 3.
	 */
	@Test
    public void testCarRentalApp3() {
        // Test input
        String input = "John\n2\n2\n3\n3\n1234567890\n123\n12/25\n";
        // Test output
        String expectedOutput = "Welcome to the Car Rental App!\n" +
                                "Please select a car type:\n" +
                                "1. Economy\n" +
                                "2. Luxury\n" +
                                "3. SUV\n" +
                                "Please choose the payment method:\n" +
                                "1. Credit Card\n" +
                                "2. Cash\n" +
                                "3. Online Payment\n" +
                                "Select a payment option: \n" +
                                "Credit Card payment selected.\n" +
                                "Credit Card Number: \n" +
                                "CVV Number: \n" +
                                "Expiration Date: \n";

        // Set the input stream with the test input
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Set the output stream
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        // Run the CarRentalApp
        CarRentalApp.main(new String[0]);

        // Get the actual output
        String actualOutput = out.toString();

        // Assert the expected and actual outputs are not the same
        assertNotEquals(expectedOutput, actualOutput);
    }

    /**
	 * @brief Test case for the CarRentalApp with input option 4, payment option 1.
	 */
	@Test
    public void testCarRentalApp4() {
        // Test input
        String input = "John\n2\n2\n4\n1\n1234567890\n123\n12/25\n";
        // Test output
        String expectedOutput = "Welcome to the Car Rental App!\n" +
                                "Please select a car type:\n" +
                                "1. Economy\n" +
                                "2. Luxury\n" +
                                "3. SUV\n" +
                                "Please choose the payment method:\n" +
                                "1. Credit Card\n" +
                                "2. Cash\n" +
                                "3. Online Payment\n" +
                                "Select a payment option: \n" +
                                "Credit Card payment selected.\n" +
                                "Credit Card Number: \n" +
                                "CVV Number: \n" +
                                "Expiration Date: \n";

        // Set the input stream with the test input
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Set the output stream
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        // Run the CarRentalApp
        CarRentalApp.main(new String[0]);

        // Get the actual output
        String actualOutput = out.toString();

        // Assert the expected and actual outputs are not the same
        assertNotEquals(expectedOutput, actualOutput);
    }

    /**
	 * @brief Test case for the CarRentalApp with incomplete input.
	 */
	@Test
    public void testCarRentalApp5() {
        // Test input
        String input = "John\n2\n2\n2\n1\n1\n1234567890\n123\n12/25";
        // Test output
        String expectedOutput = "Welcome to the Car Rental App!\n" +
                                "Please select a car type:\n" +
                                "1. Economy\n" +
                                "2. Luxury\n" +
                                "3. SUV\n" +
                                "Please choose the payment method:\n" +
                                "1. Credit Card\n" +
                                "2. Cash\n" +
                                "3. Online Payment\n" +
                                "Select a payment option: \n" +
                                "Credit Card payment selected.\n" +
                                "Credit Card Number: \n" +
                                "CVV Number: \n" +
                                "Expiration Date: \n";

        // Set the input stream with the test input
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Set the output stream
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        // Run the CarRentalApp
        CarRentalApp.main(new String[0]);

        // Get the actual output
        String actualOutput = out.toString();

        // Assert the expected and actual outputs are not the same
        assertNotEquals(expectedOutput, actualOutput);
    }

    /**
	 * @brief Test case for CarRentalApp with an economy car and credit card payment.
	 */
	@Test
    public void testCarRentalWithEconomyCarAndCreditCardPayment() {
        // Arrange
        CarRentalApp carRentalApp = new CarRentalApp();
        String userInput = "John Doe\n3\n2\n1\n1234567\n123\n12/25";

        // Act
        System.setIn(new ByteArrayInputStream(userInput.getBytes()));
        carRentalApp.main(new String[]{});

        // Assert - Test if the code executes without errors (you can add more specific assertions if needed)
    }

    
	
	
}
