import java.util.*;

//////////////////////////////////////////////////////////
//
//Function Name:    Display
//Description:      Display elements which are divisible by 5 and 3
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

        System.out.println("Elements divisible by 5 and 3:");
        for(iCnt=0 ; iCnt<Arr.length ; iCnt++)
        {
            if((Arr[iCnt]%3==0) && (Arr[iCnt]%5==0))
            {
                System.out.println(Arr[iCnt]);
            }
           
        }
    }
}

class program25_4
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