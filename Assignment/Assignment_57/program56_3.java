import java.io.*;
import java.util.*;

//////////////////////////////////////////////////////////
//
//Description:      Create a file and open to write data in it
//Input:            Filename
//Output:           Nothing
//Author:           Aaryaa Nandkumar Patil
//Date:             30/1/26
//
//////////////////////////////////////////////////////////

class program56_3
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        String FileName = null;

        System.out.println("Enter name of the file : ");
        FileName = sobj.nextLine();

        File fobj = new File(FileName);

        if(fobj.exists())
        {
            FileWriter fwobj = new FileWriter(FileName);
            fwobj.write("How are you doing");
            System.out.println("Data written successfully");

            fwobj.close();
        }
        else
        {
            System.out.println("File not found");
        }

        sobj.close();
 
    }
}