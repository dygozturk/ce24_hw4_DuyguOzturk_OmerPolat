import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import ce204_hw4_librar_factoryMethod.*;
import static org.junit.Assert.assertFalse;


public class ce204_hw4_RentalFactoryTest {

	/**
     * @brief Test case for creating an economy car rental.
     */
    @Test
    public void testCreateRental_EconomyCar() {
        // Test data
        String type = "economy";
        int mileage = 10000;
        String brand = "Toyota";
        String model = "Corolla";
        int year = 2020;
        String fuelType = "Gasoline";
        String gear = "Automatic";
        String color = "Red";
        int price = 50;

        // Create an instance of RentalFactory
        RentalFactory rentalFactory = new RentalFactory();

        // Create an economy car rental using the factory
        ICarRental carRental = rentalFactory.createRental(type, mileage, brand, model, year, fuelType, gear, color, price);

        // Assert that the carRental instance is of type EconomyCarRental
        Assert.assertTrue(carRental instanceof EconomyCarRental);

        // Assert the property values of the carRental instance
        Assert.assertEquals(mileage, carRental.getMileage());
        Assert.assertEquals(brand, carRental.getBrand());
        Assert.assertEquals(model, carRental.getModel());
        Assert.assertEquals(year, carRental.getYear());
        Assert.assertEquals(fuelType, carRental.getFuelType());
        Assert.assertEquals(gear, carRental.getGear());
        Assert.assertEquals(color, carRental.getColor());
        Assert.assertEquals(price, carRental.getPrice());
    }

    /**
     * @brief Test case for creating a luxury car rental.
     */
    @Test
    public void testCreateRental_LuxuryCar() {
        // Test data
        String type = "luxury";
        int mileage = 5000;
        String brand = "Mercedes";
        String model = "S-Class";
        int year = 2022;
        String fuelType = "Diesel";
        String gear = "Automatic";
        String color = "Black";
        int price = 150;

        // Create an instance of RentalFactory
        RentalFactory rentalFactory = new RentalFactory();

        // Create a luxury car rental using the factory
        ICarRental carRental = rentalFactory.createRental(type, mileage, brand, model, year, fuelType, gear, color, price);

        // Assert that the carRental instance is of type LuxuryCarRental
        Assert.assertTrue(carRental instanceof LuxuryCarRental);

        // Assert the property values of the carRental instance
        Assert.assertEquals(mileage, carRental.getMileage());
        Assert.assertEquals(brand, carRental.getBrand());
        Assert.assertEquals(model, carRental.getModel());
        Assert.assertEquals(year, carRental.getYear());
        Assert.assertEquals(fuelType, carRental.getFuelType());
        Assert.assertEquals(gear, carRental.getGear());
        Assert.assertEquals(color, carRental.getColor());
        Assert.assertEquals(price, carRental.getPrice());
    }

    /**
     * @brief Test case for creating an SUV car rental.
     */
    @Test
    public void testCreateRental_SuvCar() {
        // Test data
        String type = "suv";
        int mileage = 20000;
        String brand = "Jeep";
        String model = "Wrangler";
        int year = 2021;
        String fuelType = "Gasoline";
        String gear = "Manual";
        String color = "Yellow";
        int price = 80;

        // Create an instance of RentalFactory
        RentalFactory rentalFactory = new RentalFactory();

        // Create an SUV car rental using the factory
        ICarRental carRental = rentalFactory.createRental(type, mileage, brand, model, year, fuelType, gear, color, price);

        // Assert that the carRental instance is of type SuvCarRental
        Assert.assertTrue(carRental instanceof SuvCarRental);

        // Assert the property values of the carRental instance
        Assert.assertEquals(mileage, carRental.getMileage());
        Assert.assertEquals(brand, carRental.getBrand());
        Assert.assertEquals(model, carRental.getModel());
        Assert.assertEquals(year, carRental.getYear());
        Assert.assertEquals(fuelType, carRental.getFuelType());
        Assert.assertEquals(gear, carRental.getGear());
        Assert.assertEquals(color, carRental.getColor());
        Assert.assertEquals(price, carRental.getPrice());
    }
	 
	 
	 
	 
	 
}
