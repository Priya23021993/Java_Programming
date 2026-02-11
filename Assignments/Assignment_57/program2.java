/*
    Write java program to accept file names from user and 
    check whether that file is regular file or not.
*/

import java.io.*;
import java.util.*;

class operation
{
    void CheckFile(String fname)
    {
        File fobj = new File(fname);
        
        if(fobj.exists() && fobj.isFile())
        {
            System.out.println("It is a regular File");
        }
        else
        {
            System.out.println("It is a not regular file");
        }
    }
}

class program2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter file name :");
        String str= sobj.nextLine();

        operation oobj = new operation();

        oobj.CheckFile(str);
        sobj.close();

    }
}