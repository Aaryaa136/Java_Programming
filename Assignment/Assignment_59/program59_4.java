import java.util.Scanner;
import java.io.*;

//////////////////////////////////////////////////////////
//
//Description:      Take directory as input and count total files in it
//Input:            DirectoryName
//Output:           count files
//Author:           Aaryaa Nandkumar Patil
//Date:             3/2/26
//
//////////////////////////////////////////////////////////

class program59_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iCnt = 0;
        int iCount = 0;

        String DirName = null;

        System.out.println("Enter the name of directory : ");
        DirName = sobj.nextLine();

        File fobj = new File(DirName);

        if(fobj.exists() && fobj.isDirectory())
        {
            File fArr[] = fobj.listFiles();

            for(iCnt = 0 ; iCnt < fArr.length ; iCnt++)
            {
                if(fArr[iCnt].isFile())
                {
                    iCount++;
                }
            }

            System.out.println("Total number of files : "+iCount);
        }
        else
        {
            System.out.println("Directory not found");
        }

        sobj.close();
    }
}