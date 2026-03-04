import java.time.temporal.WeekFields;
import java.util.*;  

class program77_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Units = 0;
        int weeksLate = 0;

        float BillAmount = 0;
        float Penalty = 0.0f;

        System.out.println("Enter water units used : ");
        Units = sobj.nextInt();
       
        System.out.println("Weeks late paid : ");
        weeksLate = sobj.nextInt();

        if(Units < 0 || weeksLate < 0)
        {
            System.out.println("Invalid input");
            return;
        }

        if(Units <= 50)
        {
            BillAmount = Units * 2;
        }        
        else if(Units <= 100)
        {
            BillAmount = 100 + ((Units - 50) * 3);
        }
        else if(Units > 100)
        {
            BillAmount = 100 + 150 + ((Units - 100) *4);
        }

        if(weeksLate > 0)
        {
            if(weeksLate <= 5)
            {
                Penalty = BillAmount * 0.02f * weeksLate;
            }
            else
            {
                Penalty = BillAmount * 0.1f;
            }

            BillAmount = BillAmount + Penalty;
        }
    
        System.out.println("Bill Amount : "+BillAmount);
    }
}

