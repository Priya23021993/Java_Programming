//Write a program  to find the minimum of three numbers.

class Logic
{
    void findMin(int a ,int b , int c)
    {
        int min = 0;

        if(a < b && a < c)
        {
            min = a;
        }
        else if(b < c)
        {
            min = b;
        }
        else
        {
            min = c;
        }
       System.out.println("Mnimum Number is:" +min);

    }
}
class program4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.findMin(3,7,2);
    }
}