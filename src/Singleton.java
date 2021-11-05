
public class Singleton {
	private static Singleton single;
	
	public static Singleton getInstance() {
		if (single == null) {
			single = new Singleton();
		}
		return single;
	}
	
	public String getDescription() {
		return "I am a classic Singleton";
	}
}