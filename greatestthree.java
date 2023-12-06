// Program to find the greatest among three numbers


import java.util.Scanner;
public class GT
{
   public static void main(String args[])
   {
       Scanner reader=new Scanner(System.in);
       System.out.print("\n Enter the numbers----");
       System.out.print("\n Enter the first number=");
       int fn =reader.nextInt();
       System.out.print("\n Enter the second number=");
       int sn =reader.nextInt();
       System.out.print("\n Enter the third number=");
       int tn =reader.nextInt();
       reader.close();

       //code to find logic
       if(fn>sn)
       {
          if(fn>tn)
          {
             System.out.print("\nThe Greatest no="+fn);
          }
          else
          {
             System.out.print("\nthe greatest no="+tn);
          }
       }
       else
       {
           if(sn>tn)
          {
             System.out.print("\nThe Greatest no="+sn);
          }
          else
          {
             System.out.print("\nthe greatest no="+tn);
          }
       }
   }
}
