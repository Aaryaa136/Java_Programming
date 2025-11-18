import java.util.*;

//////////////////////////////////////////////////////////
//
//Function Name:    Display
//Description:      Display elements which are muliples of 11
//Input:            Integer
//Output:           Integer
//Author:           Aaryaa Patil
//Date:             18/11/25
//
//////////////////////////////////////////////////////////


class Logic
{
    public void Display(int Arr[])
    {
        int iCnt=0 , iEvenSum=0 ,iOddSum=0;

        System.out.println("Elements which are multiples of 11 are:");
        for(iCnt=0 ; iCnt<Arr.length ; iCnt++)
        {
            if(Arr[iCnt]%11==0)
            {
                System.out.println(Arr[iCnt]);
            }
           
        }
    }
}

class program25_5
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
        obj.Display(Brr);
    }
}