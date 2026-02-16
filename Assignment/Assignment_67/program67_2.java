import java.util.Scanner;

//////////////////////////////////////////////////////////
//
//Function Name:    CommonBits
//Description:      Accept two numbers from user and display common ON bits position
//Input:            Number , Number
//Output:           Nothing
//Author:           Aaryaa Nandkumar Patil
//Date:             11/2/26
//
//////////////////////////////////////////////////////////

class Logic
{
    public void CommonBits(int iNo1 , int iNo2)
    {
        int iMask = 0x1;
        int i = 0;
        
        System.out.println("Positions of common ON bits : ");
       
        for(i = 0 ; i <= 31 ; i++)
        {
            iMask = 1 << i;
            
            if(((iNo1 & iMask) != 0) && ((iNo2 & iMask) != 0))
            {
                System.out.print((i + 1) + " ");
            }        
        }
        System.out.println("");
    }
}

class program67_2 
{
    public static void main(String A[])
    {
        int iValue1 = 0 , iValue2 = 0;

        Scanner sobj = new Scanner(System.in);

        Logic obj = new Logic();

        System.out.println("Enter first number : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter second number : ");
        iValue2 = sobj.nextInt();

        obj.CommonBits(iValue1,iValue2);
    }    
}
