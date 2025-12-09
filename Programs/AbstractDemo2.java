abstract class Base
{
     public int i,j;
     
     public int Addition(int a,int b)   //concrete
     {
        return a+b;
     }

     abstract public int Substraction(int A,int B);  //abstarct

}

class Derived extends Base   //error
{

}

class AbstarctDemo2
{
    public static void main(String A[])
    {           
        Base bp=new Base();          
    
    } 
}