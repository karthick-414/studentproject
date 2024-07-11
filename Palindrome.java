import java.io.*;
class Palindrome
{
    public static void main(String args[])
    {
    int a=676;
    String result;

    result=(a%10==a/100)?"palindrom":"not a palindrome";
    System.out.println(result);
  }                     
}
