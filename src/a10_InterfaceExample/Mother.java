package a10_InterfaceExample;

public interface Mother {
	void look();
	void nature();
	default void love()
	{System.out.println("Mothers love");
	}
	static void emotion()
	{
	System.out.println("Mother Emotion");
	} }