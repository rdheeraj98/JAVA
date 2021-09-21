class Demo
{
static int a=0;

static
{
System.out.println("Static Block");
}
Demo()
{
a++;
}
static void display()
{
 System.out.println("Static Method");
 System.out.println(a);
}
}

class StaticDemo
{
public static void main(String args[])
{
Demo ob1=new Demo();
Demo ob2=new Demo();
Demo ob3=new Demo();
Demo ob4=new Demo();
Demo.display();
}
}


