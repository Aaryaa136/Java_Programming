import java.time.chrono.HijrahEra;
import java.util.*;

class program79_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int R = 0;
        int C = 0;

        int i = 0 , j = 0;
        int TotalMarks = 0;
        int Topper = 0;
        int TopperIndex = 0;
        
        float Average = 0.0f;
        boolean isFailed = false;
    
        System.out.println("Enter number of students(rows) : ");
        R = sobj.nextInt();

        System.out.println("Enter number of subjects(col) : ");
        C = sobj.nextInt();

        if(R <= 0 || C <= 0)
        {
            System.out.println("Invalid input");
            return;
        }

        int Arr[][] = new int[R][C];

        System.out.println("Enter marks : ");

        for(i = 0 ; i < R ; i++)
        {
            System.out.println("Student : "+(i+1));
            for(j = 0 ; j < C ; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }
   
        System.out.println("Student Total : ");
        for(i = 0 ; i < R ; i++)
        {
            System.out.print("Student "+(i+1)+" : ");

            TotalMarks = 0;

            for(j = 0 ; j < C ; j++)
            {
                TotalMarks = TotalMarks + Arr[i][j];  
            }   
            System.out.println(TotalMarks);   

            if(TotalMarks > Topper)
            {
                Topper = TotalMarks;
                TopperIndex = i; 
            }
        }

        System.out.println("Topper : Student : "+(TopperIndex+1));

        System.out.println("Subject Average : ");
        for(j = 0 ; j < C ; j++)
        {
            System.out.print("Subejct "+(j+1)+" : ");

            TotalMarks = 0;
            Average = 0;

            for(i = 0 ; i < R ; i++)
            {
                TotalMarks = TotalMarks + Arr[i][j];  
                Average = TotalMarks/R;
            }   
            System.out.println(Average);   
        }

        System.out.println("Students Failed : ");
        for(i = 0 ; i < R ; i++)
        {
            for(j = 0 ; j < C ; j++)
            {
                if(Arr[i][j] < 35)
                {
                    isFailed = true;
                    break;
                }
            }

            if(isFailed)
            {
                System.out.println(i+1);
            }
        }

    }
}