        
import java.util.*;

class program78_4
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        int CallDur = 0;
        int Bill = 0;

        System.out.println("Enter call duration(mins) : ");
        CallDur = sobj.nextInt();

        if(CallDur < 0)
        {
            System.out.println("Invalid input");
            return;
        }

        if(CallDur < 5)
        {
            Bill = 0;
        }
        else if(CallDur <=15)
        {
            Bill = ((CallDur - 5) * 1);
        }
        else if(CallDur > 15)
        {
            Bill = 10 + ((CallDur - 15) * 2);
        }

        System.out.println("Call Duration : "+CallDur);
        System.out.println("Total Call Charge : "+Bill);
    }
}