import java.util.Scanner;

//////////////////////////////////////////////////////////
//
//Function Name:    ToogelBit
//Description:      Accept a number and position amd toggel first and last nibbel of that number
//Input:            Number , BitPosition
//Output:           Number
//Author:           Aaryaa Nandkumar Patil
//Date:             10/2/26
//
//////////////////////////////////////////////////////////

class Logic
{
    public int ToggelBit(int iNo , int iBit)
    {           
        iNo = iNo ^ iBit;           
        return iNo;
    }
}

class program66_5
{
    public static void main(String A[])
    {
        int iValue = 0 , iPos = 0 , iMask = 0 , iRet = 0;

        Scanner sobj = new Scanner(System.in);
        Logic obj = new Logic();

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        iMask =  0xFF;

        iRet = obj.ToggelBit(iValue , iMask);

        System.out.println("Updated number is : " + iRet);
    }
}
