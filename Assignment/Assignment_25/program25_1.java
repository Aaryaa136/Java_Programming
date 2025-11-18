import java.util.*;

//////////////////////////////////////////////////////////
//
//Function Name:    Difference
//Description:      Difference between even and odd elements
//Input:            Integer
//Output:           Integer
//Author:           Aaryaa Patil
//Date:             18/11/25
//
//////////////////////////////////////////////////////////

class Logic
{
    public void Difference(int Arr[])
    {
        int iCnt=0 , iEvenSum=0 ,iOddSum=0;

        for(iCnt=0 ; iCnt<Arr.length ; iCnt++)
        {
            if(Arr[iCnt]%2==0)
            {
                iEvenSum=iEvenSum+Arr[iCnt];
            }
            else
            {
                iOddSum=iOddSum+Arr[iCnt];
            }
        }

        System.out.println("Difference between sum of even and odd elements is:"+(iEvenSum-iOddSum));
    }
}

class program25_1
{
    public static void main(String A[])
    {
        int iSize=0 , iCnt=0;

        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter number of elements:");
        iSize=sobj.nextInt();

        int Brr[]=new int[iSize];  

        System.out.println("Enter elements:");

        for(iCnt=0 ; iCnt<Brr.length ; iCnt++)
        {
            Brr[iCnt]=sobj.nextInt();
        }

        Logic obj=new Logic();
        obj.Difference(Brr);
    }
}