import java.io.*;
import java.util.*;

//////////////////////////////////////////////////////////
//
//Description:      Create a file , if it does not exists 
//Input:            Filename
//Output:           Nothing
//Author:           Aaryaa Nandkumar Patil
//Date:             30/1/26
//
//////////////////////////////////////////////////////////

class program56_4
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        String FileName = null;

        System.out.println("Enter name of the file : ");
        FileName = sobj.nextLine();

        File fobj = new File(FileName);

        if(fobj.exists())
        {
            System.out.println("File already exists");
        }
        else
        {
            fobj.createNewFile();
            System.out.println("File created succesfully");
        }
    
        sobj.close();
    }
}