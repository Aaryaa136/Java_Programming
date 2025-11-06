//////////////////////////////////////////////////////////
//
//Function Name:    displayGrade
//Description:      Display grade based on marks
//Input:            Integer
//Author:           Aaryaa Patil
//Date:             6/11/25
//
//////////////////////////////////////////////////////////

class Logic
{
    void displayGrade(int marks)
    {
        if(marks<=100 && marks>=90)
        {
            System.out.println("A grade");
        }
        else if(marks<=90 && marks>=80)
        {
            System.out.println("B grade");
        }
        else if(marks<=80 && marks>=60)
        {
            System.out.println("C grade");
        }
        else if(marks<=60 && marks>=50)
        {
            System.out.println("D grade");
        }
        else if(marks<=50 && marks>=35)
        {
            System.out.println("E grade");
        }
        else
        {
            System.out.println("Failed");
        }

    }
}

class program19_2
{
    public static void main(String A[])
    {
        Logic obj=new Logic();
        obj.displayGrade(82);
    }
}
