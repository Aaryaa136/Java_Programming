//////////////////////////////////////////////////////////
//
//Function Name:    printTable
//Description:      Print table of given input
//Input:            Integer
//Author:           Aaryaa Patil
//Date:             5/11/25
//
//////////////////////////////////////////////////////////

class Logic
{
    void printTable(int num)
    {
        int iCnt=0;

        for(iCnt=1;iCnt<=10;iCnt++)
        {
            System.out.println(iCnt*num);
        }
    }
}

class program17_5
{
    public static void main(String args[])
    {
        Logic lobj=new Logic();
        lobj.printTable(5);
    }    
}
