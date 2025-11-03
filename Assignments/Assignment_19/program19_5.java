class Logic
{
    void calculatePower(int base, int exp)
    {
        int iResult = 1;

        for(int i =1; i<= exp; i++)
        {
            iResult = iResult * base;
        }
        System.out.println(base + "raised to the power" + exp + "is" +iResult);
    }
}
class program5
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.calculatePower(2,5);
    }
}