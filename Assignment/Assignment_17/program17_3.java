//////////////////////////////////////////////////////////
//
//Function Name:    findMax
//Description:      Find maximum between two numbers
//Input:            Integer,Integer
//Author:           Aaryaa Patil
//Date:             5/11/25
//
//////////////////////////////////////////////////////////

class Logic
{
    void findMax(int a,int b)
    {
        if(a<b)
        {
            System.out.println("b is maximum");
        }
        else
        {
            System.out.println("a is maximum");   
        }
    }
}

class program17_3 
{
    public static void main(String args[])
    {
        Logic lobj=new Logic();
        lobj.findMax(20,15);
    }    
}

