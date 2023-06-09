package ce204_hw4_library_strategyMethod;

/**
 * The OnlinePayment class represents a payment method made online.
 */
public class OnlinePayment implements PaymentStrategy{
	
	private String email;
    private String password;

    /**
     * Constructs an OnlinePayment object with the specified email and password.
     * 
     * @param email    the email associated with the online payment
     * @param password the password associated with the online payment
     */
    public OnlinePayment(String email, String password) {
        this.email = email;
        this.password = password;
    }
    /**
     * Performs a payment transaction online.
     * 
     * @param amount the amount to be paid
     */
	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Paying $" + amount + " online with email: " + email);
	}

}
