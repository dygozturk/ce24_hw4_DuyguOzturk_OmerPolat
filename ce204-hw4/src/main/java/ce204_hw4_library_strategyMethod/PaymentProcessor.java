package ce204_hw4_library_strategyMethod;

/**
 * The PaymentProcessor class is responsible for processing payments using a payment strategy.
 */
public class PaymentProcessor {
	private PaymentStrategy paymentStrategy;

	 /**
     * Sets the payment strategy to be used for processing payments.
     * 
     * @param paymentStrategy the payment strategy to be set
     */
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    /**
     * Processes a payment using the specified amount.
     * 
     * @param amount the amount to be paid
     */
    public void processPayment(double amount) {
        paymentStrategy.pay(amount);
    }
}
