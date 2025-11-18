import java.util.*;

//////////////////////////////////////////////////////////
//
//Function Name:    Frequency
//Description:      Returns frequency of 11 from an array
//Input:            Integer
//Output:           Integer
//Author:           Aaryaa Patil
//Date:             14/11/25
//
//////////////////////////////////////////////////////////

class Logic
{
    public void Frequency(int Arr[] , int iNo)
    {
        int iCnt=0 , iCount=0;
       
        for(iCnt=0 ; iCnt<Arr.length ; iCnt++)
        {
            if((Arr[iCnt]) == iNo)
            {
                iCount++;
            }
        }
        
        System.out.println("Frequency in an array:"+iCount);
    }
}

class program22_5
{
    public static void main(String A[])
    {
        Scanner sobj=new Scanner(System.in);

        int iSize=0 , iCnt=0 , iValue=0;

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
        obj.Frequency(Brr,iValue);

    }
}