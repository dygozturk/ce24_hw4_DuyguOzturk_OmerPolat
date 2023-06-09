package ce204_hw4_library_observeMethod;

public class User implements ReservationObserver {

	private String name;
	/**
     * Constructs a User object with the specified name.
     * 
     * @param name the name of the user
     */
    public User(String name) {
        this.name = name;
    }
    /**
     * Notifies the user about a reservation with the specified message.
     * 
     * @param message the message to notify the user about the reservation
     */
	@Override
	public void notifyReservation(String message) {
		// TODO Auto-generated method stub
		System.out.println(name + ": " + message);
	}

}
