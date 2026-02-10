import java.util.Scanner;
import java.io.*;

//////////////////////////////////////////////////////////
//
//Description:      Take 2 files as input and one destination , which will append both files data into one
//Input:            File , File , DestFile
//Output:           Nothing
//Author:           Aaryaa Nandkumar Patil
//Date:             8/2/26
//
//////////////////////////////////////////////////////////

class program61_4
{
    public static void main(String[] args) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        int iRet = 0;

        String File1 = null;
        String File2 = null;
        String FileNameDest = null;
        
        System.out.println("Enter file name 1  : ");
        File1 = sobj.nextLine();

        System.out.println("Enter file name 2  : ");
        File2 = sobj.nextLine();

        System.out.println("Enter destination file name : ");
        FileNameDest = sobj.nextLine();

        File fobj1= new File(File1);
        File fobj2 = new File(File2);

        if(fobj1.exists() && fobj2.exists())
        {
            File fobjdest = new File(FileNameDest);

            FileInputStream fiobj1 = new FileInputStream(fobj1);
            FileInputStream fiobj2 = new FileInputStream(fobj2);
            FileOutputStream foobj = new FileOutputStream(fobjdest , true);    // imp

            // Copy file 1
            while((iRet = fiobj1.read()) != -1)
            {
                foobj.write(iRet);
            }
            fiobj1.close();

            // Copy file 2
            while((iRet = fiobj2.read()) != -1)
            {
                foobj.write(iRet);
            }

            fiobj2.close();

            foobj.close();

            System.out.println("Data appended sucessfully");
        }
        else
        {
            System.out.println("Files not found");
        }
    }
}	