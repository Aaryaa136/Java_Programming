import java.util.Scanner;
import java.io.*;

//////////////////////////////////////////////////////////
//
//Description:      Take two files as input from user and copy into other file using byte by byte
//Input:            File , File
//Output:           Nothins
//Author:           Aaryaa Nandkumar Patil
//Date:             8/2/26
//
//////////////////////////////////////////////////////////

class program61_1
{
    public static void main(String[] args) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        String FileNameSrc = null;
        String FileNameDest = null;

        int iRet = 0;

        System.out.println("Enter source file name : ");
        FileNameSrc = sobj.nextLine();

        System.out.println("Enter destination file name : ");
        FileNameDest = sobj.nextLine();

        File fobjsrc = new File(FileNameSrc);

        if(fobjsrc.exists())
        {
            File fobjdest = new File(FileNameDest);

            FileInputStream fiobj = new FileInputStream(fobjsrc);
            FileOutputStream foobj = new FileOutputStream(fobjdest);

            while((iRet = fiobj.read()) != -1)
            {
                foobj.write(iRet);
            }

            fiobj.close();
            foobj.close();

            System.out.println("File copied successfully");
        }
        else
        {
            System.out.println("File not found");
        }
    }
}