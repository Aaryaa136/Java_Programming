//////////////////////////////////////////////////////////
//
//Function Name:    checkDivisible
//Description:      Check whether a number is divisible by 5 and 11
//Input:            Integer
//Author:           Aaryaa Patil
//Date:             6/11/25
//
//////////////////////////////////////////////////////////

class Logic
{
    void checkDivisible(int num)
    {
       if((num%5==0) && (num%11==0))
       {
        System.out.println("Number is divisible by 5 and 11");
       }
       else
       {
        System.out.println("Number is not divisible by 5 and 11");
       }
    }
}

class program19_3
{
    public static void main(String A[])
    {
        Logic obj=new Logic();
        obj.checkDivisible(55);
    }
}
