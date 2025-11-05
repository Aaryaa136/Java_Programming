class Logic
{
    public void calculateSum(int n)
    {
        int iCnt=0;
        int iSum=0;

        for(iCnt=1;iCnt<=n;iCnt++)
        {
            iSum+=iCnt;
        }
        System.out.println("Sum of first n natural numbers is: " + iSum);      
    }
}

class program16_1
{
    public static void main(String Arg[])
    {
        Logic lobj=new Logic();
        lobj.calculateSum(10);
    }
}