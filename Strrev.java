import java.util.*;
class Strrev
{
   public static void main(String args[])
   { Scanner in = new Scanner(System.in);
     String s = in.nextLine();
     String reverse="";
     int len=s.length();
          for ( int i = len - 1 ; i >= 0 ; i-- )
         reverse = reverse + s.charAt(i);
         //System.out.println(reverse);
         String[] arr = reverse.split(" ");  
         for ( String ss : arr)
          {  System.out.println(ss);}
  }
  }
