import java.util.Scanner;
import java.io.*; 

//////////////////////////////////////////////////////////
//
//Description:      Accepts file name , and integer N from user and copy first N byte into a new file
//Input:            File , File , N
//Output:           Nothing
//Author:           Aaryaa Nandkumar Patil
//Date:             9/2/26
//
//////////////////////////////////////////////////////////

class program62_2
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        int n = 0;
        int i = 0;
        int Ret = 0;

        String FileNameSrc = null;
        String FilenameDest = null;

        System.out.println("Enter the name of source file : ");
        FileNameSrc = sobj.nextLine();

        System.out.println("Enter the name of destination file");
        FilenameDest = sobj.nextLine();

        System.out.println("Enter number of bytes you want to copy : ");
        n = sobj.nextInt();

        File fobj = new File(FileNameSrc);

        if(fobj.exists() && fobj.isFile())
        {
            FileInputStream fiobj = new FileInputStream(fobj);
            FileOutputStream foobj = new FileOutputStream(fobj,true);

            while((Ret = fiobj.read()) != -1 && i < n)
            {
                foobj.write(Ret);
                i++;
            }

            fiobj.close();
            foobj.close();

            System.out.println("First "+ i + " bytes copied sucessfully");
        }
        else
        {
            System.out.println("File not found");
        }        
    }    
}
