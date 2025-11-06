//////////////////////////////////////////////////////////
//
//Function Name:    findSmallestDigit
//Description:      Finf smallest digit of a number
//Input:            Integer
//Output:           Integer
//Author:           Aaryaa Patil
//Date:             6/11/25
//
//////////////////////////////////////////////////////////

class Logic
{
    void findSmallestDigit(int num)
    {
        int Digit=0;
        int smallest=num;
        
        while(num!=0)
        {
            Digit=num%10;
            if(Digit<smallest)
            {
                smallest=Digit;
            }
            num=num/10;
        }
        System.out.println("Smallest digit is:"+smallest);
    }
}

class program20_5
{
    public static void main(String args[])
    {
        Logic obj=new Logic();
        obj.findSmallestDigit(45872);
    }
}