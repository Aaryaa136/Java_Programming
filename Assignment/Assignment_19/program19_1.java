//////////////////////////////////////////////////////////
//
//Function Name:    checkLeapYear
//Description:      Check whether year is leap year or not
//Input:            Integer
//Author:           Aaryaa Patil
//Date:             6/11/25
//
//////////////////////////////////////////////////////////

class Logic
{
    void checkLeapYear(int year)
    {
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
        {
            System.out.println("Is a leap year");
        }
        else
        {
            System.out.println(" Not a leap year");
        }
    }
}

class program19_1
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.checkLeapYear(2024);
    }
}


//divisible by 4
//but not 100
//divisible by 400