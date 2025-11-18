import java.util.*;

//////////////////////////////////////////////////////////
//
//Function Name:    FirstOcc
//Description:      First occuerence of element if present
//Input:            Integer
//Output:           Integer
//Author:           Aaryaa Patil
//Date:             16/11/25
//
//////////////////////////////////////////////////////////

class Logic
{
    public void FirstOcc(int Arr[],int iNo)
    {
        int iCnt=0 ,iIndex=-1;

        for(iCnt=0 ; iCnt<Arr.length ; iCnt++)
        {
            if(Arr[iCnt] == iNo)
            {
                iIndex=iCnt;
                System.out.println("First occurence of element is:"+iCnt);
                break; 
            }
        }

        if(iIndex==-1)
        {
            System.out.println("Element not present in list");
        }
    }
}

class program23_2
{
    public static void main(String A[])
    {
        int iCnt=0 , iSize=0 ,iValue=0;

        Scanner sobj=new Scanner(System.in);
        
        System.out.println("Enter number of elements:");
        iSize=sobj.nextInt();

        System.out.println("Enter a number:");
        iValue=sobj.nextInt();

        int Brr[]=new int[iSize];

        System.out.println("Enter elements:");
        
        for(iCnt=0 ; iCnt<Brr.length ; iCnt++)
        {
            Brr[iCnt]=sobj.nextInt();
        }

        Logic obj=new Logic();
        obj.FirstOcc(Brr,iValue);
    }
}