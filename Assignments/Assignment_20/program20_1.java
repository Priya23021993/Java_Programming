class Logic
{
    void sumEvenNumbers(int n)
    {
        int iSum = 0;
         int iCnt = 0;
         for(iCnt = 1; iCnt <= n; iCnt++)
         {
            if(iCnt % 2 == 0)
            {
            iSum = iSum + iCnt;
            }
         }  
         System.out.println("Sum of even numbers up to " +n+ "is" +iSum);
    }
}
class program1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.sumEvenNumbers(10);
    }
}