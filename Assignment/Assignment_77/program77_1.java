import java.util.*;  

class program77_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Days = 0;
        int MedicineBill = 0;
        int ConsultationFee = 0;
        String WardType = null;
        String Insurance = null;
    
        float InsuranceClaim = 0.0f;
        float TotalBill = 0.0f;
        float FinalBill = 0.0f;

        float claim1 = 0.0f;
        float claim2 = 0.0f;

        System.out.println("Enter number of days patient was in hospital : ");
        Days = sobj.nextInt();

        System.out.println("Do you have medicical insurance : (Yes/No)");
        Insurance = sobj.next();

        System.out.println("Type of ward : (Normal/ICU)");
        WardType = sobj.next();

        System.out.println("Enter medicine bill : ");
        MedicineBill = sobj.nextInt();

        System.out.println("Enter consultation fees : ");
        ConsultationFee = sobj.nextInt();

        if(Days < 0 || MedicineBill < 0 || ConsultationFee < 0)
        {
            System.out.println("Invalid input");
            return;
        }
 
        if(WardType.equalsIgnoreCase("ICU"))
        {
            TotalBill = ConsultationFee + MedicineBill + (Days * 5000);
        }
        else if(WardType.equalsIgnoreCase("Normal"))
        {
            TotalBill = ConsultationFee + MedicineBill + (Days * 3000);
        }
        else
        {
            System.out.println("Invalid ward type");
        }

        if(Insurance.equalsIgnoreCase("Yes"))
        {
            claim1 = 50000;
            claim2 = TotalBill * 0.7f;

            InsuranceClaim = Math.min(claim1,claim2);
            FinalBill = TotalBill - InsuranceClaim;
        }
        else
        {
            FinalBill = TotalBill;
        }

        System.out.println("Total Bill : "+TotalBill);
        
        if(Insurance.equalsIgnoreCase("Yes"))
        {
            System.out.println("Incurance covered : "+InsuranceClaim);
        }

        System.out.println("Final pay : "+FinalBill);
    }
}