import java.util.Scanner;
import java.io.*;

class program63_3
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        String sourcedir = null;
        String destinationdir = null;

        int iRet = 0;
        
        byte Buffer[] = new byte[1024];

        System.out.println("Enter source directory name : ");
        sourcedir = sobj.nextLine();

        System.out.println("Enter destination directory name : ");
        destinationdir = sobj.nextLine();

        File fobjsrc = new File(sourcedir);

        if(fobjsrc.exists() && fobjsrc.isDirectory())
        {
            File fobjdest = new File(destinationdir);

            FileInputStream fiobj = null;
            FileOutputStream foobj = null;

            if(!fobjdest.exists())
            {
                fobjdest.mkdir();
            }
        
            File fArr[] = fobjsrc.listFiles();

            for(int i = 0 ; i < fArr.length ; i++)
            {
                if(fArr[i].isFile())
                {
                    fiobj = new FileInputStream(fArr[i]);

                    foobj = new FileOutputStream(fobjdest + fArr[i].getName());

                    while((iRet = fiobj.read(Buffer)) != -1)
                    {
                        foobj.write(Buffer,0,iRet);
                    }

                    fiobj.close();
                    foobj.close();
                }
            }

            System.out.println("Directory copied successfully");
        }
        else
        {
            System.out.println("Source directory not found");
        }
    }
}