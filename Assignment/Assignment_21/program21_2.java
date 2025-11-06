//////////////////////////////////////////////////////////
//
//Function Name:    countEvenOddRange
//Description:      Count even and odd number present between 1 and N
//Input:            Integer
//Output:           Integer
//Author:           Aaryaa Patil
//Date:             6/11/25
//
//////////////////////////////////////////////////////////

class Logic
{
    void countEvenOddRange(int num)
    {
        int iCnt=0;
        int evenCount=0;
        int oddCount=0;

        for(iCnt=1;iCnt<=num;iCnt++)
        {
            if(iCnt%2==0)
            {
                evenCount++;
            }
            else
            {
                oddCount++;
            }
        }
        System.out.println("Even range count is:"+evenCount);
        System.out.println("Odd range count is:"+oddCount);
    }
}

class program21_2
{
    public static void main(String Args[])
    {
        Logic obj=new Logic();
        obj.countEvenOddRange(50);
    }
}