import java.util.*;

//////////////////////////////////////////////////////////
//
//Function Name:    ChkBit
//Description:      Check whether 7th , 8th and 9th bit is ON or OFF
//Input:            Integer
//Output:           Boolean
//Author:           Aaryaa Nandkumar Patil
//Date:             6/2/26
//
//////////////////////////////////////////////////////////

class Logic
{
    public boolean ChkBit(int iNo,int iBit)
    {
        int iRet = 0;

        iRet = iNo & iBit;

        return (iRet == iBit);
    }
}

class program64_4
{
    public static void main(String A[])
    {
        int iValue = 0 ;
        int iMask = 0 ;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number : ");
        iValue = sobj.nextInt();

        iMask = 0x00000040 | 0x00000080 |  0x00000100;     // 7 , 8 and 9

        Logic obj = new Logic();

        bRet = obj.ChkBit(iValue,iMask);

        if (bRet == true)
        {
            System.out.println("7th , 8th and 9th bit are ON");
        }
        else
        {
            System.out.println("7th , 8th and 9th bit are OFF");
        }
    }
}