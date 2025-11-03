class Logic
{
    void printReverse(int n)
    {
        int iCnt = 0;

       System.out.println("Numbers from" + n + "to 1 in reverse order:");

         for(iCnt = n; iCnt >= 1; iCnt--)
         {
             System.out.println(iCnt + "");

         }  
    }
}
class program2
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printReverse(10);
    }
}