package ce204_hw4_librar_factoryMethod;

public class RentalFactory {
	/**
     * Creates a car rental based on the specified type and details.
     * 
     * @param type      the type of the car rental
     * @param mileage   the mileage of the car
     * @param brand     the brand of the car
     * @param model     the model of the car
     * @param year      the year of the car
     * @param fuelType  the fuel type of the car
     * @param gear      the transmission type of the car
     * @param color     the color of the car
     * @param price     the price of the car rental
     * @return          an instance of the specified car rental type
     */
	public ICarRental createRental(String type, int mileage, String brand, String model, int year, String fuelType, String gear, String color, int price) {
        ICarRental carRental = null;

        switch (type) {
            case "economy":
            	 // Creates an instance of EconomyCarRental
                carRental = new EconomyCarRental(mileage, brand, model, year, fuelType, gear, color, price);
                break;
            case "luxury":
            	 // Creates an instance of LuxuryCarRental
                carRental = new LuxuryCarRental(mileage, brand, model, year, fuelType, gear, color, price);
                break;
            case "suv":
            	// Creates an instance of SuvCarRental
                carRental = new SuvCarRental(mileage, brand, model, year, fuelType, gear, color, price);
                break;
        }

        return carRental;
    }

}
