class EvenOdd
{
    public static void main(String[] args)
    {
       System.out.print("Enter the number: ");
       Scanner reader = new Scanner(System.in); //object creation
       int num = reader.nextInt(); //reader is integer number
       reader.close();
       if(num%2==0)
       {
           System.out.print("/n Entered number"+num+"is a Even number.");
       }
       else
       {
           System.out.print("/n Entered number"+num+"is a Odd number.");
       }
    }
}
