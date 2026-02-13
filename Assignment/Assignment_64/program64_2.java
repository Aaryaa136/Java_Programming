import java.util.*;

//////////////////////////////////////////////////////////
//
//Function Name:    ChkBit
//Description:      Check whether 15th and 18th bit is ON or OFF
//Input:            Integer
//Output:           Boolean
//Author:           Aaryaa Nandkumar Patil
//Date:             6/2/26
//
//////////////////////////////////////////////////////////

class Logic
{
    public boolean ChkBit(int iNo,int iBit1,int iBit2)
    {
        int iRet1 = 0;
        int iRet2 = 0;

        iRet1 = iNo & iBit1;
        iRet2 = iNo & iBit2;

       return (iRet1 == iBit1) && (iRet2 == iBit2);
    }
}

class program64_2
{
    public static void main(String A[])
    {
        int iValue = 0 , iMask1 = 0 , iMask2 = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number : ");
        iValue = sobj.nextInt();

        iMask1 = 0x00000010;    // 5
        iMask2 = 0x00020000;    // 18

        Logic obj = new Logic();

        bRet = obj.ChkBit(iValue,iMask1,iMask2);

        if (bRet == true)
        {
            System.out.println("5th and 18th bit are ON");
        }
        else
        {
            System.out.println("5th and 18th bit are OFF");
        }
    }
}