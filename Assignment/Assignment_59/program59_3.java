import java.util.Scanner;
import java.io.*;
import java.nio.file.*;

//////////////////////////////////////////////////////////
//
//Description:      Take directory as input and display subdirectory only 
//Input:            DirectoryName
//Output:           Subdirectorynames
//Author:           Aaryaa Nandkumar Patil
//Date:             3/2/26
//
//////////////////////////////////////////////////////////

class program59_3
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

            System.out.println("Sub directories : ");
            for(iCnt = 0 ; iCnt < fArr.length ; iCnt++)
            {
                if(fArr[iCnt].isDirectory())
                {
                    System.out.println(fArr[iCnt].getName());
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