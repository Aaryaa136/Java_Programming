class Logic
{
    public void reverseNumber(int n)
    {
        int iDigit=0;
        
        while(n!=0)
        {
            iDigit=n%10;
            System.out.println("Reverse order:"+iDigit);
            n=n/10;
        }    
    }
}

class program16_4
{
    public static void main(String Arg[])
    {
        Logic lobj=new Logic();
        lobj.reverseNumber(1234);
    }
}