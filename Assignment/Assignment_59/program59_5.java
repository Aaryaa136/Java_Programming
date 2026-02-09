import java.util.Scanner;
import java.io.*;

//////////////////////////////////////////////////////////
//
//Description:      Take directory as input and display its file name and its absolute path 
//Input:            DirectoryName
//Output:           FileName and absolutepath
//Author:           Aaryaa Nandkumar Patil
//Date:             3/2/26
//
//////////////////////////////////////////////////////////

class program59_5
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

            for(iCnt = 0 ; iCnt < fArr.length ; iCnt++)
            {
                System.out.println("Name : "+fArr[iCnt].getName());
                System.out.println("Path : "+fArr[iCnt].getAbsolutePath());
            }
        }
        else
        {
            System.out.println("Directory not found");
        }

        sobj.close();
    }
}