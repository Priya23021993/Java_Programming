//Wriite a program to print the multiplication table of number.

class Logic
{
    void printTable(int num)
    {
        int iMult = 0;
        int iCnt = 0;

        for(iCnt = 1;iCnt <= 10; iCnt++)
        {
           System.out.println(num+ "X" +iCnt+  "=" +(num * iCnt));
        }
    }
}
class program5
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printTable(5);
    }
}