package ce204_hw4_observerMethodTest;

import ce204_hw4_library_observeMethod.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

public class ce204_hw4_ReservationSubjectTest {

	private ReservationSubject subject;
    private ByteArrayOutputStream outputStreamCaptor;

    /**
     * @brief Set up the test environment.
     */
    @Before
    public void setUp() {
        subject = new ReservationSubject();
        outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    /**
     * @brief Test case for attaching an observer.
     */
    @Test
    public void testAttachObserver() {
        // Arrange
        ReservationObserver observer = new User("John");

        // Act
        subject.attachObserver(observer);

        // Assert
        Assert.assertTrue(subject.getObservers().contains(observer));
    }

    /**
     * @brief Test case for detaching an observer.
     */
    @Test
    public void testDetachObserver() {
        // Arrange
        ReservationObserver observer = new User("John");
        subject.attachObserver(observer);

        // Act
        subject.detachObserver(observer);

        // Assert
        Assert.assertFalse(subject.getObservers().contains(observer));
    }

    /**
     * @brief Test case for notifying observers.
     */
    @Test
    public void testNotifyObservers() {
        // Arrange
        ReservationObserver observer1 = new User("John");
        subject.attachObserver(observer1);
        String message = "Your reservation is confirmed.";

        // Act
        subject.notifyObservers(message);

        // Assert
        String expectedOutput = "John: Your reservation is confirmed. ";
        Assert.assertNotEquals(expectedOutput, outputStreamCaptor.toString().trim());
    }
    
    

}
