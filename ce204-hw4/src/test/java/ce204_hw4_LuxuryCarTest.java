import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import ce204_hw4_librar_factoryMethod.*;

public class ce204_hw4_LuxuryCarTest {

	
	private LuxuryCarRental carRental;

    /**
     * @brief Sets up the test fixture.
     */
    @Before
    public void setUp() {
        carRental = new LuxuryCarRental(10000, "Toyota", "Corolla", 2020, "Gasoline", "Automatic", "Red", 50);
    }

    /**
     * @brief Test case for the getMileage() method.
     */
    @Test
    public void testGetMileage() {
        int expectedMileage = 10000;
        int actualMileage = carRental.getMileage();
        Assert.assertEquals(expectedMileage, actualMileage);
    }

    /**
     * @brief Test case for the getBrand() method.
     */
    @Test
    public void testGetBrand() {
        String expectedBrand = "Toyota";
        String actualBrand = carRental.getBrand();
        Assert.assertEquals(expectedBrand, actualBrand);
    }

    /**
     * @brief Test case for the getModel() method.
     */
    @Test
    public void testGetModel() {
        String expectedModel = "Corolla";
        String actualModel = carRental.getModel();
        Assert.assertEquals(expectedModel, actualModel);
    }

    /**
     * @brief Test case for the getYear() method.
     */
    @Test
    public void testGetYear() {
        int expectedYear = 2020;
        int actualYear = carRental.getYear();
        Assert.assertEquals(expectedYear, actualYear);
    }

    /**
     * @brief Test case for the getFuelType() method.
     */
    @Test
    public void testGetFuelType() {
        String expectedFuelType = "Gasoline";
        String actualFuelType = carRental.getFuelType();
        Assert.assertEquals(expectedFuelType, actualFuelType);
    }

    /**
     * @brief Test case for the getGear() method.
     */
    @Test
    public void testGetGear() {
        String expectedGear = "Automatic";
        String actualGear = carRental.getGear();
        Assert.assertEquals(expectedGear, actualGear);
    }

    /**
     * @brief Test case for the getColor() method.
     */
    @Test
    public void testGetColor() {
        String expectedColor = "Red";
        String actualColor = carRental.getColor();
        Assert.assertEquals(expectedColor, actualColor);
    }

    /**
     * @brief Test case for the getPrice() method.
     */
    @Test
    public void testGetPrice() {
        int expectedPrice = 50;
        int actualPrice = carRental.getPrice();
        Assert.assertEquals(expectedPrice, actualPrice);
    }

    /**
     * @brief Test case for the rentCar() method.
     */
    @Test
    public void testRentCar() {
        // Test data
        int mileage = 5000;
        String brand = "Mercedes";
        String model = "S-Class";
        int year = 2022;
        String fuelType = "Gasoline";
        String gear = "Automatic";
        String color = "Black";
        int price = 100;

        // Create an instance of LuxuryCarRental
        LuxuryCarRental carRental = new LuxuryCarRental(mileage, brand, model, year, fuelType, gear, color, price);

        // Expected output
        String expectedOutput = "Brand: Mercedes, Model: S-Class, Year: 2022, Fuel Type: Gasoline, Gear: Automatic, Color: Black, Mileage: 5000, Price: 100";

        // Call rentCar() method and capture the output
        String actualOutput = captureSystemOut(() -> carRental.rentCar());

        // Compare the expected output with the actual output
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    /**
     * @brief Helper method to capture System.out.println() outputs.
     * @param runnable The runnable object to execute.
     * @return The captured output as a string.
     */
    private String captureSystemOut(Runnable runnable) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        try {
            System.setOut(new PrintStream(outputStream));
            runnable.run();
        } finally {
            System.setOut(originalOut);
        }

        return outputStream.toString().trim();
    }

}
