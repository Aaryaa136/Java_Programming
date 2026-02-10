import java.util.Scanner;
import java.io.*;

//////////////////////////////////////////////////////////
//
//Description:      Take two files as input from user and copy into other file using byte[] buffer
//Input:            File , File
//Output:           Nothing
//Author:           Aaryaa Nandkumar Patil
//Date:             8/2/26
//
//////////////////////////////////////////////////////////

class program61_2
{
    public static void main(String[] args) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        int iRet = 0;

        byte Buffer[] = new byte[1024];

        String FileNameSrc = null;
        String FileNameDest = null;

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

            while((iRet = fiobj.read(Buffer)) != -1)
            {
                foobj.write(Buffer,0,iRet);
            }

            foobj.close();
            fiobj.close();

            System.out.println("File copied successfully");
        }
        else
        {
            System.out.println("File not found");
        }
    }
}