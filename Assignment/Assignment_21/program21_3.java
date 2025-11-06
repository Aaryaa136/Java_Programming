//////////////////////////////////////////////////////////
//
//Function Name:    displayFactors
//Description:      Display factors of a number
//Input:            Integer
//Author:           Aaryaa Patil
//Date:             6/11/25
//
//////////////////////////////////////////////////////////

class Logic
{
    void displayFactors(int num)
    {
        int iCnt=0;

        for(iCnt=1;iCnt<=num;iCnt++)
        {
            if(num%iCnt==0)
            {
                System.out.println(iCnt);
            }
        }
    }
}

class program21_3
{
    public static void main(String Args[])
    {
        Logic obj=new Logic();
        obj.displayFactors(12);
    }
}