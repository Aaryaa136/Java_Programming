import java.io.*;
import java.util.*;

//////////////////////////////////////////////////////////
//
//Description:      Open the file , read contents and display it on console
//Input:            Filename
//Output:           Data
//Author:           Aaryaa Nandkumar Patil
//Date:             30/1/26
//
//////////////////////////////////////////////////////////

class program56_2
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        String FileName = null;

        System.out.println("Enter name of the file : ");
        FileName = sobj.nextLine();

        File fobj = new File(FileName);

        char Buffer[] = new char[100];

        if(fobj.exists())
        {
            FileReader frobj = new FileReader(FileName); 

            frobj.read(Buffer,0,20);
            System.out.println(new String(Buffer));

            frobj.close();
        }
        else
        {
            System.out.println("File not found");
        }

        sobj.close();
 
    }
}