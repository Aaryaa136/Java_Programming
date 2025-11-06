//////////////////////////////////////////////////////////
//
//Function Name:    printReverse
//Description:      Print number in reverse order till 1
//Input:            Integer
//Author:           Aaryaa Patil
//Date:             6/11/25
//
//////////////////////////////////////////////////////////

class Logic
{
    void printReverse(int n)
    {
        int iCnt=0;

        for(iCnt=n;iCnt>=1;iCnt--)
        {
            System.out.println(iCnt);
        }      
    }
}

class program20_2
{
    public static void main(String args[])
    {
        Logic obj=new Logic();
        obj.printReverse(10);
    }
}