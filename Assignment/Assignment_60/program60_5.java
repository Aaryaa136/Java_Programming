import java.util.Scanner;
import java.io.*;
import java.nio.file.*;

//////////////////////////////////////////////////////////
//
//Description:      Take path from user and check whether path is directory or file
//Input:            Path
//Output:           Boolean
//Author:           Aaryaa Nandkumar Patil
//Date:             4/2/26
//
//////////////////////////////////////////////////////////

class program60_5
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        String inputpath = null;

        System.out.println("Enter the path of file : ");
        inputpath = sobj.nextLine().trim();

        Path pobj = Paths.get(inputpath);

        if(Files.exists(pobj))
        {
            if(Files.isRegularFile(pobj))
            {
                System.out.println("Entered path is a file");
            }
            else if(Files.isDirectory(pobj))
            {
                System.out.println("Entered path is directory");
            }

            System.out.println("Absolute path : "+pobj.toAbsolutePath());
            System.out.println("File name : "+pobj.getFileName());
        }
        else
        {
            System.out.println("Path does not exists");
        }

        sobj.close();
    }    
}
