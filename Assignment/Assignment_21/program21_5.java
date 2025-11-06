//////////////////////////////////////////////////////////
//
//Function Name:    printDivisibleBy2and3
//Description:      Check whether a number is divisible by both 2 and 3
//Input:            Integer
//Author:           Aaryaa Patil
//Date:             6/11/25
//
//////////////////////////////////////////////////////////

class Logic
{
    void printDivisibleBy2and3(int num)
    {
        if((num%2==0) && (num%3==0))
        {
            System.out.println("Number is divisible by 2 and 3");
        }
        else
        {
            System.out.println("Number is not divisible by 2 and 3");
        }
    }
}

class program21_5
{
    public static void main(String Args[])
    {
        Logic obj=new Logic();
        obj.printDivisibleBy2and3(30);
    }
}