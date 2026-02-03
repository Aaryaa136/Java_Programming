import java.util.*;
import java.io.*;
import java.nio.file.*;

//////////////////////////////////////////////////////////
//
//Description:      Take directory as input and display all file names from it 
//Input:            DirectoryName
//Output:           FileNames
//Author:           Aaryaa Nandkumar Patil
//Date:             2/2/26
//
//////////////////////////////////////////////////////////

class program58_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String FolderName = null;
        
        System.out.println("Enter name of the directory : ");
        FolderName = sobj.nextLine();

        File fobj = new File(FolderName);

        Path fpath = null;

        if(fobj.exists() && fobj.isDirectory())
        {
            File fArr[] = fobj.listFiles();
            
            System.out.println("Regular files from directory :");
            
            for(int i = 0 ; i < fArr.length ; i++)
            {
                fpath = fArr[i].toPath();

                if(Files.isRegularFile(fpath))
                {
                    System.out.println(fArr[i].getName());
                }
            }
        }
        else
        {
            System.out.println("Directory not found");
        }

        sobj.close();
    }
}