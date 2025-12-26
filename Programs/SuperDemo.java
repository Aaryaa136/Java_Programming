class Hello
{
     public int i;

     public Hello(int no)
     {
        System.out.println("Inside Hello constructor");
        this.i=no+1;        
     }

     public void Display()
     {
        System.out.println("Inside Hello Display");
     }
}

class Demo extends Hello
{
    public int i;
    
    public Demo(int a)
    {
        //first use
        //if super is not there it will generate error - as when object is created it comes at line 24 it will then go inside hello class 
        //as there is no default constructor it will generate error after super
        super(a);    
        System.out.println("Inside Demo constructor ");
        this.i=a;
    }

    public void Display()
    {
        int i=0;
        System.out.println("Inside display"+i);
        System.out.println("Inside display"+this.i);
        System.out.println("Inside display"+super.i);   //second use
        super.Display();     //3rd use 
    } 
}

class SuperDemo
{
    public static void main(String A[])
    {
        Demo dobj=new Demo(51);
        dobj.Display();
    }
}