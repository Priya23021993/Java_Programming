
//Write a program to reverse a number.

class Logic
{
    void reverseNumber(int num)
    {
        int iRev = 0;
        int iDigit = 0;

        while(num != 0)
        {
            iDigit = num % 10;
            iRev = iRev * 10 + iDigit;
            num = num /10;
        }   
           System.out.println("Reverse Number :"+iRev);
    }  

}    
class program4

{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.reverseNumber(1234);
    }

}