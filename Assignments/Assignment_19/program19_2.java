class Logic
{
    void displayGrade(int marks)
    {
        if(marks >= 75)
        {
            System.out.println("Garde : Distinction");
        }
        else if(marks >=60)
        {
            System.out.println("Garde : First Class");
        }
        else if(marks  >= 50)
        {
           System.out.println("Garde : Second Class");
        }
        else if(marks >= 35)
        {
            System.out.println("Garde : pass");
        }
        else
        {
            System.out.println("Garde : Fail");
        }
    }
}        

class program2
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.displayGrade(82);
    }
}