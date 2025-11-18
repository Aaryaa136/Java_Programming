import java.util.*;

//////////////////////////////////////////////////////////
//
//Function Name:    Check
//Description:      Check if number entered by user is present in the list
//Input:            Integer
//Output:           Integer
//Author:           Aaryaa Patil
//Date:             16/11/25
//
//////////////////////////////////////////////////////////


class Logic
{
    public void Check(int Arr[],int iNo)
    {
        int iCnt=0;
        boolean bFlag=false;

        for(iCnt=0 ; iCnt<Arr.length ; iCnt++)
        {
            if(Arr[iCnt] == iNo)
            {
                bFlag=true; 
                break;
            }
            else
            {
                bFlag=false;
            }
        }

        if(bFlag==true)
        {
            System.out.println(iNo+": is present ");
        }
        else
        {
            System.out.println(iNo+":not present");
        }
    }
}

class program23_1
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
        obj.Check(Brr,iValue);
    }
}