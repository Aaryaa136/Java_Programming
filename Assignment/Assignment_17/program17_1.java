//////////////////////////////////////////////////////////
//
//Function Name:    sumOfDigits
//Description:      Display sum of digit of a number
//Input:            Integer
//Output:           Integer
//Author:           Aaryaa Patil
//Date:             5/11/25
//
//////////////////////////////////////////////////////////

class Logic
{
    void sumOfDigits(int num)
    {
        int Digit=0;
        int iSum=0;

        while(num!=0)
        {
            Digit=num%10;
            num=num/10;
            iSum+=Digit;
        }
        System.out.println("Sum of digits of a number is:"+iSum);
    }
}

class program17_1 
{
    public static void main(String args[])
    {
        Logic lobj=new Logic();
        lobj.sumOfDigits(1234);
    }    
}
