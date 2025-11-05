//////////////////////////////////////////////////////////
//
//Function Name:    checkPrime
//Description:      Check whether a number is prime or not
//Input:            Integer
//Author:           Aaryaa Patil
//Date:             5/11/25
//
//////////////////////////////////////////////////////////

class Logic
{
    void checkPrime(int num)
    {
        if(num<=1)
        {
            return;
        }
        int iCnt=0;
        boolean isPrime=true;

        for(iCnt=2;iCnt<=num/2;iCnt++)
        {    
            if(num%iCnt==0)
            {
                isPrime=false;
                break;
            }
        }

        if(isPrime)
        {
            System.out.println("Is prime number");
        }
        else
        {
            System.out.println("Not a prime number");
        }
    }
}
class program18_1
{
    public static void main(String args[])
    {
        Logic obj=new Logic();
        obj.checkPrime(11);
    }

}