
public class Overload {
	
	private int a;	// = 0 по умолчанию

	public Overload() {
		// TODO Auto-generated constructor stub
		a = 1000000000;
		a = 1_000_000_000;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	public void setA(float a) {
		this.a = (int) a;
	}

	public void setA(String a) {
		this.a = Integer.valueOf(a);
	}
	
}
