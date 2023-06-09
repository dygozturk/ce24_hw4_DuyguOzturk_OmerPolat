package ce204_hw4_librar_factoryMethod;

public class SuvCarRental implements ICarRental {
	
	private int mileage;
    private String brand;
    private String model;
    private int year;
    private String fuelType;
    private String gear;
    private String color;
    private int price;
    /**
     * Constructs a new SuvCarRental object with the specified details.
     *
     * @param mileage   the mileage of the car
     * @param brand     the brand of the car
     * @param model     the model of the car
     * @param year      the year of the car
     * @param fuelType  the fuel type of the car
     * @param gear      the transmission type of the car
     * @param color     the color of the car
     * @param price     the price of the car rental
     */
    public SuvCarRental(int mileage, String brand, String model, int year, String fuelType, String gear, String color, int price) {
        this.mileage = mileage;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
        this.gear = gear;
        this.color = color;
        this.price = price;
    }

    /**
     * Rents the SUV car and prints its details.
     */
	@Override
	public void rentCar() {
		// TODO Auto-generated method stub
		System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year +
                ", Fuel Type: " + fuelType + ", Transmission: " + gear + ", Color: " + color +
                ", Mileage: " + mileage + ", Price: " + price);
	}
	/**
     * Returns the price of the SUV car rental.
     *
     * @return the price of the car rental
     */
	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return price;
	}
	/**
     * Returns the mileage of the SUV car.
     *
     * @return the mileage of the car
     */
	@Override
	public int getMileage() {
		// TODO Auto-generated method stub
		return mileage;
	}
	/**
     * Returns the brand of the SUV car.
     *
     * @return the brand of the car
     */
	@Override
	public String getBrand() {
		// TODO Auto-generated method stub
		return brand;
	}
	/**
     * Returns the model of the SUV car.
     *
     * @return the model of the car
     */
	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return model;
	}
	/**
     * Returns the year of the SUV car.
     *
     * @return the year of the car
     */
	@Override
	public int getYear() {
		// TODO Auto-generated method stub
		return year;
	}
	/**
	 * Returns the fuel type of the SUV car.
     *
     * @return the fuel type of the car
     */
	@Override
	public String getFuelType() {
		// TODO Auto-generated method stub
		return fuelType;
	}
	/**
     * Returns the transmission type of the SUV car.
     *
     * @return the transmission type of the car
     */
	@Override
	public String getGear() {
		// TODO Auto-generated method stub
		return gear;
	}
	/**
     * Returns the color of the SUV car.
     *
     * @return the color of the car
     */
	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return color;
	}
    
}
