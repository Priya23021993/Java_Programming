class Logic
{
   void checkSign(int num)
   {
    if(num > 0)
        
        System.out.println(num+ "is a Positive Number");
    
    else if(num < 0)
    
        System.out.println(num+ "is a negative Number");
    
    else
    
       System.out.println( "The Number is Zero");

    
   }
}
class program5
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkSign(-8);                //you can test with 0 or any +ve number too
    }
}