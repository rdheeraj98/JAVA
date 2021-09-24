import java.util.*;
import java.lang.*;
class Bank
{
 String name;
 double bal;
 int accno;
 Bank(String s,double b,int a)
 {
  name=s;
  bal=b;
  accno=a;
 }
 void deposit(Bank b,double amt)
 {
  b.bal=b.bal+amt;
 }
  void withdraw(Bank b,double amt)
 {
  b.bal=b.bal-amt;
 }
  void transfer(Bank b1,Bank b2,double amt)
 {
  b1.bal=b1.bal-amt;
  b2.bal=b2.bal+amt;
 }
 void display()
 {
  System.out.println(name+bal+accno);
 }
}
class lab8
{
 public static void main(String args[])
 {
  int flag1=0,flag2=0,flag3=0,flag4=0,opt;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter no of custemers");
  int n=sc.nextInt();
  Bank b[]=new Bank[n];
  
  for(int i=0;i<n;i++)
  {
   String s=sc.next();
   double bal=sc.nextDouble();
   int accno=sc.nextInt();
   b[i]=new Bank(s,bal,accno);
  }
   
  do
  {
   System.out.println("menu\n 1.deposit\n 2.withdraw\n 3.transfer\n enter your option\n");
   opt=sc.nextInt();
   
   switch(opt)
   {
    
    case 1: System.out.println("enter accno to deposit");
    int accno1=sc.nextInt();
    int i;
    for(i=0;i<n;i++)
    {
     if(accno1==b[i].accno)
     {
      flag1=1; 
      break;
     }
    }
    if(flag1==1)
    {
     System.out.println("enter amount to deposit");
     int amt=sc.nextInt();
     b[i].deposit(b[i],amt);
     System.out.println("after deposit");
     b[i].display();
    }
    else
     System.out.println("accno not found");
      break;
   
 case 2: System.out.println("enter accno to withdraw");
        int accno2=sc.nextInt();
        
        for(i=0;i<n;i++)
        {
         if(accno2==b[i].accno)
         {
          flag2=1;
          break;
         }
        }
        if(flag2==1)
        {
           System.out.println("enter amount to withdraw");
           int amt=sc.nextInt();
           b[i].withdraw(b[i],amt);
           System.out.println("after withdraw");
           b[i].display();
        }
       else
        System.out.println("accno not found");
        break;
  case 3: System.out.println("enter accno which transfer");
        int accno3=sc.nextInt();
        
        for(i=0;i<n;i++)
        {
         if(accno3==b[i].accno)
         {
          flag3=1;
          break;
         }
        }
       System.out.println("enter accno which is to transfer");
        int accno4=sc.nextInt();
        int j;
        for(j=0;j<n;j++)
        {
         if(accno4==b[j].accno)
         {
          flag4=1;
          break;
         }
        }
System.out.println("flag3"+flag3+"flag4"+flag4);        
if(flag3 ==1 && flag4==1)
        {
          System.out.println("enter amount to transfer");
           int amt=sc.nextInt();
           b[i].transfer(b[i],b[j],amt);
           System.out.println("after transfer");
           b[i].display();
           b[j].display();
        }
       else
        System.out.println("accno not found");
        break;
      default : System.out.println("invalid option");
     }
    }while(opt!=0);
   }
 }
                   