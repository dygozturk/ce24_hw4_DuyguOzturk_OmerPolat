package ce204_hw4_librar_factoryMethod;

/**
 * 
 * @author opola
 *
 */
public interface ICarRental {
	/**
	 * //The code defines an interface named ICarRental. An interface is a contract that defines a set of methods that a class implementing the interface must provide.
//The interface declares several method signatures:
//rentCar() is a method without a return type (void). It represents the action of renting a car.
//getMileage() is a method that returns an integer. It represents getting the mileage of the car.
//getBrand() is a method that returns a string. It represents getting the brand of the car.
//getModel() is a method that returns a string. It represents getting the model of the car.
//getYear() is a method that returns an integer. It represents getting the year of the car.
//getFuelType() is a method that returns a string. It represents getting the fuel type of the car.
//getGear() is a method that returns a string. It represents getting the gear type of the car.
//getColor() is a method that returns a string. It represents getting the color of the car.
//getPrice() is a method that returns an integer. It represents getting the price of the car rental.
//The purpose of this interface is to provide a contract or blueprint for classes that represent different types of car rentals. By implementing this interface, a class must provide implementations for all the methods declared in the interface. 
//In other words, any class that wants to be considered a car rental must implement these methods to define how renting a car works and how to retrieve specific details of the car.
	 */
	void rentCar();
    int getMileage();
    String getBrand();
    String getModel();
    int getYear();
    String getFuelType();
    String getGear();
    String getColor();
    int getPrice();
    }
