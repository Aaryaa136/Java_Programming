import java.util.*;

class program78_3
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        int Steps  = 0;
        int Goal = 0;
        int i = 0;
        int goalCount = 0;
        int Max = 0;

        System.out.println("Enter your daily step goals : ");
        Goal = sobj.nextInt();

        System.out.println("Enter steps day wise (7 Days): ");

        for(i = 0 ; i < 7 ; i++)
        {
            Steps = sobj.nextInt();

            if(Steps < 0)
            {
                break;
            }

            if(Steps >= Goal)
            {
                goalCount++;
            }

            if(Steps > Max)
            {
                Max = Steps;
            }
        }

        System.out.println("Goal Achieved Days : "+goalCount);
        System.out.println("Maximum Steps in Week : "+Max);
    }
}