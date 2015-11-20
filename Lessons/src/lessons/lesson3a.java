package lessons;

public class lesson3a {
	public static void main(String[] args) {
		
		int a, b,c=0;
		a = 5;
		b = 0;
		float d=5;
		float e = 0;
		
		float z = d/e;
		System.out.println(z);
		
		if ( b != 0 )	
			c = a / b;
		else
			System.err.println("На ноль делить нельзя");
		
		
		try {
			c = a / b;
		} catch (Exception e2) {
			System.err.println("На ноль делить нельзя");
		}

		System.out.println(c);
		
	} // end of main
} // end of class






