package helloworld;

public class World {
	
	public String strWorld = "World";
	public static String strWWW = "WWW";
	private static String strStatic = "Мир";
	
	public static String get() {
		return strStatic;
	}
	public static void set(String strStatic) {
		World.strStatic = strStatic;
	}
}
