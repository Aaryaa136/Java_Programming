import java.util.Scanner;
import java.io.*;

//////////////////////////////////////////////////////////
//
//Description:      Take directory as input and display all file names from it 
//Input:            DirectoryName
//Output:           FileNames
//Author:           Aaryaa Nandkumar Patil
//Date:             3/2/26
//
//////////////////////////////////////////////////////////

class program59_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iCnt = 0;

        String DirName = null;

        System.out.println("Enter the name of directory : ");
        DirName = sobj.nextLine();

        File fobj = new File(DirName);

        if(fobj.exists() && fobj.isDirectory())
        {
            File fArr[] = fobj.listFiles();

            System.out.println("Files in the directory : ");

            for(iCnt = 0 ; iCnt < fArr.length ; iCnt++)
            {
                System.out.println(fArr[iCnt].getName());
            }
        }
        else
        {
            System.out.println("Directory not found");
        }

        sobj.close();
    }
}