
//Write a program to find the sum of digits of a number.

class Logic
{
   void sumOfDigits(int num)
   {
       int iSum = 0, iDigit = 0;
       while(num != 0)
       {
          iDigit = num % 10;
          iSum = iSum + iDigit;
          num = num / 10;
       }
       System.out.println("Sum of digit is:"+iSum);
   }
}
class program1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.sumOfDigits(1234);
    }
}