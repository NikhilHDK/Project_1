package a12_Generalization;

public class Gpay implements UPI {

	@Override
	public void QRCodePayments() {
		// TODO Auto-generated method stub
		System.out.println("Gpay's QRCodePayment method");

	}

	@Override
	public void B2BPayments() {
		// TODO Auto-generated method stub
		System.out.println("Gpay's B2BPayments method");

	}

	@Override
	public void BalanceCheck() {
		// TODO Auto-generated method stub
		System.out.println("Gpay's BalanceCheck method");

	}

	@Override
	public void M2MPayments() {
		// TODO Auto-generated method stub
		System.out.println("Gpay's M2MPayments method");
	}

	public void GasBooking()
	{
		System.out.println("Gpay's gasBooking method");

	}
}
