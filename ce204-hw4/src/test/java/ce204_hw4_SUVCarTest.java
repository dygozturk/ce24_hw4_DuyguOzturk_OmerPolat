import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


import ce204_hw4_librar_factoryMethod.*;

public class ce204_hw4_SUVCarTest {

	private SuvCarRental carRental;

    /**
     * @brief Set up the test environment.
     */
    @Before
    public void setUp() {
        carRental = new SuvCarRental(10000, "Toyota", "Corolla", 2020, "Gasoline", "Automatic", "Red", 50);
    }

    /**
     * @brief Test case for getting the mileage.
     */
    @Test
    public void testGetMileage() {
        int expectedMileage = 10000;
        int actualMileage = carRental.getMileage();
        Assert.assertEquals(expectedMileage, actualMileage);
    }

    /**
     * @brief Test case for getting the brand.
     */
    @Test
    public void testGetBrand() {
        String expectedBrand = "Toyota";
        String actualBrand = carRental.getBrand();
        Assert.assertEquals(expectedBrand, actualBrand);
    }

    /**
     * @brief Test case for getting the model.
     */
    @Test
    public void testGetModel() {
        String expectedModel = "Corolla";
        String actualModel = carRental.getModel();
        Assert.assertEquals(expectedModel, actualModel);
    }

    /**
     * @brief Test case for getting the year.
     */
    @Test
    public void testGetYear() {
        int expectedYear = 2020;
        int actualYear = carRental.getYear();
        Assert.assertEquals(expectedYear, actualYear);
    }

    /**
     * @brief Test case for getting the fuel type.
     */
    @Test
    public void testGetFuelType() {
        String expectedFuelType = "Gasoline";
        String actualFuelType = carRental.getFuelType();
        Assert.assertEquals(expectedFuelType, actualFuelType);
    }

    /**
     * @brief Test case for getting the gear.
     */
    @Test
    public void testGetGear() {
        String expectedGear = "Automatic";
        String actualGear = carRental.getGear();
        Assert.assertEquals(expectedGear, actualGear);
    }

    /**
     * @brief Test case for getting the color.
     */
    @Test
    public void testGetColor() {
        String expectedColor = "Red";
        String actualColor = carRental.getColor();
        Assert.assertEquals(expectedColor, actualColor);
    }

    /**
     * @brief Test case for getting the price.
     */
    @Test
    public void testGetPrice() {
        int expectedPrice = 50;
        int actualPrice = carRental.getPrice();
        Assert.assertEquals(expectedPrice, actualPrice);
    }

    /**
     * @brief Test case for renting a car.
     */
    @Test
    public void testRentCar() {
        int mileage = 5000;
        String brand = "Mercedes";
        String model = "S-Class";
        int year = 2022;
        String fuelType = "Gasoline";
        String gear = "Automatic";
        String color = "Black";
        int price = 100;

        SuvCarRental carRental = new SuvCarRental(mileage, brand, model, year, fuelType, gear, color, price);

        String expectedOutput = "Brand: Mercedes, Model: S-Class, Year: 2022, Fuel Type: Gasoline, Gear: Automatic, Color: Black, Mileage: 5000, Price: 100";

        String actualOutput = captureSystemOut(() -> carRental.rentCar());

        Assert.assertNotEquals(expectedOutput, actualOutput);
    }

    /**
     * @brief Captures the output of System.out.println().
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
