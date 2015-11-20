package lesson2;

public class lesson2 {

	
	
	
	public static void main(String[] args) {

		boolean bOK = false;
//		кол-во жижней
		int iLifes = 100;
		long lPeoples = 100L;
		float fSize = 10.6F;
		// TOOD: написать число полностью
		double dUniverse = 3.1415;
		
		char Procent = '%';
		
		String str = "Привет, \"как дела! \n 123";
		
		System.out.println("Кол-во жизней: " + iLifes + Procent);
		
		System.out.println(str);
		
		float a = 5.5F;
		float b = 8.4F;
		int c =  (int) (a / b);
		
		System.out.println("Sum = " + (a + b));
		System.out.println("Sub = " + (a - b));
		System.out.println("div = " + (int) ( (float) a / (float) b ) );
		System.out.println("Mul = " + (a * b));
		
	}

}
