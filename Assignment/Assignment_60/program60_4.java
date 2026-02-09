import java.util.Scanner;
import java.io.*;

//////////////////////////////////////////////////////////
//
//Description:      Take directory as input and file extension ,if it ends with that file extension display that files
//Input:            DirectoryName , Extension Of File
//Output:           ExtensionFile
//Author:           Aaryaa Nandkumar Patil
//Date:             4/2/26
//
//////////////////////////////////////////////////////////

class program60_4
{
    public static void main(String A[])
    {
        int i = 0;

        Scanner sobj = new Scanner(System.in);

        String DirName = null;
        String extension = null;

        System.out.println("Enter the name of directory : ");
        DirName = sobj.nextLine();

        System.out.println("Files having extension : ");
        extension = sobj.nextLine();

        File fobj = new File(DirName);

        if(fobj.exists() && fobj.isDirectory())
        {
            File fArr[] = fobj.listFiles();
            String fileName = null;

            for(i = 0 ; i < fArr.length ; i++)
            {
                fileName = fArr[i].getName();

                if(fileName.endsWith(extension))
                {
                    System.out.println(fileName);
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
