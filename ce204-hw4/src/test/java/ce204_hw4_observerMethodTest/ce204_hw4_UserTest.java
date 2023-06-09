package ce204_hw4_observerMethodTest;

import ce204_hw4_library_observeMethod.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ce204_hw4_UserTest {

	private User user;
    private ByteArrayOutputStream outputStreamCaptor;

    /**
     * @brief Set up the test environment.
     */
    @Before
    public void setup() {
        user = new User("John");

        outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    /**
     * @brief Test case for notifying a reservation.
     */
    @Test
    public void testNotifyReservation1() {
        // Arrange
        User user = new User("John");
        String expectedOutput = "John: Your reservation is confirmed.";

        // Act
        user.notifyReservation("Your reservation is confirmed.");

        // Assert
        Assert.assertEquals(expectedOutput, outputStreamCaptor.toString().trim());
    }

}
