class Vehicle
{
  void Start()
  {
     System.out.println("Vehicle started");
  }
}
class Car extends Vehicle
{
   void drive()
   {
      System.out.println("Car is driving");
   }
}
class Sportscar extends Car
{
   void drive()
   {
      System.out.println("Sportscar driving fast");
   }
}
class Demo
{
   public static void main(String args[])
   {
      Vehicle V1=new Vehicle();
      V1.Start();
      Car C1=new Car();
      C1.Start();
      C1.drive();
      Sportscar S1=new Sportscar();
      S1.Start();
      S1.drive();
   }
}