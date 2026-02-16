import java.util.Scanner;

//////////////////////////////////////////////////////////
//
//Function Name:    ToggelBit
//Description:      Accept a number and position , and toggel that bit
//Input:            Number , BitPosition
//Output:           Number
//Author:           Aaryaa Nandkumar Patil
//Date:             10/2/26
//
//////////////////////////////////////////////////////////

class Logic
{
    public int ToggelBit(int iNo , int iPos , int iBit)
    {
        iBit = iBit << (iPos - 1); 
                 
        iNo = iNo ^ iBit;           
        return iNo;
    }
}

class program66_4
{
    public static void main(String A[])
    {
        int iValue = 0 , iPos = 0 , iMask = 0 , iRet = 0;

        Scanner sobj = new Scanner(System.in);
        Logic obj = new Logic();

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        System.out.println("Enter the position : ");
        iPos = sobj.nextInt();

        iMask = 0x1;

        iRet = obj.ToggelBit(iValue, iPos, iMask);

        System.out.println("Updated number is : " + iRet);
    }
}
