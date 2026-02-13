import java.util.*;

//////////////////////////////////////////////////////////
//
//Function Name:    ChkBit
//Description:      Check whether first and last is ON or OFF
//Input:            Integer
//Output:           Boolean
//Author:           Aaryaa Nandkumar Patil
//Date:             6/2/26
//
//////////////////////////////////////////////////////////

class Logic
{
    public boolean ChkBit(long iNo, long iBit)
    {
        return (iNo & iBit) == iBit;
    }
}

class program64_5
{
    public static void main(String A[])
    {
        long iValue = 0;
        long iMask = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number : ");
        iValue = sobj.nextLong();

        iMask = 0x80000000L | 0x1L; // 1st and 32nd bit

        Logic obj = new Logic();

        bRet = obj.ChkBit(iValue, iMask);

        if (bRet)
        {
            System.out.println("First and last bit is ON");
        }
        else
        {
            System.out.println("First and last bit is OFF");
        }
    }
}
