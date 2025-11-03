
//Write a program to calculate the sum of first N natural Numbers.

class Logic
{
    void calculateSum(int n)
    {
        int iSum = 0 ,i = 0;

        for(i=1; i<= n; i++ )
        {
            iSum = iSum + i;
        }
        System.out.println("sum is :"+iSum);
    }
}
class program1

{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.calculateSum(10);
    }

}