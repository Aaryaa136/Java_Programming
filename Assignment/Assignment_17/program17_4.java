//////////////////////////////////////////////////////////
//
//Function Name:    findMax
//Description:      Find maximum between three numbers 
//Input:            Integer,Integer,Integer
//Author:           Aaryaa Patil
//Date:             5/11/25
//
//////////////////////////////////////////////////////////

class Logic
{
    void findMax(int a,int b,int c)
    {
        if(a>b && a>c)
        {
            System.out.println("a is maximum");
        }
        else if(b>c && b>a)
        {
            System.out.println("b is maximum");   
        }
        else
        {
            System.out.println("c is maximum");
        }
    }
}

class program17_4
{
    public static void main(String args[])
    {
        Logic lobj=new Logic();
        lobj.findMax(3,7,2);
    }    
}

