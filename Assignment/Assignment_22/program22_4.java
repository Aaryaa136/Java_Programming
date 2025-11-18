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
    public void Frequency(int Arr[])
    {
        int iCnt=0 , iCount11=0;
       
        for(iCnt=0 ; iCnt<Arr.length ; iCnt++)
        {
            if((Arr[iCnt]) == 11)
            {
                iCount11++;
            }
        }
        
        System.out.println("Frequency of 11 in an array:"+iCount11);
    }
}

class program22_4
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