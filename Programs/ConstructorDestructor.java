class Demo
{
    public int iNo1;
    public int iNo2;

    public Demo()
    {
        System.out.println("Inside default constructor");
    }
    public Demo(int i,int j)
    {
        System.out.println("Inside parametrized constructor ");
    }
    protected void finalize()                //~Demo
    {
        System.out.println("Inside finalize");
    }
}

class ConstructorDestructor
{
    public static void main(String Arr[])
    {
        Demo dobj1 = new Demo();          //dynamic memory allocation(by default)  ,default constructor      //call
        Demo dobj2= new Demo(11,21);              //parametrized constructor   //call   //Demo dobj2(11,21)

        dobj1=null;            //telling ur done so it will collect
        dobj2=null;

        System.gc();                    //gc=garbage collector   (static-gc)

        System.out.println("end of main");
        
    }
}