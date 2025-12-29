class ThreadPriority
{
    public static void main(String A[])
    {
        System.out.println("Inside main method");

        Thread tobj=Thread.currentThread();     //thread class object
        String name=tobj.getName();            
        System.out.println("Name of current thread is:"+name);
        int Priority=tobj.getPriority();
        System.out.println("Priority of current thread is:"+Priority);    //5 - avg priority (by default)
        tobj.setPriority(10);
        Priority=tobj.getPriority();
        System.out.println("Priority of current thread is:"+Priority);

    }
}