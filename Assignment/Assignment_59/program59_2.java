import java.util.Scanner;
import java.io.*;
import java.nio.file.*;

//////////////////////////////////////////////////////////
//
//Description:      Take directory as input and display all files which are regular 
//Input:            DirectoryName
//Output:           FileNames
//Author:           Aaryaa Nandkumar Patil
//Date:             3/2/26
//
//////////////////////////////////////////////////////////

class program59_2
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

            System.out.println("Regular files from directory : ");
            
            for(iCnt = 0 ; iCnt < fArr.length ; iCnt++)
            {
                if(fArr[iCnt].isFile())
                {
                    System.out.println(fArr[iCnt].getName());
                }
                else
                {
                    System.out.println("Not a regular file");
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