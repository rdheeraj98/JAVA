// comparison of two strings 5.(C) Program
import java.util.Scanner;

public class Compare
{
   public static void main(String args[])
   {
      String str1, str2;
      Scanner in = new Scanner(System.in);
 
      System.out.println("Enter First String");
      str1 = in.nextLine();
 
      System.out.println("Enter Second String");
      str2 = in.nextLine();
 
      if(str1.compareTo(str2) > 0)
      {
         System.out.println("First String is Greater than Second String.");
      }
      else if(str1.compareTo(str2) < 0)
      {
         System.out.println("First String is Smaller than Second String.");
      }
      else
      {
         System.out.println("Both Strings are Equal ");
      }
   }
}