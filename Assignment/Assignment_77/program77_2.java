import java.util.*;  

class program77_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Distance = 0;
        int BookingHours = 0;
        int Age = 0;
        String classType = null;
        
        float Fare = 0.0f;
        float TatkalFare = 0.0f;
        float SeniorCitizienDisc = 0.0f;

        System.out.println("Enter distance(km) : ");
        Distance = sobj.nextInt();

        System.out.println("Enter train type : (Sleeper/3AC/2AC)");
        classType = sobj.next();
        
        System.out.println("Enter when trained booked(hrs) : ");
        BookingHours = sobj.nextInt();

        System.out.println("Enter age : ");
        Age = sobj.nextInt();

        if(Distance < 0 || BookingHours < 0 || Age < 0)
        {
            System.out.println("Invalid input");
            return;
        }

        if(Distance <= 150)
        {
            Fare = 200;
        }
        else if(Distance > 150)
        {
            Fare = 200 + ((Distance - 150) * 4);
        }

        if(classType.equalsIgnoreCase("Sleeper"))
        {
            Fare = Fare + 500;
        }
        else if(classType.equalsIgnoreCase("3AC"))
        {
            Fare = Fare + 300;
        }
        else if(classType.equalsIgnoreCase("2AC"))
        {
            Fare = Fare + 100;
        }

        if(BookingHours <= 24)
        {
            TatkalFare = Fare * 0.3f;
            Fare = Fare + TatkalFare;
        }
        
        if(Age > 60)
        {
            SeniorCitizienDisc = Fare * 0.4f;
            Fare = Fare - SeniorCitizienDisc;
        }

        System.out.println("Final Fare : "+Fare);

        if(classType.equalsIgnoreCase("Sleeper"))
        {
            System.out.println("Class : Sleeper");
        }
        else if(classType.equalsIgnoreCase("3AC"))
        {
            System.out.println("Class : 3AC");
        }
        else if(classType.equalsIgnoreCase("2AC"))
        {
            System.out.println("Class : 2AC");
        }
        else
        {
            System.out.println("Class : General");
        }

        if(Age > 60)
        {
            System.out.println("Senior citizen discount : "+SeniorCitizienDisc);
        }

        if(BookingHours <= 24)
        {
            System.out.println("Tatkal booking charges : "+TatkalFare);
        }
    }
}

