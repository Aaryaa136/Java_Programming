//////////////////////////////////////////////////////////
//
//Function Name:    calculatePower
//Description:      Calculate power of a number
//Input:            Integer
//Author:           Aaryaa Patil
//Date:             6/11/25
//
//////////////////////////////////////////////////////////

class Logic
{
    void calculatePower(int base,int exp)
    {
        if(exp<=0)
        {
            return;
        }

        int iCnt=0;
        int result=1;

        for(iCnt=1;iCnt<=exp;iCnt++)
        {
            result*=base;
        }
        System.out.println(result);
    }
}

class program19_5
{
    public static void main(String A[])
    {
        Logic obj=new Logic();
        obj.calculatePower(2,5);
    }
}
