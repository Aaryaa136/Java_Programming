import java.util.*;

//////////////////////////////////////////////////////////
//
//Function Name:    LastOcc
//Description:      Last occuerence of element if present
//Input:            Integer
//Output:           Integer
//Author:           Aaryaa Patil
//Date:             16/11/25
//
//////////////////////////////////////////////////////////

class Logic
{
    public void LastOcc(int Arr[], int iNo)
    {
        int iCnt=0 ,iIndex = -1;   

        for(iCnt=0 ; iCnt<Arr.length ; iCnt++)
        {
            if(Arr[iCnt] == iNo)
            {
                iIndex = iCnt;   
            }
        }

        if(iIndex != -1)
        {
            System.out.println("Last occurrence of element is: " + iIndex);
        }
        else
        {
            System.out.println("Element not present in list");
        }
    }
}

class program23_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iCnt=0 ,iSize=0 , iValue=0;
        
        System.out.println("Enter number of elements:");
        iSize = sobj.nextInt();

        System.out.println("Enter a number:");
        iValue = sobj.nextInt();

        int Brr[] = new int[iSize];

        System.out.println("Enter elements:");
        
        for(iCnt=0 ; iCnt<Brr.length ; iCnt++)
        {
            Brr[iCnt] = sobj.nextInt();
        }

        Logic obj = new Logic();
        obj.LastOcc(Brr, iValue);
    }
}
