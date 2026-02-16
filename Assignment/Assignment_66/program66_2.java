import java.util.Scanner;

//////////////////////////////////////////////////////////
//
//Function Name:    OffBit
//Description:      Accept a number and position , and OFF that bit
//Input:            Number , BitPosition
//Output:           Number
//Author:           Aaryaa Nandkumar Patil
//Date:             10/2/26
//
//////////////////////////////////////////////////////////

class Logic
{
    public int OffBit(int iNo , int iPos , int iBit)
    {
        iBit = iBit << (iPos - 1); 
        iBit = ~iBit;               
        iNo = iNo & iBit;           
        return iNo;
    }
}

class program66_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        Logic obj = new Logic();

        System.out.println("Enter the number : ");
        int iValue = sobj.nextInt();

        System.out.println("Enter the position : ");
        int iPos = sobj.nextInt();

        int iRet = obj.OffBit(iValue, iPos, 1);

        System.out.println("Updated number is : " + iRet);
    }
}
