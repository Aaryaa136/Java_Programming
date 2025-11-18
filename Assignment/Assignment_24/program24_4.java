import java.util.*;

//////////////////////////////////////////////////////////
//
//Function Name:    Digits
//Description:      Display digits which has 3 digits in it 
//Input:            Integer
//Author:           Aaryaa Patil
//Date:             17/11/25
//
//////////////////////////////////////////////////////////

class Logic
{
    public void Digits(int Arr[])
    {
       int iCnt=0 , iNum=0;
       
       for(iCnt=0 ; iCnt<Arr.length ; iCnt++)
       {
            iNum=Arr[iCnt];
            
            if(iNum>=100 && iNum<= 999 || iNum<=-100 && iNum>=-999)
            {
                System.out.println(iNum);
            }
       }
    }
}


class program24_4
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
        obj.Digits(Brr);
    }
}