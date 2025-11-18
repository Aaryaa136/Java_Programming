import java.util.*;

//////////////////////////////////////////////////////////
//
//Function Name:    Difference
//Description:      Difference between maximum and minimum element from array
//Input:            Integer
//Output:           Integer
//Author:           Aaryaa Patil
//Date:             17/11/25
//
//////////////////////////////////////////////////////////
/// 
class Logic
{
    public void Difference(int Arr[])
    {
        int iCnt=0 , iMax=0 , iMin=0;
        iMax=Arr[iCnt];
        iMin=Arr[iCnt];

        for(iCnt=0 ; iCnt<Arr.length ; iCnt++)
        {
            if(Arr[iCnt] > iMax)
            {
                iMax=Arr[iCnt];
            }
            else if(Arr[iCnt]<iMin)
            {
                iMin=Arr[iCnt];
            }
        }

        System.out.println("Difference between maximum and minimum is:"+(iMax-iMin));
    }
}

class program24_3
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
        obj.Difference(Brr);
    }
}