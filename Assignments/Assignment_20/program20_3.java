class Logic
{
    void checkPerfect(int num)
    {
        int iCnt = 0;
        int iSum = 0;
      for(iCnt = 1; iCnt <= num / 2; iCnt++)
         {
            if(num % iCnt == 0)
            iSum = iSum + iCnt;
         }  
         if(iSum == num)
         {
           System.out.println(num + "is a perfect Number");
         }
         else
         {
            System.out.println(num + "is not a perfect Number");
         }
    }
}
class program3
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkPerfect(6);
    }
}