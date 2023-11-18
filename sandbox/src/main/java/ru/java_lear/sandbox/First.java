package ru.java_lear.sandbox;

public class First {

	public static void main(String[] args){
		hello("world");
		hello("user");
		hello("Sergei");

		Square s = new Square(5);

		System.out.println("площадь квадрата со стороной " + s.l + " = " + area(s));

		Rectangle r = new Rectangle(4, 6);
		r.a = 2;
		r.b = 3;
		System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + area(r));
	}
	public static void hello(String somebody){
		System.out.println("Hello " + somebody + " !");
	}

	public static double area(Square s){
		return s.l * s.l;
	}

	public static double area(Rectangle r) {
		return r.a * r.b;
	}
}