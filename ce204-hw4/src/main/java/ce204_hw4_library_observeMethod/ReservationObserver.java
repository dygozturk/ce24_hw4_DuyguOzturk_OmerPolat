package ce204_hw4_library_observeMethod;

public interface ReservationObserver {
	/**
     * Notifies the observer about a reservation with the specified message.
     * 
     * @param message the message to notify the observer about the reservation
     */
	void notifyReservation(String message);
}
