class Logic
{
    void countEvenOddRange(int n)
    {
        int evenCount = 0,oddCount = 0;

        for(int i =1; i <= n; i++)
        {
            if(i % 2 ==0)
            {
                evenCount = evenCount + 1;
            }
            else
            {
                oddCount = oddCount + 1;
            }
        }
        System.out.println("Even numbers :"  +evenCount);
        System.out.println("Odd numbers :"  +oddCount);
    }

}
class program2
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.countEvenOddRange(50);
    }
}