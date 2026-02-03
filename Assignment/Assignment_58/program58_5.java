import java.util.*;
import java.io.*;

//////////////////////////////////////////////////////////
//
//Description:      Take directory as input and display all file names from it write data , its nam eand its size 
//Input:            DirectoryName
//Output:           Nothing
//Author:           Aaryaa Nandkumar Patil
//Date:             2/2/26
//
//////////////////////////////////////////////////////////

class program58_5
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        int Ret = 0;
        byte buffer[] = new byte[1024];

        String FolderName = null;
        String FileName = null;

        System.out.println("Enter name of the directory : ");
        FolderName = sobj.nextLine();

        File fdir = new File(FolderName);

        System.out.println("Enter name of file : ");
        FileName = sobj.nextLine();

        File fobj = new File(FileName);

        if(fdir.exists() && fdir.isDirectory())
        {
            FileInputStream fiobj = null;
            FileOutputStream foobj = new FileOutputStream(fobj);

            File fArr[] = fdir.listFiles();

            for(int i = 0 ; i < fArr.length ; i++)
            {
                fiobj = new FileInputStream(fArr[i]);

                String header = "File Name: " + fArr[i].getName() +
                                    "\nFile Size: " + fArr[i].length() + " bytes\n";
                foobj.write(header.getBytes());

                while((Ret = fiobj.read(buffer)) != -1)
                {
                    foobj.write(buffer,0,Ret);
                }

                fiobj.close();
            }

            foobj.close();
            System.out.println("Data copied successfully");
        }
        else
            {
                System.out.println("Directory not found");
            }

        sobj.close();
    }
}