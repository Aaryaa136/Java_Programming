import java.util.Scanner;

//////////////////////////////////////////////////////////
//
//Function Name:    ChkBit
//Description:      Accept a number and position and check whether that bit is ON or OFF
//Input:            Number , BitPosition
//Output:           Boolean
//Author:           Aaryaa Nandkumar Patil
//Date:             10/2/26
//
//////////////////////////////////////////////////////////

class Logic
{
    public boolean ChkBit(int iNo , int iPos , int iBit)
    {
        int iRet = 0;

        iBit = iBit << (iPos - 1);
        iRet = iNo & iBit;
        
        if(iBit == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class program66_1
{
    public static void main(String A[])
    {
        int iValue = 0 , iPos = 0 , iMask = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        Logic obj = new Logic();

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        System.out.println("Enter the position : ");
        iPos = sobj.nextInt();

        iMask = 0x1;
        
        bRet = obj.ChkBit(iValue, iPos, iMask);

        if(bRet == true)
        {
            System.out.println(iPos + " bit is OFF");
        }
        else
        {
            System.out.println(iPos + " bit is ON");
        }
    }
}