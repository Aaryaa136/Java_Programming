import java.util.Scanner;

//////////////////////////////////////////////////////////
//
//Function Name:    CountOn
//Description:      Accept a number and count number of ON(1) bit
//Input:            Number
//Output:           Integer
//Author:           Aaryaa Nandkumar Patil
//Date:             11/2/26
//
//////////////////////////////////////////////////////////

class Logic
{
    public int CountOn(int iNo)
    {
        int iCount = 0;
        
        while(iNo != 0)
        {
            if((iNo & 1) == 1)
            {
                iCount++;
            }
            iNo = iNo >> 1;
        }

        return iCount;
    }
}

class program67_1 
{
    public static void main(String A[])
    {
        int iValue = 0 , iRet = 0;

        Scanner sobj = new Scanner(System.in);

        Logic obj = new Logic();

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        iRet = obj.CountOn(iValue);

        System.out.println("Number of ON bits are : "+iRet);

    }    
}



/*
while(iNo != 0)
        {
            iDigit = iNo % 2;

            if(iDigit == 1)
            {
                iCount++;
            }

            iNo = iNo / 2;
        }

*/