//////////////////////////////////////////////////////////
//
//Function Name:    findLargestDigit
//Description:      Finf largest digit of a number
//Input:            Integer
//Output:           Integer
//Author:           Aaryaa Patil
//Date:             6/11/25
//
//////////////////////////////////////////////////////////

class Logic
{
    void findLargestDigit(int num)
    {
        int Digit=0;
        int largest=0;
        
        while(num!=0)
        {
            Digit=num%10;
            if(Digit>largest)
            {
                largest=Digit;
            }
            num=num/10;
        }
        System.out.println("Largest digit is:"+largest);
    }
}

class program20_4
{
    public static void main(String args[])
    {
        Logic obj=new Logic();
        obj.findLargestDigit(83429);
    }
}