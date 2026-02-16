import java.util.Scanner;

//////////////////////////////////////////////////////////
//
//Function Name:    ToggelBitRange
//Description:      Accept a number and range from user and toggel bits from that range
//Input:            Number
//Output:           Integer
//Author:           Aaryaa Nandkumar Patil
//Date:             10/2/26
//
//////////////////////////////////////////////////////////

class Logic
{
    public int ToggelBitRange(int iNo , int start , int end)
    {
        int iMask = 0;
        
        for(int i = start ; i <= end ; i++)
        {
            iMask |= (1 << (i - 1)); 
        }

        return iNo ^ iMask;
    }
}

class program67_5
{
    public static void main(String A[])
    {
        int iValue = 0 , iStart = 0 , iEnd = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        Logic obj = new Logic();

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        System.out.println("Enter starting range : ");
        iStart = sobj.nextInt();

        System.out.println("Enter ending range : ");
        iEnd = sobj.nextInt();

        iRet = obj.ToggelBitRange(iValue,iStart,iEnd);

        System.out.println("Updated number is : "+iRet);
    }    
}
