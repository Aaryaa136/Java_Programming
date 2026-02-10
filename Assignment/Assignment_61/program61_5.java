import java.util.Scanner;
import java.io.*;

//////////////////////////////////////////////////////////
//
//Description:      Take file name from user and divide its contents into 2files
//Input:            SrcFile , File1 , File2
//Output:           Nothing
//Author:           Aaryaa Nandkumar Patil
//Date:             8/2/26
//
//////////////////////////////////////////////////////////

class program61_5
{
    public static void main(String[] args) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        int iRet = 0;
        int iCount = 0;

        String File1 = null;
        String File2 = null;
        String FileNameSrc = null;

        long FileSize = 0;
        long halfsize = 0;

        System.out.println("Enter source file name : ");
        FileNameSrc = sobj.nextLine();
        
        System.out.println("Enter file name 1  : ");
        File1 = sobj.nextLine();

        System.out.println("Enter file name 2  : ");
        File2 = sobj.nextLine();

        File fobjsrc = new File(FileNameSrc);

        if(fobjsrc.exists())
        {   
            File fobj1= new File(File1);
            File fobj2 = new File(File2);

            FileInputStream fiobj = new FileInputStream(fobjsrc);
            FileOutputStream foobj1 = new FileOutputStream(fobj1);    
            FileOutputStream foobj2 = new FileOutputStream(fobj2);    

            FileSize = fobjsrc.length();
            halfsize = FileSize / 2;

            // Data in File 1
            while((iRet = fiobj.read()) != -1)
            {
                if(iCount < halfsize)
                {
                    foobj1.write(iRet);
                }
                else
                {
                    foobj2.write(iRet);
                }

                iCount++;
            }

            foobj1.close();
            fiobj.close();
            foobj2.close();

            System.out.println("Data divided sucessfully");
        }
        else
        {
            System.out.println("Files not found");
        }
    }
}