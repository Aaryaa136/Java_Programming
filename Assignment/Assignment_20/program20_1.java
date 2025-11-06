//////////////////////////////////////////////////////////
//
//Function Name:    sumEvenNumbers
//Description:      Print sum of even number
//Input:            Integer
//Output:           Integer
//Author:           Aaryaa Patil
//Date:             6/11/25
//
//////////////////////////////////////////////////////////


class Logic
{
    void sumEvenNumbers(int n)
    {
        int iCnt=0;
        int Sum=0;

        for(iCnt=1;iCnt<=n;iCnt++)
        {
            if(iCnt%2==0)
            {
                Sum+=iCnt;
            }
        }
        System.out.println("Sum of even numbers :"+Sum);
    }
}

class program20_1
{
    public static void main(String args[])
    {
        Logic obj=new Logic();
        obj.sumEvenNumbers(10);
    }
}