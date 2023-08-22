package a12_Generalization;

public class BHIM  implements UPI {

	public static void main (String[] args)
	{
		
	}

	@Override
	public void QRCodePayments() {
		// TODO Auto-generated method stub
		System.out.println("BHIM's QRCodePayment method");
	
	}

	@Override
	public void B2BPayments() {
		// TODO Auto-generated method stub
		System.out.println("BHIM's B2BPayments method");

	}

	@Override
	public void BalanceCheck() {
		// TODO Auto-generated method stub
		System.out.println("BHIM's BalanceCheck method");

	}

	@Override
	public void M2MPayments() {
		// TODO Auto-generated method stub
		System.out.println("BHIM's M2MPayments method");

	}
	
	public void Recharge()
	{
		System.out.println("BHIM's recharge method");

	}
}
