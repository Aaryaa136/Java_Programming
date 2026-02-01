import java.io.*;
import java.util.*;

//////////////////////////////////////////////////////////
//
//Description:      Create a file and open that file
//Input:            Filename
//Output:           Nothing
//Author:           Aaryaa Nandkumar Patil
//Date:             30/1/26
//
//////////////////////////////////////////////////////////

class program56_1
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        Boolean bRet = false;

        String FileName = null;

        System.out.println("Enter name of the file : ");
        FileName = sobj.nextLine();

        File fobj = new File(FileName);
        
        bRet = fobj.createNewFile();

        if(bRet == true)
        {
           
            System.out.println("File gets created successfully");
        }
        else
        {
            System.out.println("Unable to create file");
        }
        
        sobj.close();
    }
}