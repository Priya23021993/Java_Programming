class Logic
{
    void printDigits(int num)
    {
        int iDigit = 0;

        System.out.println("Digits are:");

       while(num > 0)
        { 
            iDigit = num % 10;             //Get last Digit
            System.out.println(iDigit);
            num = num / 10 ;                 //Remove last digit
    
        }
    }
}        

class program4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printDigits(9876);
    }
}