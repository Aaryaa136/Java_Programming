class Demo
{
    public int Division(int No1, int No2) throws ArithmeticException   //tells might be exception (alert)
    {
        int Ans=0;
        Ans=No1/No2;
        return Ans;
    }
}

class ThrowsDemo
{
    public static void main(String A[])
    {
        Demo obj=new Demo();
        int Ret=0;

        try
        {
            Ret=obj.Division(11,0);
        }
        catch(ArithmeticException aobj)
        {
            System.out.println("Inside catch"+aobj);
        }

        System.out.println(Ret); 
    }
}


//as throws is written in front of division function it tells caller 
//all carefully so when calling we need to write try and  catch when calling :obj et=obj.Division(11,0);

/*
 Inside catchjava.lang.ArithmeticException: / by zero
0
 */