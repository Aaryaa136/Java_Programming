import java.util.Scanner;

//////////////////////////////////////////////////////////
//
//Function Name:    ToggelBit
//Description:      Accept a number and on its first 4 bits
//Input:            Integer
//Output:           Integer
//Author:           Aaryaa Nandkumar Patil
//Date:             10/2/26
//
//////////////////////////////////////////////////////////

class Logic
{
    public int OnBit(int iValue , int iBit)
    {
        return iValue | iBit;
    }
}

class program65_5
{
    public static void main(String A[])
    {
        int iNo = 0 , iMask = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        Logic obj = new Logic();

        System.out.println("Enter a number : ");
        iNo = sobj.nextInt();

        iMask = 0xF;      // first 4 bits 

        iRet = obj.OnBit(iNo,iMask);

        System.out.println("Updated number is : "+iRet);
    }  
}
