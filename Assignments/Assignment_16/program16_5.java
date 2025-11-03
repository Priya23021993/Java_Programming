
//Write a program to count the number of digits in a given number.

class Logic
{
    void countDigits(int num)
    {
        int iCount = 0;
        while(num != 0)
        {
            num = num /10;
            iCount++;
        }   
           System.out.println("Number of Digits :"+iCount);
    }  

}    
class program5

{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.countDigits(7865);
    }

}