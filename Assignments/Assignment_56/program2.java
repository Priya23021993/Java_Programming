/*
    Write java program to accept file name from user and open 
    that file and display the contents on screen.
*/

import java.io.*;
import java.util.*;

class operation
{
    void Display(String FileName)
    {
        try
        {
            int iRet = 0;

            FileInputStream fiobj = new FileInputStream(FileName);
            System.out.println("File is open Successfully");

            while((iRet= fiobj.read()) != -1 )
            {
                System.out.print((char)iRet);
            }
            fiobj.close();
        }
        catch(Exception e)
        {
            System.out.println("Unable to open file");
        }
    }
}

class program2
{
    public static void main(String A[])
    {
        String str = null;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the file name :");
        str = sobj.nextLine();

        operation oobj = new operation();

        oobj.Display(str);
        sobj.close();

    }
}