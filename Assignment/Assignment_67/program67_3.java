import java.util.Scanner;

//////////////////////////////////////////////////////////
//
//Function Name:    ChkBit
//Description:      Accept a number and check whether 9th and 10th is ON or OFF
//Input:            Number , Bit
//Output:           Boolean
//Author:           Aaryaa Nandkumar Patil
//Date:             11/2/26
//
//////////////////////////////////////////////////////////

class Logic
{
    public boolean ChkBit(int iNo , int iBit)
    {
        int iAns = 0;

        iAns = iNo & iBit;

        if(iAns == iBit)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class program67_3
{
    public static void main(String A[])
    {
        int iValue = 0 , iMask = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        Logic obj = new Logic();

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        iMask = 0x00000100 | 0x00000800;

        bRet = obj.ChkBit(iValue,iMask);

        if(bRet == true)
        {
            System.out.println("9th and 12th bit is ON");
        }
        else
        {
            System.out.println("9th and 12th bit is OFF");
        }

    }    
}
