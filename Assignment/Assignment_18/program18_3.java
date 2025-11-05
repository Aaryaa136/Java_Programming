//////////////////////////////////////////////////////////
//
//Function Name:    printOddNumbers
//Description:      Print odd numbers upto n
//Input:            Integer
//Author:           Aaryaa Patil
//Date:             5/11/25
//
//////////////////////////////////////////////////////////

class Logic
{
    void printOddNumbers(int num)
    {
        int iCnt=0;

        for(iCnt=1;iCnt<=num;iCnt++)
        {
            if((iCnt%2)!=0)
            {
                System.out.println(iCnt);
            }
            else
            {

            }
        }
    }   
}
class program18_3
{
    public static void main(String args[])
    {
        Logic obj=new Logic();
        obj.printOddNumbers(20);
    }

}