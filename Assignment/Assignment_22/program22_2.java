import java.util.*;

//////////////////////////////////////////////////////////
//
//Function Name:    Frequency
//Description:      Difference between even and odd elements in
//Input:            Integer
//Output:           Integer
//Author:           Aaryaa Patil
//Date:             14/11/25
//
//////////////////////////////////////////////////////////

class Logic
{
    public void Frequency(int Arr[])
    {
        int iCnt=0 , iCountEven=0 ,iCountOdd=0;

        for(iCnt=0 ; iCnt<Arr.length ; iCnt++)
        {
            if((Arr[iCnt]%2) == 0)
            {
                iCountEven++;
            }
            else
            {
                iCountOdd++;
            }
        }

        System.out.println("Difference of even and odd elements is:"+(iCountEven-iCountOdd));
    }
}

class program22_2
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
        obj.Frequency(Brr);

    }
}