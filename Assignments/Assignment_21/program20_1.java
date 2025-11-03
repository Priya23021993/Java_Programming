class Logic
{
    void productOfDigits(int num)
    {
        int iDigit = 0; 
        int iProduct = 1;

        if(num < 0)
        {
            num = -num;   
        }
        while(num != 0)
        {
            iDigit = num % 10;
            iProduct = iProduct * iDigit;
            num = num /10;
        }

         System.out.println("product of digits is:" +iProduct);
    }
}

class program1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.productOfDigits(234);
    }
}