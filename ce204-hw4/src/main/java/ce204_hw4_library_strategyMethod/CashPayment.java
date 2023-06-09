package ce204_hw4_library_strategyMethod;

/**
 * The CashPayment class represents a payment method using cash.
 */
public class CashPayment implements PaymentStrategy {

	/**
     * Performs a payment transaction using cash.
     * 
     * @param amount the amount to be paid
     */
	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Paying $" + amount + " in cash");
	}

}
