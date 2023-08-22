package a10_InterfaceExample;

public interface Father {
	void confidence();
	void attitude();
	default void love()
	{
	System.out.println("Fathers love");
	}
	static void emotion()
	{
	System.out.println("Fathers emotion");
	} }