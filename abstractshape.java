//Java program to calculate area and perimeter of variety of shapes.


abstract class shape
{
	abstract void calculateArea();
	abstract void calculatePerimeter();
}
class Circle extends shape
{
	double radius;
	Circle(double a)
	{ 
		radius=a;
	}
	void calculateArea()
	{
		double area=radius*radius*3.14;
		System.out.println("Area:"+area);
	}
	void calculatePerimeter()
	{
		double per=2*3.14*radius;
		System.out.println("Perimeter:"+per);
	}
}
class Triangle extends shape
{
	double dim1;
	double dim2;
	double dim3;
	Triangle(double a,double b,double c)
	{
		dim1=a;
		dim2=b;
		dim3=c;
	}
	void calculateArea()
	{
		System.out.println("Area of triangle:"+0.5*dim2*dim3);
	}
	void calculatePerimeter()
	{
		System.out.println("Perimeter of triangle:"+(dim1+dim2+dim3));
	}
}
class ShapeDemo
{
	public static void main(String args[])
	{
		shape s;
		Circle c=new Circle(10);
		s=c;
		s.calculateArea();
		s.calculatePerimeter();
		Triangle t=new Triangle(20,30,40);
		s=t;
		s.calculateArea();
		s.calculatePerimeter();
	}
}