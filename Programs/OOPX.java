class Arithmetic
{
    public int iNo1;
    public int iNo2;

    public Arithmetic()
    {
        this.iNo1=0;
        this.iNo2=0;
        
    }
    public Arithmetic(int i,int j)
    {
        this.iNo1=i;
        this.iNo2=j;
    }
    public int Addition()           //method
    {
        int iAns=0;
        iAns=this.iNo1 + this.iNo2;
        return iAns;
    } 
    public int Substraction()    //method
    {
        int iAns=0;
        iAns=this.iNo1 - this.iNo2;
        return iAns;
    }
}

class OOPX
{
    public static void main(String Arr[])
    {
        Arithmetic aobj1 = new Arithmetic(11,10);
        int iRet=0;

        iRet=aobj1.Addition();           //call
        System.out.println("Addition is:"+iRet);

        iRet=aobj1.Substraction();      //call
        System.out.println("Substraction is:"+iRet);

        aobj1=null;

    }
}