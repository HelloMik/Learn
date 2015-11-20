package lessons;

public class lesson4 {

	public int var = 0;
	private int priv = 1;
	protected int prot = 4;
	
	public double pi = 3.1415;

	public static void main(String[] args) {

		lesson4 myClass = new lesson4();
		lesson4 myClass1 = new lesson4();
		
		myClass.var = 1;

		System.out.println(myClass.var);
		System.out.println(myClass1.var);

		myClass.operators();
		
		myClass.testArray();

		System.out.println("End");
	} // конец main

	
	public static void test() {
		System.err.println("test");
	}


	public void testArray() {
		
		int[] anArray;

//		System.out.println(anArray);
		
		anArray = new int[10];

		anArray[1] = 4;

		System.out.println(anArray[0]);
		System.out.println(anArray[1]);

		

		String[] sNames = { "Петя", "Вася", "Коля" };
		byte[] Marks = { 5, 2, 3 };

		System.out.println(sNames[0] + " - " + Marks[0]);
		System.out.println(sNames[1] + " - " + Marks[1]);
		System.out.println(sNames[2] + " - " + Marks[2]);

		
			
		for (int i=0; sNames.length > i; i++)
			System.out.println(sNames[i] + " - " + Marks[i]);
		
		
		
		
		int[][] points = new int[10][2];
		points[0][0] = 1; // x
		points[0][1] = 1; // y
		
		points[5][0] = 8; // Х шестой точки
		points[5][1] = 8; // У шестой точки
	
		
		
	} // end of testArray
	
	public void operators() {

		int a = 1;
		int A = 2;
		int c = a + A;
		
		int b = ++a+a++;
		a = a + 1; // a++;
		b = a + a; // 
		a = a + 1; // a += b;
//		a = a * b;
//		a *= b;
		
		c = 1 + 4 * 2;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		

		int max;
		
		if ( a > b )
			max = a;
		else
			max = b;

		max = (a > b) ? a : b;
	
		
		//      true        true
		if ( ( a > b ) && ( a > 0) )
			System.out.println("");

		if ( a > b )
			if ( a > 0 )
				System.out.println("Ура!");
	
		
		
		
		if ( a >= 0 || b <= 0 )
			System.out.println("");

		
		
		
		if (a != 0) // а не равно нулю
			System.out.println("a is not equial zero");
		
		
		if ( !(a == 0) )
			System.out.println("a is not equial zero");
	
		
		a = a + b;
		a += b;
		a *= b;
		
		
		int i = 3;
        i++;
        // prints 4
        System.out.println(i);
        ++i;			   
        // prints 5
        System.out.println(i);
        // prints 6
        System.out.println(++i);
        // prints 6
        System.out.println(i++);
        // prints 7
        System.out.println(i);
		
	} // end of operators

} // конец class
