package lesson2;

public class lesson3 {

	public static void main(String[] args) {
		
		int i=2;					
		
		{
			int j=2;
			System.out.println("i =" + i);
		}
		
		
//		j=0; ������ �.�. ���������� ��������� � �������
		
		int a = 4;
		int b = 0;
		
		if (b == 0)
		{
			System.out.println("������! �� ���� ������ ������!");
//			System.exit(1);
		}
		else
		{
			int c = a / b;
			
			System.out.println("a / b = " + c);
		}
		
//		int c = a / 0;
		
		
		for (int j = 0; j < 10; j++) {
			System.out.println("j = " + j);
			
			if ( j % 2 == 0 )
				System.out.println("������");
			else
				System.out.println("�����");
			
		}
		
		// infinite cycle
		
		
		for (int k = 0;;) {
			k++;
			if (k > 1 ) {
				System.out.println("Hello! " + k);
			} // if
			
			if ( k > 10 )
				break;
			
		} // for
		
		
//		System.out.println("����� ���������");
		
	} // main

} // class
