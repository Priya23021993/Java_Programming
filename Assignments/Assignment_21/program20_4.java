class Logic
{ 
    int count = 0 ,i = 0;

    void countFactors(int num)
    {
        if(num < 0)
        { 
            num = -num;
        }
        for(i = 1; i <= num /2; i++)
        {
            if(num % i == 0)
            {
                count++;
            }
        }
        System.out.println("Total number of Factors:"  + count);
    }

}
class program4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.countFactors(12);
    }
}