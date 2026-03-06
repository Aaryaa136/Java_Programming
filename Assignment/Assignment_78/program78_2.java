import java.util.*;

class program78_2
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        int Votes = 0;
        int VoterId[];

        int i =  0;
        int j = 0;
        int validVotes = 0;
        int rejectedVotes = 0;

        boolean isDuplicate = false;

        System.out.println("Enter number of votes : ");
        Votes = sobj.nextInt();

        System.out.println("Enter VoterId : ");

        VoterId = new int[Votes];
        
        for(i = 0 ; i < Votes ; i++)
        {
            VoterId[i] = sobj.nextInt();          
            
        }

        for(i = 0 ; i < Votes ; i++)
        {
            isDuplicate = false;

            for(j = 0 ; j < i ; j++)
            {
                if(VoterId[i] == VoterId[j])
                {
                    isDuplicate = true;
                    break;
                }
            }

            if(isDuplicate)
            {
                rejectedVotes++;
            }
            else
            {
                validVotes++;
            }
        }
        
        System.out.println("Valid votes : "+validVotes);
        System.out.println("Rejected Duplicate Votes : "+rejectedVotes);

        sobj.close();
    }
}