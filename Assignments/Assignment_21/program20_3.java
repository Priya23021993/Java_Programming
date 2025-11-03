class Logic 
{
    void displayFactors(int num)
    {
        int i= 0;

        if(num < 0)
        {
            num = -num;
        }
        System.out.println("Factors of "  +num +  "are:");
        for(i = 1; i <= num/2 ;i++)
        {
            if(num % i ==0)
            {
                System.out.println(i);
            }
        }
    }
}

class program3
{
    public static void main (String args[])
    {
        Logic obj = new Logic();
        obj.displayFactors(12);
    }
}