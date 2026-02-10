import java.util.Scanner;
import java.io.*; 

//////////////////////////////////////////////////////////
//
//Description:      Accepts file name and create a backup copy with originalbackup.ext
//Input:            File 
//Output:           Nothing
//Author:           Aaryaa Nandkumar Patil
//Date:             9/2/26
//
//////////////////////////////////////////////////////////

class program62_4
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        int Ret = 0;

        byte Buffer[] = new byte[1024];

        String FileNameSrc = null;

        System.out.println("Enter the name of file : ");
        FileNameSrc = sobj.nextLine();

        File fobjsrc = new File(FileNameSrc);

        if(fobjsrc.exists() && fobjsrc.isFile())
        {
            File fobjdest = new File("Original_backuup.ext");
            
            FileInputStream fiobj = new FileInputStream(fobjsrc);
            FileOutputStream foobj = new FileOutputStream(fobjdest);

            while((Ret = fiobj.read(Buffer)) != -1)
            {
                foobj.write(Buffer,0,Ret);
            }

            foobj.close();
            fiobj.close();

            System.out.println("Back up done");
        }
        else
        {
            System.out.println("File not found");
        }        
    }    
}
