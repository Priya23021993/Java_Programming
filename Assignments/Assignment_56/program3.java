/*
    Write java program to accept file name from user and open 
    that  in write mode and write some data at the end of file.
*/

import java.io.*;
import java.util.*;

class operation
{
    void Write(String FileName)
    {
        try
        {
            boolean bRet = false;

            FileOutputStream foobj = new FileOutputStream(FileName);
            String data = "\n data Written at the end of file.";
            
            byte arr[]=data.getBytes();

            foobj.write(arr);
            foobj.close();
            System.out.println("Data written Successfully");
        }
        catch(IOException e)
        {
            System.out.println("Unable to write into file");
        }
    }
}

class program3
{
    public static void main(String A[])
    {
        String str = null;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the file name :");
        str = sobj.nextLine();

        operation oobj = new operation();

        oobj.Write(str);
        sobj.close();

    }
}