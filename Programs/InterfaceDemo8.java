interface A
{
    int no=11;
    void fun();
    default void gun()        //added in java version 8:2014  (default)in interface
    {
        System.out.println("Inside gun");
    }
}

class Demo implements A   //multiple inheritance
{
     public void fun()
     {
        System.out.println("Inside fun");    
     }
}

class InterfaceDemo8
{
    public static void main(String A[])
    {
         Demo dobj=new Demo();
         dobj.fun();
         dobj.gun();
    }
}