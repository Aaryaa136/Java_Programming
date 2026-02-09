import java.util.Scanner;
import java.io.*;

//////////////////////////////////////////////////////////
//
//Description:      Take directory as input and display the name and smallest file by size
//Input:            DirectoryName
//Output:           Smallestfile
//Author:           Aaryaa Nandkumar Patil
//Date:             4/2/26
//
//////////////////////////////////////////////////////////

class Program60_3
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of directory : ");
        String DirName = sobj.nextLine();

        File fobj = new File(DirName);

        File smallestFile = null;

        if(fobj.exists() && fobj.isDirectory())
        {
            File[] fArr = fobj.listFiles();
            long minsize = Long.MAX_VALUE;

            if(fArr != null)
            {
                
                for(int i = 0; i < fArr.length; i++)
                {
                    if(fArr[i].isFile())
                    {
                        if(fArr[i].length() < minsize)
                        {
                            minsize = fArr[i].length();
                            smallestFile = fArr[i];
                        }
                    }
                }
            }

            if(smallestFile != null)
            {
                System.out.println("Smallest file is : " + smallestFile.getName());
                System.out.println("Smallest file size is : " + minsize + " bytes");
            }
            else
            {
                System.out.println("No files found in directory");
            }
        }
        else
        {
            System.out.println("Directory not found");
        }

        sobj.close();
    }
}
