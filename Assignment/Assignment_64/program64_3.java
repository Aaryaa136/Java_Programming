import java.util.*;

//////////////////////////////////////////////////////////
//
//Function Name:    ChkBit
//Description:      Check whether 7th , 15th , 21st and 28th bit is ON or OFF
//Input:            Integer
//Output:           Boolean
//Author:           Aaryaa Nandkumar Patil
//Date:             6/2/26
//
//////////////////////////////////////////////////////////

class Logic
{
    public boolean ChkBit(int iNo,int iBit1,int iBit2,int iBit3,int iBit4)
    {
        int iRet1 = 0 , iRet2 = 0 , iRet3 = 0 , iRet4 = 0;

        iRet1 = iNo & iBit1;
        iRet2 = iNo & iBit2;
        iRet3 = iNo & iBit3;
        iRet4 = iNo & iBit4;

       return (iRet1 == iBit1) && (iRet2 == iBit2) && (iRet3 == iBit3) && (iRet4 == iBit4);
    }
}

class program64_3
{
    public static void main(String A[])
    {
        int iValue = 0 ;
        int iMask1 = 0 , iMask2 = 0,iMask3 = 0 , iMask4 = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number : ");
        iValue = sobj.nextInt();

        iMask1 = 0x00000040;     // 7
        iMask2 = 0x00004000;     // 15
        iMask3 = 0x00100000;     // 21
        iMask4 = 0x08000000;     // 28
      

        Logic obj = new Logic();

        bRet = obj.ChkBit(iValue,iMask1,iMask2,iMask3,iMask4);

        if (bRet == true)
        {
            System.out.println("7th , 15th , 21st and 28th bit are ON");
        }
        else
        {
            System.out.println("7th , 15th , 21st and 28th bit are OFF");
        }
    }
}