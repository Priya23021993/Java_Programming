/*
    Write java program to accept file names from user and 
    calculate checksum of that file and display on screen.
*/

import java.io.*;
import java.util.*;

class operation
{
    void CheckSum(String fname)
    {
        int iRet = 0, iSum = 0;

        try
        {
            FileInputStream fiobj = new FileInputStream(fname);

            while((iRet = fiobj.read()) != -1)
            {
                iSum = iSum + iRet;
            }
            fiobj.close();
            System.out.println("Checksum of file is : "+iSum);
        }
        catch(IOException e)
        {
            System.out.println("Unable to calculate checksum");
        }
    }
}

class program4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter directory name :");
        String str= sobj.nextLine();

        operation oobj = new operation();

        oobj.CheckSum(str);
        sobj.close();

    }
}