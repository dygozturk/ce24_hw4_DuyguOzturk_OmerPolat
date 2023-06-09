package ce204_hw4_library_strategyMethod;

/**
 * The PaymentStrategy interface represents a payment strategy.
 */
public interface PaymentStrategy {
	
	/**
     * Performs a payment transaction.
     * 
     * @param amount the amount to be paid
     */
	void pay(double amount);
	
}
