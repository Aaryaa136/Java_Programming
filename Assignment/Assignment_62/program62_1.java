import java.util.Scanner;
import java.io.*; 

//////////////////////////////////////////////////////////
//
//Description:      Accepts file name , and display total number of bytes read 
//Input:            File 
//Output:           Integer
//Author:           Aaryaa Nandkumar Patil
//Date:             9/2/26
//
//////////////////////////////////////////////////////////

class program62_1 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String FileName = null;

        System.out.println("Enter the name of file : ");
        FileName = sobj.nextLine();

        File fobj = new File(FileName);

        if(fobj.exists() && fobj.isFile())
        {
            System.out.println(fobj.length()+" bytes");
        }
        else
        {
            System.out.println("File not found");
        }        
    }    
}
