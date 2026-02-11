/*
    Write java program to accept directory names from user and 
    create that directory.
*/

import java.io.*;
import java.util.*;

class operation
{
    void CreateDirectory(String dname)
    {
        File dobj = new File(dname);
        
        if(dobj.mkdir())
        {
            System.out.println("Directory created Successfully");
        }
        else
        {
            System.out.println("Directory already exists or cannot be created");
        }
    }
}

class program3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter directory name :");
        String str= sobj.nextLine();

        operation oobj = new operation();

        oobj.CreateDirectory(str);
        sobj.close();

    }
}