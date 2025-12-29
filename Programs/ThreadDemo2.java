class ThreadDemo2
{
    public static void main(String A[])
    {
        System.out.println("Inside main method");

        Thread tobj=Thread.currentThread();     //current thread-static(Thread is class)
        String name=tobj.getName();             //get Name is method
        System.out.println("Name of current thread is:"+name);
    }
}