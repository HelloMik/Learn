package lessons;

public class lesson5a {

	public static void main(String[] args) {

		if (args.length != 2) {
			System.out.println("Two parameters required");
			return;
		}
		
		lesson5a obj = new lesson5a();
		
		Float a = Float.valueOf(args[0]);
		Float b = Float.valueOf(args[1]);
		
		System.out.println(a);
		System.out.println(b);
		
		float result = obj.add(a, b);
		System.out.println("сумма = " + result);
		
		result = obj.sub(a, b);
		System.out.println("разница = " + result);
		
		result = obj.mul(a, b);
		System.out.println("произведение = " + result);
		
		result = obj.div(a, b);
		System.out.println("деление = " + result);
		
		System.out.println("END");
	} // end of main
	
	public float add( float a, float b ) {
		
		float result = a + b;
		
		return result;
	}
	
	public float sub( float a, float b ) {
		
		float result = a - b;
		
		return result;
	}
	
	public float mul( float a, float b ) {
		
		float result = a * b;
		
		return result;
	}

	public float div( float a, float b ) {
		
		float result = a / b;
		
		return result;
	}
}
