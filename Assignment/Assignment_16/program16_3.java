class Logic
{
    public void findFactorial(int n)
    {
        int iCnt=0,iFact=1;

        for(iCnt=1;iCnt<=n;iCnt++)
        {
            iFact*=iCnt;
        }
        System.out.println("factorial is: " + iFact);      
    }
}

class program16_3
{
    public static void main(String Arg[])
    {
        Logic lobj=new Logic();
        lobj.findFactorial(5);
    }
}