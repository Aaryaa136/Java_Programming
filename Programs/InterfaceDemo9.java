interface A
{
    int no=11;
    void fun();

    private void Display()      //added in java version 8:2014  (default)in interface  //helper function
    {
        System.out.println("Inside private Display");
    }

    default void gun()        //added in java version 8:2014  (default)in interface
    {
        System.out.println("Inside gun");
        Display();
    }

}

class Demo implements A   //multiple inheritance
{
     public void fun()
     {
        System.out.println("Inside fun");    
     }
}

class InterfaceDemo9
{
    public static void main(String A[])
    {
         Demo dobj=new Demo();
         dobj.fun();
         dobj.gun();
        //error  dobj.Display();
    }
}