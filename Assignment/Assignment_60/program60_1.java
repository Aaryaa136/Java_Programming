import java.util.Scanner;
import java.io.*;

//////////////////////////////////////////////////////////
//
//Description:      Take directory as input and display total size of all files in that directory
//Input:            DirectoryName
//Output:           Totalsize
//Author:           Aaryaa Nandkumar Patil
//Date:             4/2/26
//
//////////////////////////////////////////////////////////

class program60_1 
{
    public static void main(String A[])
    {
        int i = 0;

        Scanner sobj = new Scanner(System.in);

        String DirName = null;

        System.out.println("Enter the name of directory : ");
        DirName = sobj.nextLine();

        File fobj = new File(DirName);

        if(fobj.exists() && fobj.isDirectory())
        {
            File fArr[] = fobj.listFiles();
            long totalsize = 0;

            for(i = 0 ; i < fArr.length ; i++)
            {
                if(fArr[i].isFile())
                {
                    totalsize = totalsize + fArr[i].length();
                }
            }


            System.out.println("Total size of files in a directory is : "+totalsize);
        }
        else
        {
            System.out.println("Directory not found");
        }

        sobj.close();
    }    
}
