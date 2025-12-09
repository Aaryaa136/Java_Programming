abstract class Base
{
     public int i,j;
     
     public int addition(int a,int b)   //concrete
     {
        return a+b;
     }

     abstract public int substraction(int a,int b);  //abstarct

}

class Derived extends Base   
{
    public int x;

    public int substraction(int a,int b)
    {
        return a-b;
    }

    public int multiplication(int a,int b)
    {
        return a*b;
    }

}

class AbstractDemo3
{
    public static void main(String A[])
    {           
        Base bp=new Derived();      //upcasting

        int iRet=0;

        iRet=bp.addition(11,10);
        System.out.println(iRet);

        iRet=bp.substraction(11,10);
        System.out.println(iRet);

//       iRet=bp.Multiplication(11,10);  //error
    
    } 
}