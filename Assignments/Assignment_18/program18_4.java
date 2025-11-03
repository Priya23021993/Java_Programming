class Logic
{
   void sumEvenOddDigits(int num)
   {
       int iDigit = 0,iEvenSum = 0, iOddSum = 0;    //To accept Input
        
        while(num > 0)
        {
            iDigit = num % 10;                      // get Last Digit 
             if((iDigit % 2)==0)                    //Check Even
             
                iEvenSum = iEvenSum + iDigit;
             
             else                                   //Check Odd
             
                iOddSum = iOddSum + iDigit;

                num = num / 10;                    //Remove Last digit 
             
        }
      
         System.out.println("Sum of even Digits =" +iEvenSum);
       
         System.out.println("Sum of odd Digits =" +iOddSum);

      }
      
   }

class program4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.sumEvenOddDigits(123456);
    }
}