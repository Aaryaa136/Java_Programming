import java.util.Scanner;
import java.io.*;

class program63_1
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        String source = null;
        String destination = null;

        int iRet = 0;
        
        byte Buffer = new byte[1024];

        System.out.println("Enter source file name : ");
        source = sobj.nextLine();

        System.out.println("Enter destination file name : ");
        destination = sobj.nextLine();

        File fobjsrc = new File(source);

        if(fobjsrc.exists())
        {
            File fobjdest = new File(destination);

            FileInputStream fiobj = new FileInputStream(fobjsrc);
            FileOutputStream foobj = new FileOutputStream(fobjdest);

            if((iRet = fobjsrc.read(Buffer)) != -1)
            {
                foobj.write(Buffer,0,iRet);
            }

            System.out.println("File copied successfully");
        }
        else
        {
            System.out.println("File not found");
        }
    }
}