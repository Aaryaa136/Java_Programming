//////////////////////////////////////////////////////////
//
//Function Name:    printDigits
//Description:      Print digits of a number seperately
//Input:            Integer
//Author:           Aaryaa Patil
//Date:             6/11/25
//
//////////////////////////////////////////////////////////

class Logic
{
    void printDigits(int num)
    {
        int Digit=0;

        while(num!=0)
        {
            Digit=num%10;
            System.out.println(Digit);
            num=num/10;
        }
    }
}

class program19_4
{
    public static void main(String A[])
    {
        Logic obj=new Logic();
        obj.printDigits(9876);
    }
}
