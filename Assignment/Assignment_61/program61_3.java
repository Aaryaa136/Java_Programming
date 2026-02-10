import java.util.Scanner;
import java.io.*;

//////////////////////////////////////////////////////////
//
//Description:      Take a file as input from user and string and append that string at end of file
//Input:            Path
//Output:           Boolean
//Author:           Aaryaa Nandkumar Patil
//Date:             8/2/26
//
//////////////////////////////////////////////////////////

class program61_3
{
    public static void main(String[] args) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        String FileName = null;
        String str = null;

        System.out.println("Enter file name : ");
        FileName = sobj.nextLine();

        System.out.println("Enter the string you want to append: ");
        str = sobj.nextLine();

        File fobj = new File(FileName);

        if(fobj.exists())
        {
            FileOutputStream foobj = new FileOutputStream(fobj , true);    // imp

            byte[] Buffer= str.getBytes();
            foobj.write(Buffer);

            foobj.close();

            System.out.println("Data appended sucessfully");

        }
        else
        {
            System.out.println("File not found");
        }
    }
}	// wriiten through append mode