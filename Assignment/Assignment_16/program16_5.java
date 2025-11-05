class Logic
{
    public void countDigits(int n)
    {
        int iDigit=0;
        int iCount=0;
        
        while(n!=0)
        {
            iDigit=n%10;
            n=n/10;
            iCount++;
        }   
        System.out.println("Digits in a number:"+iCount);
    }
}

class program16_5
{
    public static void main(String Arg[])
    {
        Logic lobj=new Logic();
        lobj.countDigits(7865);
    }
}