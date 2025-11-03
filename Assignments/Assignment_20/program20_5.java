class Logic
{
    void findSmallestDigit(int num)
    {
        int iSmallest = 9;             //assume Largest  possible
        int  iDigit = 0;

        while(num > 0)
         {
            iDigit = num % 10;         //Extra Last Digit

            if(iDigit  < iSmallest)     //Check if it's Smaller
            iSmallest = iDigit;
            num = num / 10;             //Remove Last Digit
         }  
         
           System.out.println("Smallest Digit is :" +iSmallest);
         
    }
}
class program5
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.findSmallestDigit(45872);
    }
}