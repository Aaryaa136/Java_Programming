import java.util.*;

//////////////////////////////////////////////////////////
//
//Function Name:    Minimum
//Description:      Find minimum element from array
//Input:            Integer
//Output:           Integer
//Author:           Aaryaa Patil
//Date:             17/11/25
//
//////////////////////////////////////////////////////////

class Logic
{
    public void Minimum(int Arr[])
    {
        int iCnt=0 , iMin=0;
        iMin=Arr[iCnt];

        for(iCnt=0 ; iCnt<Arr.length ; iCnt++)
        {
            if(Arr[iCnt] < iMin)
            {
                iMin=Arr[iCnt];
            }
        }

        System.out.println("Minimum is:"+iMin);
    }
}

class program24_2
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
        obj.Minimum(Brr);
    }
}