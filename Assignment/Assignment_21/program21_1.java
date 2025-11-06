//////////////////////////////////////////////////////////
//
//Function Name:    productOfDigit
//Description:      Print product of digit of a number
//Input:            Integer
//Output:           Integer
//Author:           Aaryaa Patil
//Date:             6/11/25
//
//////////////////////////////////////////////////////////

class Logic
{
    void productOfDigits(int num)
    {
        int digit=0;
        int product=1;

        while(num!=0)
        {
            digit=num%10;
            product*=digit;
            num=num/10;
        }
        System.out.println("Product of number is:"+product);
    }
}

class program21_1
{
    public static void main(String Args[])
    {
        Logic obj=new Logic();
        obj.productOfDigits(234);
    }
}