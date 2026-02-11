/*
    Write java program to accept two file names from user and 
    open first file and creste new file(Second name)and copy the 
    data from first file into newly created file.
*/

import java.io.*;
import java.util.*;

class operation
{
    void CopyFile(String Src,String Dest)
    {
        try
        {
           int iRet = 0;
           FileInputStream fiobj = new FileInputStream(Src);
           FileOutputStream foobj = new FileOutputStream(Dest);

           while((iRet = fiobj.read())!= -1)
           {
               foobj.write(iRet);
           }
             fiobj.close();
             foobj.close();
            System.out.println("Data Copied Successfully") ;
        }
        catch(IOException e)
        {
            System.out.println("Unable to copy file");
        }

    }
}

class program1
{
    public static void main(String A[])
    {
        String f1 = null;
        String f2  = null;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter source file name :");
        f1 = sobj.nextLine();

        System.out.println("Enter destination file name :");
        f2 = sobj.nextLine();

        operation oobj = new operation();

        oobj.CopyFile(f1,f2);
        sobj.close();

    }
}
