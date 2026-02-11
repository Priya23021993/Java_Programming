/*
    Write java program to accept file name from user and create
    new file of that name if it is not existing.
*/

import java.io.*;
import java.util.*;

class operation
{
    void CreateFile(String FileName)
    {
        try
        {
           File fobj = new File(FileName);

           if(fobj.createNewFile())
           {
              System.out.println("File Created Successfully");
           }
           else
           {
            System.out.println("File Already Exists");
           }
        }
        catch(IOException e)
        {
            System.out.println("Unable to create file");
        }
    }
}

class program4
{
    public static void main(String A[])
    {
        String str = null;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the file name :");
        str = sobj.nextLine();

        operation oobj = new operation();

        oobj.CreateFile(str);
        sobj.close();

    }
}