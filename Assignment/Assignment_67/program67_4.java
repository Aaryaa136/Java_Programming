import java.util.Scanner;

//////////////////////////////////////////////////////////
//
//Function Name:    ChkBit
//Description:      Accept a number and 2 position and check if either first or seond position is ON
//Input:            Number
//Output:           Boolean
//Author:           Aaryaa Nandkumar Patil
//Date:             11/2/26
//
//////////////////////////////////////////////////////////

class Logic
{
    public boolean ChkBit(int iNo , int pos1 , int pos2)
    {
        int iAns = 0;

        int iMask = 0x1;
        iMask = (iMask << (pos1 - 1)) | (iMask << (pos2 - 1));

        iAns = iNo & iMask;

        if(iAns != 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class program67_4
{
    public static void main(String A[])
    {
        int iValue = 0 , iPos1 = 0 , iPos2 = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        Logic obj = new Logic();

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        System.out.println("Enter first position : ");
        iPos1 = sobj.nextInt();

        System.out.println("Enter second position : ");
        iPos2 = sobj.nextInt();

        bRet = obj.ChkBit(iValue,iPos1,iPos2);

        if(bRet == true)
        {
            System.out.println("Bit is ON");
        }
        else
        {
            System.out.println("Bit is OFF");
        }

    }    
}
