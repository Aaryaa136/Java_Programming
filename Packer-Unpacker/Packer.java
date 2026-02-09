//  Packing code

import java.io.*;
import java.util.*;


class Packer
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        String Header = null;
        byte Key = 0x11;

        int iRet = 0;
        int i = 0 , j = 0;
        
        byte Buffer[] = new byte[1024];
        byte bHeader[] = new byte[100];

        String FolderName = null;
        String PackName = null;
 
        System.out.println("Enter the name of folder : ");
        FolderName = sobj.nextLine();

        System.out.println("Enter the name of packed file : ");
        PackName = sobj.nextLine();
        
        File fobj = new File(FolderName);

        if((fobj.exists()) && (fobj.isDirectory()))
        {
            File PackObj = new File(PackName);

            PackObj.createNewFile();

            FileOutputStream foobj = new FileOutputStream(PackObj);

            FileInputStream fiobj = null;

            System.out.println("Folder is present"); 

            File fArr[] = fobj.listFiles();

            System.out.println("Number of files in the folder are : "+fArr.length);

            for(i = 0; i < fArr.length; i++)
            {
                fiobj = new FileInputStream(fArr[i]);
                                         

                if(fArr[i].getName().endsWith(".txt"))
                {
                    //  Header formation
                    Header = fArr[i].getName() + " " + fArr[i].length();

                    for(j = Header.length() ; j < 100 ; j++)
                    {
                        Header = Header + " ";
                    }

                    bHeader = Header.getBytes();  

                    //  Write header into packed file
                    foobj.write(bHeader,0,100);

                    //  Read the data from input files from  folder
                    while((iRet = fiobj.read(Buffer)) != -1)
                    {
                       for(j = 0 ; j < iRet ; j++)
                        {
                            //  Encyrption logic
                            Buffer[j] = (byte)(Buffer[j] ^ Key);
                        }
                         
                        //  Write the files data 
                        foobj.write(Buffer,0,iRet);
                    } 
                }
           
                fiobj.close();
            }
            foobj.close();
        }
        else
        {
            System.out.println("There is no such folder");
        }

        sobj.close();
    }
}