//////////////////////////////////////////////////////////
//
//Function Name:    checkPalindrome
//Description:      Check if a number is palindrome or not
//Input:            Integer
//Author:           Aaryaa Patil
//Date:             5/11/25
//
//////////////////////////////////////////////////////////

class Logic
{
    void checkPalindrome(int num)
    {
        if(num<0)
        {
            System.out.println("Negative numbers are not consider palindromes");
            return;
        }

        int Digit=0;
        int original=num;
        int reverse=0;

        while(num!=0)
        {
            Digit=num%10;
            reverse=reverse*10+Digit;
            num=num/10;
        }

        if(original==reverse)
        {
            System.out.println("Number is palindrome");
        }
        else
        {
            System.out.println("Number is not palidrome");
        }
 
    }
}

class program17_2
{
    public static void main(String args[])
    {
        Logic lobj=new Logic();
        lobj.checkPalindrome(121);
    }    
}
