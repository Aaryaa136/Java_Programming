import java.util.*;

class program77_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int rows = 0;
        int col = 0;
        int Seats = 0;

        int i = 0 , j = 0;

        int RemainingSeats = 0;
        int bookedCount = 0;
        int Price = 0;
        int TotalCost = 0;

        System.out.println("Enter number of rows in theatre : ");
        rows = sobj.nextInt();

        System.out.println("Enter number of columns in theatre : ");
        col = sobj.nextInt();

        System.out.println("Enter number of seats you want to book : ");
        Seats = sobj.nextInt();

        if(rows <= 0 || col <= 0)
        {
            System.out.println("Invalid input");
            return;
        }

        int Arr1[][] = new int[rows][col];
        int Arr2[][] = new int[rows][col];

        // Existing booking
        for(i = 0 ; i < rows ; i++)
        {
            System.out.println("Enter booking details of row : "+(i+1));
            for(j = 0 ; j < col ; j++)
            {
                Arr1[i][j] = sobj.nextInt();
            }
        }

        // Requested seats
        for(i = 0 ; i < rows ; i++)
        {
            System.out.println("Enter requested seats of row : "+(i+1));
            for(j = 0 ; j < col ; j++)
            {
                Arr2[i][j] = sobj.nextInt();

                if(Arr2[i][j] == 1)
                {
                    if(Arr1[i][j] == 1)
                    {
                        System.out.println("Seat ("+(i+1)+","+(j+1)+") Already Booked");
                    }
                    else
                    {
                        System.out.println("Seat ("+(i+1)+","+(j+1)+") Booked Successfully");
                        Arr1[i][j] = 1;
                        bookedCount++;

                        Price = (i+1) * 100;
                        TotalCost = TotalCost + Price;
                    }
                }
            }
        }

        if(bookedCount == Seats)
        {
            System.out.println("Booking Status : SUCCESS");
        }
        else
        {
            System.out.println("Booking Status : FAIL");
        }

        for(i = 0 ; i < rows ; i++)
        {
            for(j = 0 ; j < col ; j++)
            {
                if(Arr1[i][j] == 0)
                {
                    RemainingSeats++;
                }
            }
        }

        System.out.println("Total Cost : " + TotalCost);
        System.out.println("Remaining Seats : " + RemainingSeats);
    }
}