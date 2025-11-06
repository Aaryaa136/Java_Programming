//////////////////////////////////////////////////////////
//
//Function Name:    checkPerfect
//Description:      Check whether a number is perfecr number or not
//Input:            Integer
//Output:           Integer
//Author:           Aaryaa Patil
//Date:             6/11/25
//
//////////////////////////////////////////////////////////

class Logic
{
    void checkPerfect(int num)
    {
        int iCnt=0;
        int Sum=0;

        for(iCnt=1;iCnt<=num/2;iCnt++)
        {
            if(num%iCnt==0)
            {
                Sum+=iCnt;
            }
            else
            {

            }
        }
        if(Sum==num)
        {
            System.out.println("Is perfect number");
        }
        else
        {
            System.out.println("Not perfecr number");
        }
    }
}

class program20_3
{
    public static void main(String args[])
    {
        Logic obj=new Logic();
        obj.checkPerfect(6);
    }
}