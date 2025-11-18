import java.util.*;


//////////////////////////////////////////////////////////
//
//Function Name:    Check
//Description:      Check whether 11 is present or not in an array
//Input:            Integer
//Output:           Boolean
//Author:           Aaryaa Patil
//Date:             14/11/25
//
//////////////////////////////////////////////////////////

class Logic
{
    public void Check(int Arr[])
    {
        int iCnt=0 , iCountEven=0 ,iCountOdd=0;
        boolean bFlag=false;

        for(iCnt=0 ; iCnt<Arr.length ; iCnt++)
        {
            if((Arr[iCnt]) == 11)
            {
                bFlag=true;
            }
        }

        if(bFlag == true)
        {
            System.out.println("11 is present in array");
        }
        else
        {
            System.out.println("11 is not present in array");
        }
    }
}

class program22_3
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
        obj.Check(Brr);

    }
}