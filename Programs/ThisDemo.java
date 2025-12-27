class Demo
{
     public int i;    //non static characteristics
     public static int j;   //static characteristics

     static      //static block to initialize static characteristics
     {
        j=21;
     }
    
     public Demo()   //default constructor
     {
        this.i=11;      //first use to initialize
        System.out.println("Inside default");
     }

     public Demo(int a)    //parametrized constructor
     {
        this();      //second use         should be on first line of that constructor this() 
        System.out.println("Inside parametrized");
     }

     public void Display()
     {
        System.out.println("Inside Display"+this.i);   //third use
     }

}

class ThisDemo
{
    public static void main(String A [])
    {
        Demo dobj = new Demo(51);
        dobj.Display();
    }
}