import java.util.*;
import java.io.*;

//////////////////////////////////////////////////////////
//
//Description:      Take directory as input and display all file names it in a file
//Input:            DirectoryName , FileName
//Output:           Nothing 
//Author:           Aaryaa Nandkumar Patil
//Date:             2/2/26
//
//////////////////////////////////////////////////////////

class program58_2
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        String FolderName = null;
        String FileName = null;

        System.out.println("Enter name of the directory : ");
        FolderName = sobj.nextLine();

        System.out.println("Enter name of the file : ");
        FileName = sobj.nextLine();

        File fobj = new File(FolderName);

        File obj = new File(FileName);

        if(fobj.exists() && fobj.isDirectory())
        { 
            FileOutputStream foobj = new FileOutputStream(FileName);
            
            File fArr[] = fobj.listFiles();

            for(int i = 0 ; i < fArr.length ; i++)
            {
                if(fArr[i].isFile())
                {
                   String str = fArr[i].getName()+"\n";
                   foobj.write(str.getBytes()); 
                }
            }

            foobj.close();

            System.out.println("File names written successfully");
        }
        else
        {
            System.out.println("Directory not found");
        }

        sobj.close();
    }
}