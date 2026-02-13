import java.util.Scanner;

//////////////////////////////////////////////////////////
//
//Function Name:    OffBit
//Description:      Accept a number and off 7th and 10th bit
//Input:            Integer
//Output:           Integer
//Author:           Aaryaa Nandkumar Patil
//Date:             10/2/26
//
//////////////////////////////////////////////////////////

class Logic
{
    public int OffBit(int iValue , int iBit)
    {
        iValue = iValue & iBit;

        return iValue;
    }
}

class program65_2
{
    public static void main(String A[])
    {
        int iNo = 0 , iMask = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        Logic obj = new Logic();

        System.out.println("Enter a number : ");
        iNo = sobj.nextInt();

        iMask = 0xffffffbf & 0xfffffdff;   // 7th and 10th

        iNo = iNo & iMask;

        iRet = obj.OffBit(iNo,iMask);

        System.out.println("Updated number is : "+iRet);
    }  
}
