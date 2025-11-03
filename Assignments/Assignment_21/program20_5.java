class Logic
{ 
    int i = 0;

    void printDivisibleBy2and3(int n)
    {
        for(i = 1; i <= n; i++)
        {
            if(i % 2 == 0 && i % 3 ==0)
            {
                System.out.println(i);
            }
        }
       
    }

}
class program5
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printDivisibleBy2and3(30);
    }
}