import java.util.Scanner;
import java.io.*;

class program63_4
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        byte Buffer[] = new byte[1024];
        int iRet = 0;

        System.out.println("Enter source directory name : ");
        String sourcedir = sobj.nextLine();

        System.out.println("Enter destination directory name : ");
        String destinationdir = sobj.nextLine();

        File fobjsrc = new File(sourcedir);

        if (fobjsrc.exists() && fobjsrc.isDirectory())
        {
            File fobjdest = new File(destinationdir);

            if (!fobjdest.exists())
            {
                fobjdest.mkdir();
            }

            File commonFile = new File(fobjdest, "Backup.txt");

            FileOutputStream foobj = new FileOutputStream(commonFile, true);

            File fArr[] = fobjsrc.listFiles();

            for (int i = 0; i < fArr.length; i++)
            {
                if (fArr[i].isFile())
                {
                    FileInputStream fiobj = new FileInputStream(fArr[i]);
                    
                    String header = "\n--- File Name: " + fArr[i].getName() + " ---\n";
                    foobj.write(header.getBytes());

                    while ((iRet = fiobj.read(Buffer)) != -1)
                    {
                        foobj.write(Buffer, 0, iRet);
                    }

                    fiobj.close();
                }
            }

            foobj.close();
            System.out.println("All files copied into one common file successfully");
        }
        else
        {
            System.out.println("Source directory not found");
        }
    }
}
