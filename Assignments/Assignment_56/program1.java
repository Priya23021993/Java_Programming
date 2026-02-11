/*
    Write java program to accept file name from user and open 
    that file.
*/

import java.io.*;
import java.util.*;

class operation
{
    void open(String FileName)
    {
        try
        {
            FileInputStream fiobj = new FileInputStream(FileName);
            System.out.println("File is open Successfully");
            fiobj.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Unable to open file");
        }
    }
}

class program1
{
    public static void main(String A[])
    {
        String str = null;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the file name :");
        str = sobj.nextLine();

        operation oobj = new operation();

        oobj.open(str);
        sobj.close();

    }
}
