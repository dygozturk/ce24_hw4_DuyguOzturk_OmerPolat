package ce204_hw4_library_observeMethod;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * The CarReservationSystem class represents a car reservation system.
 */
public class CarReservationSystem {
	private ReservationSubject reservationSubject = new ReservationSubject();

	/**
     * Makes a car reservation with the specified start date and rental days.
     * 
     * @param startDate   the start date of the reservation
     * @param rentalDays  the number of rental days
     */
    public void makeReservation(LocalDate startDate, int rentalDays) {
        LocalDate endDate = startDate.plusDays(rentalDays);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        String message = "New reservation: Your rental period is from "
                + startDate.format(formatter) + " to " + endDate.format(formatter) + ".";
        reservationSubject.notifyObservers(message);
    }
    /**
     * Adds a user as an observer to the reservation subject.
     * 
     * @param user the user to be added
     */
    public void addUser(User user) {
        reservationSubject.attachObserver(user);
    }
    /**
     * Removes a user from the reservation subject.
     * 
     * @param user the user to be removed
     */
    public void removeUser(User user) {
        reservationSubject.detachObserver(user);
    }
    /**
     * Returns a list of observers attached to the reservation subject.
     * 
     * @return the list of observers
     */
    public List<ReservationObserver> getObservers() {
        return reservationSubject.getObservers();
    }
}
