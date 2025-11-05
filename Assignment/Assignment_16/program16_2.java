class Logic
{
    public void checkEvenOdd(int n)
    {
        if((n%2)==0)
        {
            System.out.println("Number is even");
        }
        else
        {
            System.out.println("Number is odd");
        }
    }
}

class program16_2
{
    public static void main(String Arg[])
    {
        Logic lobj=new Logic();
        lobj.checkEvenOdd(7);
    }
}