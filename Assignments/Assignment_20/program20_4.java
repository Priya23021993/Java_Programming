class Logic
{
    void findLargestDigit(int num)
    {
        int iMax = 0 ,iDigit = 0;
        while(num > 0)
         {
            iDigit = num % 10;

            if(iDigit  > iMax)
             iMax = iDigit;
            num = num / 10;
         }  
         
           System.out.println("Largest Digit is :" +iMax);
         
    }
}
class program4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.findLargestDigit(7394);
    }
}