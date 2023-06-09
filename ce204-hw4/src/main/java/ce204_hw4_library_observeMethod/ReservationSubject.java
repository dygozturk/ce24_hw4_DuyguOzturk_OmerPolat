package ce204_hw4_library_observeMethod;

import java.util.ArrayList;
import java.util.List;

public class ReservationSubject {
	private List<ReservationObserver> observers = new ArrayList<>();
	
	/**
     * Attaches an observer to the reservation subject.
     * 
     * @param observer the observer to be attached
     */
    public void attachObserver(ReservationObserver observer) {
        observers.add(observer);
    }
    /**
     * Detaches an observer from the reservation subject.
     * 
     * @param observer the observer to be detached
     */
    public void detachObserver(ReservationObserver observer) {
        observers.remove(observer);
    }
    /**
     * Notifies all observers with the specified message.
     * 
     * @param message the message to notify the observers
     */
    public void notifyObservers(String message) {
        for (ReservationObserver observer : observers) {
            observer.notifyReservation(message);
        }
    }
    /**
     * Returns a list of observers attached to the reservation subject.
     * 
     * @return the list of observers
     */
    public List<ReservationObserver> getObservers() {
        return observers;
    }
}
