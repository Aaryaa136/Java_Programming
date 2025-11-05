//////////////////////////////////////////////////////////
//
//Function Name:    sumEvenOddDigits
//Description:      Print sum of even and odd digits seperately
//Input:            Integer
//Author:           Aaryaa Patil
//Date:             5/11/25
//
//////////////////////////////////////////////////////////

class Logic
{
    void sumOfEvenOddDigits(int num)
    {
        int iDigit=0;
        int iEvenSum=0;
        int iOddSum=0;

        while(num!=0)
        {
            iDigit=num%10;

            if(iDigit%2==0)
            {
                iEvenSum+=iDigit;
            }
            else
            {
                iOddSum+=iDigit;
            }
            num=num/10;
        }

        System.out.println("Sum of even digits: " + iEvenSum);
        System.out.println("Sum of odd digits: " + iOddSum);
    }   
}
class program18_4
{
    public static void main(String args[])
    {
        Logic obj=new Logic();
        obj.sumOfEvenOddDigits(123456);
    }

}