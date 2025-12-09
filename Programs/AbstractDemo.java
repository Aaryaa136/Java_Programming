abstract class Base
{
     public int i,j;
     
     public int Addition(int a,int b)   //concrete
     {
        return a+b;
     }

     abstract public int Substraction(int A,int B);  //abstarct

}

class AbstarctDemo1
{
    public static void main(String A[])
    {           
        Base bp=new Base();          //error
    
    } 
}