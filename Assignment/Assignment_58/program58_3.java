import java.util.*;
import java.io.*;

//////////////////////////////////////////////////////////
//
//Description:      Directory as input , from list of files in that directory write all data ina one file 
//Input:            DirectoryName , Filename
//Output:           Nothing
//Author:           Aaryaa Nandkumar Patil
//Date:             2/2/26
//
//////////////////////////////////////////////////////////

class program58_3
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        String FolderName = null;

        System.out.println("Enter name of the directory : ");
        FolderName = sobj.nextLine();

        File fobj = new File(FolderName);

        if(fobj.mkdir())
        {
            System.out.println("Directory created sucessfully");
            fobj.getAbsolutePath();
        }
        else
        {
            System.out.println("Failed to create directory");
        }
        

        sobj.close();
    }
}