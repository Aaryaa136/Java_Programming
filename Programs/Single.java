class Base                   //8
{
    public int i,j;

    public void fun()
    {
        System.out.println("Inside base fun");
    }
}

class Derived extends Base       //12byte
{
    public int x;

    public void gun()
    {
        System.out.println("Inside derived gun");
    }
}

class Single
{
    public static void main(String A[])
    {
        Base bobj= new Base();
        Derived dobj= new Derived();

        bobj.fun();

        dobj.fun();   //accessing base class with derived
        dobj.gun();   //access itself
    }
}