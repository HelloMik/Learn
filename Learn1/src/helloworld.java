

import helloworld.Hello;
import helloworld.World;

public class helloworld {
	
	public static void main(String[] args) {
		
		Hello hello = new Hello();
		World world = new World();

		System.out.println(hello.strHello + " " + world.strWorld);

		System.out.println( World.strWWW ); // Статическая переменная 
		
		System.out.println( hello.get() ); // hello
		hello.set("Здравствуйте");
		System.out.println( hello.get() );
		
		hello.strHello="123";
//		hello.strHi = "123";
		
		/*************************************************/
		
		Overload over = new Overload(); // создаем новый экземпляр класса
		
		System.out.println( over.getA() );
		
		over.setA(100); // целое число
		
		System.out.println( over.getA() );
		
		over.setA(3.1415f); // с плавающей точкой
		
		System.out.println( over.getA() );
		
		over.setA("123"); // строка
		
		System.out.println( over.getA() );
	} // end of main
} // end of class
