import java.util.*;
 
class Palindrome
{
   public static void main(String args[])
   {
      String original, reverse = ""; 
      Scanner in = new Scanner(System.in);
      int count=0;
      System.out.println("Enter a string to check if it is a palindrome");
      original = in.nextLine();
 
      int length = original.length();
 
      for ( int i = length - 1; i >= 0; i-- )
         reverse = reverse + original.charAt(i);
 
      if (original.equals(reverse))
      {  for ( int i = length - 1; i >= 0; i-- ){
        
        if(original.charAt(i)=='a'||original.charAt(i)=='e'||original.charAt(i)=='i'||original.charAt(i)=='o'||original.charAt(i)=='u')
        {
        count++;
        }
        }
        if(count<=3)
        {
         System.out.println("false");
         }
         else
         {
          System.out.println("true"); 
          }
         }
      else 
      {
         System.out.println("Entered string is not a palindrome.");
         }
 
   }
} 
