/*
    Write java program to accept Directory name from user and 
    display all names of files from that directory.
*/

import java.io.*;
import java.util.*;

class operation
{
    void DisplayFiles(String DirName)
    {
        File fobj = new File(DirName);

        if((fobj.exists()) &&(fobj.isDirectory()))
        {
            String files[] = fobj.list();
           System.out.println("Files in directory:");
           
           for(String fname : files)
           {
               System.out.println(fname);
           }
        }
        else
        {
            System.out.println("Directory does not exist");
        }

    }
}

class program5
{
    public static void main(String A[])
    {
        String str = null;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Directory name :");
        str = sobj.nextLine();

        operation oobj = new operation();

        oobj.DisplayFiles(str);
        sobj.close();

    }
}