//////////////////////////////////////////////////////////
//
//Function Name:    checkSign
//Description:      Check whether a number is postive ,negative or zero
//Input:            Integer
//Author:           Aaryaa Patil
//Date:             5/11/25
//
//////////////////////////////////////////////////////////

class Logic
{
    void checkSign(int num)
    {
        if(num>0)
        {
            System.out.println("Number is positive");
        }
        else if(num<0)
        {
            System.out.println("Number is negative");
        }
        else
        {
            System.out.println("Number is 0");
        }
    }   
}
class program18_5
{
    public static void main(String args[])
    {
        Logic obj=new Logic();
        obj.checkSign(-8);
    }

}