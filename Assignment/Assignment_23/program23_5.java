import java.util.*;

//////////////////////////////////////////////////////////
//
//Function Name:    Product
//Description:      Returns product of odd numbers in an array
//Input:            Integer
//Output:           Integer
//Author:           Aaryaa Patil
//Date:             16/11/25
//
//////////////////////////////////////////////////////////


class Logic
{
    public void Product(int Arr[])
    {
        int iProduct = 1;
        int iCountOdd = 0;

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] % 2 != 0)
            {
                iProduct *= Arr[iCnt];
                iCountOdd++;
            }
        }

        if(iCountOdd == 0)
        {
            System.out.println("No odd elements found. Product is: 0");
        }
        else
        {
            System.out.println("Product of odd elements is: " + iProduct);
        }
    }
}

class program23_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iCnt=0 ,iSize=0;

        System.out.println("Enter number of elements:");
        iSize = sobj.nextInt();

        int Brr[] = new int[iSize];

        System.out.println("Enter elements:");
        
        for(iCnt = 0; iCnt < Brr.length; iCnt++)
        {
            Brr[iCnt] = sobj.nextInt();
        }

        Logic obj = new Logic();
        obj.Product(Brr);
        
        sobj.close();
    }
}
