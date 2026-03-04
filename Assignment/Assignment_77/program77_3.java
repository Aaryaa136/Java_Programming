import java.util.*;

import javax.crypto.spec.HKDFParameterSpec.Extract;  

class program77_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Calls = 0;
        int Data = 0;
        int SMS = 0;

        int Cost = 0;
        int extraCost = 0;

        System.out.println("Enter call usage(min) : ");
        Calls = sobj.nextInt();

        System.out.println("Enter Data(GB) : ");
        Data = sobj.nextInt();

        System.out.println("Enter SMS(count) : ");
        SMS = sobj.nextInt();

        if(Calls <= 50 && Data < 2 && SMS <= 10)
        {
            Cost = 150;
        }
        else if(Calls <= 100 && Data < 2 && SMS <= 50)
        {
            Cost = 200;
        }
        else if(Calls <= 100 && Data == 2 && SMS <= 50)
        {
            Cost = 250;
        }
        else if(Calls <= 100 && Data == 2 && SMS <= 100)
        {
            Cost = 300;
        }
        else if(Calls <= 100 && Data == 3 && SMS <= 100)
        {
            Cost  = 350;
        }
        else if(Calls <= 100 && (Data > 3 || Data <= 5 )&& SMS < 100)
        {
            Cost  = 400;
        }
        else
        {
            Cost = 500;
        }

        if(Calls > 100)
        {
            extraCost = (Calls - 100) * 1;
        }

        if(Data > 5)
        {
            extraCost = (Data - 5) * 10;
        }

        if(SMS > 100)
        {
            extraCost = (SMS - 100) * 1;
        }

        Cost = Cost + extraCost;

        System.out.println("Recommended plan cost : "+Cost);

        sobj.close();
    }
}