import java.util.*;

//////////////////////////////////////////////////////////
//
//Function Name:    Maximum
//Description:      Find maximum element from array
//Input:            Integer
//Output:           Integer
//Author:           Aaryaa Patil
//Date:             17/11/25
//
//////////////////////////////////////////////////////////

class Logic
{
    public void Maximum(int Arr[])
    {
        int iCnt=0 , iMax=0;
        iMax=Arr[iCnt];

        for(iCnt=0 ; iCnt<Arr.length ; iCnt++)
        {
            if(Arr[iCnt] > iMax)
            {
                iMax=Arr[iCnt];
            }
        }

        System.out.println("Maximum is:"+iMax);
    }
}

class program24_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iSize=0 , iCnt=0 ;

        System.out.println("Enter number of elements:");
        iSize=sobj.nextInt();

        int Brr[]=new int[iSize];

        System.out.println("Enter elements:");

        for(iCnt=0 ; iCnt<Brr.length ; iCnt++)
        {
            Brr[iCnt]=sobj.nextInt();
        }
        
        Logic obj=new Logic();
        obj.Maximum(Brr);
    }
}