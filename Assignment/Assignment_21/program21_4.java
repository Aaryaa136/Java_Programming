//////////////////////////////////////////////////////////
//
//Function Name:    countFactors
//Description:      Count number of factors in a number
//Input:            Integer
//Output:           Integer
//Author:           Aaryaa Patil
//Date:             6/11/25
//
//////////////////////////////////////////////////////////

class Logic
{
    void countFactors(int num)
    {
        int iCnt=0;
        int iFrequency=0;

        for(iCnt=1;iCnt<=num;iCnt++)
        {
            if(num%iCnt==0)
            {
                iFrequency++;
            }
        }
        System.out.println("Factors of a number are:"+iFrequency);
    }
}

class program21_4
{
    public static void main(String Args[])
    {
        Logic obj=new Logic();
        obj.countFactors(20);
    }
}