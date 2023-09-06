import java.util.*;

import java.util.Scanner;

class Rectangle
{
	float length;
	float breadth;
	float area;
	
	public void input()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter the Rectangle length");
		length = scanner.nextFloat();
		System.out.println("please enter the Rectangle breadth");
		breadth = scanner.nextFloat();
		
	}
	
	public void compute()
	{
		area = length*breadth;
	}
	
	public void disp()
	{
		System.out.println("area of Rectangle is: "+area);
	}
}

class Square
{
	float length;
	float area;
	
	public void input()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter the Square length");
		length = scanner.nextFloat();
	}
	
	public void compute()
	{
		area = length*length;
	}
	
	public void disp()
	{
		System.out.println("area of square is: "+area);
	}
}

class Circle
{
	float radius;
	float pi = 3.14f;
	float area;
	
	public void input()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter the circle radius");
		radius = scanner.nextFloat();
		
	}
	
	public void compute()
	{
		area = pi*radius*radius;
	}
	
	public void disp()
	{
		System.out.println("area of circle is: "+area);
	}
}

public class Project {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		Square s = new Square();
		Circle c = new Circle();
		
		r.input();
		r.compute();
		r.disp();
		
		s.input();
		s.compute();
		s.disp();
		
		c.input();
		c.compute();
		c.disp();
		

	}

}

/* Same Project by using OOPS Concept Like Encapsulation, Polymorphism And Abstraction*/


/*
abstract class Shapes
{
	float area;
	abstract public void input(); 
	abstract public void compute();
	public void disp()
	{
		System.out.println("Area is: "+area);
	}
}
class Rectangle extends Shapes
{
	float length;
	float breadth;
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the length of Rectangle");
		length = sc.nextFloat();
		System.out.println("please enter the breadth of Rectangle");
		breadth = sc.nextFloat();
		sc.close();
	}
public void compute()
	{
		area = length*breadth;
	}
}

class Circle extends Shapes
{
	float radius;
	float pi = 3.14f;
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the radius of circle");
		radius = sc.nextFloat();
		sc.close();
	}
	public void compute()
	{
		area = pi*radius*radius;
	}
}

class Square extends Shapes
{
	float length;
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the length of Square");
		length = sc.nextFloat();
		sc.close();
	}
	public void compute()
	{
		area = length*length;
	}
}
class Geometry
{
	public void permit(Shapes s)
	{
		s.input();
		s.compute();
		s.disp();
	}
}

public class Project
{
	public static void main(String[] args)
	{
		Rectangle rr = new Rectangle();
		Circle cc = new Circle();
		Square ss = new Square();
		
		Geometry g = new Geometry();
		g.permit(rr);
		g.permit(cc);
		g.permit(ss);
	}
}


*/

