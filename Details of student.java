import java.util.*;
class Student
{
   String Name;
   int USN;
   int Sem;
   String Branch;
   void readdata()
   {
      System.out.println("Students details is");
      Scanner sc=new Scanner(System.in);
      System.out.println("enter student name:");
      name=sc.next();
      System.out.println("enter student usn:");
      usn=sc.nextInt();
      System.out.println("enter student sem:");
      sem=sc.nextInt();
      System.out.println("enter student branch:");
      branch=sc.next();
   }
   void Display()
   {
      System.out.println("name is" +name);
      System.out.println("USN is" +usn);
      System.out.println("sem is" +sem);
      System.out.println("branch is" +branch);
   }
}
class Studentdemo
{
   public static void main(String args[])
   {
      System.out.println("enter the number of student:");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      Student S1[]=new Student[10];
      for(int i=0;i<n;i++)
      {
         S1[i]=new Student();
         S1[i].readdata();
      }
      for(int i=0;i<n;i++)
      {
         S1[i].display();
      }
   }
}