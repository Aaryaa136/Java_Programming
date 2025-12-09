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
}

class Constructor
{
    public static void main(String Arr[])
    {
        Demo dobj1 = new Demo();          //dynamic memory allocation(by default)  ,default constructor 

        Demo dobj2= new Demo(11,21);              //parametrized constructor
        
    }
}