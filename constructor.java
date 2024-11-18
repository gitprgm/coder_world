class Box
{
   double height;
   double width;
   double depth;
   Box()
   {
     height=width=depth=1;
   }
   Box(double h,double w,double d)
   { 
     height=h;
     width=w;
     depth=d;
   }
   Box(Box ob)
   {
     ob.height=height;
     ob.width=width;
     ob.depth=depth;
   }
   void Volume()
   {
     double Volume=height*width*depth;
     System.out.println("the Volume is" +Volume);
   }
}
class Boxweight extends Box
{
   double weight;
   Boxweight(double h,double w,double d,double we)
   {
      super(h,w,d);
      weight=we;
   }
   Boxweight(Boxweight ob)
   {
      ob.height=height;
      ob.width=width;
      ob.depth=depth;
      ob.weight=weight;
   }
   void show()
   {
      super.Volume();
      System.out.println("the weight is" +weight);
   }
}
class Shipment extends Boxweight
{
   double cost;
   Shipment(double h,double w,double d,double we,double co)
   {
      super(h,w,d,we);
      cost=co;
   }
   Shipment(Shipment ob)
   {
      ob.height=height;
      ob.width=width;
      ob.depth=depth;
      ob.weight=weight;
      ob.cost=cost;
   }
   void show()
   {
      super.show();
      System.out.println("the cost is" +cost);
   }
}
class Demo
{
   public static void main(String args[])
   {
      Shipment S1=new Shipment(5,10,19.5,19.6,6.5);
      S1.show();
   }
}