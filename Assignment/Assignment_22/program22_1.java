import java.util.*;

//////////////////////////////////////////////////////////
//
//Function Name:    CountEven
//Description:      Returns count of even elements
//Input:            Integer
//Output:           Integer
//Author:           Aaryaa Patil
//Date:             14/11/25
//
//////////////////////////////////////////////////////////

class Logic
{
    public void CountEven(int Arr[])
    {
        int iCnt=0 , iCount=0;

        for(iCnt=0 ; iCnt<Arr.length ; iCnt++)
        {
            if((Arr[iCnt]%2) == 0)
            {
                iCount++;
            }
        }

        System.out.println("Count of even elements is:"+iCount);
    }
}

class program22_1
{
    public static void main(String A[])
    {
        Scanner sobj=new Scanner(System.in);
        
        int iSize=0 , iCnt=0;

        System.out.println("Enter number of elements:");
        iSize=sobj.nextInt();

        int Brr[]=new int[iSize];

        System.out.println("Enter elements:");

        for(iCnt=0 ; iCnt<Brr.length ; iCnt++)
        {
            Brr[iCnt]=sobj.nextInt();
        }

        Logic obj=new Logic();
        obj.CountEven(Brr);

    }
}