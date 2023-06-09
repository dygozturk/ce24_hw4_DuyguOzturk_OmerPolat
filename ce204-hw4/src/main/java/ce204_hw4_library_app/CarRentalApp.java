package ce204_hw4_library_app;

import java.time.LocalDate;
import java.util.Scanner;
import ce204_hw4_librar_factoryMethod.ICarRental;
import ce204_hw4_librar_factoryMethod.RentalFactory;
import ce204_hw4_library_observeMethod.*;
import ce204_hw4_library_strategyMethod.*;

/**
 * The CarRentalApp class represents the main entry point for the Car Rental App.
 * It allows users to select a car type, choose a payment method, and make a reservation.
 */
public class CarRentalApp{
	
	/**
	 * The main method is the entry point for the Car Rental App.
	 * It interacts with the user to select a car type, choose a payment method, and make a reservation.
	 * @param args The command-line arguments (not used).
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        RentalFactory rentalFactory = new RentalFactory();
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        int totalPrice;
        String cardNumber, cvv, expirationDate;
        String email, password;

        System.out.println("Please enter the user name: ");
        String userName = scanner.next();
        scanner.nextLine();

        System.out.println("How many days do you want to rent?");
        int day = scanner.nextInt();
        scanner.nextLine();

        System.out.println("After how many days does the rental start?");
        int startDay = scanner.nextInt();
        scanner.nextLine();

        User user = new User(userName);
        CarReservationSystem reservationSystem = new CarReservationSystem();
        reservationSystem.addUser(user);

        while (true) {
            
            
                	System.out.println("Welcome to the Car Rental App!");
                    System.out.println("Please select a car type:");
                    System.out.println("1. Economy");
                    System.out.println("2. Luxury");
                    System.out.println("3. SUV");

                    int carType = scanner.nextInt();
                    scanner.nextLine();

                    ICarRental carRental;
                    switch (carType) {
                        case 1:
                            ICarRental economyRental = rentalFactory.createRental("economy", 50000, "Honda", "Civic", 2022, "Gasoline", "Automatic", "Red", 500);
                            economyRental.rentCar();
                            totalPrice = economyRental.getPrice() * day;
                            break;
                        case 2:
                            ICarRental luxuryRental = rentalFactory.createRental("luxury", 20000, "Mercedes-Benz", "S-Class", 2021, "Diesel", "Automatic", "Black", 4000);
                            luxuryRental.rentCar();
                            totalPrice = luxuryRental.getPrice() * day;
                            break;
                        case 3:
                            ICarRental suvRental = rentalFactory.createRental("suv", 10000, "Toyota", "Land Cruiser", 2023, "Gasoline", "Automatic", "Silver", 1500);
                            suvRental.rentCar();
                            totalPrice = suvRental.getPrice() * day;
                            break;
                        default:
                            System.out.println("Invalid car type. Please try again.");
                            continue;
                    }

                    System.out.println("Please choose the payment method:");
                    System.out.println("1. Credit Card");
                    System.out.println("2. Cash");
                    System.out.println("3. Online Payment");

                    System.out.print("Select a payment option: ");
                    int paymentOption = scanner.nextInt();

                    switch (paymentOption) {
                        case 1:
                            System.out.println("Credit Card payment selected.");
                            System.out.println("Credit Card Number: ");
                            cardNumber = scanner.next();
                            scanner.nextLine();
                            System.out.println("CVV Number: ");
                            cvv = scanner.next();
                            scanner.nextLine();
                            System.out.println("Expiration Date: ");
                            expirationDate = scanner.next();
                            scanner.nextLine();
                            PaymentStrategy creditCardPayment = new CreditCardPayment(cardNumber, cvv, expirationDate);
                            paymentProcessor.setPaymentStrategy(creditCardPayment);
                            paymentProcessor.processPayment(totalPrice);
                            break;
                        case 2:
                            System.out.println("Cash payment selected.");
                            PaymentStrategy cashPayment = new CashPayment();
                            paymentProcessor.setPaymentStrategy(cashPayment);
                            paymentProcessor.processPayment(totalPrice);
                            break;
                        case 3:
                            System.out.println("Online Payment selected.");
                            System.out.println("E-mail: ");
                            email = scanner.next();
                            scanner.nextLine();
                            System.out.println("Password: ");
                            password = scanner.next();
                            scanner.nextLine();
                            PaymentStrategy onlinePayment = new OnlinePayment(email, password);
                            paymentProcessor.setPaymentStrategy(onlinePayment);
                            paymentProcessor.processPayment(totalPrice);
                            break;
                        default:
                            System.out.println("Invalid payment option selected.");
                            break;
                    }

                    LocalDate reservationStartDate = LocalDate.now();
                    LocalDate newReservationStartDate = LocalDate.now().plusDays(startDay);

                    reservationSystem.makeReservation(newReservationStartDate, day);

                    scanner.nextLine();
                    break;
                
        }
    }
}
