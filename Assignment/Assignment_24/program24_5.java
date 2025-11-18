import java.util.*;

//////////////////////////////////////////////////////////
//
//Function Name:    Summation
//Description:      Summation of each element of an array
//Input:            Integer
//Output:           Integer
//Author:           Aaryaa Patil
//Date:             17/11/25
//
//////////////////////////////////////////////////////////

class Logic
{
    public void Summation(int Arr[])
    {
       int iCnt=0 , iSum=0 ,iDigit=0;
       
       for(iCnt=0 ; iCnt<Arr.length ; iCnt++)
       {
            iSum=0;

            while(Arr[iCnt] != 0)
            {
                iDigit=Arr[iCnt]%10;
                iSum=iSum+iDigit;
                Arr[iCnt]=Arr[iCnt]/10;
            }

            System.out.println("Summation is:"+iSum);
       }
    }
}


class program24_5
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
        obj.Summation(Brr);
    }
}