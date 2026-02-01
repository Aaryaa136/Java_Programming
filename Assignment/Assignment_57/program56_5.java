import java.io.*;
import java.util.*;

//////////////////////////////////////////////////////////
//
//Description:      Accept directory name and display all files from that directory
//Input:            DirectoryName
//Output:           Nothing
//Author:           Aaryaa Nandkumar Patil
//Date:             30/1/26
//
//////////////////////////////////////////////////////////

class program57_5
{
    public static void main(String A[]) throws Exception
    {
        int i = 0;
        Scanner sobj = new Scanner(System.in);
        
        String DirectoryName = null;
        
        System.out.println("Enter the name of directory : ");
        DirectoryName = sobj.nextLine();

        File dobj = new File(DirectoryName);

        if(dobj.exists() && dobj.isDirectory())
        {
            File fArr[] = dobj.listFiles();

            System.out.println("Files in directory");

            for(i = 0 ; i < fArr.length ; i++)
            {
                System.out.println(fArr[i].getName());
            }
        }
        else
        {
            System.out.println("Directory not found");
        }

        sobj.close();
    }    
}
