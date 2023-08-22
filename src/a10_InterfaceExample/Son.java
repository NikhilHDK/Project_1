package a10_InterfaceExample;

public class Son implements Mother,Father
	{

	public static void main(String[] args)
	{
		Son s=new Son();
		
		s.confidence();
		s.attitude();
		s.look();
		s.nature();
		s.laptop();
		s.love();
	}

	@Override
	public void confidence() {
		System.out.println("Fathers property-confidence implemented by Son ");
		
	}

	@Override
	public void attitude() {
		System.out.println("Fathers property-attitude implemented by Son ");
		
	}

	@Override
	public void look() {
		System.out.println("Mothers property-look implemented by Son ");		
	}

	@Override
	public void nature() {
		System.out.println("Mothers property-nature implemented by Son ");
		
	}
	public void laptop()
	{
		System.out.println("Sons own property");

	}

	@Override
	public void love() {
		// TODO Auto-generated method stub
		Mother.super.love();
		Father.super.love();
	}

	
	
	

}
