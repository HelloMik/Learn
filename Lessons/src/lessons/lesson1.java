package lessons;

public class lesson1 {

	public static void main(String[] args) {
		// комментарий
		/*
		 много 
		 строк
		*/

		lesson1 obj = new lesson1();
		obj.cycles(0);
		obj.cycles(1);
		obj.cycles(-1);
		
		byte things = 127;
		short digit = 32767;
		int nLifes = 100;
		long lBigest = 999999999;
		long aNumber = 0L;

		float pi = 3.1415F;
		double pi2 = 3.1415;
		
		int karma = -100500;
		
		System.out.println("Кол-во жизней = " + nLifes);
		System.out.println("Hello World");
		
		
		{
			int i=0;
		}
		
		int i;
		i = 0;
		
		
		int a = 3;
		int b = 7;
		int c = 0;
		int C = 1;
		
		c = a + b;
		c = a - b;
		c = a * b;
		c = a / b;
		
		
		c--;

		c++;
		c = c + 1;
		c += 1;
		
		c /= 5;
		c = c / 5;
		
		
		
		b = ++a+a++;
		a = a + 1; // a++;
		b = a + a; // 
		a = a + 1; // a += 1;
		
		c = 1 + 4 * 2;
		
		
		String str = "Привет!";
		
		System.out.println(str);
	
		
		float aa = 5.5F;
		float bb = 8.4F;
		int cc =  (int) (a / b);
		int c1 = (int) aa;
		
		int k=5;
		float f = (float)k;
		
		float a1 = 5.5F;
		float b1 = 8.4F;
	
		System.out.println("Sum = " + (a1 + b1));
		System.out.println("Sub = " + (a1 - b1));
		System.out.println("div = " + (int) ( (float) a1 / (float) b1 ) );
		System.out.println("Mul = " + (a1 * b1));
		
		boolean bOk = true; // false
		
		
	} // end of main

	public void cycles(int i) {
				
		if ( i == 0 )
		{
			System.out.println("i = 0");
		}
		else
		{
			System.out.println("i != 0");
		}
		
		if ( i >= 0)
			System.out.println("больше или рвно нулю");
		
		if ( ( i == 0 ) && ( i < 0 ) )
			System.out.println("меньше или рвно нулю");
		
		if ( ( i == 0 ) || ( i < 0 ) )
			System.out.println("меньше или рвно нулю");
		
		if ( i != 0 )
			System.out.println("i не равно нулю");
		
		//
		
		for ( int j = 0; j < 10; j++ ) {
			if ( (j % 2) == 0 )
				System.out.println(j + " Четное");
			else
				System.out.println(j + " Не четное");
		}
		
		
//		for (;;) {
//			System.err.println("Кранты");
//		}

		int j = 10;
		for (;;) {
			j--;
			if (j == 0)
				break;
			
			if ( j == 5 )
				continue;
			
			System.out.println(j);
		}
		
		
	} // end of cycles
	
} // end of class
