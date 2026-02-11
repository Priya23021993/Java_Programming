/*
    Write java program to accept directory names from user and 
    display all names of files from that directory and size of
    each file on screen.
*/

import java.io.*;
import java.util.*;

class operation
{
    void DisplayFiles(String dname)
    {
        File dobj = new File(dname)

        if(dobj.exists() && dobj.isDirectory())
        {
            File fArr[]= dobj.listFiles();
        }
        catch(IOException e)
        {
            System.out.println("Unable to calculate checksum");
        }
    }
}

class program5
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