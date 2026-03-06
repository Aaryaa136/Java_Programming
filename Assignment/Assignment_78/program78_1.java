import java.util.*;

class program78_1
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        int Days = 0;

        float Amount = 0.0f;
        float Discount = 0.0f;
        
        System.out.println("Enter number of days stayed : ");
        Days = sobj.nextInt();

        if(Days <= 0)
        {
            System.out.println("Invalid input");
            return;
        }

        if(Days < 7)
        {
            Amount = Days * 3000;
        }
        else if(Days > 7)
        {
            Amount = Days * 3000;
            Discount = Amount * 0.05f;
            Amount = Amount - Discount;
        }

        System.out.println("Total Stay Duration : "+Days);
        System.out.println("Final Bill Amount : "+Amount);

        sobj.close();
    }
}