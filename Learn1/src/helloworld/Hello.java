package helloworld;

public class Hello {
	
	public String strHello = "Hello";
	protected String strHola = "Hola";
	private String strPrivet = "Привет";
	
	public final String strHi = "Hi!";
	public final int max_life = 100;
	
	public String get() {
		return strPrivet;
	}
	
	public void set(String strPrivet) {
		this.strPrivet = strPrivet;
	}
	
	
}
