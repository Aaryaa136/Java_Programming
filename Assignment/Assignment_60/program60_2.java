import java.util.Scanner;
import java.io.*;

//////////////////////////////////////////////////////////
//
//Description:      Take directory as input and display the name and largest file by size
//Input:            DirectoryName
//Output:           Largestfile
//Author:           Aaryaa Nandkumar Patil
//Date:             4/2/26
//
//////////////////////////////////////////////////////////

class Program60_2
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of directory : ");
        String DirName = sobj.nextLine();

        File fobj = new File(DirName);

        long maxsize = 0;
        File largestFile = null;

        if(fobj.exists() && fobj.isDirectory())
        {
            File[] fArr = fobj.listFiles();

            if(fArr != null)
            {
                for(int i = 0; i < fArr.length; i++)
                {
                    if(fArr[i].isFile())
                    {
                        if(fArr[i].length() > maxsize)
                        {
                            maxsize = fArr[i].length();
                            largestFile = fArr[i];
                        }
                    }
                }
            }

            if(largestFile != null)
            {
                System.out.println("Largest file is : " + largestFile.getName());
                System.out.println("Largest file size is : " + maxsize + " bytes");
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
