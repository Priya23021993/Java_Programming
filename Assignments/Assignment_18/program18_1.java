
class Logic
{
    void checkPrime(int num)
    {
        int iCnt = 0;
        int flag = 0;
       for(iCnt = 2; iCnt <= num / 2; iCnt++)
       {
           if(num % iCnt == 0)
           {
               flag = 1;
               break;
           }
       }
         if(flag == 0)
         {
           System.out.println(num + "Is a prime Number");
         }
         else
         {
            System.out.println(num + "is not a prime Number");
         }  
    }
}
class program1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkPrime(11);
    }
}