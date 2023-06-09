package ce204_hw4_observerMethodTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ce204_hw4_library_observeMethod.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class ce204_hw4_CarReservationSystemTest {

	 private CarReservationSystem carReservationSystem;
	    private ByteArrayOutputStream outputStreamCaptor;

	    /**
	     * @brief Set up the test environment.
	     */
	    @Before
	    public void setup() {
	        carReservationSystem = new CarReservationSystem();
	        outputStreamCaptor = new ByteArrayOutputStream();
	        System.setOut(new PrintStream(outputStreamCaptor));
	    }

	    /**
	     * @brief Test case for making a reservation.
	     */
	    @Test
	    public void testMakeReservation() {
	        // Arrange
	        LocalDate startDate = LocalDate.now();
	        int rentalDays = 5;
	        LocalDate endDate = startDate.plusDays(rentalDays);
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
	        String expectedMessage = "New reservation: Your rental period is from "
	                + startDate.format(formatter) + " to " + endDate.format(formatter) + ".";
	        User user1 = new User("John");
	        carReservationSystem.addUser(user1);

	        // Act
	        carReservationSystem.makeReservation(startDate, rentalDays);

	        // Assert
	        String expectedOutput = "John: " + expectedMessage;
	        Assert.assertEquals(expectedOutput, outputStreamCaptor.toString().trim());
	    }

	    private CarReservationSystem reservationSystem;
	    private User user1;
	    private User user2;

	    /**
	     * @brief Set up the test environment.
	     */
	    @Before
	    public void setup1() {
	        reservationSystem = new CarReservationSystem();
	        user1 = new User("John");
	        user2 = new User("Jane");
	        reservationSystem.addUser(user1);
	        reservationSystem.addUser(user2);
	    }

	    /**
	     * @brief Test case for removing a user.
	     */
	    @Test
	    public void testRemoveUser() {
	        // Arrange

	        // Act
	        reservationSystem.removeUser(user1);

	        // Assert
	        Assert.assertFalse(reservationSystem.getObservers().contains(user1));
	        Assert.assertTrue(reservationSystem.getObservers().contains(user2));
	    }
}
