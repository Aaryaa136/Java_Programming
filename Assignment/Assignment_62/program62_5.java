import java.util.Scanner;
import java.io.*; 

//////////////////////////////////////////////////////////
//
//Description:      Accepts file name and handle all possible file realted to exception properly
//Input:            File 
//Output:           Nothing
//Author:           Aaryaa Nandkumar Patil
//Date:             9/2/26
//
//////////////////////////////////////////////////////////

class program62_5
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        String FileName = null;

        System.out.println("Enter the name of file : ");
        FileName = sobj.nextLine();

        File fobj = new File(FileName);

        try
        {
            if(fobj.exists())
            {
                System.out.println("File already exists");
            }
            else
            {
                fobj.createNewFile();

                System.out.println("File created successfully");
            }            
        }
        catch(IOException iobj)
        {
            System.out.println(iobj);
        }
               
    }    
}
