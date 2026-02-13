import java.util.Scanner;

//////////////////////////////////////////////////////////
//
//Function Name:    ToggelBit
//Description:      Accept a number and toggel 7th bit of that number
//Input:            Integer
//Output:           Integer
//Author:           Aaryaa Nandkumar Patil
//Date:             10/2/26
//
//////////////////////////////////////////////////////////

class Logic
{
    public int ToggelBit(int iValue , int iBit)
    {
        iValue = iValue ^ iBit;

        return iValue;
    }
}

class program65_3
{
    public static void main(String A[])
    {
        int iNo = 0 , iMask = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        Logic obj = new Logic();

        System.out.println("Enter a number : ");
        iNo = sobj.nextInt();

        iMask = 0x00000040;     //7th   

        iRet = obj.ToggelBit(iNo,iMask);

        System.out.println("Updated number is : "+iRet);
    }  
}
