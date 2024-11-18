
class Overloading
{
	float a,b;
	int a;
	int b;
	void sum(int a,int b)
	{
		System.out.println("The sum is"+(a+b));
	}
	void sum(float a,float b)
	{
		System.out.println("The sum is"+(a+b));
	}
	void sum(int a)
	{
		System.out.println("The sum is"+(a+a));
	}
}
class Overloading
{
	public static void main(String args[])
	{
		overloading a1=new overloading();
		a1.add(10);
		a1.add(12.5,13.2);
	}
}