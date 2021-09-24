import java.util.*;
class player
{
   int id;
   String name;
   player(int i,String n)
   {
     id=i;
     name=n;
   }
   void print()
   {
      System.out.println("player id is"+id);
      System.out.println("player name is"+name);
   }
}
class cricket extends player
{
   int age;
   cricket(int i,String n,int a)
   {
     super(i,n);
     age=a;
   }
   void print()
   {
     super.print();
     System.out.println("cricket player age is"+age);
   }
}
class hockey extends player
{
  int weight;
  hockey(int i,String n,int w)
  {
    super(i,n);
    weight=w;
  }
  void print()
  {
   super.print();
   System.out.println("hockey player weight is"+weight);
 
  }
}
class football extends player
{ 
   int height;
    football(int i,String n,int h)
    {
      super(i,n);
      height=h;
    }
    void print()
    {
     super.print();
     System.out.println("football player height is"+height);
    }
}
class lab13
{
  public static void main(String args[])
  {
    cricket c=new cricket(1,"vasu",24);
    c.print();
    hockey h=new hockey(2,"siva",60);
    h.print();
    football f=new football(3,"khan",6);
    f.print();
  }
}