import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


import ce204_hw4_librar_factoryMethod.*;

public class ce204_hw4_EconomyCarTest {

	

	private EconomyCarRental carRental; /**< The instance of EconomyCarRental used for testing. */

	@Before
	public void setUp() {
	    carRental = new EconomyCarRental(10000, "Toyota", "Corolla", 2020, "Gasoline", "Automatic", "Red", 50);
	}

	@Test
	public void testGetMileage() {
	    int expectedMileage = 10000; /**< The expected mileage of the car. */
	    int actualMileage = carRental.getMileage();
	    Assert.assertEquals(expectedMileage, actualMileage);
	}

	@Test
	public void testGetBrand() {
	    String expectedBrand = "Toyota"; /**< The expected brand of the car. */
	    String actualBrand = carRental.getBrand();
	    Assert.assertEquals(expectedBrand, actualBrand);
	}

	@Test
	public void testGetModel() {
	    String expectedModel = "Corolla"; /**< The expected model of the car. */
	    String actualModel = carRental.getModel();
	    Assert.assertEquals(expectedModel, actualModel);
	}

	@Test
	public void testGetYear() {
	    int expectedYear = 2020; /**< The expected year of the car. */
	    int actualYear = carRental.getYear();
	    Assert.assertEquals(expectedYear, actualYear);
	}

	@Test
	public void testGetFuelType() {
	    String expectedFuelType = "Gasoline"; /**< The expected fuel type of the car. */
	    String actualFuelType = carRental.getFuelType();
	    Assert.assertEquals(expectedFuelType, actualFuelType);
	}

	@Test
	public void testGetGear() {
	    String expectedGear = "Automatic"; /**< The expected transmission type of the car. */
	    String actualGear = carRental.getGear();
	    Assert.assertEquals(expectedGear, actualGear);
	}

	@Test
	public void testGetColor() {
	    String expectedColor = "Red"; /**< The expected color of the car. */
	    String actualColor = carRental.getColor();
	    Assert.assertEquals(expectedColor, actualColor);
	}

	@Test
	public void testGetPrice() {
	    int expectedPrice = 50; /**< The expected price of the car rental. */
	    int actualPrice = carRental.getPrice();
	    Assert.assertEquals(expectedPrice, actualPrice);
	}
    
	/**
	 * @brief Test case for the rentCar() method.
	 */
	@Test
	public void testRentCar() {
	        
	    // Test data
	    int mileage = 10000; /**< Mileage of the car */
	    String brand = "Toyota"; /**< Brand of the car */
	    String model = "Corolla"; /**< Model of the car */
	    int year = 2020; /**< Year of the car */
	    String fuelType = "Gasoline"; /**< Fuel type of the car */
	    String gear = "Automatic"; /**< Gear type of the car */
	    String color = "Red"; /**< Color of the car */
	    int price = 50; /**< Rental price of the car */

	    // Create an instance of EconomyCarRental
	    EconomyCarRental carRental = new EconomyCarRental(mileage, brand, model, year, fuelType, gear, color, price);

	    // Expected output
	    String expectedOutput = "Brand: Toyota, Model: Corolla, Year: 2020, Fuel Type: Gasoline, Transmission: Automatic, Color: Red, Mileage: 10000, Price: 50";

	    // Call rentCar() method and capture the output
	    String actualOutput = captureSystemOut(carRental::rentCar);

	    // Compare the expected output with the actual output
	    Assert.assertEquals(expectedOutput, actualOutput);
	}

	/**
	 * @brief Helper method to capture System.out.println() outputs.
	 * @param runnable The runnable object to execute.
	 * @return The captured output as a string.
	 */
	private String captureSystemOut(Runnable runnable) {
	    // Backup the previous System.out object
	    PrintStream originalOut = System.out;

	    // Use ByteArrayOutputStream to capture the output
	    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outputStream));

	    // Run the Runnable (captures System.out.println() calls)
	    runnable.run();

	    // Convert the captured output to a string and trim it
	    String capturedOutput = outputStream.toString().trim();

	    // Restore System.out to the original object
	    System.setOut(originalOut);

	    // Return the captured output
	    return capturedOutput;
	}

}
